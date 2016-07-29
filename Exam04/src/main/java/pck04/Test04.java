package pck04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
		
		Collection<Integer[]> value = map.values();	
		Iterator<Integer[]> li = value.iterator();	
		
		int temp = 0;
		Set<Integer> set = map.keySet();
		for(int i = 0; i < 50; i ++){
			list.add(new Random().nextInt(100));
		}
		
		Integer[] arr = new Integer[50];
		for(int j = 0; j < 50; j++){
			temp = (int)list.get(j) / 10;
			map.put(new Integer(temp), arr[list.get(j)]);
		}
	}

}
