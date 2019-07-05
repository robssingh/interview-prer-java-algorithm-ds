package datasturctures;

import java.util.*;

public class TrieDS {
	//Node for trie data structure
	public class TrieNode{
		Map<Character, TrieNode> children;
		boolean endOfWord;
		public TrieNode() {
			children = new HashMap<>();
			endOfWord = false;
		}
	}
	
	public final TrieNode root ;
	public TrieDS() {
		root = new TrieNode();
	}
	
	//insert word in the trie
	public void insert(String word) {
		TrieNode current = root;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			TrieNode node = current.children.get(c);
			if(node ==  null) {
				node = new TrieNode();
				current.children.put(c, node);
			}
			current = node;
		}
		current.endOfWord = true;
	}
	
	//search word in trie
	public boolean search(String word) {
		TrieNode current  = root;
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i);
			TrieNode node = current.children.get(c);
			if(node ==  null) {
				return false;
			}
			current = node;
		}
		
		
		return current.endOfWord;
	}
	
	
	public static void main(String[] args) {
		TrieDS trie = new TrieDS();
		trie.insert("abc");
		trie.insert("abcd");
		trie.insert("robin");
		
		System.out.println(trie.search("robin"));
		System.out.println(trie.search("abc"));
		System.out.println(trie.search("robi"));
		
	}
	
	
}
