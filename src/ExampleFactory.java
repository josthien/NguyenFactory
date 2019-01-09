
public class ExampleFactory {
	private static ExampleFactory instance;
	private static AService aService;
	
	public ExampleFactory(){}
	
	public static synchronized ExampleFactory getInstance() 
	{
		if(instance == null)
		{
			System.out.print("Creating Service Provider\n");
			instance = new ExampleFactory();
		}
		else
		{
			System.out.print("Instance already exists\n");
		}
		return instance;
	}
	
	public static synchronized AService getService()
	{
		if(aService == null)
		{
			System.out.print("Creating Service Provider\n");
			aService = new AService();
		}
		else
		{
			System.out.print("AService already exists\n");
		}
		return aService;
	}
}
