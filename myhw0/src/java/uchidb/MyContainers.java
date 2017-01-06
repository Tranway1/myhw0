package uchidb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyContainers<T, S> implements Containers<T, S> {
	
	private Map<S, T> map = new HashMap<S,T>();

	
	public Set<T> initSet(T[] tArray){
		// TODO Auto-generated method stub
		Set<T> mySet = new HashSet<T>();
		for (T t : tArray)
			mySet.add(t);
		return mySet;
	}

	public List<T> initList(T[] tArray) {
		// TODO Auto-generated method stub
		List<T> myList = new ArrayList<T>();
		for (T t : tArray)
			myList.add(t);
		return myList;
	}

	public Map<S,T> initEmptyMap() {
		// TODO Auto-generated method stub
		Map<S,T> map =  new HashMap<S,T>();
		return map;
	}

	public void storeMap(Map<S,T> mapToStoreInClass) {
		// TODO Auto-generated method stub
		for (S key : mapToStoreInClass.keySet())
			map.put(key, mapToStoreInClass.get(key));
	}

	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
		// TODO Auto-generated method stub
		if (overwriteExistingKey){
			map.put(key, value);
			return true;	
		}
		else if (map.containsKey(key))
			return false;
		else{
			map.put(key, value);		
			return true;	
		}
	}
	
	public T getValueFromMap(S key, T defaultValue) {
		// TODO Auto-generated method stub
		if (map.containsKey(key))
			return map.get(key);
		return defaultValue;
	}


	public T getValueFromMap(S key) {
		// TODO Auto-generated method stub
		return map.get(key);
	}
	
	
//	public boolean equals(MyContainers<T, S> con){
//		if (map.equals(con.map))
//			return true;
//		else
//			return false;
//	}
}
