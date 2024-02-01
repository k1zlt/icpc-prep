import math

l = []
for _ in range(int(input())):
    l.append(list(map(int, input().split())))

for i in l:
    print(i[0] * math.floor(i[1]/2))