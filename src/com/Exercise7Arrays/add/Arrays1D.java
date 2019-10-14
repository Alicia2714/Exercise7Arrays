package com.Exercise7Arrays.add;

public class Arrays1D {

	public static void main(String[] args) {
		
		final int ELEMENTS_ARRAY =10;
		
		int[] intArray = new int[ELEMENTS_ARRAY];
		char[] charArray = new char [ELEMENTS_ARRAY];
		boolean[] boolArray = new boolean [ELEMENTS_ARRAY];
		double[] dblArray = new double [ELEMENTS_ARRAY];
		String[] strArray = new String [ELEMENTS_ARRAY];
		
		int[] intArray2 ={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		char[] charArray2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		boolean[] boolArray2 = {true, false, false, false, true, true, true, true, false, false};
		double[] dblArray2 = {1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0};
		String[] strArray2 = {"Hola", "Holi", "Hello", "Adios", "Bye-bee", "Sayonara", "Good Bye", "Ocho", "Nueve", "Diez"};
		
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(intArray2[i]);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(charArray2[i]);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(dblArray2[i]);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(boolArray2[i]);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(dblArray2[i]);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++) {
			System.out.println(strArray2[i]);
		}

	}

}
