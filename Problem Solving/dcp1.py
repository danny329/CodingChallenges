# canSum with memo
# DCP1
def canSum(targetSum, numbers, memo = {}):
    if targetSum in memo:
        return memo[targetSum]
    if targetSum == 0:
        return True
    if targetSum < 0:
        return False
    for num in numbers:
        reminder = targetSum - num
        numbers.remove(num)
        if canSum(reminder,numbers,memo) == True:
            memo[targetSum] = True
            return True
    memo[targetSum] = False
    return False

print(canSum(300,[7,14]))