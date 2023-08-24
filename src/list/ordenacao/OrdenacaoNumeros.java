package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoNumeros {
    List<Integer> numerosList;
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumeros(int numero) {
        numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendenteList = new ArrayList<>(numerosList);
        Collections.sort(numerosAscendenteList);
        return numerosAscendenteList;
    }
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendenteList = new ArrayList<>(numerosList);
        numerosDescendenteList.sort(Collections.reverseOrder());
        return numerosDescendenteList;
    }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumeros(15);
        ordenacaoNumeros.adicionarNumeros(94);
        ordenacaoNumeros.adicionarNumeros(53);
        ordenacaoNumeros.adicionarNumeros(78);
        ordenacaoNumeros.adicionarNumeros(34);

        System.out.println("Ordem ascendente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Ordem descendente: " + ordenacaoNumeros.ordenarDescendente());
    }
}
