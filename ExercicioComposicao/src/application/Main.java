package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------DADOS DO CLIENTE---------");

        System.out.printf("Nome do cliente: ");
        String nomeDoCliente = scanner.nextLine();

        System.out.printf("Email: ");

        String emailCliente = scanner.next();
        scanner.nextLine();
        System.out.printf("Data de aniversário: ");
        Date aniversario = sdf.parse(scanner.nextLine());

        Client client = new Client(nomeDoCliente, emailCliente, aniversario);


        System.out.println("---------DADOS DO PEDIDO---------");


        System.out.printf("Qual a situação do pedido: ");
        String situacao = scanner.nextLine();
        System.out.printf("Quantos itens diferentes nesse pedido: ");
        int quantidadeDeItensNoPedido = scanner.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(situacao), client);

        System.out.println("---------PEDIDOS---------");

        for (int i = 0; i < quantidadeDeItensNoPedido; i++) {
            scanner.nextLine();
            System.out.printf("Nome do Produto: ");
            String nomeDoProduto = scanner.nextLine();
            System.out.printf("Preço do Produto: ");
            Double preco = scanner.nextDouble();

            Product product = new Product(nomeDoProduto, preco);

            System.out.printf("Quantidade desse produto: ");
            int quantidadeDesseItem = scanner.nextInt();

            OrderItem orderItem = new OrderItem(quantidadeDesseItem, preco, product);

            order.addItem(orderItem);

        }

        System.out.println("---------RESUMO DO PEDIDO---------");
        System.out.println("MOMENTO DO PEDIDO: " + sdf2.format(order.getMoment()));
        System.out.println("STATUS: " + order.getStatus());
        System.out.println(client);
        System.out.println("ITENS PEDIDOS:");
        for (OrderItem orderItem : order.getOrderItemList()) {
            System.out.println(orderItem);
        }
        System.out.printf("TOTAL $: ");
        System.out.println(order.total());
    }
}