
public class Transaction 
{
	public void Deposit(Account a,double amt)
	{
		double b1=a.getBal()+amt;
		a.setBal(b1);
	}
	public void Withdraw(Account a,double amt)
	{
		double b2=a.getBal()-amt;
		a.setBal(b2);
	}
	public void checkbal(Account a)
	{
		System.out.println(a.getBal());
	}
}
