package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double resultado = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                resultado = p.getPreco() * p.getQuantidade();
            }
        }
        return resultado;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produto = null;
        double produtoMaisCaro = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > produtoMaisCaro) {
                    produtoMaisCaro = p.getPreco();
                    produto = p;
                }
            }
        }
        return produto;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produto = null;
        double produtoMaisBarato = Double.MAX_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() < produtoMaisBarato) {
                    produtoMaisBarato = p.getPreco();
                    produto = p;
                }
            }
        }
        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produto = null;
        double valorTotalEmEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
                double valorProdutoEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEstoque > valorTotalEmEstoque) {
                    valorTotalEmEstoque = valorProdutoEstoque;
                    produto = entry.getValue();
                }
            }
        }
        return produto;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProdutos();

        estoqueProdutos.adicionarProduto(1l, "prod1", 3, 10.5d);
        estoqueProdutos.adicionarProduto(2l, "prod2", 1, 35d);
        estoqueProdutos.adicionarProduto(3l, "prod3", 5, 3d);
        estoqueProdutos.adicionarProduto(4l, "prod4", 4, 5.5d);
        estoqueProdutos.adicionarProduto(5l, "prod5", 10, 2.5d);
        estoqueProdutos.adicionarProduto(6l, "prod6", 10, 10.5d);
        estoqueProdutos.exibirProdutos();

        System.out.println("Valor estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Mais Barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
