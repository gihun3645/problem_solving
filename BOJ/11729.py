n = int(input())


def hanoi(n, source, destin, temp):
    if n > 1:
        hanoi(n-1, source, temp, destin)
        print(source, destin)
        hanoi(n-1, temp, destin, source)
    else:
        print(source, destin)


count = 2 ** n - 1
print(count)

hanoi(n, "1", "3", "2")
