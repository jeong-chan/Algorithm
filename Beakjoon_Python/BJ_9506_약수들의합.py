while True:

    number = int(input())

    # 종료조건
    if number == -1:
        break

    tmp_numbers = []

    for i in range(1, number):
        if number % i == 0:
            tmp_numbers.append(i)

    if sum(tmp_numbers) == number:
       print(number, '=', ' + '.join(str(i) for i in tmp_numbers))
    else:
       print(number, 'is NOT perfect.')
