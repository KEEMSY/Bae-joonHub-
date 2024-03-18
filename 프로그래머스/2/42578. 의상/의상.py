def solution(clothes):
    dict_clothes = {}
    for name, category in clothes:

        if category not in dict_clothes.keys():
            dict_clothes[category] = 1
        else: dict_clothes[category] += 1
    
    answer = 1
    for key, value in dict_clothes.items():
        answer *= value + 1
        
    return answer-1