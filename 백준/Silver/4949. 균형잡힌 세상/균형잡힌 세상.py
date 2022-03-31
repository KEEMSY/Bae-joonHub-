while True:
    stack = []
    words = input()
    if words == "." :
        break

    flag = True
    for word in words:
        if word == '(' or word =='[':
            stack.append(word)

        elif word == ')':
            if not stack or stack[-1] == '[':
                flag = False
                break
            elif stack[-1] == '(':
                stack.pop()
        elif word == ']':
            if not stack or stack[-1] == '(':
                flag = False
                break
            elif stack[-1]=='[':
                stack.pop()
    if flag == True and not stack: 
        print("yes")
    else: 
        print("no")