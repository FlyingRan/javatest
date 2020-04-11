package xhr.数组;
//args是用来接受命令行的
//右键run as 第二个 输入命令！
public class agrsText {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("请输入正确的用户名和密码");
			return;
		}
		String name = args[0];
		String password = args[1];
		if("许浩然" .equals(name)&&"1045425708".equals(password)) {
			System.out.println("登陆成功！欢迎回来！");
		}else {
			System.out.println("登陆失败！请检查用户名和密码！");
		}
	}

}
