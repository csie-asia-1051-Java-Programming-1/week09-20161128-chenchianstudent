package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021007 陳麒安
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入n");
		int n=scn.nextInt();
		int i=1;
		int sum=0;
		while(i<=n){
		float ans=n%i;
		if(ans==0){
			System.out.print(i+" ");
			sum=sum+1;
			}
		i=i+1;

		}
		if(sum==2){
			System.out.print("是質數");
		}else{
			System.out.println("不是質數");
		}
			}

		}

