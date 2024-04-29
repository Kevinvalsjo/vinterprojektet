public class dåligsås extends Sås {
    dåligsås(String location, int kalo, int uses, int grader) {
        super(location, kalo, uses, grader);

    }

    @Override
    public void stark() {
        System.out.println("Jätta äcklig och stark");
    }

    @Override
    public String returnMyName() {
        return "dåligsås";
    }

}


