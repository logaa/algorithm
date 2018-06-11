
public class BubbleSort {
			
	public static void main(String[] args) {
		
		Integer[] array = new Integer[]{17, 38, 5, 44, 15, 36, 26, 27, 2, 3, 4, 19, 50, 44, 46, 47, 48, 8, 11};
		
		bubbleSort(array);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}
		
	}

	public static void bubbleSort(Integer[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]){
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
	}
}
