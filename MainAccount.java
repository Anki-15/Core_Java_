
public class MainAccount 
{
public static void main(String[] args) 
	{
		Transaction t1=new Transaction();
		Account ac= new Account();
		t1.Deposit(ac, 10000);
		t1.checkbal(ac);
		t1.Withdraw(ac, 500);
		t1.checkbal(ac);
	}
}
