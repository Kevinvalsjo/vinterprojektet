public class Brunsås extends Sås {
    Brunsås(String location, int kalo, int uses, int grader, String consis) {
        super(location, kalo, uses, grader, consis);

    }

    @Override
    public void stark() {
        System.out.println("Väldigt stark");
    }

    @Override
    public String returnMyName() {
        return "brunsås";
    }

}


