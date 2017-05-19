
public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(p(1234554321));
		System.out.println(p("Malayalam"));
		System.out.println(p("German"));
	}
	
	public static boolean p(String w) {
		int halfway = w.length()/2;
		boolean b = true;
		w = w.toLowerCase();
		for(int i = 0; i<=halfway; i++) {
			System.out.println(w.charAt(i));
			System.out.println(w.charAt(w.length()- (i+1)));
			if(w.charAt(i) == w.charAt(w.length()- (i+1))) {
				continue;
			} else {
				b = false;
				break;
			}
		}		
		return b;		
	}
	
	public static boolean p(int w) {	
		int reverse = 0;		
		for(int temp = w;temp > 0; temp=temp/10) {
			reverse = 10 * reverse + temp%10;			
			System.out.println(temp%10 + "  " + reverse + "   " + temp);		
		}
		 if (reverse == w)
			 return true;		
		return false;		
	}
}
