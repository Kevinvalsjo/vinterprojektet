public class Sås extends Ingredienser {
    Sås(String location, int kalo, int uses, int grader, String consis) {
        super(uses);
        this.location = location;
        this.grader = grader;
        this.kalorier = kalo;
        this.uses = uses;
        this.consis = consis;
    }

    public void stark() {
        System.out.println("Såsens starkhet");
    }

    @Override
    public String returnMyName() {
        return "sås";
    }

}
