# given n and k .return all possible combination of k numbers out of n.
# brute force
# def allCombination(n,k):
#     for i in range(1,n+1):
#         for j in range(i+1,n+1):
#             print(i,j)
# allCombination(4,3)
    
def allCombination(n,k,memo ={}):
    if n in memo: return memo[n]
    if n == 1 : return []

    allcomb = None

    for i in range(1,n):
        subresult = allCombination(n-i,k,memo)
        if subresult is not None:
            if len(subresult) > k:
                allcomb.extend(subresult)
                return [i]
            else:
                return subresult.append(i)
    return allcomb
    
print(allCombination(4,2))
