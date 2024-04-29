public class Vitlökssås extends Sås {
    Vitlökssås(String location, int kalo, int uses, int grader) {
        super(location, kalo, uses, grader);
    }

    @Override
    public void stark() {
        System.out.println("Inte så stark");
    }

    @Override
    public String returnMyName() {
        return "vitlökssås";
    }

}
