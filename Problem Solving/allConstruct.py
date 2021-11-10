def allConstruct(target,wordBank,memo = {}):
    if target in memo: return memo[target]
    if target == '' : return [[]]
    result = []
    for word in wordBank:
        if target.startswith(word) == True:
            suffix = target[len(word):]
            suffixways =  allConstruct(suffix,wordBank,memo)
            targetways = list(map(lambda  x : [word,*x] ,suffixways))
            result.extend(targetways)
    memo[target] =  result
    return memo[target]

print(allConstruct('purple',['purp','p','ur','le','purpl']))