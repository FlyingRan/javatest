package xhr.数组;

public class jiudian_hotel {

	jiudian_room[][] room = new jiudian_room[5][10];
	//初始化房间状态
	public jiudian_hotel() {
		for(int i=0; i<5; i++)
			for(int j =0; j<10;j++) {
				if(i==0||i==1) {
					room[i][j]= new jiudian_room((i+1)*100+j+1+"","标准间",false);
				}
				if(i==2||i==3) {
					room[i][j]= new jiudian_room((i+1)*100+j+1+"","双人间",false);
				}
				if(i==4) {
					room[i][j]= new jiudian_room((i+1)*100+j+1+"","豪华间",false);
				}
			}
	}
	//预定
	public void order(String id) {
		for(int i =0;i<room.length;i++)
			for(int j=0;j<room[i].length;j++) {
				if(room[i][j].getId().equals(id)) {
					room[i][j].setInuse(true);
					System.out.println("预定成功");
				}
			}
				
		
	}
	//退房
	public void out(String id) {
		for(int i =0;i<room.length;i++)
			for(int j=0;j<room[i].length;j++) {
				if(room[i][j].getId().equals(id)) {
					room[i][j].setInuse(false);
					System.out.println("退房成功，欢迎下次再来");
				}
			}
	}
	//查看房间状态
	public void print() {
		for(int i = 0; i<room.length;i++) {
			for(int j = 0; j<room[i].length;j++) {
				System.out.print(room[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
