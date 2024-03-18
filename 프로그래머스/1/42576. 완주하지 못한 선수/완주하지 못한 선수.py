from collections import Counter

def solution(participant, completion):
    participant_counter = Counter(participant)
    completion_counter = Counter(completion)

    missing_participant = participant_counter - completion_counter    
    
    return list(missing_participant.keys())[0]
