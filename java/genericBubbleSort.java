package java;

public class genericBubbleSort
{
    public static void main(String[] args) {

        Integer[] a={3,2,67,98,3};

        bubbleSort(a);
        display(a);

        car[] cars = new car[4]; // allocated contiguous memory locations for 5 car objects
        cars[0] = new car(100,2000, "Y");
        cars[1] = new car(60,3000, "B");
        cars[2] = new car(90,8000, "G");
        cars[3] = new car(50,1000, "R");

        bubbleSort(cars);
        display(cars);


    }

    private static <T extends Comparable<T>> void bubbleSort(T[] a)
    {
        // larger values go to back
        int n = a.length;

        for (int i = 0; i < n-1; i++)
        {
            for (int j=0; j<n-i-1; j++)
            {
                if(a[j].compareTo(a[j+1]) >0) //swap
                {
                    T temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
            }

        }
    }

    private static <T> void display(T[] arr) {

        for(T val : arr)
            System.out.print(val + " ");

        System.out.println();
    }
}
