def calc(a, b, r):
    if a > b:
        a, b = b, a
    x = min((a - b) // 2, r)
    print(a, b, r, x)
    print(">", abs((a ^ x) - (b ^ x)))
    print(">", abs((a ^ (x-1)) - (b ^ (x-1))))
    print(">", abs((a ^ (x-2)) - (b ^ (x-2))))

l = []
for _ in range(int(input())):
    l.append(list(map(int, input().split())))

for i in l:
    calc(i[0], i[1], i[2])