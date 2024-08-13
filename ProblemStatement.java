
import java.util.*;

public class ProblemStatement {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", 20));
        products.add(new Product("Product2", 25));
        products.add(new Product("Product3", 30));
        products.add(new Product("Product4", 35));
        products.add(new Product("Product5", 50));
        List<String> filteredProductNames = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice()>=10) {
                filteredProductNames.add(product.getName());
            }
        }
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        List<String> sortedProductNames = new ArrayList<>();
        for(Product product:products){
            if(filteredProductNames.contains((product.getName()))){
                sortedProductNames.add(product.getName());
            }
        }
        System.out.println(sortedProductNames);
        }
        static class Product{
        private final String name;
        private final double price;
        public Product(String name, double price){
            this.name=name;
            this.price=price;
        }
        public String getName(){
            return name;
        }
        public double getPrice(){
            return price;
        }
    }
}
