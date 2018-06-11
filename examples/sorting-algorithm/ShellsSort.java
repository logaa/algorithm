
public class ShellsSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[]{17, 38, 5, 44, 33, 15, 36, 26, 27, 2, 3, 4, 19, 50, 44, 46, 47, 48, 8, 11};
		
		sort(array);
	}

	private static void sort(Integer[] array) {
		shellsSort(array);
	}

	private static void shellsSort(Integer[] array) {
		int cri = array.length / 2; //
		for (int i = 0; i <= cri; i++) {
			Integer[] temp = new Integer[]{};
			temp[i] = array[i];
			for (int j = 1; j * cri < array.length; j++) {
				temp[j] = array[j * cri + 1];
			}
			if(temp.length > 1){
				shellsSort(temp);
			}
		}
	}

}
