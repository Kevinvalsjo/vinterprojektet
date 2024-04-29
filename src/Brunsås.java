public class Brunsås extends Sås {
    Brunsås(String location, int kalo, int uses, int grader) {
        super(location, kalo, uses, grader);

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


