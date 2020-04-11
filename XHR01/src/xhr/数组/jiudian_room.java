package xhr.数组;

public class jiudian_room {
	private String id;
	private String  type;
	private boolean inuse;
	public String getId() {
		return id;
	}
	//alt+shift+s 生成get set 方法
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isInuse() {
		return inuse;
	}
	public void setInuse(boolean inuse) {
		this.inuse = inuse;
	}
	public jiudian_room(String id, String type, boolean inuse) {//alt+shift+s
		super();
		this.setId(id);//这是另一种方法
		this.type = type;
		this.inuse = inuse;
	}
	public String toString() {
		return   "["+id + " " + type + " " + (inuse?"在用":"空闲") + "]";
	} 	
	
}
