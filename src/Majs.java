public class Majs extends Ingredienser {
    //konstruktorn tar in värden från Program klassen
    Majs(String location, int kalo, int uses, int grader) {
        super(uses);
        this.location = location;
        this.kalorier = kalo;
        this.grader = grader;
        this.uses = uses;
    }


    //polymorfism
    @Override
    public String returnMyName() {
        return "majs";
    }
}
