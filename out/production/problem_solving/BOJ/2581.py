m = int(input())
n = int(input())

# 소수 찾기
list = []
for num in range(m, n+1):
    error = 0
    if num > 1:
        for i in range(2, num):
            if num % i == 0:
                error += 1
        if error == 0:
            list.append(num)
if list == []:
    print(-1)
else:
    print(sum(list))
    print(min(list))
