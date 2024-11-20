public static void main(String[] args){
  
  public affiche_etoile(int nbetoile){
    String etoile = "";
    for(int i = 0; i < nbetoile;i++){
      etoile += "*";
    }
    return etoile;
  }
  System.out.println(affiche_etoile(5));
}
