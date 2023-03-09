# 6분 시작
def solution(s):
    answer = ''
    mapper = {
        'zero': '0',
        'one': '1',
        'two': '2',
        'three': '3',
        'four': '4',
        'five': '5',
        'six': '6',
        'seven': '7',
        'eight': '8',
        'nine': '9'
    }
    
    temp = ''
    for target in s:
        
        if target.isdigit():
            answer += str(target)
        
        if target.isalpha():
            temp += target
            
        if temp in mapper.keys():
            answer += mapper[temp]
            temp = ''

    return int(answer)