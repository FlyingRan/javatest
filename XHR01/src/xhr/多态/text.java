package xhr.多态;

public class text {

	public static void main(String[] args) {
		dog a = new dog();
		a.eat();
		System.out.println(a.num);
		animal b= new dog();//多态的特征：父类对象引用子类对象
		b.eat();//动态绑定与静态绑定
		System.out.println(b.num);//重写不能对成员变量进行修改
		//b.move(); error 这是错的，不能引用父类中不存在的方法，需要强制转换！！
		
		/* 强制转换 */
		dog c = (dog) b;
		c.move();
		
		animal d= new dog();//假设有一个cat类继承animal， 那么不能 把dog 转为 cat
		/*
		  可以通过 instanceof 进行判断 d 可不可以转换 
		  if(d instanceof cat) 
		  	cat f =(cat) d;
		 */
		
		
		
	}

}
