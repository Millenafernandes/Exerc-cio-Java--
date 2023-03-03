package application;
import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		
		
		    Scanner ler = new Scanner(System.in);

		    
		    int v[] = new int[10]; 
		    int i; 
		    

		    for (i=0; i<10; i++) {
		      
		      v[i] = ler.nextInt();
		    }
		    
		    int max = v[0];
		      
		      for (i = 0; i < v.length; i++) {
		    	  
		    	 
		             
		           if(v[i] > max) { 
		           max = v[i];
		           
		           
		        } 
		      }
		      
		      for(i=0; i<v.length; i++) {
		    	  
		      
		      if(v[i] == max) {
	          System.out.println(max);
	           }  
			      
		    }  
		   
}  
}
		      
	    
	
	
	
	


