package controle.estoque;

public class Estoque {

    String nome;
    int quantidade;

     public  void vender(int qtdVendida){

         if (qtdVendida < quantidade){
            quantidade -= qtdVendida;
             System.out.printf("Venda Realizada. Estoque restante de %s: %d%n",nome,quantidade);
         }else {
             System.out.println("Estoque insuficiente!");
         }
     }
}
