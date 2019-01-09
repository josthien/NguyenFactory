/*Name: Thien Nguyen
 * ID: 903324444*/
public class MyController {
	public static void main(String[] args) {
		ExampleFactory exampleFactory = new ExampleFactory();
		
		exampleFactory.getService();
		exampleFactory.getService();
		exampleFactory.getService();
		
		AService aService = new AService();
		aService.ProvideService();
	}
}
