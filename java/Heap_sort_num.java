
public class Heap_sort_num {
	public static void main(String args[]) {
		int[] arr = {22,12,34,56,32,12,3 };
		
		Heap_sort_num hs = new Heap_sort_num();
		hs.heapsort(arr);
		
		hs.printArray(arr);
		
	}

	private void printArray(int[] arr) {
		System.out.println("sorted Heap---------------- ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
	}

	private void heapsort(int[] arr) {
		int len = arr.length;
		
		for(int i = (len/2)-1; i>=0;i--) {
			heapify(arr,len,i);
		}
		
//		swap the elements and heapify again
		for(int i=len-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr,i,0);
		}
	}

	private void heapify(int[] arr, int n, int i) {

//		parent index position
		int largest=i;
//		leftchild index position
		int li=2*i+1;
//		right child index position
		int ri=2*i+2;
		
		if(li<n && arr[li]>arr[largest])
			largest=li;
		if(ri<n && arr[ri]>arr[largest])
			largest=ri;
		
		if(largest!=i) {
		   int temp = arr[i];
		   arr[i]=arr[largest];
		   arr[largest]=temp;
		   
		   heapify(arr,n,largest);
		}
		
		}
}

