package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;
    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdadeList = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdadeList);
        return pessoasPorIdadeList;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAlturaList = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAlturaList, new ComparatorPorAltura());
        return pessoasPorAlturaList;
    }
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.78);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}



