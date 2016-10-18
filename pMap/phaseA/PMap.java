/** Phase A <ahp536><de5877>
 * Phase B <de5877><ahp536>
 */
package pMap.phaseA;

/**
 * PMap stands for Paired Map. A map is a collection of key value pairs, e.g.,
 * (1, 2) (2, 3) (3, 4) are all pairs with a key that's a integer and a value
 * that's an integer
 */
public class PMap {

	Entry[] map = new Entry[1000];
	private static int totalCount = 0;
	
	public int size() {
		return totalCount;
	}

	public boolean isEmpty() {
		if(totalCount == 0){
			return true;
		}

		return false;
	}

	public boolean containsKey(int key) {

		int i = 0;
		for (; map[i] != null; i++){
			if (map[i].getKey() == key){
				return true;
			}
		}
		return false;
	}

	public boolean containsValue(int value) {
		int i = 0;
		for (; map[i] != null; i++){
			if (map[i].getValue() == value){
				return true;
			}
		}
		return false;

	}

	public int get(int key) {

		int i = 0;
		for (; map[i] != null; i++){
			if (map[i].getKey() == key){
				return map[i].getValue();
			}
		}
		
		
		return 0;
	}

	public int put(int key, int value) {

		int i = 0;
		
		if(map[0] == null){
			map[0] = new Entry(key, value);
			totalCount += 1;
			return 0;
		}
		
		for (; map[i] != null; i++){
			if (containsKey(key)){
				int placeholder = map[i].getValue();
				map[i].setValue(value);
				return placeholder;
			}
		}
		map[i] = new Entry(key,value);
		totalCount += 1;
		return 0;
	}

	public int remove(int key) {

		if(containsKey(key)){
			int i = 0;
			int placeholder = 0;
			for (; map[i] != null; i++){
				if (map[i].getKey() == key){
					placeholder = map[i].getValue();
					for(;i < totalCount; i++){
						map[i] = map[i+1];
					}
				}
			}
				totalCount -= 1;
				return placeholder;
		}
		else{
			return 0;
		}

	}

	public void putAll(int[] keys, int[] values) {
		for (int i = 0; i < keys.length; i++){
			put(keys[i], values[i]);
		}
		
	}

	public void clear() {
			int i = 0;
			for (; map[i] != null; i++){
				map[i] = null;
			}
			totalCount = 0;
	}

	public int[] keys() {
		int[] keylist = new int[totalCount];
		
		for(int i = 0 ; map[i] != null; i++){
			
			keylist[i] = map[i].getKey();
		}
		return keylist;

	}

	public int[] values() {
		int[] valuelist = new int[totalCount];
		
		for(int i = 0 ; map[i] != null; i++){
			
			valuelist[i] = map[i].getValue();
		}
		return valuelist;
	}

	public Entry[] entrys() {
		// TODO Auto-generated method stub
		return map;
	}

}
