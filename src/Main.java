
public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale();

        try {
            sale.totalCalculation();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        sale.addProducts(new Product("Phone", 540.99));
        sale.addProducts(new Product("TV", 875));

        try  {
            sale.totalCalculation();
            System.out.println("Total price of the sale " + sale.getTotalPrice()  + " €.");
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        try {
            Product invalidProduct = sale.getProductAt(10);
            System.out.println("Product: " + invalidProduct.getName());
        } catch (IndexOutOfBoundsException i) {
            System.out.println(i.getMessage());
        }



        }
    }
