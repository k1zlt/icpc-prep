def calc():
    d = {}
    a = list(map(int, input().split()))
    for i in range(len(a)):
        d[a[i]] = i
    b = list(map(int, input().split()))
    a.sort(key=lambda x: b[d[x]])
    b.sort()
    print(" ".join(map(str, a)))
    print(" ".join(map(str, b)))

for _ in range(int(input())):
    input()
    calc()