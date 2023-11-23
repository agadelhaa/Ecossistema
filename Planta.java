public class Planta {
    // Atributos da classe Planta:
    private int tamanho;
    private Solo soloPlanta;
    // o segundo atributo é um objeto da classe Solo que será atribuído a variável soloPlanta.

    // método para criar um novo objeto da classe Planta
    public Planta(int tamanho, Solo soloPlanta){
        this.tamanho = tamanho;
        this.soloPlanta = soloPlanta;
    }

    // método para consultar o atributo tamanho da planta
    public int getTamanho() {
        return tamanho;
    }

    // método para alterar o tamanho da planta
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // método para consultar o atributo soloPlanta, que é um objeto da classe Solo
    public Solo getSoloPlanta() {
        return soloPlanta;
    }

    // método para alterar o atributo soloPlanta, é um objeto da classe Solo
    public void setSoloPlanta(Solo soloPlanta) {
        this.soloPlanta = soloPlanta;
    }

    // método para calcular o valor nutricional que a planta terá para quem se alimentar dela
    public int calcularValorNutricional(int tamanho){
        return tamanho / 6;
    }

    // método para calcular o quanto a planta cresce ao absorver os nutrientes do solo
    public void absorverNutrientes(){
        this.tamanho += this.soloPlanta.calcularValorNutricional(this.soloPlanta.getNutrientes());
    }
}

