public class Inseto {
    private int tamanho;
    private Planta plantaInseto;

    public Inseto(int tamanho, Planta plantaInseto){
        this.tamanho = tamanho;
        this.plantaInseto = plantaInseto;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
        
    public Planta getPlantaInseto(){
        return plantaInseto;
    }

    public void setPlantaInseto(Planta plantaInseto){
        this.plantaInseto = plantaInseto 
    }

    public int calcularValorNutricional(int tamanho){
        return tamanho / 10
    }

    public void absorverNutrientes(){
        this.tamanho += this.plantaInseto.calcularValorNutricional(this.plantaInseto.getTamanho());
    }
 
}
