// JAVA è un linguaggio di programmazione orientato agli oggetti quindi interamente costituito da classi.
/* JDK (Java Development Kit) è un insieme di strumenti software e librerie che consentono agli sviluppatori 
di creare ,compilare, testare ed anche debaggare applicazioni Java.*/


//Commento su singola linea
/* Commento du multilinea */

/*
public class IlMioPrimoProjJava {

 public static void main(String[] args) {
  
  
  java.util.Scanner input = new java.util.Scanner(System.in); 
  
  System.out.println("Ciao come ti chiami");
  String nome = input.nextLine();
  
  System.out.println("Ciao "+nome+". Molto piacere!");
  System.out.println("E dimmi, "+nome+"... ma quanti anni hai?");
  
  
  int anni = input.nextInt();
  input.nextLine();
  
  System.out.println("OOOOk hai "+anni+" anni.");
  
  if (anni>=18) {
   System.out.println("OK! Sei maggiorenne!");
  }
  else
  {
   System.out.println("OK! Sei minorenne!");
  }
  
 }
 
}
*/

/*
import java.util.Scanner;

public class IlMioPrimoProjJava {

 public static void main(String[] args) {
  
  
  
  Scanner input = new Scanner(System.in);
  System.out.println("Inserisci il tuo nome");
  
  String nome = input.nextLine();
  
  System.out.println("Inserisci la tua altezza in metri");  
  double altezza = input.nextDouble();
  input.nextLine();
  
  System.out.println("Quanti anni hani?");
  int anni = input.nextInt();
  input.nextLine();
  
  
  System.out.println("Dunque, ti chiami "+nome+" e hai "+anni+" anni e sei alto/a "+altezza);
  
  
 }
 
}
*/