package set.pesquisa;

import java.util.HashSet;
import java.util.Set;
public class AgendaDeContatos {
    private Set<Contato> contatosSet;

    public AgendaDeContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) System.out.println(contatosSet);
        else System.out.println("Conjunto vazio!");
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosSelecionadosSet = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contato contato : contatosSet) {
                if (contato.getNome().startsWith(nome)) {
                    contatosSelecionadosSet.add(contato);
                }
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
        return contatosSelecionadosSet;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato contato : contatosSet) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumeroDeTelefone(novoNumero);
                    contatoAtualizado = contato;
                    break;
                }
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        agendaDeContatos.exibirContatos();

        agendaDeContatos.adicionarContato("Camila", 10000001);
        agendaDeContatos.adicionarContato("Camila 1", 10000002);
        agendaDeContatos.adicionarContato("Lucas 1", 10000004);
        agendaDeContatos.adicionarContato("Mateus 1", 10000004);
        agendaDeContatos.adicionarContato("Camila 3", 10000005);

        agendaDeContatos.exibirContatos();

        //Pesquisar contatos com nome camila:
        System.out.println(agendaDeContatos.pesquisarPorNome("Camila"));
        System.out.println(agendaDeContatos.pesquisarPorNome("camila"));

        //Atualizar
        System.out.println(agendaDeContatos.atualizarNumeroContato("Camila 1", 10000009));
    }
}
