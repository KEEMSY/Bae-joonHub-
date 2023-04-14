# m개의 이모티콘 상품이 각각 총 4가지 경우의 수를 가질 수 있고, m의 최댓값은 7이므로 완전탐색에는 최대 4^7번의 탐색
# 모든 상황에 대하여 이모티콘 플러스 구독 회원 수와 이모티콘 판매 가격을 구하고, 그 중 조건에 맞는 (이모티콘 플러스 구독자수, 판매 가격순) 최선의 결과를 반환

discounts = [10, 20, 30, 40]
answer = [-1, -1]
def solution(users, emoticons):
    n, m = len(users), len(emoticons)
    discount_list = [0] * m
    
    def search(idx):
        global answer
        if idx == m :
            sale_num, cost_num = 0, 0
            for i in range(n) :
                tmp = 0
                for j in range(m) :
                    if users[i][0] <= discount_list[j] :
                        tmp += emoticons[j] * ( 100 - discount_list[j] ) // 100
                if tmp >= users[i][1] :
                    sale_num += 1
                else :
                    cost_num += tmp
            if sale_num > answer[0] or sale_num == answer[0] and cost_num > answer[1] :
                answer = [sale_num, cost_num]
            return
        
        for i in range(4) :
            discount_list[idx] = discounts[i]
            search(idx+1)
    
    search(0)
    
    return answer