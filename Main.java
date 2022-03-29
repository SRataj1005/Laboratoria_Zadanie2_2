import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    char[] tab = {'a','L','a'};
    int kod;
    char znak;
    System.out.println(tab.length);

    for(int i=0; i < tab.length; i++)
      {
        System.out.println(tab[i]);
      } 
    for(int j=0; j < tab.length; j++)
      {
        znak = charAt(tab[j]);
        kod = (int) znak;
        if(kod >= 97 && kod <=122)
        {
          System.out.println(Character.toLowerCase(tab[j]));
        }
        else
        {
          System.out.println(Character.toUpperCase(tab[j]));
        }  
      
      } 

}
}  