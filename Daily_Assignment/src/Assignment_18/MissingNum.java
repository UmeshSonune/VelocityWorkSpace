package Assignment_18;

import java.util.Scanner;

public class MissingNum {
	public static void main(String[] args) {
		System.out.print("Enter Size of array --> ");
		Scanner cin = new Scanner(System.in); 
		int size =cin.nextInt(); 
		int[] a = new int[size];
		for(int i=0;i<size;i++) {
			
			System.out.print("Element at "+(i+1)+" --> ");
			a[i]=cin.nextInt();
			
			
		}
		
		System.out.println("Given Array ");
		for(int b:a) {
			
			System.out.print(b+" ");			
		}
		
		
		int smallNum=MissingNum.compare(a);
		int flag = smallNum;
		System.out.println("\n Starting From-->  "+ smallNum);
		int bigNum=0;
		for(int i=0;i<a.length;i++) {
			bigNum = MissingNum.findNum(a,smallNum);
			
			smallNum=bigNum;
			
			}
		System.out.println((bigNum+1)+" is missing from First sequesnce started from "+flag );
			
		
		
		
	}

	static public int compare(int[] a) {
		int num=a[0];
		for(int i=0;i<a.length;i++) {
			if(num>a[i]) {
				num=a[i];
			}
			
		}
		return num;
		
	}
	static public int findNum(int[] a,int num) {
		for(int i = 0;i<a.length;i++) {
			if(num+1==(a[i])) {
			 num=a[i];
			}
		}
		return num;
	}
}



