
public class B extends A 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setValue(int value)
	{
		System.out.println("hello");
		super.setValue(value);
	}
}
