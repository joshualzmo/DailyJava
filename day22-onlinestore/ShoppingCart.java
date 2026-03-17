import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Product[] products = new Product[10];
        Product[] cart = new Product[products.length];
        int count = 0;
        boolean running = true;

        products[0] = new Product("Laptop", 999.99, 5);
        products[1] = new Product("Smartphone", 699.99, 10);
        products[2] = new Product("Headphones", 149.99, 15);
        products[3] = new Product("Keyboard", 89.99, 20);
        products[4] = new Product("Mouse", 49.99, 25);
        products[5] = new Product("Monitor", 299.99, 8);
        products[6] = new Product("USB Cable", 12.99, 50);
        products[7] = new Product("External Hard Drive", 129.99, 12);
        products[8] = new Product("Webcam", 79.99, 18);
        products[9] = new Product("Gaming Chair", 249.99, 6);

        System.out.println("Available Products:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }

        while (running) {
            try {
                System.out.println("\nEnter a product name you'd like to buy: ");
                String input = scnr.nextLine();

                int productIndex = -1;
                for (int i = 0; i < products.length; i++) {
                    if (input.equalsIgnoreCase(products[i].getName())) {
                        productIndex = i;
                        break;
                    }
                }

                if (productIndex == -1) {
                    throw new Exception("Product does not exist.");
                }

                System.out.println("How many would you like to buy?: ");
                int numProducts = Integer.parseInt(scnr.nextLine());

                if (numProducts <= 0) {
                    throw new ArithmeticException("Value must be greater than 0.");
                }

                if (products[productIndex].getQuantity() <= 0) {
                    throw new Exception("Out of stock.");
                }

                if (numProducts > products[productIndex].getQuantity()) {
                    throw new Exception("Not enough stock available.");
                }

                if (count >= cart.length) {
                    throw new Exception("Cart is full.");
                }

                products[productIndex].decrementQuantity(numProducts);
                cart[count] = new Product(
                    products[productIndex].getName(),
                    products[productIndex].getPrice(),
                    numProducts
                );
                count++;

                System.out.println("Successfully purchased " + numProducts + " " + products[productIndex].getName());

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Would you like to buy another product? (y/n): ");
            String again = scnr.nextLine();
            if (again.equalsIgnoreCase("n")) {
                running = false;
            }
        }

        System.out.println("\nItems in cart:");
        for (int i = 0; i < count; i++) {
            System.out.println(cart[i]);
        }

        scnr.close();
    }
}