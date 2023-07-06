package Exercise;

public class ArrayQUENO18 {
	
	public static void main(String[] args) {
		
		int [] a = {7,600,5,4,3,2,1};
		
		position(a,1);
		
	}
	   private static int position(int[]arr , int number) {
		   
		   int index = 0;
		   
		   for (int i = 0; i < arr.length; i++) {
			   
			   if (number == arr[i]) {
				   
				   index = i;
				   
				   break;
				   
			   }else if (number != arr[i]) {
				   index = -1;
				   
			   }
			
		}
		   
		   System.out.println("\""+ number +"\"" + "is at index  =" + index);
		   return index;
		   
	   }

}
