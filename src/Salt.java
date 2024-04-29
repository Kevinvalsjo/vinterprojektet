public class Salt extends Ingredienser {
    //kopplar till vilket saltkar den ligger i
    Saltkar saltkar;

    Salt(String location, int kalo, int uses, int grader, Saltkar saltkar) {
        super(uses);
        this.location = location;
        this.grader = grader;
        this.kalorier = kalo;
        this.uses = uses;
        this.saltkar = saltkar;
    }

    @Override
    public String returnMyName() {
        return "salt";
    }

    //skriver ut information om saltet
    @Override
    public String toString() {
        String s = "\nSalt från " + location;
        return s;
    }


}
