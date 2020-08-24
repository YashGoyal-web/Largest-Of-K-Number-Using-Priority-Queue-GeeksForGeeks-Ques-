/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		        
       Scanner sc = new Scanner(System.in);
       
       int numberOfTimes = sc.nextInt();
       
       for(int j = 0 ; j<numberOfTimes ; j++){
       
           int TotalNumber = sc.nextInt();
           int NumbersToReturn = sc.nextInt();
           
           int[] data = new int[TotalNumber];
    
           for(int i = 0 ; i < data.length ; i++){
            data[i] = sc.nextInt();
           }
        
           PriorityQueue<Integer> pq = new PriorityQueue<>();
           
           for(int i = 0 ;i<NumbersToReturn ; i++){
               pq.add(data[i]);
           }
           
           for(int i = NumbersToReturn ; i<TotalNumber ; i++){
               if(pq.peek()<data[i]){
                   pq.poll();
                   pq.add(data[i]);
               }
           }
           
           ArrayList<Integer> res = new ArrayList<>(pq);
           
                   Collections.sort(res,Collections.reverseOrder());
                   
                   for(int e : res){
                       System.out.print(e+" ");
                   }
       
        System.out.println();
}
	    
	}
}
