package projetoJava;
import java.util.Scanner;

public class ex_07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v [] = new int [4];
		
		int i;
		
		
		for(i=0; i<v.length; i++) {
		v[i] = sc.nextInt();

} 		
		for (i=0; i<4; i++) {
    	if(i%2 == 0) {
	     
	      System.out.println(v[i]);} 
		
		
	}

}
}
