def countConstruct(target,wordBank,memo={}):
    if target in memo: return memo[target]
    if target == '': return True

    totalCount = 0
    for word in wordBank:
        if target.startswith(word) == True:
            suffix = target[len(word):]
            numwayforrest = countConstruct(suffix,wordBank,memo)
            totalCount += numwayforrest

    memo[target] =  totalCount
    return memo[target]

print(countConstruct('abcdef',['ab','abc','cd','def','abcd']))
print(countConstruct('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef',['e','eee','eeee','eeeeeeeeee','eeeeeeeeeeeee']))