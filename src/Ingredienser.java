import java.util.Scanner;

public class Ingredienser {// variablerna är inte privata för att arven måste komma åt de. går nog att lösa på något sätt
    protected String location;//var kommer ingrediensen ifrån
    protected int kalorier;//hur många kalorier i en ignrediens
    protected int uses;//hur många gånger man kan använda en ingrediens
    private int total;
    protected int grader;
    protected String consis;

    public int getkalo() {
        return kalorier;
    }

    public int getgrader() {
        return grader;
    }

    public String getlocation() {
        return location;
    }

    public int getuses() {
        return uses;
    }

    Ingredienser(int uses) {
        this.uses = uses;
    }


    public int mat() {

        if (uses <= 0) {
            total = 0;
            System.out.println("Du blev så arg för att du inte hade mer av denna och kastade kastrullen ut igenom fönstret och förlorade alla ingredienser du hade lagt i");
        } else {
            System.out.println("Du har bara " + uses + " användningar kvar");
            total += getkalo();
            uses--;
            System.out.println("Du har lagt i totalt " + total + " av den här ingrediensen ");


        }
        return total;
    }

    int användare;

    public int setKalorier(int kalorier) {
        if (kalorier >= 0) {
            total -= användare;
            System.out.println("Du har nu " + total + " av denna"

            );

        } else {
            System.out.println("Du har ingen av denna");
        }


        return total;
    }

    public double setKalorier(double kalorier) {
        if (kalorier >= 0) {
            total -= användare;
            System.out.println("Du har nu " + total + " av denna"

            );

        } else {
            System.out.println("Du har ingen av denna");
        }
        return total;
    }

}
