hh, mm, ss = map(int, input().split())
afterss = int(input())

if afterss<60 :
    ss = ss+afterss
else :
    mm = mm+afterss//60
    ss = ss+afterss%60

if ss>=60 :
    mm = mm+ss//60
    ss = ss%60

if mm>=60 :
    hh = hh+mm//60
    mm = mm%60

if hh >=24 :
    hh = hh%24

print(f"{hh} {mm} {ss}")
