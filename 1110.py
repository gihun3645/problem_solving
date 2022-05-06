n = int(input())
num = n  # num을 변하는 값으로 지정
count = 0  # 사이클이 몇 번도는지

while True:
    a = num//10
    b = num % 10
    c = (a+b) % 10
    num = (b*10) + c
    count += 1
    if(num == n):
        break
print(count)
