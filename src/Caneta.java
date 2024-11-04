public class Caneta {
    private static final double CONSUMO_BASE_DE_TINTA = 0.01;
    private String cor;
    private String marca;
    private double percentualDeTinta;

    public Caneta(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
        this.percentualDeTinta = 1.0;
    }

    public Caneta(String cor, String marca, double percentualDeTinta) {
        this.cor = cor;
        this.marca = marca;

        // Limitando o valor do percentual de tinta para >= 0 e <= 1
        if (percentualDeTinta > 1.0)
            this.percentualDeTinta = 1.0;
        else this.percentualDeTinta = Math.max(percentualDeTinta, 0.0);
    }

    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getPercentualDeTinta() {
        return this.percentualDeTinta;
    }

    public void escrever(String texto) {
        if (percentualDeTinta > 0) {
            System.out.println(texto);
            percentualDeTinta -= CONSUMO_BASE_DE_TINTA;
        } else
            System.out.println("A caneta está sem tinta!");
    }

    public void pintar(String objeto) {
        if (percentualDeTinta > 0) {
            System.out.println(objeto + " pintado de " + this.cor);
            percentualDeTinta -= CONSUMO_BASE_DE_TINTA * 10;
        } else
            System.out.println("A caneta está sem tinta!");
    }
}
