def bestSum(targetSum,numbers,memo={}):
    if targetSum in memo : return memo[targetSum]
    if targetSum == 0 : return []
    if targetSum < 0 : return None

    shortestCombination = None

    for num in numbers:
        reminder = targetSum - num
        remainderCombination = bestSum(reminder,numbers,memo)
        if remainderCombination is not None:
            combination = [*remainderCombination,num]
            if shortestCombination == None or len(combination) < len(shortestCombination) : 
                shortestCombination = combination.copy()
    memo[targetSum] =  shortestCombination
    return memo[targetSum]


# print( bestSum(7,[2,3]))
# print(bestSum(7,[5,3,4,7]))
# print(bestSum(7,[2,4]))
# print(bestSum(8,[2,3,5]))
print(bestSum(100,[1,2,5,25]))

