package xhr.สýื้;

public class arrText {
	private static void m1(int[] a) {
		System.out.println(a);
	}
	public static void main(String [] args) {
		int[] a=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		 for(int i=0;i<3;i++) System.out.println("a["+i+"]="+a[i]);
		
		arrText s = new arrText();
		m1(a);
	}
}
