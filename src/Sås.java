public class Sås extends Ingredienser {
    Sås(String location, int kalo, int uses, int grader) {
        super(uses);
        this.location = location;
        this.grader = grader;
        this.kalorier = kalo;
        this.uses = uses;

    }

    public void stark() {
        System.out.println("Såsens starkhet");
    }

    @Override
    public String returnMyName() {
        return "sås";
    }

}
