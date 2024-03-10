import os

s = 0
for i in os.listdir():
    if os.path.isdir(i):
        for j in os.listdir(i):
            if j.endswith('.py') or j.endswith('.java'):
                s += 1

print(s)