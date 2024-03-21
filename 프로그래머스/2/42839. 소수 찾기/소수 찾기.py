from itertools import permutations

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def solution(numbers):
    prime_set = set()
    
    for length in range(1, len(numbers) + 1):
        for combination in permutations(numbers, length):
            number = int(''.join(combination))
            if is_prime(number):
                prime_set.add(number)
    
    return len(prime_set)