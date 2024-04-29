public class dåligsås extends Sås {
    boolean möglig;

    dåligsås(String location, int kalo, int uses, int grader, String färg, boolean möglig) {
        super(location, kalo, uses, grader, färg);
        this.möglig = möglig;
    }

    @Override
    public void stark() {
        System.out.println("Jätte äcklig och stark");
    }

    @Override
    public String returnMyName() {
        return "dåligsås";
    }

}


