package systemDesign.LruCache;

import java.util.*;

public class LRUCache {
	
	class Entry {
		//Use doubly ended linked list to denote entry in LRU Cache
		int key;
		int value;
		Entry left, right;
	}
	
	//will use hash-map to store reference of all entries 
	//LRU entries are represented as unique key and have a value
	
	HashMap<Integer, Entry> map = new HashMap<>();
	Entry start, end;
	static int LRU_SIZE = 5;
	
	//get entry -- move the entry to top as its most recently called
	int getEntry(int key) {
		if(map.containsKey(key)) {
			Entry entry = map.get(key);
			removeNode(entry);
			addToTop(entry);
			return entry.value;
		}
		
		return -1;
	}
	
	
	//add entry to LRU cache-- if it exists move it top-- if new add it to top
	
	void putEntry(int key, int value) {
		if(map.containsKey(key)) {
			Entry entry = map.get(key);
			entry.value = value;
			removeNode(entry);
			addToTop(entry);
			map.put(key, entry);
		} else {
			Entry newNode = new Entry();
			newNode.key = key;
			newNode.value = value;
			newNode.left = null;
			newNode.right = null;
			//check for max size--if reached remove end node and insert at top-- 
			//else insert at top
			if(map.size()==LRU_SIZE) {
				map.remove(end.key);
				removeNode(end);
				addToTop(newNode);
			}else {
				addToTop(newNode);
			}
			map.put(key, newNode);
		}
		
	}
	
	
	//add to top whenever a node is accessed from cache or created
	void addToTop(Entry node) {
		node.right = start;
		node.left = null;
		
		if(start!=null) {
			start.left= node;
		}
		start = node;
		if(end==null) {
			end=start;
		}
	}
	
	
	//remove Node
	void removeNode(Entry node){
		if(node.left!=null) {
			node.left.right = node.right;
		}else {
			start = node.right;
		}
		
		if(node.right!=null) {
			node.right.left = node.left;
		}else {
			end = node.left;
		}
	}
	
	//Main method
	public static void main(String[] args) {
		LRUCache lru = new LRUCache();
		
		lru.putEntry(0, 10);
		lru.putEntry(4, 90);
		lru.putEntry(2, 80);
		lru.putEntry(9, 70);
		lru.putEntry(3, 50);
		lru.putEntry(0, 60);
		lru.putEntry(4, 20);
		
		System.out.println(lru.getEntry(0));
		
	}
}
