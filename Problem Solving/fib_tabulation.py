def fib(n):
    table = [0] * (n+1)
    table[1] = 1
    for i in range(0,n):                        
        table[i+1] += table[i]        
        if i+2 <= n:
            table[i+2] += table[i]
    return table[n]
print(fib(50))