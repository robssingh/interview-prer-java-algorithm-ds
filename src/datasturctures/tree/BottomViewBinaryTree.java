package datasturctures.tree;

import java.util.*;

/**
 * BottomViewBinaryTree
 */
public class BottomViewBinaryTree {

   class Node {
       int data;
       int hd;
       Node left, right;
    
       Node(int data) {
            this.data = data;
            hd = Integer.MAX_VALUE;
            left = right = null;
       }
   }

   public void bottomView(Node root) {
        if(root == null)
            return;

        int hd = 0;
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        Queue<Node> queue = new LinkedList<Node>();

        root.hd = hd;
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            hd = temp.hd;
            map.put(hd, temp.data);
            if(temp.left != null){
                temp.left.hd = hd-1;
                queue.add(temp.left);
            }
            if(temp.right != null){
                temp.right.hd = hd+1;
                queue.add(temp.right);
            }
        }
        Set<Entry<Integer, Integer>> set = map.entrySet(); 
  
        // Make an iterator 
        Iterator<Entry<Integer, Integer>> iterator = set.iterator(); 
  
        // Traverse the map elements using the iterator. 
        while (iterator.hasNext()) 
        { 
            Map.Entry<Integer, Integer> me = iterator.next(); 
            System.out.print(me.getValue()+" "); 
        } 
   }

    public static void main(String[] args) {
        
    }
}