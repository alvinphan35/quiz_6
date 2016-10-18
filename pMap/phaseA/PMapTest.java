/** Phase A <ahp536><de5877>
 * Phase B <de5877><ahp536>
 */
package pMap.phaseA;

import org.junit.Test;

public class PMapTest {

	@Test
	public void test1() {
		PMap pmap = new PMap();
		pmap.put(0, 1);
		pmap.put(1, 2);
		pmap.put(2, 3);
		System.out.println(pmap.size());
		int[] keys = pmap.keys();
		for (int i : keys) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] values = pmap.values();
		for (int i : values) {
			System.out.print(i+" ");
		}
		System.out.println(pmap.size());
		
		pmap.clear();
		int[] keys2 = pmap.keys();
		for (int i : keys2) {
			System.out.print(i+" ");
		}
		int[] values2 = pmap.values();
		for (int i : values2) {
			System.out.print(i+" ");
		}
	}

	// TODO add more test cases to test all implemented methods
}
