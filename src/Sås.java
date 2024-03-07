public class Sås extends Ingredienser{


    Sås(String plats,int kalo){
        this.location=plats;

        this.kalorier = kalo;
    }
    public int såskalo(){

        return kalorier;
    }
    public String såsplats(){
        return location;

    }



}
