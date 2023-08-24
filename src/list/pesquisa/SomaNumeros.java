package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;
    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        if(!numerosList.isEmpty()) {
            for(int numero: numerosList) {
                soma += numero;
            }
        } else {
            throw new RuntimeException("Lista Vazia!");
        }
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if(!numerosList.isEmpty()) {
            for(int numero: numerosList) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        } else {
            throw new RuntimeException("Lista Vazia!");
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()) {
            for(int numero: numerosList) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        } else {
            throw new RuntimeException("Lista Vazia!");
        }
        return menorNumero;
    }
    public void exibirNumeros() {
        if(!numerosList.isEmpty()) {
            System.out.println("Lista de números: " + numerosList);
        }  else {
        throw new RuntimeException("Lista Vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        //Adicionando Números:
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(33);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(56);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(43);
        somaNumeros.adicionarNumero(29);

        //Somando Números:
        System.out.println("Soma: " + somaNumeros.calcularSoma());

        //Maior Número:
        System.out.println("Maior Número: " + somaNumeros.encontrarMaiorNumero());

        //Maior Número:
        System.out.println("Menor Número: " + somaNumeros.encontrarMenorNumero());

        //Lista de números:
        somaNumeros.exibirNumeros();
    }
}
