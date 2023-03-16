import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
   Scanner x = new Scanner(System.in);
   int resp;
System.out.println("SEJA BEM VINDO AO NOSSO CINEMA");
 System.out.println("Digite a categoria para saber o valor do ingresso");
     
     
     System.out.println("1- estudante");
      System.out.println("2- aposentado");
        System.out.println("3-normal");
     
          resp = x.nextInt();
           double ing = 24;
        
        switch(resp){
    
              case 1: ing = ing - (ing *50/100); break;
              case 2: ing = ing - (ing *30/100); break;
              case 3: ing = ing - (ing *0); break;
}
 
 System.out.println(" o valor do ingresso com desconto será: "+ ing);
   
}
   }
