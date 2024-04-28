public class Bacon extends Ingredienser {

    //konstruktorn tar in värden från Program klassen och sätter in värdena i klassen
    Bacon(String location, int kalo, int uses, int grader) {
        super(uses);

        this.location = location;

        this.kalorier = kalo;
        this.grader = grader;
        this.uses = uses;
    }


    //namn för klassen
    @Override
    public String returnMyName() {
        return "bacon";
    }
//
}