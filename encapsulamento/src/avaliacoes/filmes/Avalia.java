package avaliacoes.filmes;

import java.util.ArrayList;
import java.util.List;

public class Avalia {
    private String titulo;
    private List<Integer> avaliacao;

    public Avalia(String titulo) {
        this.titulo = titulo;
        this.avaliacao = new ArrayList<>();

    }

    public void adicionarAvalicao(int avaliaFilme){
        if(avaliaFilme >= 1 && avaliaFilme <= 5){
            avaliacao.add(avaliaFilme);
        }else {
            System.out.println("Avaliação inválida! Use valores entre 1 e 5");
        }
    }

    public double calculaMedia(){
        int soma = 0;
        for (int nota : avaliacao){
            soma += nota;
        }

        return (double) soma / avaliacao.size();
    }

    public String getTitulo() {
        return titulo;
    }
}
