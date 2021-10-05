#include <iostream>

using namespace std;

int main()
{
    cout << "Enter size of an Array : ";
    int n;
    cin >> n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    cout << "Enter key : ";
    int key;
    cin >> key;

    int f = 0, l = n-1;
    bool ans = false;
    int cnt = 0;
    cnt += 2;

    while (f <= l)
    {
        cnt += 2;
        int mid = (f + l) / 2;
        if (key == arr[mid])
        {
            ans = true;
            cnt += 2;
            break;
        }
        else if (key < arr[mid])
        {
            cnt += 2;
            l = mid - 1;
        }
        else
        {
            cnt += 2;
            f = mid + 1;
        }
    }

    ans ? cout << "Found\n" : cout << "Not Found\n";
    cout<<"Count = "<<cnt<<endl;
    return 0;
}