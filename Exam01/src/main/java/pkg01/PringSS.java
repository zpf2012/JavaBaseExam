package pkg01;

import java.util.ArrayList;
import java.util.List;


public class PringSS {
//	int arr [] = new int [50];
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 100; i < 200;i++){
			for(int j = 2; j <= i; j++){
				if(i%j == 0){
					break;				
				}else if(j == i-1){
					list.add(i);
				}
				
			}
		}
		System.out.print("101-200之间共有"+list.size()+"个素数,分别是：");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
		
	}
	

}
