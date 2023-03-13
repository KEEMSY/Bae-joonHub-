from collections import deque

def solution(bridge_length, weight, truck_weights):
    answer = 0
    bridge = [0] * bridge_length
    
    bridge = deque(bridge)
    truck_weights = deque(truck_weights)
    
    weight_sum = 0
    while len(bridge) != 0:
        answer += 1
        
        bridge_front = bridge.popleft()
        if bridge_front != 0:
            weight_sum -= bridge_front
        
        if truck_weights:
            if weight_sum + truck_weights[0] <= weight:
                into_truck = truck_weights.popleft()
                weight_sum += into_truck
                bridge.append(into_truck)
            else:
                bridge.append(0)
    return answer