import java.util.Iterator;

public class Practice {
	public static String removeSpecialChar(String str){
		return str.replaceAll("[^a-zA-Z]","");
	}
	
	public static void findDuplicateChar(String str){
		char[] string = str.toCharArray();
		int count;
		char[] duplicate =new char[str.length()];
		System.out.println("Duplicate characters in a given string: ");
		
		for(int i=0;i<string.length;i++){
			//count =1;
		  
			for(int j=i+1;j<string.length;j++){
				if (string[i] == string[j] /* && string[i] !=' ' */){
			    	 // count++;
			    	  //string[j]='0';
					duplicate[i]=string[i];
			      }	  
		    }	
		 	
//			if(count>1 && string[i] !='0') {
//				System.out.println(string[i]);
//			}
		  	
		}
		for(char ch : duplicate) {
			if(ch!=0) {
			System.out.println(ch);}
		}
		
		
	} 
	
	public static void sortArr(char[] arr) {
		
		
		char temp;
		System.out.println("sorted array : ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j] ) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	   for(char ch : arr) {
		  
		   System.out.println(ch);
	   }	
	}
	
	
	public static void main(String[] args) {

		String str =  "Amit/@k1um@a+r";		
		System.out.println(removeSpecialChar(str));
		
		findDuplicateChar("AaAbbBcB");
		char[] ch =  {'a','c','b','e','d'};
		sortArr(ch);
	}
	
	
}
