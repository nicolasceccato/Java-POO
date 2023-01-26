package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProducts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Quantidade de produtos: ");
        int quantidaDeProdutos = scanner.nextInt();


        List<Product> products = new ArrayList<>();

        for (int i = 0; i < quantidaDeProdutos; i++) {
            scanner.nextLine();
            System.out.print("Qual o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Qual o preço do produto: ");
            Double preco = scanner.nextDouble();
            Product product = null;
            System.out.print("Comum, usado ou importado (c/u/i): ");
            char tipoDeProduto = scanner.next().charAt(0);
            if (tipoDeProduto == 'c'){
                product = new Product(nome, preco);
            }else if(tipoDeProduto == 'u'){
                scanner.nextLine();
                System.out.print("Data de fabricação: ");
                Date dataDeFabricacao = simpleDateFormat.parse(scanner.nextLine());
                product = new UsedProducts(nome, preco, dataDeFabricacao);
            }else if( tipoDeProduto == 'i'){
                System.out.print("Qual a taxa de importação:");
                Double taxaDeImportacao = scanner.nextDouble();
                product = new ImportedProduct(nome, preco, taxaDeImportacao);
            }

            products.add(product);
        }
        System.out.println("PRICE TAGS: ");
        for (Product x : products){
            System.out.println(x.priceTag());
        }
    }
}
