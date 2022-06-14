# for문

n = int(input(" 20보다 작거나 같은 자연수 또는 0 : "))

list = [0, 1]
for i in range(2, n+1):
    num = list[i-1] + list[i-2]
    list.append(num)
print(list[n])


# 재귀 함수

def fibonacci(n):
    if n <= 1:
        return 0
    return fibonacci(n-1) + fibonacci(n-2)


n = int(input())
print(fibonacci)
