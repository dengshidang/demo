package demo;

import java.util.concurrent.ConcurrentHashMap;
/**
 *
 * @author ASUS
 *2018/07/13
 */
public class ConcurrentHashMap2 {
	
	
	public static void main(String[] args) {
		 ConcurrentHashMap<String,Integer> map=new  ConcurrentHashMap<>(2);
		 map.put("a", 1);
		 map.put("b", 2);
		 map.put("3", 3);
		
		 System.out.println(map);
	}

}
