public class Sås extends Ingredienser {
    protected String färg;

    Sås(String location, int kalo, int uses, int grader, String färg) {
        super(location, kalo, uses, grader);
        this.färg = färg;
    }

    public void stark() {
        System.out.println("Såsens starkhet");
    }

    @Override
    public String returnMyName() {
        return "sås";
    }


}
