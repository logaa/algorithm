
public class SelectionSort {

	
	
	
	public static void main(String[] args) {
		Integer[] array = new Integer[]{17, 38, 5, 44, 31, 36, 0, 27, 2, 3, 4, 19, 50, 44, 0, 47, 48, 8, 11};
		selectionSort(array);
		for (Integer integer : array) {
			System.out.println(integer);
		}
		
	}

	public static void selectionSort(Integer[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[minIndex] >= array[j]) minIndex = j;
			}
			if(array[minIndex] == array[i]) continue;
			array[minIndex] = array[minIndex] + array[i];
			array[i] = array[minIndex] - array[i];
			array[minIndex] = array[minIndex] - array[i];
		}
	}
}
