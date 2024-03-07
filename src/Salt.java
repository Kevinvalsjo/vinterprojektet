public class Salt extends Ingredienser{


    Salt(String plats,int kalo){
        this.location=plats;

        this.kalorier = kalo;
    }
    public int saltkalo(){

        return kalorier;
    }
    public String saltplats(){
        return location;

    }
    public void saltet()
{
    System.out.println("Det här saltet kommer från Uganda och produceras i naturlig miljö");
}
public void drink(){
        System.out.println("Du har bestämt dig för att dricka saltet, men varför?");
    }

}
