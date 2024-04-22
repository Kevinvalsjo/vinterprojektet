public class Ris extends Ingredienser {
    Ris(String location, int kalo, int uses) {
        super(uses);
        this.location = location;

        this.kalorier = kalo;

        this.uses = uses;
    }//konstruktor som tar in värden från objekt skapandet i main, Här sätts ris.location ris.kalorier och ris.uses.


}
