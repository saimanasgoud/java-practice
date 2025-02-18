// public class Arrays{
// public static void main(String args[]){

// //Selection sort...

// int a[] = new int[]{23, 4, 78, 4, 9, 0, 54, 12, 90, 55, 24};
// System.out.println("Original array:");
// for(int t : a)
// System.out.print(t + "\t");
// Arrays arrays = new Arrays();

// int[] selection = arrays.selectionSort(a);
// System.out.println("\nAfter selection sort:");
// for(int t : selection){
// System.out.print(t + "\t");
// }
// }

// int[] selectionSort(int a[]){

// for(int x = 0; x <= a.length - 2; x++){
// int mini = x;
// for(int y = mini + 1; y <= a.length - 1; y++){
// if(a[mini] > a[y]){
// mini = y;
// }
// }
// int temp = a[x];
// a[x] = a[mini];
// a[mini] = temp;
// }
// return a;
// }
// }

// 2d arrays..
// public class arrays {

// public static void main(String[] args) {
// int a[] = new int[]{12, 34, 87, 9, 8, 3, 1};
// int rows = 4, cols = 7;

// int b[][] = new int[rows][cols];

// for(int x = 0; x <= rows - 1; x++){
// for(int y = 0; y <= cols - 1; y++){
// System.out.print(b[x][y]);
// }
// System.out.println();
// }
// }
// }

// public class arrays {

// public static void main(String[] args) {

// int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// for(int r = 0; r < a.length; r++){
// for(int c = 0; c < a[r].length ; c++){
// System.out.print(a[r][c] + " ");
// }
// System.out.println();
// }
// }
// }

// public class arrays {

// public static void main(String[] args) {

// int rows = 5;

// for (int r = 0; r <= rows; r++) {
// for (int c = rows; c >= r; c--) {
// System.out.print(c + " ");
// }
// System.out.println();
// }
// }
// }

// public class arrays {

// 	public static void main(String[] args) {
// 		String str = "madam";
// 		if (isPalindrome(str)) {
// 			System.out.println(str + " is a palindrome.");
// 		} else {
// 			System.out.println(str + " is not a palindrome.");
// 		}
// 	}

// 	public static boolean isPalindrome(String str) {
// 		int left = 0;
// 		int right = str.length() - 1;

// 		while (left < right) {
// 			if (str.charAt(left) != str.charAt(right)) {
// 				return false;
// 			}
// 			left++;
// 			right--;
// 		}
// 		return true;
// 	}
// }

// public class arrays {

// 	public static void main(String[] args) {
// 		String s = "Hello all good morning";
// 		String s1[] = s.split(" ");

// 		int max = 0;
// 		String res = "";
// 		for (int x = 0; x < s1.length; x++) {
// 			String s2 = s1[x];
// 			int count = 0;
// 			for (int y = 0; y < s2.length(); y++) {
// 				char c = s2.charAt(y);
// 				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
// 						|| c == 'O' || c == 'U') {
// 					count++;
// 				}
// 			}
// 			System.out.println("Number of vowels in " + s2 + " is " + count);

// 			if (count > 0 && max < count) {
// 				max = count;
// 				res = s2;
// 			}
// 		}
// 		System.out.println("Word with maximum vowels is " + res);
// 	}
// }

class str {
	public static void main(String args[]) {

		String s = "apple";

		str st = new str();
		// System.out.println("vowels are " + st.vowels(s));
		// System.out.println("Sub strings are " + st.sub_string(s));
		// System.out.println("duplicates are " + st.dublicates(s));

		String s1 = st.sub_string(s);
		String a[] = s1.split(" ");
		for (int x = 0; x < a.length; x++) {
			String word = a[x];
			int no_of_dublicates = st.dublicates(word);
			if (no_of_dublicates == 0) {
				int vowels_count = st.vowels(word);
				if (vowels_count > 1) {
					System.out.println(word);
				}
			}
		}

	}

	int vowels(String s) {
		int count = 0;

		for (int x = 0; x < s.length(); x++) {
			char c = s.charAt(x);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}
		}
		return count;
	}

	String sub_string(String s) {
		String res = "";

		for (int x = 0; x < s.length(); x++) {
			for (int y = x + 1; y <= s.length(); y++) {
				String s1 = s.substring(x, y);
				res = res + s1 + "";
			}
		}
		// res = res.trim();
		return res;
	}

	int dublicates(String s) {
		String s1 = "";
		int count = 0;
		for (int x = 0; x < s.length(); x++) {
			char c = s.charAt(x);
			if (s.indexOf(c) != s.lastIndexOf(c)) {
				if (s1.indexOf(c) == -1) {
					count++;
					s1 = s1 + c;
				}
			}
		}
		return count;
	}
}
