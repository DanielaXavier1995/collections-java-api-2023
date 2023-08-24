package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;
    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigo) {
        convidadosSet.add(new Convidado(nome, codigo));
    }
    public void removerConvidadoPorCodigo(int codigo) {
        Convidado convidadoRemover = null;
            for(Convidado convidado: convidadosSet) {
                if(convidado.getCodigo() == codigo) {
                    convidadoRemover = convidado;
                    break;
                }
            }
        convidadosSet.remove(convidadoRemover);
    }
    public int contarConvidados() {
        return convidadosSet.size();
    }
    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        //Lista vazia:
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados no conjunto");

        //Adicionando elementos:
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados no conjunto");

        //Exibir
        conjuntoConvidados.exibirConvidados();

        //Remover convidados:
        conjuntoConvidados.removerConvidadoPorCodigo(1234);
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidados no conjunto");

        //Exibir
        conjuntoConvidados.exibirConvidados();
    }
}
