package xhr.สýื้;

public class maopao {

	public static void main(String[] args) {
		int[] a = {2,1,5,4};
		int t;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	}

