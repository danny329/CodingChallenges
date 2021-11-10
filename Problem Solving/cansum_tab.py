def cansum(target,numbers):
    table = [False]*(target+1)
    table[0] = True
    for i in range(0,target+1):    
        if table[i]:
            for num in numbers:
                if i+num <= target: table[i+num] = True
    return table[target]


print(cansum(8,[2,3,5]))