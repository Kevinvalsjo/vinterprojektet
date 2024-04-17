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
            total += kalo();
            uses--;
            System.out.println("Du har lagt i någonting och kalorierna av soppan har gått upp till " + total);


        }
        return total;
    }

    public abstract int kalo();

    public abstract String plats();

    public abstract int uses();

}