TC = int(input())

amount_y = 0
amount_k = 0

for i in range (TC) :

    for j in range(9) :
        y, k = map(int, input().split())
        amount_y += y
        amount_k += k

    if amount_y > amount_k :
        print('Yonsei')
    elif amount_k > amount_y :
        print('Korea')
    else:
        print('Draw')
