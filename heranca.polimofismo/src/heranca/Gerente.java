package heranca;

public class Gerente extends Funcionarios{
    private double bonus;

    public Gerente(String nome, int salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
