package pkg02;

import java.io.IOException;
import java.util.Scanner;

public class Test02 {
	static int shbzj = 0;
	public static void main(String[] args){
		System.out.print("请输入工资：");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		
		int j = salary - shbzj - 3500;
//		System.out.println(j);
		float shui = 0.00f;
		if(j < 0){
			shui = 0;
		}else if(j <= 1500){
			shui = j*0.03f;
		}else if(j <= 4500){
			shui = j*0.1f;
		}else if(j <= 9000){
			shui = j*0.2f;
		}else if(j <= 35000){
			shui = j*0.25f;
		}else if(j <= 55000){
			shui = j*0.3f;
		}else if(j <= 80000){
			shui = j*0.35f;
		}else{
			shui = j*0.45f;
		}
		
		System.out.println("所需要缴纳的税费为："+shui);
	}
	

}
