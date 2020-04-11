package xhr.สýื้;

public class shuixianhua {
	public static void m1() {
		for(int i=100;i<1000;i++)
		{
		int	x=i%10;
		int	y=i/10%10;
		int	z=i/100%10;
			if(Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3)==i)
				System.out.println(i);
		}
	}
	public static void main(String [] agrs) {
		int i,x,y,z;
		for(i=100;i<1000;i++)
		{
			x=i%10;
			y=i/10%10;
			z=i/100%10;
			if(Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3)==i)
				System.out.println(i);
		}
		m1();
	}
}
