package LabelledForLoop;

public class Continue {

	public static void main(String[] args) {
	int i=0;
	
	while(i<10){
		
		i++;
				if(i==5)	
					continue;
					System.out.println(i);
					System.out.println("waiting for 5"+i);
					
				
		
	}
	System.out.println("End of program");

	}

}
