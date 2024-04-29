public class Saltkar {
    //variabler för saltkaret
    private int volym;
    private String märke;
    private Salt salt;

    //säger att den ska peka på variablerna i den här klassen
    Saltkar(int volym, String märke) {
        this.volym = volym;
        this.märke = märke;
    }

    //skapar nytt salt som ligger i saltkaret
    public Salt addSalt(String location, int kalo, int uses, int grader) {
        Salt salt = new Salt(location, kalo, uses, grader, this);
        this.salt = salt;
        return salt;

    }

    //skriver ut information om saltkaret
    @Override
    public String toString() {
        String s = "\nSaltkar med volymen " + volym + " Kommer från " + märke;
        return s;
    }
}
