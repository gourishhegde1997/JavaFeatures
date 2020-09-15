package java8features.defaultmethods;

public class DefaultMethodSample1 implements Greeting, GreetingExtn {
//public class DefaultMethodSample1 extends Greet implements Greeting, GreetingExtn {

	public static void main(String[] args) {
		new DefaultMethodSample1().hello();
	}

}

interface Greeting{
    default void hello() {
	System.out.println(" hello from Greet");
    }
}

interface GreetingExtn extends Greeting{
     default void hello() {
	System.out.println(" hello from Greeting");
     }
}

class Greet {   //comment and uncomment this class to try more possibilities
    public void hello()  {
        System.out.println("hello from Greet");
    }
}
