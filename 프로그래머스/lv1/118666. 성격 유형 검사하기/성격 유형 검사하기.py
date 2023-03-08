def solution(survey, choices):
    characters = ["RT", "CF", "JM", "AN"]
    score = [3, 2, 1, 0, 1, 2, 3]
    subdict = {}
    
    for character in characters:
        for char in character:
            subdict[char] = 0

    
    for case, choice in zip(survey, choices):
        idx = 0 if choice <= 3 else 1
        target_score = score[choice - 1]
        target_character = case[idx]

        subdict[target_character] += target_score

    answer = ''
    
    for character in characters:
        compareA = subdict[character[0]]
        compareB = subdict[character[1]]

        target = character[0] if compareA >= compareB else character[1]
        answer += target

    return answer