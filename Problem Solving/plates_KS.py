def plates(P,A,N,K):
    array.sort()
    m = 0
    for k,v in enumerate(array):
        if B >= v:
            B -= v
            m+=1
    return m
        

if __name__ == '__main__':
    no_of_testcases = int(input())
    
    for i in range(0, no_of_testcases):
        A = []
        N, K, P = list(map(int, input().split(" ")))
        for j in range(0,N):
            A.append(list(map(int, input().split(" "))))
        print('Case #'+str(i+1)+': ', plates(P,A,N,K))
    
    