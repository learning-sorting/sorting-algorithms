def insertion_sort(arr):
    n = len(arr);
    for i in range(1,n):
        current = arr[i];
        j = i-1
        while j >= 0 and current < arr[j]:
            arr[j + 1] = arr[j]
            j = j - 1
        
        arr[j + 1] = current
    return arr

insertion_sort([1, 34, 2])
