public class Salt extends Ingredienser {


    Salt(String plats, int kalo, int uses) {
        this.location = plats;

        this.kalorier = kalo;

        this.uses = uses;
    }

    public int uses() {
        return uses;
    }

    public int kalo() {

        return kalorier;
    }

    public String plats() {
        return location;

    }
}
