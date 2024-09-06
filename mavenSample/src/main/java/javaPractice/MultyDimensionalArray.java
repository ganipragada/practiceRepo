package javaPractice;

import java.util.Arrays;
import java.util.List;

public class MultyDimensionalArray {

	public static void main(String[] args) {
		int[][] i = new int[2][2];
		i[0][0] = 1;
		i[0][1] = 2;
		i[1][0] = 3;
		i[1][1] = 4;
		
		int[][] a = {{10,20},{30,40},{50,60}};
		
		List<int[]> arrayListI =  Arrays.asList(i);
        List<int[]> arrayListA = Arrays.asList(a);
        for (int j = 0; j < a.length; j++) {
        	System.out.println(a);
		}

        System.out.println("ArrayList from array i: " + arrayListI);
        System.out.println("ArrayList from array a: " + arrayListA);
	}

}
