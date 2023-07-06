package Oop;

public class Testaccount {
    public static void main(String[] args) {
		Account s = new Account ();
		s.setname("pushpraj");
		s.setAccountType("saving ");
		s.setBalance(100);
		s.setDeposit(1000);
		s.setWithdraw(500);
		s.setfundtransfer(115);
		s.settpaybill(20);
		
		
          System.out.println(s.getname());
          System.out.println(s.getAccountType());
          System.out.println(s.getbalance());     
          System.out.println(s.getDeposit());
          System.out.println(s.getWithdraw());
          System.out.println(s.getfundtransfer());
          System.out.println(s.getpaybill());
		
		
		
		
	}
}
