	

	import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

	public class Module {
	    public static void main(String[] args) throws IOException {
	    	Scanner leitor = new Scanner(System.in);
	    	
	    	int size=leitor.nextInt();
	    	int[] grades = new int[size];
	    	
	    	for (int i = 0;i<size;i++){
	    		int x = leitor.nextInt();
	    		grades[i]=x;
	    		    		
	    	}
	    	System.out.println(Arrays.toString(grades));
	     	
	    	
	/*  	while(true) {
				String input = leitor.nextLine();  
				if( leitor.hasNext()   ) {}  
				else { 
							
					System.out.println( "' dado: " +N );
					N = leitor.[i];
					A= A +N;
				}  
	    	System.out.println(N);*/
	    	if (A>40)
	    		System.out.println("Deixa para amanha!");
	    	else
	    		System.out.println("Farei hoje!");
	    	leitor.close();
	       }       
	      //TODO: Complete o If com a condição que soluciona o problema  .
	    	

	    	
	 
	    }
	
}