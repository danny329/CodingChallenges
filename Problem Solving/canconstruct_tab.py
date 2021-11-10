def canconstruct(target,words): 
    table = [False]*(len(target)+1)
    table[0] = True

    for i in range(0, len(target)+1):
        if table[i]:
            for word in words:        
                if target[i:i+len(word)] == word:
                    if i+len(word) <= len(target):
                        table[i+len(word)] = True
    return table[len(target)]

print(canconstruct('abcdef',['ab','abc','cd','def','abcd']))