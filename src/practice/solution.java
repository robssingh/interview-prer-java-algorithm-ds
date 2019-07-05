package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class solution{
	
	
	void calburnt(int[] distance, int n) {
		Arrays.sort(distance);
        long totalCalBurnt = 0;
        int totalDis = 0;
        
        
        
        for(int i=n-1; i>=0; i--){
            int calBurnt = 2*totalDis+distance[i];
            totalCalBurnt = totalCalBurnt+calBurnt;
            totalDis = totalDis+distance[i];
        }
        System.out.println(totalCalBurnt);
	}
    
    public static void main(String[] args) throws NumberFormatException, IOException{

    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int nt=Integer.parseInt(br.readLine().trim());
    	while(nt-->0)
	    {
			int n=Integer.parseInt(br.readLine().trim());
			String line = br.readLine(); 
			String[] strs = line.trim().split("\\s+");
			int[] distance = new int[n];
			for (int x = 0; x < n; x++) {
			    distance[x] = Integer.parseInt(strs[x]);
			}
			Arrays.sort(distance);
          long totalCalBurnt = 0;
          int totalDis = 0;
          
          for(int i=n-1; i>=0; i--){
              int calBurnt = 2*totalDis+distance[i];
              totalCalBurnt = totalCalBurnt+calBurnt;
              totalDis = totalDis+distance[i];
          }
          System.out.println(totalCalBurnt);
			
		}

    }
    
}
