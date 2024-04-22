public class Majs extends Ingredienser {
    Majs(String location, int kalo, int uses) {
        super(uses);
        this.location = location;

        this.kalorier = kalo;

        this.uses = uses;
    }

    public int getuses() {
        return uses;
    }


    public int getkalo() {

        return kalorier;
    }

    public String getlocation() {
        return location;

    }

}
