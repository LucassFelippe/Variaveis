package controle.tarefas;

public class Controle {
     String descricao;
     boolean concluida;


     public void exibeTarefas(){

         String status;

         if(concluida){
             System.out.println("Tarefa: " + descricao + " - Status: Concluida");
         }else {
             System.out.println("Tarefa: " + descricao + " - Status: Pendente" );
         }


     }
}
