package org.cap.com;

public class BootClass {

	public static void main(String[] args) {
		System.out.println("Hello from STS!!!");
		show();
	}
	public static void show()
	{
		int[] arr= {10,20,30,40};
		for(int i=0;i<100;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Show method here!");
	}
}
