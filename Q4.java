public class etoile{


  public String triangletoile(int nbetoile){

    String triangle = "";

    for (int i = 1; i < nbetoile; i++){

      for(int j = 1; j < i; j++){
        triangle +="*";
      }
      triangle +="\n";
    }
    return triangle;
  }

  public static void main(String[] args){
    System.out.println(triangletoile(4));

  }
}
