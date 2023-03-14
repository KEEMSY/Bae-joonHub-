def solution(operations):
    answer = []
    for operation in operations:
        txt, num = operation.split()
        
        if txt == 'I':
            answer.append(int(num))
        else:
            if answer:
                if num == "1":
                    answer.pop()
                else:
                    answer.pop(0)

        answer.sort()
    
    return [0,0] if not answer else [answer[-1], answer[0]]