package pkg03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Test03 t = new Test03();
		t.tell();
	}
	public void tell(){
		System.out.println("请输入日期：");
		Scanner sc = new Scanner(System.in);		
		String date =sc.nextLine();
//		获得年月日
		int year = Integer.parseInt(date.substring(0, 4));
		int mm = Integer.parseInt(date.substring(5, 7));
		int dd = Integer.parseInt(date.substring(8, 10));
		int eryue = 0;
		int day = 0;
//判断输入月份是否合法		
		if(mm>12 || dd >31){
			System.out.println("输入不合法");
		}
		
//判断平年和闰年		
		if (year%100 == 0){
			if(year%400 == 0){
				eryue = 29;
			}else{
				eryue = 28;
			}
		}else{
			eryue = 28;
		}
		
		switch (mm) {
		case 12:
			day+=30;
		case 11:
			day+=31;
		case 10:
			day+=30;	
		case 9:
			day+=31;
		case 8:
			day+=31;
		case 7:
			day+=30;
		case 6:
			day+=31;
		case 5:
			day+=30;
		case 4:
			day+=31;		
		case 3:
			day+=eryue;
		case 2:
			day+=31;
		case 1:
			day+=dd;
		default:
			break;
		}
		
		System.out.println("你输入的日期为当年的第"+day+"天");
		
	}
	
}
