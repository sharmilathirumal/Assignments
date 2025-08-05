package org.example;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Product[] products = new Product[5];
        for(int i=0;i<5;i++){
            int productId =i+1;
            System.out.println("Enter product price:");
            double productPrice =s.nextDouble();
            System.out.println("Enter product quantity");
            int productQuantity =s.nextInt();
            products[i] = new Product(productId,productPrice,productQuantity);
        }
        System.out.println("Highest price product id: "+findHighestProductId(products));
        System.out.println("Total Amount of all product: "+totalAmountSpent(products));
    }

    public static int findHighestProductId(Product[] products){
        int productId =0;
        double maximumQuantity = 0;
        for(Product product:products){
            if(product.price>maximumQuantity) {
                productId =product.pid;
                maximumQuantity=product.price;
            }
        }
        return productId;
    }

    public static double totalAmountSpent(Product[] products){
        double totalAmount =0;
        for (Product product:products){
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }
}

/*OUTPUT:
Enter product price:
10
Enter product quantity
100
Enter product price:
70
Enter product quantity
7
Enter product price:
20
Enter product quantity
30
Enter product price:
30
Enter product quantity
10
Enter product price:
40
Enter product quantity
5
Highest price product id: 2
Total Amount of all product: 2590.0
 */
