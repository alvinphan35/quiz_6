/** Phase A <de5877><>
 * Phase B <de5877><>
 */

package pMap.phaseB;

import java.util.Map;

/**
 * Map.Entry. Assume that key is an integer and value is a string.
 */

public class PEntry implements Map.Entry<Integer,String> {
	private int key;
	private String value;
	
	public PEntry(Integer k, String v){
		this.key = k;
		this.value = v;
	}

	public Integer getKey() {
		return key;
	}
	
	
	@Override
	public String getValue() {
		return value;
	}
	
	
	@Override
	public String setValue(String v) {
		String placeholder = value;
		this.value = v;
		return placeholder;
	}
	

}
