public class Brunsås extends Sås {
    double dlSoja;

    Brunsås(String location, int kalo, int uses, int grader, String färg, double dlSoja) {
        super(location, kalo, uses, grader, färg);
        this.dlSoja = dlSoja;
    }

    @Override
    public void stark() {
        System.out.println("Lagom stark");
    }

    @Override
    public String returnMyName() {
        return "brunsås";
    }


}


