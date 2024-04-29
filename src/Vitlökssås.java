public class Vitlökssås extends Sås {
    int antalKlyftor;

    Vitlökssås(String location, int kalo, int uses, int grader, String färg, int antalKlyftor) {
        super(location, kalo, uses, grader, färg);
        this.antalKlyftor = antalKlyftor;
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
