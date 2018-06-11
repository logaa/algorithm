
public class CountingSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[]{17, 38, 5, 44, 33, 15, 36, 26, 27, 2, 3, 4, 19, 50, 44, 46, 47, 48, 8, 11};
		countingSort(array);
		/*for (Integer integer : array) {
			System.out.println(integer);
		}*/
	}

	/**
	 * 
	 * @param array
	 */
	public static void countingSort(Integer[] array) {
		// 找出最大值、最小值
		int max = array[0];
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) max = array[i];
			if(array[i] < min) min = array[i];
		}
		// 最大最小元素之间范围[min, max]的长度
		int len = max - min + 1; 
		// 建立辅助数组，记录出现的次数，并初始化（0次）
		int[] timesOfArray = new int[len + 1];
		for (int i = 0; i < array.length; i++) {	
			// 使用加1后的索引，有重复的该位置就自增
			timesOfArray[array[i] - min + 1] ++;
		}
		// 频率 -> 元素的开始索引
        for (int i = 0; i < len; i++) {
        	timesOfArray[i + 1] += timesOfArray[i];
        }
        // 元素按照开始索引分类，用到一个和待排数组一样大临时数组存放数据
        int[] aux = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // 填充一个数据后，自增，以便相同的数据可以填到下一个空位
            aux[timesOfArray[array[i] - min]++] = array[i];
        }
        // 数据回写
        for (int i = 0; i < array.length; i++) {
        	array[i] = aux[i];
        }
	}	
}

















