package verifica.nota;

public class main {
    public static void main(String[] args) {
        double notaP = 7.5;
        double notaM = 8.0;
        double notaF = 3.0;
        double media = (notaP + notaM + notaF) / 3;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("O estudante está de recuperação. ");
        }else {
            System.out.println("Reprovado");
        }
    }
}
