import entities.Product;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Entre com os dados do produto");

        System.out.print("Nome do Produto:");
        product.name = sc.nextLine();

        System.out.print("Preço do Produto:");
        product.price = sc.nextDouble();

        System.out.print("Quantidade no estoque:");
        product.quantity = sc.nextInt();

        System.out.println(product);



        sc.close();
    }
}