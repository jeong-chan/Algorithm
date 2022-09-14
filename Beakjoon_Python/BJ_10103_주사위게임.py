game_round = int(input())

total_chang = 100
total_jeong = 100

for i in range (game_round) :
    chang, jeong = map(int, input().split())
    if chang > jeong :
        total_jeong = total_jeong - chang
    elif jeong > chang :
        total_chang = total_chang - jeong
    else :
        continue

print(total_chang)
print(total_jeong)
