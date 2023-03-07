def solution(id_list, report, k):
    answer = [0] * len(id_list)
    reported = {x: 0 for x in id_list}

    for data in set(report):
        user, reported_user = data.split()
        reported[reported_user] += 1

    for data in set(report):
        user, reported_user = data.split()
        if reported[reported_user] >= k:
            answer[id_list.index(user)] += 1

    return answer