package xhr.����;

public class jiudian_hotel {

	jiudian_room[][] room = new jiudian_room[5][10];
	//��ʼ������״̬
	public jiudian_hotel() {
		for(int i=0; i<5; i++)
			for(int j =0; j<10;j++) {
				if(i==0||i==1) {
					room[i][j]= new jiudian_room((i+1)*100+j+1+"","��׼��",false);
				}
				if(i==2||i==3) {
					room[i][j]= new jiudian_room((i+1)*100+j+1+"","˫�˼�",false);
				}
				if(i==4) {
					room[i][j]= new jiudian_room((i+1)*100+j+1+"","������",false);
				}
			}
	}
	//Ԥ��
	public void order(String id) {
		for(int i =0;i<room.length;i++)
			for(int j=0;j<room[i].length;j++) {
				if(room[i][j].getId().equals(id)) {
					room[i][j].setInuse(true);
					System.out.println("Ԥ���ɹ�");
				}
			}
				
		
	}
	//�˷�
	public void out(String id) {
		for(int i =0;i<room.length;i++)
			for(int j=0;j<room[i].length;j++) {
				if(room[i][j].getId().equals(id)) {
					room[i][j].setInuse(false);
					System.out.println("�˷��ɹ�����ӭ�´�����");
				}
			}
	}
	//�鿴����״̬
	public void print() {
		for(int i = 0; i<room.length;i++) {
			for(int j = 0; j<room[i].length;j++) {
				System.out.print(room[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
}
