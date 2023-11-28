public class Sapo {
    private int tamanho;
    private Inseto insetoSapo;

    public Sapo(int tamanho, Inseto insetoSapo){
        this.tamanho = tamanho
        this.insetoSapo = insetoSapo;
    }

    public int getTamanho (){
        return tamanho
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public Inseto getInsetoSapo(){
        return insetoSapo;
    }

    public void setInsetoSapo(Inseto insetoSapo){
        this.insetoSapo = insetoSapo;
    }

    public int calcularValorNutricional(int tamanho){
        return tamanho / 2;
        }

    public void absorverNutrientes(){
        this.tamanho += this.inseto.calcularValorNutricional(this.insetoSapo.getTamanho());
    }
}