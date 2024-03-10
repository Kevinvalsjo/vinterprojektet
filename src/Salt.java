public class Salt extends Ingredienser {


    Salt(String plats, int kalo, int uses) {
        this.location = plats;

        this.kalorier = kalo;

        this.uses = uses;
    }

    public int saltuses() {
        return uses;
    }

    public int saltkalo() {

        return kalorier;
    }

    public String saltplats() {
        return location;

    }
}
