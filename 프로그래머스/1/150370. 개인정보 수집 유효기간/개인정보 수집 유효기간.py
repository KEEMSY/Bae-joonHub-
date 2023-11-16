from datetime import datetime, timedelta

def solution(today, terms, privacies):
    def get_total_days(date_str):
        date = datetime.strptime(date_str, "%Y.%m.%d")
        total_days = date.year * 12 * 28 + date.month * 28 + date.day
        return total_days

    total_today = get_total_days(today)
    
    terms_map = {}
    for term in terms:
        term_split = term.split(" ")
        terms_map[term_split[0]] = int(term_split[1]) * 28

    answer_list = []
    for i, privacy in enumerate(privacies):
        privacy_split = privacy.split(" ")
        temp_total_days = get_total_days(privacy_split[0]) + terms_map[privacy_split[1]]
        
        if temp_total_days <= total_today:
            answer_list.append(i + 1)

    return answer_list

