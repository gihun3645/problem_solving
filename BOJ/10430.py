A, B, C = map(int, input().split())
# 3개의 수를 입력받는다. 

# map 함수를 쓰지 않는 경우
# A, B ,C = input().split()
# A = int(A)
# B = int(B)
# C = int(C)

print((A+B)%C, ((A%C)+(B%C))%C, (A*B)%C, ((A%C)*(B%C))%C, sep='\n')
# sep='\n'로 줄바꿈