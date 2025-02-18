// public class darrays{
// 	public static void main(String rgs[]){

// 	//Selection sort...

// 	int a[] = new int[]{23, 4, 78, 4, 9, 0, 54,1, 12, 90, 55, 24};
// 	darrays arrays = new darrays();
// 	int selection = arrays.selectionSort(a);
// 	System.out.println("\nSorted array:");
//         for (int num : a) {
//             System.out.print(num + "\t");
//         }
// 	System.out.print(selection);
// }

// int selectionSort(int a[]){

// 	for(int x = 0; x <= a.length - 2; x++){
// 		int mini = x;
// 		for(int y = mini + 1; y <= a.length - 1; y++){
// 			if(a[mini] > a[y]){
// 				mini = y;
// 			}
// 		}
// 			int temp = a[x];	
// 			a[x] = a[mini];
// 			a[mini] = temp;
// 			}	

// 		// for(int t : a)
// 		// 	System.out.print(t + "\t");

// 	return a[0];
// 	}
// }

//2 arrays

public class darrays {

	public static void main(String[] args) {
		int a[] = new int[] { 12, 34, 70, 23, 1 };
		int b[] = new int[a.length];
		int insert = 2, element = 100;
		for (int x = 0; x < insert; x++) {
			b[x] = a[x];
		}
		b[insert] = element;
		int y = insert;

		for (int x = insert + 1; x < a.length; x++, y++) {
			b[x] = a[y];
		}

		for (int t : b) {
			System.out.println(t);
		}
	}
}