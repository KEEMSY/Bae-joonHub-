def solution(nums):
    cnt = len(nums) / 2
    set_nums = set(nums) 
    answer = min(len(set_nums), cnt)
    
    return answer