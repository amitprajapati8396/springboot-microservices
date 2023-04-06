public class D {
	//1-15 , /3==0 print foo , if /5=0 print bar , /3=0 && /5==0 print foo bar
	
	public static void m1(int[] n){
		
		for(int n1 : n) {
		   System.out.println(n1);
			if(n1%3==0 && n1%5==0)
			  System.out.println("foo bar");
			else if (n1%3==0)
				System.out.println("foo");
			else if (n1%5==0)
				System.out.println("bar");
		}
	}
	
	public static void main(String[] args) {
	//	m1(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
		
	// 
	
		String str ="Hello world";
		String op="";
		//System.out.println(str.toUpperCase());
		for(int i=0;i<str.length();i++){
			if(i%2!=0)
				op+=Character.toUpperCase(str.charAt(i));
			else op+=Character.toLowerCase(str.charAt(i));
		}
		System.out.println(op);
	}
}
