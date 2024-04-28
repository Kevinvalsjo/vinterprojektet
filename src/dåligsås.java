public class dåligsås extends Sås {
    dåligsås(String location, int kalo, int uses, int grader, String consis) {
        super(location, kalo, uses, grader, consis);

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


