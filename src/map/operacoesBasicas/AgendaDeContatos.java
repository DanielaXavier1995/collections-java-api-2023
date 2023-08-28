package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    private Map<String, Integer> agendaContatosMap;
    public AgendaDeContatos() {
        this.agendaContatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }
    public void removerContato(String nome) {
        if(!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }
    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }
    public Integer pesquisarPorNome(String nome) {
        Integer resultado = null;
        if(!agendaContatosMap.isEmpty()) {
            resultado = agendaContatosMap.get(nome);
        }
        return resultado;
    }

    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        agendaDeContatos.exibirContatos();

        agendaDeContatos.adicionarContato("Nome1", 222222);
        agendaDeContatos.adicionarContato("Nome1", 111111);
        agendaDeContatos.adicionarContato("Nome2", 333333);
        agendaDeContatos.adicionarContato("Nome3", 444444);
        agendaDeContatos.adicionarContato("Nome4", 555555);
        agendaDeContatos.adicionarContato("Nome1", 777777);
        agendaDeContatos.exibirContatos();

        agendaDeContatos.removerContato("Nome1");
        agendaDeContatos.exibirContatos();

        System.out.println("A chave é: " + agendaDeContatos.pesquisarPorNome("Nome3"));
    }
}
