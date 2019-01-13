
public class Sort {
	 
	//冒泡排序 稳定排序 平局复杂度O(n^2) 
	public static void bubbleSort(int[] a) {
		if(a.length<=1) return;
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j]<a[j+1]) {
					int k = a[j];
					a[j] = a[j+1];
					a[j+1] = k;
					flag = true;
				}
			}
			if (!flag) return;
		}
	}
	
	//插入排序 稳定排序 平局复杂度 O(n^2)
	public static void insertionSort(int[] a) {
		if(a.length<=0) return;
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j]<a[j-1]) {
					int k = a[j];
					a[j] = a[j-1];
					a[j-1] = k;
				}else {
					break;
				}
			}
		}
	}
	
	//选择排序 不稳定排序 平均复杂度O(n^2)
	public static void selectionSort(int[] a) {
		if (a.length<=1) return;
		for (int i = 0; i < a.length-1; i++) {
			int min = a[i];
			int flag = i;
			for (int j = i; j < a.length; j++) {
				if (a[j]<min) {
					min = a[j];
					flag = j;
				}
			}
			int k = a[i];
			a[i] = a[flag];
			a[flag] = k;
		}
	}
	
	//希尔排序  不稳定排序 平均复杂nlog^2n
	public static void shellSort(int[] a) {
	    int number = a.length / 2;
	    int i,j,temp;
	    while (number >= 1) {
	        for (i = number; i < a.length; i++) {
	            temp = a[i];
	            j = i - number;
	            while (j >= 0 && a[j] < temp) {
	                a[j + number] = a[j];
	                j = j - number;
	            }
	            a[j + number] = temp;
	        }
	        number = number / 2;
	    }
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {2,1,5,32,4,6,3,24,42,6,2,3,6,3,2,7,8};
	
//		Sort.bubbleSort(a);
//		Sort.insertionSort(a);
//		Sort.selectionSort(a);
		Sort.shellSort(a);
		//检验是否正确排序
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
