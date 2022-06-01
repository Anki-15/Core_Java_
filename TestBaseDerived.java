
public class TestBaseDerived {

	public static void main(String[] args) {
		System.out.println(Base.n);
		Base.greet();
		
		System.out.println(Derived.n);
		Derived.greet();
	}

}
