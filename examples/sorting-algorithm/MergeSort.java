import java.util.Arrays;

public class MergeSort {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] array = new Integer[]{17, 38, 5, 44, 15, 36, 26, 27, 2, 3, 4, 19, 50, 44, 46, 47, 48, 8, 11};
		for (Integer integer : mergeSort(array)) {
			System.out.println(integer);
		}
	}

	
	
	public static Integer[] mergeSort(Integer[] array) {
		if(array.length < 2) return array;
		int middle = array.length / 2;
		Integer[] lArr = Arrays.copyOfRange(array, 0, middle);
		Integer[] rArr = Arrays.copyOfRange(array, middle, array.length);
		return sort(mergeSort(lArr), mergeSort(rArr));
	}
	
	private static Integer[] sort(Integer[] lArr, Integer[] rArr) {
		Integer[] array = new Integer[lArr.length + rArr.length];
		int index = 0;
		int r = 0;
		int l = 0;
		while (index < lArr.length + rArr.length) {
			if(l < lArr.length && r < rArr.length && rArr[r] > lArr[l]){
				array[index] = lArr[l];
				l++;
				index ++;
			}else if(r < rArr.length){
				array[index] = rArr[r];
				r++;
				index ++;
			}else{
				while (index < lArr.length + rArr.length && r < rArr.length){
					array[index] = rArr[r];
					r++;
					index ++;
				}
				while (index < lArr.length + rArr.length && l < lArr.length){
					array[index] = lArr[l];
					l++;
					index ++;
				}
			}
		}
		return array;
	}
	
	
}
