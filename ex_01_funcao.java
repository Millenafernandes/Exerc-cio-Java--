package projetoJava;

import java.util.Scanner;

public class ex_01 {
	
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.println(checarDiv(a,b));
	
	
}

public static boolean checarDiv(int a, int b) {
	if(a%b == 0) {
		return true;
	} else {
	return false; 
}
}
}
