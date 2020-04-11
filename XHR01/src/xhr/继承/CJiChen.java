package xhr.继承;

/*子类不能访问父类中的private 的成员变量或者成员方法，子类也可以访问祖先类，只要extends声明即可！*/
/*子类给以重写父类中的成员方法，但只限成员方法，其他不能修改，且访问权限不能降低，
 即如果父类是public，子类修改时就不能用private。*/
public class CJiChen {

	public static void main(String[] args) {
		CSon a = new CSon();
		a.m1();
		a.m2();

	}

}
