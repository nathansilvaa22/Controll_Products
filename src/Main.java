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

        System.out.println();

        System.out.println("Dados do Produto: " + product);

        System.out.println();

        System.out.println("Dejesa adicionar produtos ao estoque?");
        System.out.println(" 1 - Não");
        System.out.println(" 2 - Sim");
         int resposta = sc.nextInt();

        if( resposta == 2){

            System.out.println("Entre com o numero de produtos que quer adicionar ao estoque: ");

            int quant = sc.nextInt();
            product.addProducts(quant);

            System.out.println();

            System.out.println("Atualização Dados do Produto: " + product);

        }

        System.out.println("Deseja remover alguma quantidade de produto?");
        System.out.println();
        System.out.println(" 1 - Não");
        System.out.println(" 2 - Sim");
        int res = sc.nextInt();



        if (res == 2){

            System.out.println("Entre com o numero de produtos que quer remover ao estoque: ");

            int quant = sc.nextInt();
            product.removeProducts(quant);

            System.out.println();

            System.out.println("Atualização Dados do Produto: " + product);

        }

        sc.close();
    }
}