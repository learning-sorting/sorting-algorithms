def quicksort(lst):
    l = len(lst)
    if l < 2:
        return lst
    cp = 0 
    for i in range(1, l): 
         if lst[i] <= lst[0]:
              cp += 1
              local = lst[i]
              lst[i] = lst[cp]
              lst[cp] = local
    local = lst[0]
    lst[0] = lst[cp] 
    lst[cp] = local 
    L = quicksort(lst[0:cp]) 
    R = quicksort(lst[cp+1:l]) 
    lst = L + [lst[cp]] + R 
    return lst
lst = list(map(int,input().split()))
print(quicksort(lst))
