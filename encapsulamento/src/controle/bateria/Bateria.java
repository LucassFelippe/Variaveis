package controle.bateria;

public class Bateria {
    private int nivelBateria;



    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if ((nivelBateria >= 0 && nivelBateria <= 100))
            this.nivelBateria = nivelBateria;
    }

    public String exibeStatus() {
        if (nivelBateria <= 20) {
           return "Bateria fraca";
        } else if (nivelBateria <= 79) {
            return "Bateria ok";
        } else {
             return "Bateria cheia";
        }

    }
}
