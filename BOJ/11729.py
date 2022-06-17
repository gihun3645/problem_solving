n = int(input())

count = 2 ** n - 1
print(count)


def hanoi(n, source, destin, temp):
    if n > 1:
        hanoi(n-1, source, temp, destin)
        print(source, destin)
        hanoi(n-1, temp, destin, source)
    else:
        print(source, destin)


hanoi(n, "1", "3", "2")
