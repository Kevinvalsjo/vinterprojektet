public class Ris extends Ingredienser{
    Ris(String plats,int kalo, int uses){
        this.location=plats;

        this.kalorier = kalo;

        this.uses = uses;
    }

    public int risuses(){
        return uses;
    }
    public int riskalo(){

        return kalorier;
    }
}
