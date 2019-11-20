package hello;

public class hello {
	public static void main(String args[]) {
		Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        ticket1.setName("售票厅1");
        ticket2.setName("售票厅2");
        ticket1.start();
        ticket2.start();

	}
}

class Ticket extends Thread{
	private static int ticketNum = 10;
	public void run() {
		while(true) {
			synchronized(Ticket.class) {
				if(ticketNum>0)
					System.out.println(getName()+"售出了"+(10-(--ticketNum))+"张票");
				else {
					System.out.println("暂无余票");
					break;
				}
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
