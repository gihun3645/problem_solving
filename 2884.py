H, M = map(int, input().split())
# 두 개의 정수를 받음

if M < 45 :
    if H == 0 : # 0 시이면 
        H == 23
        M += 60
    else: # 0시가 아니면 (0시 보다 크면)
        H -= 1
        M += 60