import java.security.spec.RSAOtherPrimeInfo;

class Ingredienser{// variablerna är inte privata för att arven måste komma åt de. går nog att lösa på något sätt
    protected String location;//var kommer ingrediensen ifrån
    protected int kalorier;//hur många kalorier i en ignrediens
    protected int uses;//hur många gånger man kan använda en ingrediens
String p;
int majs;
public int total;

    public void mat(){

    if (p.uses <= 0) {

        System.out.println("Du har inte mer av denna");
    } else {
        System.out.println("Du har bara"+p.uses+ "användningar kvar");

        p.uses--;
        total +=1;
        System.out.println("Du har lagt i lite  och kalorierna av soppan har gått upp till " + total);

    }
}

    public int uses() {
        return uses;
    }

}