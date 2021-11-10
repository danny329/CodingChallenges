def canSum(targetsum,numbers, memo = {}):
    if targetsum in memo:
        return memo[targetsum]

    if targetsum == 0 :
        return True

    if targetsum < 0 :
        return False

    for num in numbers:
        reminder = targetsum - num
        if canSum(reminder,numbers,memo) == True:
            memo[targetsum] = True
            return True

    memo[targetsum] = False
    return False

print(canSum(7,[2,3]))
print(canSum(7,[5,3,4,7]))
print(canSum(7,[2,4]))
print(canSum(8,[2,3,5]))
print(canSum(300,[7,14]))
# run each test separately