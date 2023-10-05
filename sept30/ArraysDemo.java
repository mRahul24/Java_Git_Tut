package sept30;

import java.util.Iterator;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,203,43,435,232,43,56};
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
		}
		System.out.println(max);


	}

}
