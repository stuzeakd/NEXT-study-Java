
public class TestClass {
	int a, b;
	public TestClass() {		
		a= 0;
		b= 1;
		
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Object TestCla)
	{
		if(!(TestCla instanceof TestClass)) return false;
		TestClass obj = (TestClass)TestCla;
		return (obj.a == a && obj.b == b);
	}
}
