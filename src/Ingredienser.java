import java.security.spec.RSAOtherPrimeInfo;

class Ingredienser{
    private String ingrediens;

public Ingredienser(String ingrediens){
    this.ingrediens =ingrediens;
}

public void ljud(){
    System.out.println("gör ett ljud");
}
public String getIngrediens(){

    return ingrediens;
}


}