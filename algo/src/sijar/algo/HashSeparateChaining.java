package sijar.algo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * author sijar ahmed
 * @param <K>
 * @param <V>
 */
public class HashSeparateChaining<K,V> {

	private int INITIAL_CAPACITY = 10;
	private HashNode<K,V>[] bucket = (HashNode<K, V>[]) Array.newInstance(HashNode.class,INITIAL_CAPACITY);
	private int no_of_keys;

	@Override
	public String toString() {
		return "HashSeparateChaining{" +
				"bucket=" + Arrays.toString(bucket) +
				'}';
	}
//public boolean  equals(K o) {}
	//public int      hashCode() {}

	public int size() {
		return no_of_keys;
	}

	public boolean isEmpty() {
		return (no_of_keys==0)?true:false;
	}

	public boolean containsKey(K key) {
		return false;
	}

	public boolean containsValue(V value) {
		return false;
	}

	public K get(K key) {
		return null;
	}

	public K put(K key, V value) {
		int slab = key.hashCode() % bucket.length; //Note:- hashcode is RAM memory address if not overriden
		//System.out.println("HashValue= "+ key.hashCode());
		System.out.println("Hash code=" + (slab-1) + " for key=" + key);
		if(bucket[slab-1] == null){
			bucket[slab-1] = new HashNode<>();
		}
		bucket[slab-1].put(key,value);
		return key;
	}

	public K remove(K key) {
		return null;
	}


	public void clear() {

	}

	/*public Set keySet() {
		Set keyset = new LinkedHashSet();
		for(K k : bucket){
			keyset.add(k);
		}
		return keyset;
	}
	public Collection values() {
		return null;
	}
	*/


	public static void main(String[] args) {
		HashSeparateChaining<Integer,String> map = new HashSeparateChaining<>();
		//System.out.println(map);

		map.put(123,"sijar");
		map.put(113,"tanzeem");
		map.put(203,"ship");
		map.put(393,"ali");
		map.put(483,"lord");
		map.put(573,"jabber");
		map.put(663,"circus");
		map.put(753,"guitar");
		map.put(201,"madhu");
		map.put(15,"gopal");
		map.put(7,"utpal");
		System.out.println(map);

	}


}


/**
 *
 * @param <K>
 * @param <V>
 */
class HashNode<K,V> {

	private LinkedListNode<K, V> head;
	/**
	 * @param key
	 * @return
	 */
	public V get(K key) {
		return null;
	}
	/**
	 * @param key
	 * @param value
	 * @return
	 */
	public K put(K key, V value) {
		if (head != null) {
			LinkedListNode<K, V> current = head;
			for (; current.link != null; current = current.link) {
			}
			current.link = new LinkedListNode<>(key, value, null);
		} else {
			head = new LinkedListNode<>(key, value, null);
		}
		return key;
	}
	public V remove(K key) {
		return null;
	}

	@Override
	public String toString() {
		return "{" +
				"head=" + head +
				" " + head.printAllLinks();

	}

	/**
	 *
	 * @param <K>
	 * @param <V>
	 */
	private class LinkedListNode<K, V> {
		private LinkedListNode<K, V> link;
		private K key;
		private V value;

		public LinkedListNode(K key, V value, LinkedListNode<K, V> link) {
			this.link = link;
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "{" +
					"key=" + key +
					", value=" + value +
					'}';
		}


		String printAllLinks() {
			StringBuilder sb = new StringBuilder();
			for (LinkedListNode current = this; current != null; current = current.link) {
				sb.append(current);
			}
			return sb.toString();
			}
		}
	}


