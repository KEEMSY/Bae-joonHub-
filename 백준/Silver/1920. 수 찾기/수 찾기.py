def binary(array,target,start,end):
    if start > end:
        return 0
    mid = (start+end)//2
    if array[mid] == target:
        return 1
    elif array[mid] > target:
        return binary(array, target, start, mid-1)
    else:
        return binary(array, target, mid+1, end)


n_case = int(input())
n = sorted(list(map(int,input().split())))

m_case = int(input())
m = list(map(int,input().split()))

for i in m:
    start = 0
    end = len(n)-1
    print(binary(n,i,start,end))