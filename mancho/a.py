import math

n = int(input())
m = 1000000007
l = []
result = 0
for i in range(1, min(n + 1, m)):
    i2 = i
    i2 = pow(int(math.sqrt(i2)), 2)
    while True:
        if i % i2 == 0:
            result += i2
            break
        i2 = pow(int(math.sqrt(i2)) - 1, 2)
        # print(i2)
    result %= m
if (n > m):
    print(result * 2 % m)
else:
    print(result)
# print(l)