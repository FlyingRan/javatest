package xhr.异常;

public class ExceptionText1 {
	public static void usersid(String a) throws illegaidException {
		if(a.length()>10) {
			throw new illegaidException("id过长！");
		}
		else
			System.out.println("注册成功");
	}
	public static void main(String[] args)  {
		try {
			usersid("10454257822");
		} catch (illegaidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
