H, M = map(int, input().split())
# 두 개의 정수를 받음

if M >= 45: 
    print(H, M - 45)
else:
    print(H - 1, 60 - (45-M))