package xhr.Ïß³Ì;

public class TaskVolatile {

	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		Thread t1= new Thread(task);
		t1.start(); 
		Thread.sleep(10);
		task.setFlag(false);
}
}
