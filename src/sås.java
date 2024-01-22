class sås extends Ingredienser{
    private int kalorier;
    public sås(int kalorier, String ingrediens){
        super(ingrediens);
        this.kalorier = kalorier;

    }

    public int getKalorier(){
        return kalorier;
    }

}
