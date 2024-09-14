def sumZero(arr):
    map={}
    map[0]=[-1]  
    ans=[]
    sum=0
    for i in range(len(arr)):
        sum+=arr[i]
        if sum in map:
            for start_index in map[sum]:
                ans.append((start_index+ 1,i))
        if sum not in map:
            map[sum]=[]
        map[sum].append(i)
    return ans




ans=sumZero([1, 2, -3, 3, -1, 2])
print(ans)

