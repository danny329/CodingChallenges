def gridTraveller(m,n,memo={}):
    key = ','.join(str([m,n]))
    if key in memo:
        return memo[key]
    if m == 0 or n == 0:
        return 0
    
    if m == 1 and n == 1 :
        return 1
    
    memo[key] = gridTraveller(m-1,n,memo) + gridTraveller(m,n-1,memo)
    return memo[key]

print(gridTraveller(1,1))
print(gridTraveller(2,3))
print(gridTraveller(3,2))
print(gridTraveller(3,3))
print(gridTraveller(18,18))