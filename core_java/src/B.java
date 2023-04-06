public class B {
	
	public static void main(String[] args) {
		//sort array and find numbers
		 
		int arr[] = {10, 20, 25, 63, 96, 57};
		int temp ,size;
		size=arr.length;
	
		System.out.println("find last 3 highest numbers : ");
		 for(int i =0 ; i<size ;i++){
			 for(int j = i+1 ; j<size ; j++){
				 if(arr[i]>arr[j]){
					 temp = arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
			//iterate 3 highest number
			 if(arr[size-3]<arr[size-1]) {
				 System.out.println(arr[i]);
			 }
		 }
		
   //find duplicate elements in array		 
		 
        int arr1[] = {2,3,6,5,2,7,8,9,5,3};	
        
		System.out.println("find duplicate numbers : ");

         for(int i = 0 ; i<arr1.length; i++){
        	 for(int j=i+1 ; j<arr1.length ; j++) {
        		 if(arr1[i]==arr1[j]){
        			 System.out.println(arr1[i]);
        		 }
        	 }
         }
        
        
	}
}
