TC = int(input())

ans = ''
ans_amount = 0

for i in range (TC) :
    num = int(input())

    for j in range(num) :
      name, amount = input().split()

      if int(amount) > int(ans_amount) :
        ans_amount = max(int(amount),int(ans_amount))
        ans = name

    print(ans)
