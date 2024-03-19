from collections import deque

def solution(bridge_length, weight, truck_weights):
    time = 0
    bridge_queue = deque([0] * bridge_length)  
    current_weight = 0

    trucks_queue = deque(truck_weights)

    while trucks_queue:
        time += 1
        left_truck = bridge_queue.popleft()
        current_weight -= left_truck

        if current_weight + trucks_queue[0] <= weight:
            truck = trucks_queue.popleft()
            bridge_queue.append(truck)
            current_weight += truck
        else:
            bridge_queue.append(0)

    time += bridge_length

    return time