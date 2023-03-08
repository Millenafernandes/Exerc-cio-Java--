package projetoJava;
import java.util.Scanner;

public class ex0005 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v[] = new int[4]; 
	    int i; 
	    int par=0;
	   

	    for (i=0; i<4; i++) {
	    	
	      
	      v[i] = sc.nextInt();
	      
	      
	  } for(i=0; i<4; i++) {
		  	v[i] = v.length-i;
	  }
	    
	    for (i=0; i<4; i++) {
	    if(v[i]%2 == 0) {
		      par = v[i];
		     
		     
		    System.out.println(par);
	    }
	    }

}

}