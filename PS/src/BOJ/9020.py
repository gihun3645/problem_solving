# 소수 집합 만들기
nums = {x for x in range(2, 10_001) if x == 2 or x % 2 == 1}
# nums : 2와 홀수로 이루어진 집합
for odd in range(3, 101, 2):
    nums -= {i for i in range(2 * odd, 10_001, odd) if i in nums}
    # 홀수의 배수로 이루어진 집합을 빼줌

# 골드바흐 수를 출력
t = int(input())
for _ in range(t):
    even = int(input())
    half = even//2  # 입력받은 짝수를 2로 나눈 몫을 구함
    for x in range(half, 1, -1):  # 차이가 적은 두 수를 구하기 위해서 큰 수부터 꺼냄
        if (even-x in nums) & (x in nums):
            print(x, even-x)
            break
