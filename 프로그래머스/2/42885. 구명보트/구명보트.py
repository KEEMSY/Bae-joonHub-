def solution(people, limit):
    people.sort()
    left, right = 0, len(people) - 1
    lifeboats = 0
    
    while left <= right:  
        if people[left] + people[right] <= limit:
            left += 1  
        right -= 1  
        lifeboats += 1
    
    return lifeboats