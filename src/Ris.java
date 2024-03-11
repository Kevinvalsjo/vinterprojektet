public class Ris extends Ingredienser {

    Ris(String plats,int kalo, int uses){
        this.location=plats;

        this.kalorier = kalo;

        this.uses = uses;
    }//konstruktor som tar in värden från objekt skapandet i main, Här sätts ris.location ris.kalorier och ris.uses.

    public int risuses(){
        return uses;
                        }//används för att printa ut hur många gånger någonting har använts
    public int riskalo(){

        return kalorier;
                         }//används för att printa ut hur många kalorier
    public String risplats() {
        return location;

                             }//används för att printa ut platsen
}
