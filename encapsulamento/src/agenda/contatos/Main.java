package agenda.contatos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Agenda contato1 = new Agenda("Jõao Silva ", "(11) 9999-0000");
        Agenda contato2 = new Agenda("Lucas Felippe", "(51) 992684164");
        Agenda contato3 = new Agenda("Will Smith", "(98) 7777-0000");


        ArrayList<Agenda> agenda = new ArrayList<>();

        agenda.add(contato1);
        agenda.add(contato2);
        agenda.add(contato3);

        int i = 1;
        for (Agenda contatos : agenda){
            System.out.println(i + "." + contatos.getNome() + "- " + contatos.getNome());
            i++;
        }
    }
}
