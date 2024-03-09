public class Sås extends Ingredienser{


    Sås(String plats,int kalo,int uses){
        this.location=plats;

        this.kalorier = kalo;
        this.uses = uses;
    }
    public int såskalo(){

        return kalorier;
    }
    public String såsplats(){
        return location;

    }
    public int såsuses(){
        return uses;
    }



}
