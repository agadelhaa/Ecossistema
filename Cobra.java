public class Cobra {
   
    private int tamanho;
    private int proteina;
    private Onca onca1;
    private boolean venenosa;
   
    public Cobra(int tamanho, Onca onca1, boolean venenosa, int proteina){
        this.tamanho = tamanho;
        this.onca1 = onca1;
        this.venenosa = venenosa;
        this.proteina = proteina;
    }

    public boolean getVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getProteina() {
        return proteina;
    }

    public void setarProteina(int proteina) {
        this.proteina = proteina;
    }

   
    public Onca getOncaCobra() {
        return onca1;
    }

    
    public void setOncaCobra(Onca onca1) {
        this.onca1 = onca1;
    }

    public int calcularProteina(int tamanho){
        return tamanho * 1000;
    }


    public void setarProteina(){
        this.proteina += this.calcularProteina(this.onca1.getTamanho());
    }
}