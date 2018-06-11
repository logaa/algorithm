
public class HeapSort {

	public static void main(String[] args) {
		Integer[] array = new Integer[]{17, 38, 5, 44, 33, 15, 36, 26, 27, 2, 3, 4, 19, 50, 44, 46, 47, 48, 8, 11};
		//array = asc(array);
		 array = desc(array);
		for (Integer integer : array) {
			System.out.println(integer);
		}
		
	}

	/**
	 * 升序（大顶堆）
	 * @param array
	 * @return
	 */
	public static Integer[] asc(Integer[] array) {
		int len = array.length;
		while (len > 1) {
			// 无序数组大顶堆排序
			bigHeapify(array, len);
			// 交换堆顶元素与末尾元素
			swap(array, 0, len - 1);
			len --;
		}
		return array;
	}

	/**
	 * 大顶堆
	 * @param array
	 */
	private static void bigHeapify(Integer[] array, int length) {
		for (int i = length / 2 - 1; i >= 0; i--) {
			int lNode = i * 2 + 1;
			int rNode = i * 2 + 2;
			if(array[i] < array[lNode]){ // 左节点大于父节点时，交换值
				swap(array, i, lNode);
			}
			if(rNode < length && array[i] < array[rNode]){ // 右节点大于父节点时，交换值
				swap(array, i, rNode);
			}
		}
	}
	
	/**
	 * 降序（小顶堆）
	 * @param array
	 * @return
	 */
	public static Integer[] desc(Integer[] array) {
		int len = array.length;
		while (len > 1) {
			// 无序数组小顶堆排序
			smallHeapify(array, len);
			// 交换堆顶元素与末尾元素
			swap(array, 0, len - 1);
			len --;
		}
		return array;
	}

	/**
	 * 小顶堆
	 * @param array
	 * @return
	 */
	private static void smallHeapify(Integer[] array, int length) {
		for (int i = length / 2 - 1; i >= 0; i--) {
			int lNode = i * 2 + 1;
			int rNode = i * 2 + 2;
			if(array[i] > array[lNode]){ // 左节点小于于父节点时，交换值
				swap(array, i, lNode);
			}
			if(rNode < length && array[i] > array[rNode]){ // 右节点小于于父节点时，交换值
				swap(array, i, rNode);
			}
		}
	}
	
	/**
	 * 交换值
	 * @param array
	 * @param s
	 * @param t
	 */
	private static void swap(Integer[] array, int s, int t) {
		array[s] = array[s] + array[t];
		array[t] = array[s] - array[t];
		array[s] = array[s] - array[t];
	}
}
