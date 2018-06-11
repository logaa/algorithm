
public class QuickSort {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[]{17, 38, 5, 44, 15, 36, 26, 27, 2, 3, 4, 19, 50, 44, 46, 47, 48, 8, 11};
		
		quickSort(array, 0, array.length - 1);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}

	public static void quickSort(Integer[] array, int left, int right) {
		final int left_ = left;
		final int right_ = right;
		if(left <= right){ 
			int pivot = array[left];
			while(left != right) {
				while (left < right && array[right] >= pivot) right --;
				array[left] = array[right];
				while (left < right &&  array[left] <= pivot) left ++;
				array[right] = array[left];
			}
			array[right] = pivot;
			quickSort(array, left_, left - 1);
			quickSort(array, right + 1, right_);
		}
	}
}
