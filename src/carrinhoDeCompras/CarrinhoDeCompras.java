package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;
    private double valorTotalCarrinho;
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itensRemovidosList = new ArrayList<>();
        if(!itemList.isEmpty()) {
            for (Item item : itemList) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensRemovidosList.add(item);
                }
            }
            itemList.removeAll(itensRemovidosList);
        } else {
            System.out.println("Lista de compras vazia, adicione um item!");
        }
    }
    public double calcularValorTotal() {
        if(!itemList.isEmpty()) {
            for (Item item : itemList) {
                valorTotalCarrinho += item.getPreco() * item.getQuantidade();
            }
            return valorTotalCarrinho;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirItens () {
        if(!itemList.isEmpty()) {
            System.out.println(itemList);
        } else {
            System.out.println("Lista vazia!");
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //Método Adicionar:
        carrinhoDeCompras.adicionarItem("caderno", 15.0, 2);
        carrinhoDeCompras.adicionarItem("livro", 95.0, 1);
        carrinhoDeCompras.adicionarItem("estojo", 30.0, 1);

        //Método Exibir itens:
        carrinhoDeCompras.exibirItens();

        //Remover Itém:
        carrinhoDeCompras.removerItem("livro");
        carrinhoDeCompras.exibirItens();

        //Calcular Valor do carrinho:
        System.out.println("Valor do carrinho " + carrinhoDeCompras.calcularValorTotal());
    }
}

