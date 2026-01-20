package media;

public class CalculaMedia {
    String nome;
    double nota1;
    double nota2;


    public void relatorio(){
        double calculaMedia = (nota1 + nota2 ) / 2;
        double media = calculaMedia;
        System.out.printf("Aluno: %s \n Nota1: %.1f \n Nota2: %.1f \n Media: %.1f \n",nome, nota1, nota2, media);

        if( media >= 7){
            System.out.println("Situação: Aprovado! ");
        }else {
            System.out.println("Reprovado!");
        }
    }

}
