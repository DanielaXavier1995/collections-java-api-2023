package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        agendaEventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> agendaEventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(agendaEventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataProximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        Map<LocalDate, Evento> agendaEventosTreeMap = new TreeMap<>(agendaEventosMap);
        for (Map.Entry<LocalDate, Evento> entry : agendaEventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                dataProximoEvento = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento.getNome() + " ocorrerá na data: "
                        + dataProximoEvento);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 10), "Evento1", "Atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 23), "Evento2", "Atracao2");
       // agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 29), "Evento3", "Atracao3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 07), "Evento4", "Atracao4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 15), "Evento5", "Atracao5");
        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}

