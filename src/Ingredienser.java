import java.util.Scanner;

public class Ingredienser {// variablerna är inte privata för att arven måste komma åt de.
    protected String location;//var kommer ingrediensen ifrån
    protected int kalorier;//hur många kalorier i en ignrediens
    protected int uses;//hur många gånger man kan använda en ingrediens
    private int total;
    protected int grader;

    Ingredienser(int uses) {
        this.uses = uses;
    }

    Ingredienser(String location, int kalo, int uses, int grader) {
        this.location = location;
        this.kalorier = kalo;
        this.grader = grader;
        this.uses = uses;
    }


    //getmetoder för att hämta värden
    public String getLocation() {
        return location;
    }

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

    //tar in värden från Program klasen och räknar ut hur många användingar man har kvar
    public int mat() {

        if (uses <= 0) {
            System.out.println("Du har inte mer " + returnMyName());
        } else {
            System.out.println("Du har bara " + uses + " användningar kvar");
            total += getkalo();
            uses--;
            System.out.println("Du har lagt i totalt " + total + " av den här ingrediensen ");


        }
        return total;
    }


    /* public int setKalorier(int kalorier) {
         if (kalorier >= 0) {
             total -= kalorier;
             System.out.println("Du har nu " + total + " av denna"

             );

         } else {
             System.out.println("Du har ingen av denna");
         }


         return total;
     }

     public double setKalorier(double kalorier) {
         if (kalorier >= 0) {
             total -= kalorier;
             System.out.println("Du har nu " + total + " av denna"

             );

         } else {
             System.out.println("Du har ingen av denna");
         }
         return total;
     }
     */
    //metod som alla ingredienserna overridar(polymorfism)
    public String returnMyName() {
        return "Detta är en ingrediens";
    }


}
