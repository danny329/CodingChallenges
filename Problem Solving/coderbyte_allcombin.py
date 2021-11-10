def combination(elements):
    if len(elements) == 0 : return [ [] ]
    frstele = elements[0]
    rest = elements[1:]
    combwithout = combination(rest)    
    combwith = []
    for i in combwithout:
        combwith.append([frstele,*i])
    return [*combwithout,*combwith]

if __name__ == '__main__':
    testcase  = int(input())
    for i in range(0, testcase):
        string = input()
        sorting = sorted(list(map(lambda x : ''.join(x),combination(list(string))))[1:])
        print(sorting.index(string)+1)