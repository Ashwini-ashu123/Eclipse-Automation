package OOPs.Encapsulation;

public class Bank {
	
	public String accName;
	public long accountNum;
	private int password;
	private int Balance;
	
	public int getPass() {
		return password;
	}
	
	public int setPass(int pass) {
		return	password=pass;
	}
	
	public int getBal() {
		return Balance;
	}
	
	public void setBal(int bal) {
		this.Balance=bal;
	}

	
}
