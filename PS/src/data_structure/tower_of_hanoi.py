# 이동 방향 표시

from time import perf_counter


def tower_of_hanoi(n, source, destin, temp):
    if n > 1:
        tower_of_hanoi(n-1, source, temp, destin)
        print("Move a disk from", source, "to", destin)
        tower_of_hanoi(n-1, temp, destin, source)
    else:
        print("Move a disk from", source, "to", destin)


tower_of_hanoi(3, "A", "C", "B")

# 이동 횟수 세기


def hanoi_count(n, source, destin, temp):
    global count  # 전역변수
    if n > 1:
        hanoi_count(n-1, source, temp, destin)
        count += 1
        hanoi_count(n-1, temp, destin, source)
    else:
        count += 1


count = 0

hanoi_count(3, "A", "C", "B")
print("moved", count, "times.")


# 계산 시간 구하기

def hanoi_time(n, source, destin, temp):
    global count
    if n > 1:
        hanoi_time(n-1, source, destin, temp)
        count += 1
        hanoi_time(n-1, temp, destin, source)
    else:
        count += 1


count = 0
start = perf_counter()
hanoi_time(24, "A", "C", "B")
finish = perf_counter()
cpu_time = round(finish-start, 1)
print(24, "disks:", count, "moves in", cpu_time, "seconds")
