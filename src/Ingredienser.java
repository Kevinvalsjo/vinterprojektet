abstract class Ingredienser {// variablerna är inte privata för att arven måste komma åt de. går nog att lösa på något sätt
    protected String location;//var kommer ingrediensen ifrån
    protected int kalorier;//hur många kalorier i en ignrediens
    protected int uses;//hur många gånger man kan använda en ingrediens
    private int total;

    Ingredienser(int uses) {
        this.uses = uses;
    }


    public int mat() {

        if (uses <= 0) {

            System.out.println("Du har inte mer");
        } else {
            System.out.println("Du har bara " + uses + " användningar kvar");
            total += getkalo();
            uses--;
            System.out.println("Du har lagt i totalt " + total + " av den här ingrediensen ");


        }
        return total;
    }

    public abstract int getkalo();

    public abstract String getlocation();

    public abstract int getuses();

}