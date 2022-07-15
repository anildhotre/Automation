package encapsulation;

public class ATMMachine {
public void balanceEnq() 
{
	Server s = new card();
	s.getbalance(1234);
}
public void withDraw()
{
	Server s = new Server();
s.setbalance(5000,1234);
}
public static void main(String[] args) {
	ATMMachine am = new ATMMachine();
	Server s = new Server();
	s.getbalance(1234);
	s.setbalance(5000,1234);
	s.setbalance(1234);
}
}
