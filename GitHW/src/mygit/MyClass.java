package mygit;

// dev version

public class MyClass {

	public static int larger(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static int abs(int a) {
		if (a >= 0)
			return a;
		else
			return -a;
	}

	public static int median(int a, int b, int c) {
		if (a <= b) {		// 1
			if (b <= c)		// 2
				return b;	// 3	// 1 1 1
			else if (a <= c)// 4
				return c;	// 5	// 1 3 2
			else
				return a;	// 6	// 2 2 1
		}
		else {
			if (a <= c)		// 7
				return a;	// 8	// 2 1 2
			else if (b <= c)// 9
				return c;	// 10	// 2 1 1
			else
				return b;	// 11	// 3 2 1
		}
	}						// 12

	static int binarySearch(int list[], int key) {
		int low, high, middle;				// 1
		low = 0;
		high = list.length-1;

		while (low <= high) {				// 2
			middle = (low + high) / 2;		// 3
   			if (key == list[middle])		// 4
				return middle;				// 5
			else if (key > list[middle])	// 6
				low = middle + 1;			// 7
			else
				high = middle - 1;			// 8
		}
		return -1;							// 9
	}										// 10
}
