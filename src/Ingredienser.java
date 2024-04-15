import java.security.spec.RSAOtherPrimeInfo;

abstract class Ingredienser {// variablerna är inte privata för att arven måste komma åt de. går nog att lösa på något sätt
    protected String location;//var kommer ingrediensen ifrån
    protected int kalorier;//hur många kalorier i en ignrediens
    protected int uses;//hur många gånger man kan använda en ingrediens

    Ingredienser(int uses) {
        this.uses = uses;
    }


    public void mat() {

        if (uses <= 0) {

            System.out.println("Du har inte mer av denna");
        } else {
            System.out.println("Du har bara " + uses + " användningar kvar");

            System.out.println("Du har lagt i och kalorierna av soppan har gått upp till ");

        }

    }

    public abstract int kalo();

    public abstract String plats();
}