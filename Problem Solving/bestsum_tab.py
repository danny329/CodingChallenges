def bestsum(target,numbers):
    table = [None]*(target+1)
    table[0] = []

    for i in range(0,target+1):
        if table[i] is not None:
            for num in numbers:
                if (i+num) <= target: 
                    new_set = [*table[i],num]
                    if table[i+num] is None or len(new_set) < len(table[i+num]):
                            table[i+num] = new_set
    return table[target]

print(bestsum(100,[1,2,5,25]))