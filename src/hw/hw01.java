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
System.out.print(n);
for(int i=2;i<n;i++){ 
for(int j=1;j<=i;j++){ 
int sum=((i+j)*(i-j+1))/2; 

if(sum==n){ 
String s="="; 
for(int a=j;a<=i;a++){ 
	s+="+";
	s+=a; 


 }
System.out.print(s);
		    
 
		    } 
		    
		    }
		    }
	  }

}
