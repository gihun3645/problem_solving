n, x = map(int, input().split())
a = map(int, input().split(maxsplit=n))
b = []
for i in a:
    if i < x:
        b.append(str(i))
print(*b)
