while True:
    n = int(input())
    cnt = 0  # 소수의 개수
    for i in range(n, 2*n+1):
        if i == 1:
            continue
        for j in range(2, int(i ** 0.5)+1):
            if i % j == 0:
                break
        else:
            cnt += 1
    print(cnt)
