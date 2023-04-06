
public class E {

	public static void findNums(int[] arr , int target){
		
		int[] findValue = new int[2]; 
		for(int i=0 ; i<arr.length ; i++) {			
			for(int j = i+1; j<arr.length ; j++){
				
			  	if(arr[i] + arr[j] == target){
			  		findValue[0] = arr[j];
			  		findValue[1] = arr[i];
			  	System.out.println(findValue[0] + " + " + findValue[1] +" = "+ target);	
			  		
			  	}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		findNums(new int[]{1,3,5,9,10,6}, 15);
		
//		int x = 0;
//		for(int i=0; i<5 ; i++){
//			x++;
//		}
//	   System.out.println(x);
	}
}
