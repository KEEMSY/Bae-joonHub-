def solution(s):
    check_stack = []
    
    for char in s:
        if char == "(":
            check_stack.append(char)
        elif char == ")" and check_stack:
            check_stack.pop()
        else:
            return False
            
    return len(check_stack) == 0