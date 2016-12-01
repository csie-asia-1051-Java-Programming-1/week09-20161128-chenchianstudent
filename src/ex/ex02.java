package ex;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021007 陳麒安
 */

public class ex02 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
ArrayList<data> studList=new ArrayList<data>();
studList.add(new data("aa","123456"));
studList.add(new data("bb","789665"));
studList.add(new data("cc","454545"));
//學生
System.out.print("請輸入國文 英文 數學(每人)成績:");
for(int i=0;i<3;i++){
studList.get(i).setChinese(scn.nextInt());
studList.get(i).setEnglish(scn.nextInt());
studList.get(i).setMath(scn.nextInt());
studList.get(i).setAvg();
}
float data[]=new float[3];
float ans;
for(int i=0;i<3;i++){
	data[i]=studList.get(i).getAvg();
	}
for(int i=0;i<3-1;i++){
	for(int j=0;j<3-1-i;j++){
		if(data[j]<data[j+1]){
			ans=data[j];
			data[j]=data[j+1];
			data[j+1]=ans;//大小順序
			}
		}
	}
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		if(data[i]==studList.get(j).getAvg())
			studList.get(j).showInfo();
	}
	}
}
}
class data{
private String id,name;
private int chinese,english,math;
private float avg;
public data(String id1,String name1){
	id=id1;
	name=name1;
}
public void setChinese(int ch1){
	chinese=ch1;
}
public int getChinese(){
	return chinese;
}
public void setEnglish(int eng1){
	english=eng1;
}
public int getEnglish(){
	return english;
}
public void setMath(int math1){
	math=math1;
}
public int getMath(){
	return math;
}
public void setAvg(){
	avg=(chinese+english+math)/3f;
}
public float getAvg(){
	return avg;
}
public void showInfo(){
	System.out.println(id+"\t"+name+"\t"+chinese+"\t"+english+"\t"+math+"\t"+avg);
}	
}