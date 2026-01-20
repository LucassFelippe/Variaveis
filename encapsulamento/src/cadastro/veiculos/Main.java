package cadastro.veiculos;

public class Main {
    public static void main(String[] args) {

    Cadastra carro = new Cadastra("Gol", "ABC-1234", 2020);

        System.out.println("Veiculo Cadastrado: ");
        System.out.println("Carro: " + carro.getModelo());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Ano: " + carro.getAno());

    }

}
