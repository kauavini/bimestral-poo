import java.util.List;
import java.util.LinkedList;

public class main {
    public static void main(String[] args){
       System.out.println("rodando");

       SistemaPizzaria sp = new SistemaPizzaria();

    
       Clientes cli = new Clientes(1, "Jordan", "Guarabira", "0994939493");
       sp.AddCli(cli);
       Clientes cli2 = new Clientes(2, "Thalita", "Alagoinha", "9399392392");
       sp.AddCli(cli2);
       Clientes cli3 = new Clientes(3, "José", "Alagoa Grande", "9399299323");
       sp.AddCli(cli3);
       System.out.println("Clientes Cadastrados no sistema");
       sp.EmitirRelat();

    
       System.out.println(sp.Pesquisar(1));

       sp.Atualizar(3, "José Barros", "Caiana", "988667734");
       sp.EmitirRelat();

       sp.RemoveCli(3);
       sp.EmitirRelat();





       ProdutosCard p1 = new CardapioBebida(1, "Refri", 6.50f);
       sp.AddCard(p1);
       ProdutosCard p2 = new CardapioBebida(2, "Fanta", 8.80f);
       sp.AddCard(p2);
       ProdutosCard p3 = new CardapioPizza(3, "Pizza de Calabresa", 30f,"Calabresa");
       sp.AddCard(p3);



       System.out.println("Pizzaria");
       Item itens1 = new Item(1, sp.PesquisarCard(1), 1);
       Item itens2 = new Item(2, sp.PesquisarCard(3), 1);
           
       List<Item> pedido1 = new LinkedList();



       pedido1.add(itens1);
       pedido1.add(itens2);
           
       Pedido pedido = new PedidoPizzaria(1, pedido1,"29/05/2021");
       sp.AddPedidoPizzaria((PedidoPizzaria) pedido);

       sp.EmitirRelatPedidoPizzaria();


    }
}
