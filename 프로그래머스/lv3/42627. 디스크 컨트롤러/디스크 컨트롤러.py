def solution(jobs):
    answer = 0
    j = len(jobs)
    jobs.sort(key=lambda x: x[1])

    accumulate_num = 0
    while jobs:
        for i in range(len(jobs)):
            if jobs[i][0] <= accumulate_num:
                accumulate_num += jobs[i][1]
                answer += accumulate_num - jobs[i][0]
                jobs.pop(i)
                break
            if i == len(jobs)-1:
                accumulate_num += 1

    return answer // j