package xhr.数组;

public class SU {
	public static  boolean Pan(int a) {
		int i,k=(int)Math.sqrt(a);
		for( i = 2; i<=k;i++)
			if(a%i==0) break;
		 if(i>k) return true;
		 return false;
	}
	public static void main(String[] args) {
		int x=2,count=0;
		for(;x<1000;x++) {
			if(Pan(x)) {
				count++;
			}
		}
		System.out.println("0-1000的素数有"+count+"个哦");
	}

}
