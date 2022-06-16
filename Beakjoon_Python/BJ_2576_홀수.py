list = []
for i in range(7):
    a = int(input())
    list.append(a)
list.sort()
list.reverse()

add_ans = 0
ans = 0
for i in list:
    if i%2 == 1:
        add_ans += i
        ans = i
    else:
        continue

if ans != 0:
    print(add_ans)
    print(ans)
else:
    print(-1)
