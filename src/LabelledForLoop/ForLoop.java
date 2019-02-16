package LabelledForLoop;

public class ForLoop {

	public static void main(String[] args) {
		
		 int i,j;

         loop1:   for(i=1;i<=2;i++){
         
             System.out.println();

			             loop2:   for(j=1;j<=10;j++){
			             
						            	 loop3: for(int k=0; k<10; k++){
						                 System.out.print(k + " ");
						
						                 if(k==7)
						                     break loop1;     //Statement 1
						            }
			             }
         }
 }
}
 