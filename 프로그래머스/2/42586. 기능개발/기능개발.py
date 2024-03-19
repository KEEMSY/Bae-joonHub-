def solution(progresses, speeds):
    answer = []
    daysLeft = []
    
    for progress, speed in zip(progresses, speeds):
        if (100 - progress) % speed == 0:
            daysLeft.append((100 - progress) // speed)
        else:
            daysLeft.append((100 - progress) // speed + 1)
    
    while daysLeft:
        deployDay = daysLeft.pop(0)
        deployCount = 1
        
        while daysLeft and daysLeft[0] <= deployDay:
            deployCount += 1
            daysLeft.pop(0)
        
        answer.append(deployCount)
        
    return answer