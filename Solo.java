public class Solo {

    // Atributos da classe Solo:
    private int nutrientes;
    private Onca oncaSolo;

    // Construtor da classe
    public Solo(int nutrientes, Onca oncaSolo) {
        this.nutrientes = nutrientes;
        this.oncaSolo = oncaSolo;
    }

    // Método para consultar o atributo nutrientes do solo
    public int getNutrientes() {
        return nutrientes;
    }

    // método para alterar os nutrientes do solo
    public void setNutrientes(int nutrientes) {
        this.nutrientes = nutrientes;
    }

    // método para consultar o atributo onçaSolo, que é um objeto da classe Onça
    public Solo getOnçaSolo() {
        return oncaSolo;
    }

    // método para alterar o atributo onçaSolo, é um objeto da classe Onça
    public void setOncaSolo(Onca oncaSolo) {
        this.oncaSolo = oncaSolo;
    }

    // Método para calcular o valor nutricional do solo para a planta
    public int calcularValorNutricional(int nutrientes) {
        // Calcula o valor nutricional com base no tamanho da planta
        return nutrientes / 3;
    }

    // Método para absorver nutrientes
    public void absorverNutrientes() {
        this.nutrientes += this.oncaSolo.calcularValorNutricional(this.oncaSolo.getTamanho());
    }
}
