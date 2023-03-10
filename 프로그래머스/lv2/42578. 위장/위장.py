from collections import defaultdict
def solution(clothes):
    answer = 1
    cloth_dict = defaultdict(list)
    
    for cloth, category in clothes:
        cloth_dict[category].append(cloth)
    
    for value in cloth_dict.values():
        answer *= (len(value) + 1)
    return answer -1