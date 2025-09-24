package OOPs.Encapsulation;

public class secreteNum {
	
public static void main(String[] args) {
	Bank acc=new Bank();
	acc.setPass(1234);
	acc.setBal(30000); 
	acc.accName="Vignesh";
	acc.accountNum=29302983728910l;
	
	System.out.println("Account Name : "+acc.accName);
	System.out.println("Account Number : "+acc.accountNum);
	System.out.println("Account Password : "+acc.getPass());
	System.out.println("Account Balance : "+acc.getBal());
}	

}
