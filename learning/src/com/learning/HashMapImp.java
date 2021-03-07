package com.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Pair<K, V> {
	public K key;
	public V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
}

class Bucket {
	private List<Pair<Integer, Integer>> bucket;

	public Bucket() {
		this.bucket = new LinkedList<Pair<Integer, Integer>>();
	}

	public Integer get(Integer key) {
		for (Pair<Integer, Integer> pair : this.bucket) {
			if (pair.key.equals(key)) {
				return pair.value;
			}
		}
		return -1;
	}

	public void update(Integer key, Integer value) {
		boolean found = false;
		for (Pair<Integer, Integer> pair : this.bucket) {
			if (pair.key.equals(key)) {
				pair.value = value;
				found = true;
			}
		}
		if (!found) {
			this.bucket.add(new Pair<Integer, Integer>(key, value));
		}
	}

	public void remove(Integer key) {
		for (Pair<Integer, Integer> pair : this.bucket) {
			if (pair.key.equals(key)) {
				this.bucket.remove(pair);
			}
			break;
		}
	}
}

public class HashMap {
	private int key_space;
	private List<Bucket> hashTable;

	public HashMap() {
		this.key_space = 2069;
		this.hashTable = new ArrayList<Bucket>();
		for (int i = 0; i < key_space; i++) {
			this.hashTable.add(new Bucket());
		}
	}

	public int get(int key) {
		int hash_key = key % this.key_space;
		return hashTable.get(hash_key).get(key);
	}

	public void put(int key, int value) {
		int hash_key = key % this.key_space;
		this.hashTable.get(hash_key).update(key, value);
	}

	public void remove(int key) {
		int hash_key = key % this.key_space;
		this.hashTable.get(key).remove(key);
	}
	
	public static void main(String args[]) {
		HashMap hashMap = new HashMap();
		hashMap.put(1, 1);
		hashMap.put(2, 2);
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(3)); 
		
		
		
	}
}
