package xhr.สýื้;

public class xuanze {

	public static void main(String[] args) {
		int[] a = {2,1,5,4};
		int t;
		for(int i=0;i<a.length;i++)
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
