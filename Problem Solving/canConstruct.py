def canConstruct(target,wordBank,memo = {}):
    if target in memo : return memo[target]
    if target == '' : return True

    for word in wordBank:
        if target.startswith(word) == True:
            suffix = target[len(word):]
            if canConstruct(suffix,wordBank) == True:
                memo[target] = True
                return memo[target]
    memo[target] = False
    return memo[target]

print(canConstruct('abcdef',['ab','abc','cd','def','abcd']))
print(canConstruct('eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef',['e','eee','eeee','eeeeeeeeee','eeeeeeeeeeeee']))