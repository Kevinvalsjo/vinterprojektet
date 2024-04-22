public class Ris extends Ingredienser {
    Ris(String location, int kalo, int uses) {
        super(uses);
        this.location = location;

        this.kalorier = kalo;

        this.uses = uses;
    }//konstruktor som tar in värden från objekt skapandet i main, Här sätts ris.location ris.kalorier och ris.uses.


    public int getuses() {
        return uses;
    }//används för att printa ut hur många gånger någonting har använts

    public int getkalo() {

        return kalorier;
    }//används för att printa ut hur många kalorier

    public String getlocation() {
        return location;

    }//används för att printa ut platsen
}
