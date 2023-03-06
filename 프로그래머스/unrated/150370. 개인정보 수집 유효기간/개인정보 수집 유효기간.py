def solution(today, terms, privacies):
    answer = []
    
    year, month, day = today.split('.')
    translated_today = ((int(year) * 12) + int(month)) * 28 + int(day)

    periods = {}
    for term in terms:
        type, period = term.split()
        periods[type] = int(period) * 28
    
    for i in range(len(privacies)):
        period, term = privacies[i].split()
        
        target_year, target_month, target_day = period.split('.')
        translated_target = ((int(target_year) * 12) + int(target_month)) * 28 + int(target_day) + periods[term]

        if translated_today >= translated_target:
            answer.append(i+1)
        
    return answer