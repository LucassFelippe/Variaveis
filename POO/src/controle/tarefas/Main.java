package controle.tarefas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Controle t1 = new Controle();

        t1.descricao = "Estudar";
        t1.concluida = true;

        Controle t2 = new Controle();

        t2.descricao = "Academia";
        t2.concluida = false;

        List<Controle> list = new ArrayList<>();

        list.add(t1);
        list.add(t2);

        for (Controle t : list){
            t.exibeTarefas();
        }
    }
}
