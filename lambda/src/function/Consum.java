package function;
import java.util.function.Consumer;
public class Consum {
	public static void main(String[] args) {
	    Consumer<Product> updatePrice = p -> p.setPrice(5.9);
	    Product p = new Product();
	    updatePrice.accept(p);
	    p.printPrice();
	  }
}
