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
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		Collection<List<Integer>> value = map.values();	
		Iterator<List<Integer>> li = value.iterator();	
		
		int temp = 0;
		Set<Integer> set = map.keySet();
		for(int i = 0; i < 50; i ++){
			list.add(new Random().nextInt(100));
		}
		
		for(int j = 0; j < 50; j++){
			temp = list.get(j) / 10;
			map.put(new Integer(temp), arr[list.get(j)]);
		}
	}

}
