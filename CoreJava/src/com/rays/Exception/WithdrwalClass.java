package com.rays.Exception;

public class WithdrwalClass {
      
	private int balance = 0;
	
	public int getbalance () {
		return balance ;
		
	}
	public void setbalance (int balance ) {
		this.balance = balance ;
		
	}
	public void Withdrwal (int amt ) {
		int total = getbalance() - amt;
		setbalance(total);
		
		//System.out.println("Balance After Deposite = " + getbalance());

		
		if (total >= 2000){
			
			setbalance(total);
			
			System.out.println("Balance Agter Withdrwal = " + getbalance());
			
		}else {
			 
			System.out.println("Insufficent Balance ...!!");
		}
	
}
}
