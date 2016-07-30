package pck04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.w3c.dom.Element;

public class Test04 {

	public static void main(String[] args) {
		Test04 t4 = new Test04();
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		int temp = 0;
//	生成50个随机数
		for(int i = 0; i < 50; i ++){
			list.add(new Random().nextInt(100));
		}
		System.out.println("随机生成的50个小于一百的数为：");
		for(int k = 0; k < list.size();k++){
			System.out.print(list.get(k)+",");
		}
		System.out.println();
//	将随机生成的50个数分组放入map中	
		for(int n = 0; n < 10; n++){
			List<Integer> list2 = new ArrayList<Integer>();			
			for(int j = 0; j < list.size(); j++){
				temp = list.get(j) / 10;
				if(n == temp){
					list2.add(list.get(j));
				}
			}
			map.put(Integer.valueOf(n), list2);
		}
	
//	读取排序前的map
		
		System.out.println(map);
//		读取map的value值进行排序
		
		
//	读取排序后的map
		Map<Integer, List<Integer>> new_map = new HashMap<Integer, List<Integer>>();
		
		Collection<List<Integer>> value = map.values();	
		Iterator<List<Integer>> li = value.iterator();		
				
		Set<Integer> key= map.keySet();
		Iterator<Integer> iter = key.iterator();
		for(int i = 0; i < value.size();i++){
			int key1 = 0;
			while (iter.hasNext()) {
				key1 = iter.next();
				break;
			}
			while (li.hasNext()) {
				new_map.put(key1, t4.sort(li.next()));
//				System.out.println(li.next());
				break;
			}
		}
		
		System.out.println(new_map);
		
	}
//  排序方法
	public List<Integer> sort(List<Integer> list){
		List<Integer> list3 = new ArrayList<Integer>();
		Integer [] arr = new Integer [list.toArray().length];
//	将传入的list转换为数组，因为toArray()得到的为Object[]对象，所以需要将Object[]转为Integer[]
		for(int k = 0; k < list.toArray().length; k++){  
		    arr[k] = Integer.parseInt(list.toArray()[k].toString());  
		}
		for(int i = 0 ; i < arr.length;i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr [j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int m = 0; m < arr.length;m++){
			list3.add(arr[m]);
		}
		return list3;
	}

}
