public class Bacon extends Ingredienser {

    Bacon(String location, int kalo, int uses, int grader) {
        super(uses);
        this.location = location;

        this.kalorier = kalo;
        this.grader = grader;
        this.uses = uses;
    }


    @Override
    public String returnMyName() {
        return "bacon";
    }
//
}