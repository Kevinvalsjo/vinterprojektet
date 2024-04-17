public class Sås extends Ingredienser {


    Sås(String plats, int kalo, int uses) {
        super(uses);
        this.location = plats;

        this.kalorier = kalo;
        this.uses = uses;
    }

    public int kalo() {

        return kalorier;
    }

    public String plats() {
        return location;

    }

    public int uses() {
        return uses;
    }


}
