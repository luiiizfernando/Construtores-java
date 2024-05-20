import java.security.Permission;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args)
    {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Brilhante", 19.99, 4));
        listaDeProdutos.add(new Produto("Leite", 3.50, 2));
        listaDeProdutos.add(new Produto("Picaranjuba", 3.99, 4));
        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(0));
        System.out.println(listaDeProdutos);

        Produto produto = new Produto("Arroz", 29.63, 3);
        System.out.println(produto);

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Carne", 35.99, 1, "25/05/2024");
        System.out.println(perecivel);

    }
}
