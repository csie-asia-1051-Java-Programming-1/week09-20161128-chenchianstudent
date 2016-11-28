package hw;
import java.util.Scanner;
/*
 * Topic:讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021007 陳麒安
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入上限");
int n=scn.nextInt();
fun1(n);
	}
public static void fun1(int n){
for(int y=2;y<n/2;y++){ 
for(int x=1;x<y;x++){ 
int sum=(y+x)*(y-x+1)/2; 
	 if(sum==n){ 
	String result="z="; 
for(int a=x;a<=y;a++){ 
result+=a; 
result+="+"; 
 }
		    
 if(result.length()>0){ 
 System.out.println(result.substring(0, result.length()-1)); 
		    } 
		    
		    }
		    }
	  }
}}
