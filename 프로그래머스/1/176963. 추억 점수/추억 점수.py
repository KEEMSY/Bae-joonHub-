def solution(name, yearning, photo):
    score_dict = {n: y for n, y in zip(name, yearning)}
    
    answer = []
    for target in photo:
        score = sum(score_dict.get(key, 0) for key in target)
        answer.append(score)
    
    return answer