public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
        QuickSort ab = new QuickSort();
        
        System.out.println("sorted array"); 
        for(int i = 0; i < arr.length;i++) {
        	System.out.println(arr[i]); 
        }
	}

}
