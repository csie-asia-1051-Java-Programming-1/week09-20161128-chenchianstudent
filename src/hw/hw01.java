package hw;
import java.util.Scanner;
/*
 * Topic:���ϥΪ̿�J�@����ơA�Q�Ψ禡�I�s��X�@�s���ƼƦC���ӼƦC���M�����@����ơA���ǥ���ƨä����X�s���ơA�Y�䤣��ɡA�ЦL�X�uNo�v�C
�Ҧp: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021007 ���Q�w
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�W��");
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
