package Assignment_18;

import java.util.Scanner;

public class DuplicateNum {
	public static void main(String[] args) {
		int[] a = {21,22,23,24,5,67,77,89,22};
		for(int i:a) {
			System.out.print(" - "+i);
				
			}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				
				if(i==j) {
					continue;
				}
				else if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
		}
		}
		}
				

		
	}

