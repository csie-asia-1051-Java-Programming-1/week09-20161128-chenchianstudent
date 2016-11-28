package hw;
import java.util.Scanner;
/*
 * Topic: 块タ俱计 N羭计计禬筁 N ゎ
计:1 2 4 7 11 16 22 29
计:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021007 朝腝
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("叫块n");
int n=scn.nextInt();
int sum=1;
for(int i=0;i<=n;i++){
	sum=sum+i;
	System.out.print(sum+" ");
}
for(int i=1;i<=n;i++){
	for(int j=1;j<i+1;j++){
		System.out.print(i);}
	}

	}

}
