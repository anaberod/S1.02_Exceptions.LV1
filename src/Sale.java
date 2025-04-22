import java.util.ArrayList;
import java.util.List;

public class Sale {

    private List<Product> products;
    private double totalPrice;


    public Sale() {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }


    public void addProducts(Product product) {
        products.add(product);
    }

    public void totalCalculation() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();

        }

        totalPrice = 0.0;
        for (Product product : products)
            totalPrice += product.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Product getProductAt(int index) {
        return products.get(index);
    }
}






