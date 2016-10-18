/** Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pMap.phaseA;

/**
 * Map.Entry, assume that the key and value are both integers.
 */
public class Entry {
	private int key;
	private int value;

	public int getKey(){
		return this.key;
	}
	public void setKey(int key){
		this.key = key;
	}
	public void setValue(int value){
		this.value = value;
	}
	public int getValue(){
		return this.value;
	}
	public Entry(int key, int value) {
		this.key = key;
		this.value = value;
	}
	// TODO
}
