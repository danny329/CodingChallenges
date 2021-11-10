def howsum(target,numbers):
    table = [None]*(target+1)    
    table[0] = []    
    for i in range(0,target+1):
        if table[i] is not None:
            for num in numbers:
                if (i+num) <= target :
                    table[i+num] = [ *table[i], num ]
    return table[target]

print(howsum(8,[2,3,5]))