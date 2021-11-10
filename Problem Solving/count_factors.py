def countFactors(m,n):
    # count factors common to m and n and return count
    # 10,15 count will be 2. since 1,5 as common factors of 10 15
    # find factors of m
    # find factors of n
    # count common value in both
    mfactors = []
    fact = []
    small,large = 0,0
    if m>n :
        small,large = int(n/2),m
        for i in range(1, small+1):
            if n % i == 0:
                mfactors.append(i)
        for i in mfactors:
            if large % i == 0:
                fact.append(i)
    else:
        small,large = int(m/2),n
        for i in range(1, small+1):
            if m % i == 0:
                mfactors.append(i)
        for i in mfactors:
            if large % i == 0:
                fact.append(i)
    
    return fact
print(countFactors(101,12))
# [1, 2, 5, 10, 25, 50]
# print(countFactors(3232323232310,112312312315))
# 0,1 => null
# 1,1 => 1 
# 1,2 => 1
# 2,4 => 1,2