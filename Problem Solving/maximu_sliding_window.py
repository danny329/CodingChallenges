# brute force approach O(N*K)
def m_s_w(array_num,window):
    final = []
    for i in range(len(array_num)-window+1):
        limit=i+window
        max = array_num[i]
        for j in range(i+1,limit):
            if max < array_num[j]:
                max = array_num[j]
        final.append(max)
    print(final)
m_s_w([1,3,-1,-3,5],3)