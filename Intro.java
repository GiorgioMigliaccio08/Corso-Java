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

// Le variabili devono avere nomi diversi
  // NON POSSONO ESISTERE DUE VARIABILI CON LO STESSO NOME!
  
  // Le variabili sono associate al tipo di dati con cui le dichiariamo
  // int = numeri interi
  // double = numeri decimali
  // String = stringhe di testo
  // e così via...
  
  // esistono variabili primitive e variabili di riferimento o oggetti
  // le primitive sono i tipi base, gli oggetti sono le classi
  // Le variabili primitive sono:
  // byte, short, int, long, float, double, char, boolean
  // Le variabili di riferimento sono gli oggetti, ad esempio String, Scanner, ecc.
  
  // vediamo i tipi primitivi
  // byte = 1 byte = 8 bit può contenere valori numerici interi da -128 a 127
  // short = 2 byte = 16 bit può contenere valori numerici interi da -32.768 a 32.767
  // int = 4 byte = 32 bit può contenere valori numerici interi da -2.147.483.648 a 2.147.483.647
  // long = 8 byte = 64 bit può contenere valori numerici interi da -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
  
  // float = 4 byte = 32 bit può contenere valori numerici con decimali da -3.40282347E+38 a 3.40282347E+38
  // double = 8 byte = 64 bit può contenere valori numerici con decimali da -1.79769313486231570E+308 a 1.79769313486231570E+308 
  // char = 2 byte = 16 bit può contenere un carattere Unicode ('A', 'b', 'x', '@') e si può indicare i caratteri anche con i codici esadecimali e va da '\u0000' a '\uffff'

  // boolean = 1 byte = 8 bit può contenere solo due valori: true o false
  // true significa vero, false significa falso
  // rappresenta un valore logico, ad esempio se una condizione è vera o falsa
  
  int a = 10; // dichiarazione e inizializzazione della variabile a
  int b = 20; // dichiarazione e inizializzazione della variabile b
  // qualche esempio con i double
  double c = 10.5; // dichiarazione e inizializzazione della variabile c dentro ora ha 10.5
  double d = 20.5; // dichiarazione e inizializzazione della variabile d dentro ora ha 20.5
  
  // i float sono simili ai double ma hanno meno precisione, meno cifre dopo la virgola.
  // inoltre le variabili float hanno bisogno di una lettera f alla fine del numero a cui le assegnamo
  
  // se voglio dichiarare una variabile float e 
  // metterci dentro 10.5, devo crearla float e  e  poi ci associo 10.5 segito da f
  // questo perchè JAVA normalmente se scrive 10.5 lo interpreta come un double
  // e questo può creare problemi... perchè i float sono incompatibili normalmente... hanno bisogno della f
  
  
  float e = 10.5f; // dichiarazione e inizializzazione della variabile e dentro ora ha 10.5
  
  // se però metto dei valori dentro le variabili di tipo double a e b, dopo tra loro si possono assegnare senza f
  
  double f = e; // dichiarazione e inizializzazione della variabile f dentro ora ha 10.0
  
  // DENTRO un double o un float posso mettere anche un int
  
  double g = a; // dichiarazione e inizializzazione della variabile g dentro ora ha 10.0
  // o esempio con numero
  
  double h = 10; // dichiarazione e inizializzazione della variabile h dentro ora ha 10.0
  // e non serve la f con i float
  float i = 10; // dichiarazione e inizializzazione della variabile i dentro ora ha 10.0


// in java ogni confronto da per risultato un booleano
  
  // possiamo quindi salvarlo in una variabile booleana
  
  boolean risultato = 5 > 3; // maggiore
  boolean risultato2 = 5 < 3; // minore
  boolean risultato3 = 5 == 3; // uguale
  boolean risultato4 = 5 != 3; // diverso
  boolean risultato5 = 5 >= 3; // maggiore o uguale
  boolean risultato6 = 5 <= 3; // minore o uguale

  import java.util.Scanner;

public class IlMioPrimoProjJava {

 public static void main(String[] args) {
  
  // In java è possibile eseguire dei blocchi di codice 
  // solo in certi casi...
  // quando una certa condizione è vera o falsa
  
  // per esempio, 
  int a = 40;
  if (a>10)
  {
   System.out.println("a è maggiore di 10");
  }
  else
  {
   System.out.println("a è minore di 10");
  }
  
  
  // è possibile che operare più controlli se - allora -se 
  
  if (a>10)
  {
   System.out.println("a è maggiore di 10");
  }
  else if (a<10)
  {
   System.out.println("a è minore di 10");
  }
  else
  {
   System.out.println("a è uguale a 10");
  }
 }
 
}

//ESERCIZIO 1


import java.util.Scanner;

public class App {

 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.println("Ciao come ti chiami?");
  String nome = input.nextLine();
  
  System.out.println("Ciao "+nome+". E' bello vedere che sei ancora vivo...");
  System.out.println("e dimmi, "+nome+"...ti senti vivo?");
  String scelta = input.nextLine().toLowerCase();
  input.nextLine();
  
  
  
  if(scelta.equals("si")) {
   System.out.println("Ok! Sei vivo! Non mollare prof "+nome+ "");
  }
  else if (scelta.equals("no")) {
   System.out.println("Oh no! Forse dovresti prenderti un altra pausa... e bere meno caffè... xD");
  }
  else {
   System.out.println("non ho ben capito, ma spero che tu stia bene!");
  }
  }

}