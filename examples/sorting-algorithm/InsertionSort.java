
public class InsertionSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[]{17, 38, 5, 44, 33, 15, 36, 26, 27, 2, 3, 4, 19, 50, 44, 46, 47, 48, 8, 11};
		//Integer[] array = new Integer[]{17, 38, 5, 6};
		
		insertionSort(array);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

	public static void insertionSort(Integer[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int prevIndex = i - 1;
			while (prevIndex >= 0 && array[prevIndex] > current) {
				array[prevIndex + 1] = array[prevIndex];
				prevIndex --;
			}
			array[prevIndex + 1] = current;
		}
	}

}
