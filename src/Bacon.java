public class Bacon extends Ingredienser {

    Bacon(String location, int kalo, int uses) {
        super(uses);
        this.location = location;

        this.kalorier = kalo;

        this.uses = uses;
    }

    public int getkalo() {

        return kalorier;
    }

    public String getlocation() {
        return location;

    }

    public int getuses() {
        return uses;
    }

    //constructor för Baco
//
}