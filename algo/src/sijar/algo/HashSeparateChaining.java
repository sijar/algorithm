/*
 * Developed by Sijar Ahmed on 18/2/19 12:53 AM
 * Last modified 12/2/19 12:12 AM.
 * Sijar Ahmed (sijar.ahmed@gmail.com)
 * Copyright (c) 2019. All rights reserved.
 *
 *
 * The Class / Interface HashSeparateChaining is responsible for...
 * @author sijarahmed
 * 18/2/19 12:53 AM
 *
 */

package sijar.algo;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * author sijar ahmed
 * @param <K>
 * @param <V>
 */
public class HashSeparateChaining<K,V> {

	private int INITIAL_CAPACITY = 9;
	private HashNode<Integer,V>[] bucket = (HashNode<Integer, V>[]) Array.newInstance(HashNode.class,INITIAL_CAPACITY);

	@Override
	public String toString() {
		return Arrays.toString(bucket);
	}

	public int size() {
		int _count=0;
		Integer[] _keys = keySet();
		for(int i=0; i< _keys.length; ++i){
			if(_keys[i]!= null){
				++_count;
			}
		}
		return _count;
	}

	public boolean isEmpty() {
		return (size()==0)?true:false;
	}

	public boolean containsKey(Integer key) {
		return false;
	}

	public boolean containsValue(V value) {
		return false;
	}

	public V get(Integer key) {
		int index = UniversalHashfunction(key,bucket.length);
		return bucket[Math.abs(index-1)].get(key);
	}

	private int UniversalHashfunction(Integer key, int length) {
		int index = key.hashCode() % bucket.length; //modulo hash function
		return index;
	}




	public Integer put(Integer key, V value) {

		//int index = key.hashCode() % bucket.length; //modulo hash function
		int index = UniversalHashfunction(key,bucket.length);
		System.out.println("KEY=" + key + ", Hashcode=" + Math.abs(index-1));
		if(bucket[Math.abs(index-1)] == null){
			bucket[Math.abs(index-1)] = new HashNode<>();
		}
		bucket[Math.abs(index-1)].put(key,value);
		return key;
	}

	public Integer remove(Integer key) {
		return null;
	}


	public void clear() {
	}

	public Integer[] keySet() {
		Integer[] _keys = new Integer[INITIAL_CAPACITY];
		for(int i=0,j=0; i<bucket.length; ++i,++j){
			if(bucket[i] != null && bucket[i].getKey() != null){
				_keys[j] = bucket[i].getKey();
			}
		}
		return  _keys;
	}



	public static void main(String[] args) {
	HashSeparateChaining<Integer,String> map = new HashSeparateChaining<>();
		map.put(Integer.valueOf(122),"bigbang");
		map.put(Integer.valueOf(36),"sheldon");
		map.put(Integer.valueOf(204),"ship");
		map.put(Integer.valueOf(395),"alibaba");
		map.put(Integer.valueOf(486),"lord");
		map.put(Integer.valueOf(577),"jabber");
		map.put(Integer.valueOf(668),"circus");
		map.put(Integer.valueOf(759),"guitar");
		map.put(Integer.valueOf(201),"Gstring");
		map.put(Integer.valueOf(18),"cricket");
		map.put(Integer.valueOf(798),"willow");

		System.out.println("--------------------");
		System.out.println(map);
		System.out.println("--------------------");

		System.out.println("NO. OF KEYS=" + map.size());
		System.out.println("--------------------");
		Integer[] key_sets = map.keySet();
		for(int i=0; i<key_sets.length;++i){
		    if(key_sets[i] != null) {
				System.out.println("KEY=" + key_sets[i] + "\b VALUE=" + map.get(key_sets[i]));
			}
		}

		System.out.println("\nRetrieving value for keys with collison...");
		Integer[] _collided_keys = new Integer[]{486,668,201,18,798};
		for (Integer collided_key : _collided_keys) {
			System.out.println("KEY=" + collided_key + "\b VALUE=" + map.get(collided_key));
		}
	}


}


/**
 *
 * @param <Integer>
 * @param <V>
 */
class HashNode<Integer,V> {

	private LinkedListNode<Integer, V> head;
	/**
	 * @param key
	 * @return
	 */
	public V get(Integer key) {
	    //if(key == null) return null;
		LinkedListNode<Integer,V> current = head;
		while(!current.key.equals(key) && current.link!=null){
			current = current.link;
		}
		return current.value;
	}

	public Integer getKey(){
		return head.key;
	}


	/**
	 * @param key
	 * @param value
	 * @return
	 */
	public Integer put(Integer key, V value) {
		if (head != null) {
			LinkedListNode<Integer, V> current = head;
			for (; current.link != null; current = current.link) {
			}
			current.link = new LinkedListNode<>(key, value, null);
		} else {
			head = new LinkedListNode<>(key, value, null);
		}
		return key;
	}
	public V remove(Integer key) {
		return null;
	}

	@Override
	public String toString() {
		return head.printAllLinks();

	}

	/**
	 *
	 * @param <Integer>
	 * @param <V>
	 */
	private class LinkedListNode<Integer, V> {
		private LinkedListNode<Integer, V> link;
		private Integer key;
		private V value;

		public LinkedListNode(Integer key, V value, LinkedListNode<Integer, V> link) {
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
			sb.append("\n");
			return sb.toString();
			}
		}


		int remove(int Key, V value){
			throw new UnsupportedOperationException("to be implemented");
		}



}


