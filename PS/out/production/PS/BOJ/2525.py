from curses import init_pair


H, M = map(int, input().split())
timer = int(input())

H += timer // 60
M += timer % 60

if M >= 60: # 1시 40분에서 30분을 요리하는 경우 
    H += 1 # 2시 10분이 되서 1시간이 늘어남
    M -= 60
if H >= 24: # 24시가 되어버린 경우 
    H -= 24

print(H, M)
