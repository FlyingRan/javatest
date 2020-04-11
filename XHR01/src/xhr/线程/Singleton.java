package xhr.线程;

public class Singleton {
	/*
	 * “懒汉式”与“饿汉式”的区别，是在与建立单例对象的时间的不同。
	 * 
	 * “懒汉式”是在你真正用到的时候才去建这个单例对象：
	 * 
	 * 比如：有个单例对象
	 */
	    private Singleton(){}

	    private static Singleton singleton = null;  //不建立对象

	    public static synchronized Singleton getInstance(){

	             if(singleton == null) {        //先判断是否为空                

	                 singleton = new Singleton ();  //懒汉式做法

	             }

	             return singleton ;

	     }

	}
	/* “饿汉式”是在不管你用的用不上，一开始就建立这个单例对象：比如：有个单例对象 */

	/*public class Singleton{

	    public Singleton(){}

	    private static Singleton singleton = new Singleton()；; //建立对象

	    public static Singleton getInstance(){

	        return singleton ;//直接返回单例对象    }}
*//*
	它有以下几个要素：

	· 私有的构造方法

	· 指向自己实例的私有静态引用

	· 以自己实例为返回值的静态的公有的方法

	 */
//}
