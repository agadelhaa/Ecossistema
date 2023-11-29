public class Onca {
   
    private int tamanho;
    private Cobra cobraOnca;
   
    public Onca(int tamanho, Cobra cobraOnca){
        this.tamanho = tamanho;
        this.cobraOnca = cobraOnca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

   
    public Cobra getCobraOnca() {
        return cobraOnca;
    }

    
    public void setCobraOnca(Cobra cobraOnca) {
        this.cobraOnca = cobraOnca;
    }

    public int calcularValorNutricional(int tamanho){
        return tamanho / 2;
    }


    public void absorverNutrientes(){
        this.tamanho += this.cobraOnca.calcularValorNutricional(this.cobraOnca.getTamanho());
    }
}