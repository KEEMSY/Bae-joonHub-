def solution(s):
    answer = []
    for chr in s:
        if not answer or chr == "(":
            answer.append(chr)
        if answer[-1] != "(":
            return False
        if chr == ")":
            answer.pop()

    if answer:
        return False

    return True