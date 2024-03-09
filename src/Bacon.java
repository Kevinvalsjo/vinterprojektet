public class Bacon extends Ingredienser{


    Bacon(String plats,int kalo, int uses){
        this.location=plats;

        this.kalorier = kalo;

        this.uses = uses;
    }
    public int baconkalo(){

        return kalorier;
    }
    public String baconplats(){
        return location;

    }
    public int baconuses(){
        return uses;
    }

    //constructor för Baco
//
}