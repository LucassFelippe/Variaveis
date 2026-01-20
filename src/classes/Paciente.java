package classes;

public class Paciente {
     String nome;
     int idade;
     double altura;
     boolean estudante;

     public Paciente (String nome,int idade, double altura, boolean estudante){
         this.nome = nome;
         this.idade = idade;
         this.altura = altura;
         this.estudante = estudante;

     }

     void mostrarDados(){
         System.out.println("Nome: " + nome);
         System.out.println("Idade: " + idade);
         System.out.println("Altura: " + altura);
         System.out.println("Estudante: " + estudante);
     }
}
