# 27
def solution(queue1, queue2):
    sum1 = sum(queue1)
    sum2 = sum(queue2)
    if sum1 == sum2:
        return queue1, queue2
    elif not queue1:
        return queue2
    elif not queue2:
        return queue1
    target_sum = (sum1 + sum2) // 2
    current_sum = 0
    new_queue1 = []
    new_queue2 = []
    for element in queue1:
        current_sum += element
        new_queue1.append(element)
        if current_sum == target_sum:
            return new_queue1, queue2
    if current_sum < target_sum:
        for element in queue2:
            current_sum += element
            new_queue1.append(element)
            if current_sum == target_sum:
                return new_queue1, new_queue2
    elif current_sum > target_sum:
        for element in queue2:
            current_sum += element
            new_queue2.append(element)
            if current_sum == target_sum:
                return new_queue1, new_queue2