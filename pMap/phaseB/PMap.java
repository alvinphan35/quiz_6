/** Phase A <de5877><>
 * Phase B <de5877><>
 */
package pMap.phaseB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import pMap.phaseA.Entry;

/**
 * PMap stands for Paired Map. A map is a collection of key value pairs, e.g.,
 * (1, "one") (2, "two") (3, "three") are all pairs with a key that's a integer and a value
 * that's an string.
 */

public class PMap implements Map<Integer,String> {
	private HashSet<Entry<Integer, String>> map = new HashSet<Entry<Integer,String>>();
	
	@Override
	public int size() {
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		
		int size = 0;		
		while(iterator.hasNext()){
			/* Advance pointer */
			iterator.next();
			/* Update size */
			size++;
		}
		return size;
	}

	@Override
	public boolean isEmpty() {
		if(map.size() == 0){ return true; }
		else{ return false; }		
	}

	@Override
	public boolean containsKey(Object key) {
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		
		/* Iterate through map to look for key */
		while(iterator.hasNext()){
			/* return true if key exists */
			if(iterator.next().getKey() == key){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		
		/* Iterate through map to find value */
		while(iterator.hasNext()){
			/* If value exists return true (cannot use == due to it being a string */
			if(iterator.next().getValue().equals(value)){
				return true;
			}
		}
		return false;
	}

	@Override
	public String get(Object key) {
		Iterator<Entry<Integer, String>> iterator = map.iterator();
		Entry<Integer,String> placeholder;
		
		/* Iterate through map to get value from particular entry */
		while(iterator.hasNext()){
			/* Pull the object entry */
			placeholder = iterator.next();
			/* Check for matching key */
			if(placeholder.getKey() == key){
				/* Return value if key matches */
				return placeholder.getValue();
				}
			}
		/* Else return null */
		return null;
	}

	@Override
	public String put(Integer key, String value) {
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		String previousValue;
		Entry<Integer, String> placeholder;
		
		/* Iterate through map to check if entry already exists */
		while(iterator.hasNext()){
			/* Place entry in temp spot for inspection */
			placeholder = iterator.next();
			/* If keys match, set new value and return previous value */
			if(placeholder.getKey() == key){
				previousValue = placeholder.getValue();
				placeholder.setValue(value);
				return previousValue;
			}
		}
		/* If not in map, then add new Entry and return null */
		map.add(new PEntry(key, value));
		return null;
	}

	@Override
	public String remove(Object key) {
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		PEntry placeholder;
		String previousValue;
		
		/* Iterate through map to find matching entry */
		while(iterator.hasNext()){
			placeholder = (PEntry)iterator.next();
			/* If we find a match, remove entry and return previous value */
			if(placeholder.getKey() == key){
				previousValue = placeholder.getValue();
				iterator.remove();
				return previousValue;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void putAll(Map<? extends Integer, ? extends String> m) {
		Iterator<Entry<Integer,String>> iterator = ((HashSet<java.util.Map.Entry<Integer, String>>) m).iterator();
		
	
		
		
	}

	@Override
	public void clear() {
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		/* While entries exist we iterate and remove */
		while(iterator.hasNext()){
			iterator.next();
			iterator.remove();
			
		}
		
	}


	@Override
	public Set<Integer> keySet() {
		Set<Integer> keys = new HashSet<Integer>();
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		
		/* Iterate through map and store keys in hashset to return */
		while(iterator.hasNext()){
			keys.add(iterator.next().getKey());
		}
		return keys;
	}


	@Override
	public Collection<String> values() {
		Collection<String> values = new ArrayList<String>();
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		
		/* Iterate through map and put all values in collection of Strings to return */
		while(iterator.hasNext()){
			values.add(iterator.next().getValue());
		}
		return values;

	}

	@SuppressWarnings("null")
	@Override
	public Set<Entry<Integer, String>> entrySet() {
		Set<Entry<Integer, String>> entry_set = null;
		Iterator<Entry<Integer,String>> iterator = map.iterator();
		
		/* Iterate through map and add all entries to set to return */
		while(iterator.hasNext()){
			entry_set.add(iterator.next());
		}
		return entry_set;
	}

	

}
