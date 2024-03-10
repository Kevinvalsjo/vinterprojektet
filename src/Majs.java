public class Majs extends Ingredienser{
    Majs(String plats,int kalo, int uses){
        this.location=plats;

        this.kalorier = kalo;

        this.uses = uses;
    }

    public int majsuses(){
        return uses;
    }
    public int majskalo(){

        return kalorier;
    }
}
