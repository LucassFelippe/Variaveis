package registro.notas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String disciplina;
    private List<Double> notas;

    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
        this.notas  = new ArrayList<>();
    }

    public void adicionarNota(double addNota){
        if (addNota >= 0 && addNota <= 10){
            notas.add(addNota);
        }else {
            System.out.println("Nota invalida ignorada: " + notas);
        }
    }

    public int contarNotasValidas(){
        return notas.size();
    }

    public double calculaMedia(){
        if (notas.isEmpty()) return 0;
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.size();
    }

    public String getDisciplina() {
        return disciplina;
    }
}
