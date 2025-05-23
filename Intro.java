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

Scanner input;
  // ok, però, a differenza delle variabili primare, come int, double e simili...
  // Scanner è una CLASSE e non un tipo primitivo...
  // Ed è una di quelle che non ha l'istanziamento implicito...
  // Cosa vuol dire?
  // Significa che deve essere ISTANZIATA
  
  // infatti è come se, scrivendo Scanner input; avessi solo "prenotato" il nome input per essere
  // un oggetto Scanner
  // ma un oggetto Scanner in realtà occupa una certa MEMORIA
  // Memoria che ancora non è stata allocata (cioè messa da parte per questa variabile)
  // Per allocarla, devo usare il costruttore in new che vuol dire "nuovo" (producine uno nuovo)...
  // new seguito dal nome della classe che devo  istanziare
  // new Scanner();
  // Poi, come per alcuni altri oggetti (non tutti) serve di indicare la configurazione...
  // Infatti quando facciamo new NOMECLASSE() oltre ad allocare memoria
  // Stiamo anche invocando una cosa che si chiama COSTRUTTORE
  // che è un metodo che prepara anche l'oggetto per essere usato, non si limita a allocare memoria
  // e talvolta questo metodo richiede dei parametri
  
  // nel caso di Scanner li richiede perchè la classe Scanner può creare degli oggetti Scanner
  // per più cose... oggetti che a seconda di come vengono organizzati possono 
  // leggere da tastiera (che è ciò che vogliamo fare noi) o da file o da rete  o altro..
  // quindi nel costruttore new Scanner() dobbiamo inserire un parametro che indica
  // che ci serve per l'input da tastiera.
  // CHI ha creato questa classe l'ha pensata in modo che il parametro che dobbiamo passare
  // è un oggetto. L'oggetto che ci serve è System.in
  // QUesto oggetto farà capire alla classe Scanner che noi vogliamo leggere da tastiera
  // e questa predisporrà l'oggetto per questo scopo
  
  // Quindi la riga di codice che ci serve è:
  
  input = new Scanner(System.in);
  
  // Avremmo potuto farlo anche su una sola riga
  // Scanner input = new Scanner(System.in);
  
  // anche le altre variabili, quelle primarie si possono inizializzare in questo modo
  // int numero = 0;
  // double prezzo = 5.5;

  // per fare questo useremo una classe per l'Input.
  // La classe Scanner
  // Scanner è una classe e quindi ci può permettere di creare
  // un oggetto, una variabile oggetto (o variabile per riferimento).
  
     // Creiamo la variabile oggetto che ci servirà per richiedere l'inserimento
  // di un INPUT Dati da tastiera.
  
  // Scegliamo un nome per la variabile oggetto.
  // DATO che servirà ad acquisire un input da tastiera
  // SUGGERERIREI un nome che ci ricordi a che cosa serve
  // magari input o tastiera... oppure potremmo chiamarla scanner.
  // Attenzione so che scanner sembra il nome della classe, ma questa si chiama
  // Scanne (con la S  maiuscola). JAVA è case sensitive, quindi per lui maiuscole e minuscole
  // fanno differenza. Sono lettere diverse.
  // Scanner e scanner sono due parole diverse.
  // Scanner è il nome della classe
  // quindi potremmo anche chiamarla scanner
  // oppure possiamo preferire scannerInput o inputScanner
  // o come abbiamo detto prima input o tastiera.

  Scanner input;
  // ok, però, a differenza delle variabili primare, come int, double e simili...
  // Scanner è una CLASSE e non un tipo primitivo...
  // Ed è una di quelle che non ha l'istanziamento implicito...
  // Cosa vuol dire?
  // Significa che deve essere ISTANZIATA
  
  // infatti è come se, scrivendo Scanner input; avessi solo "prenotato" il nome input per essere
  // un oggetto Scanner
  // ma un oggetto Scanner in realtà occupa una certa MEMORIA
  // Memoria che ancora non è stata allocata (cioè messa da parte per questa variabile)
  // Per allocarla, devo usare il costruttore in new che vuol dire "nuovo" (producine uno nuovo)...
  // new seguito dal nome della classe che devo  istanziare
  // new Scanner();
  // Poi, come per alcuni altri oggetti (non tutti) serve di indicare la configurazione...
  // Infatti quando facciamo new NOMECLASSE() oltre ad allocare memoria
  // Stiamo anche invocando una cosa che si chiama COSTRUTTORE
  // che è un metodo che prepara anche l'oggetto per essere usato, non si limita a allocare memoria
  // e talvolta questo metodo richiede dei parametri
  
  // nel caso di Scanner li richiede perchè la classe Scanner può creare degli oggetti Scanner
  // per più cose... oggetti che a seconda di come vengono organizzati possono 
  // leggere da tastiera (che è ciò che vogliamo fare noi) o da file o da rete  o altro..
  // quindi nel costruttore new Scanner() dobbiamo inserire un parametro che indica
  // che ci serve per l'input da tastiera.
  // CHI ha creato questa classe l'ha pensata in modo che il parametro che dobbiamo passare
  // è un oggetto. L'oggetto che ci serve è System.in
  // QUesto oggetto farà capire alla classe Scanner che noi vogliamo leggere da tastiera
  // e questa predisporrà l'oggetto per questo scopo
  
  // Quindi la riga di codice che ci serve è:
  
  input = new Scanner(System.in);
  
  // Avremmo potuto farlo anche su una sola riga
  // Scanner input = new Scanner(System.in);
  
  // anche le altre variabili, quelle primarie si possono inizializzare in questo modo
  // int numero = 0;
  // double prezzo = 5.5;

  // con il metodo nextLine() leggo una riga di testo     
  // quello che ottengo è una stringa
  // servirà una variabile stringa
  
  // SE PERO voglio leggere un numero e farlo finire dentro una variabile di tipo int
  // devo usare il metodo nextInt() o nextLine() recuperando una stringa e poi convertire la stringa in int
  
  // Occhio che nextInt() non legge gli spazi, ma soprattutto lascia sporca la memoria della tastiera...
  // si dice in termine tecnico che lascia il buffer sporco
  // e per pulirlo bisogna usare nextLine() subito dopo. Visivamente non si vedrà capitare nulla
  // ma serve a pulire il buffer. Se non si fa, nel caso usassimo un nextLine successivamente
  // per leggere la tastiera non funzionerà.

  // In pratica il primo nextLine() dopo nextInt() non funziona!
  // QUINDI se non c'è nessun nextLine() dopo nextInt() non c'è problema
  // ma se ci serve di usare un nextLine() dopo un nextInt() dobbiamo pulire il buffer
  // e allora, dato che il primo nextLine() non funziona, lo facciamo subito dopo il nextInt()

  // Qualunque programma serio ha bisogno di un INPUT
  // cioè serve che dei dati vengano introdotti nel programma dall'esterno
  // magari leggendo i dati da un file, leggendo i dati da un server
  // leggendo i dati da tastiera (che vuol dire che li inserisce l'utente che usa il programma)
  
  // Noi ora impareremo l'input da tastiera
  
  // In pratica significa che impariamo a realizzare dei programmi
  // che saranno in grado di chiedere all'utente di inserire dei dati
  // questo li inserirà da tastiera e questi dati finiranno dentro delle variabili del programma
  // e dopo il nostro programma le potrà usare...

// per fare questo useremo una classe per l'Input.
  // La classe Scanner
  // Scanner è una classe e quindi ci può permettere di creare
  // un oggetto, una variabile oggetto (o variabile per riferimento).
  
     // Creiamo la variabile oggetto che ci servirà per richiedere l'inserimento
  // di un INPUT Dati da tastiera.
  
  // Scegliamo un nome per la variabile oggetto.
  // DATO che servirà ad acquisire un input da tastiera
  // SUGGERERIREI un nome che ci ricordi a che cosa serve
  // magari input o tastiera... oppure potremmo chiamarla scanner.
  // Attenzione so che scanner sembra il nome della classe, ma questa si chiama
  // Scanne (con la S  maiuscola). JAVA è case sensitive, quindi per lui maiuscole e minuscole
  // fanno differenza. Sono lettere diverse.
  // Scanner e scanner sono due parole diverse.
  // Scanner è il nome della classe
  // quindi potremmo anche chiamarla scanner
  // oppure possiamo preferire scannerInput o inputScanner
  // o come abbiamo detto prima input o tastiera.

Scanner input;
  // ok, però, a differenza delle variabili primare, come int, double e simili...
  // Scanner è una CLASSE e non un tipo primitivo...
  // Ed è una di quelle che non ha l'istanziamento implicito...
  // Cosa vuol dire?
  // Significa che deve essere ISTANZIATA
  
  // infatti è come se, scrivendo Scanner input; avessi solo "prenotato" il nome input per essere
  // un oggetto Scanner
  // ma un oggetto Scanner in realtà occupa una certa MEMORIA
  // Memoria che ancora non è stata allocata (cioè messa da parte per questa variabile)
  // Per allocarla, devo usare il costruttore in new che vuol dire "nuovo" (producine uno nuovo)...
  // new seguito dal nome della classe che devo  istanziare
  // new Scanner();
  // Poi, come per alcuni altri oggetti (non tutti) serve di indicare la configurazione...
  // Infatti quando facciamo new NOMECLASSE() oltre ad allocare memoria
  // Stiamo anche invocando una cosa che si chiama COSTRUTTORE
  // che è un metodo che prepara anche l'oggetto per essere usato, non si limita a allocare memoria
  // e talvolta questo metodo richiede dei parametri
  
  // nel caso di Scanner li richiede perchè la classe Scanner può creare degli oggetti Scanner
  // per più cose... oggetti che a seconda di come vengono organizzati possono 
  // leggere da tastiera (che è ciò che vogliamo fare noi) o da file o da rete  o altro..
  // quindi nel costruttore new Scanner() dobbiamo inserire un parametro che indica
  // che ci serve per l'input da tastiera.
  // CHI ha creato questa classe l'ha pensata in modo che il parametro che dobbiamo passare
  // è un oggetto. L'oggetto che ci serve è System.in
  // QUesto oggetto farà capire alla classe Scanner che noi vogliamo leggere da tastiera
  // e questa predisporrà l'oggetto per questo scopo
  
  // Quindi la riga di codice che ci serve è:
  
  input = new Scanner(System.in);
  
  // Avremmo potuto farlo anche su una sola riga
  // Scanner input = new Scanner(System.in);
  
  // anche le altre variabili, quelle primarie si possono inizializzare in questo modo
  // int numero = 0;
  // double prezzo = 5.5;

  // con il metodo nextLine() leggo una riga di testo     
  // quello che ottengo è una stringa
  // servirà una variabile stringa
  
  // SE PERO voglio leggere un numero e farlo finire dentro una variabile di tipo int
  // devo usare il metodo nextInt() o nextLine() recuperando una stringa e poi convertire la stringa in int
  
  // Occhio che nextInt() non legge gli spazi, ma soprattutto lascia sporca la memoria della tastiera...
  // si dice in termine tecnico che lascia il buffer sporco
  // e per pulirlo bisogna usare nextLine() subito dopo. Visivamente non si vedrà capitare nulla
  // ma serve a pulire il buffer. Se non si fa, nel caso usassimo un nextLine successivamente
  // per leggere la tastiera non funzionerà.

  // In pratica il primo nextLine() dopo nextInt() non funziona!
  // QUINDI se non c'è nessun nextLine() dopo nextInt() non c'è problema
  // ma se ci serve di usare un nextLine() dopo un nextInt() dobbiamo pulire il buffer
  // e allora, dato che il primo nextLine() non funziona, lo facciamo subito dopo il nextInt()

import java.util.Scanner;

public class App {

 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
        
  System.out.println("Questo programma chiederà 10 volte di inserire un numero INTERO");
  System.out.println("Potrai inserire un numero pari o dispari (fai tu)");
  System.out.println("Alla fine ti dirò quanti numeri dispari hai inerito e quanti pari");
  
  int contaPari   = 0;
  int contaDispari  = 0;
  
  for (int i=0;i<10;i++)
  {
   System.out.println("Inserisci un numero intero a caso");
   int num = input.nextInt();
   input.nextLine();
   
   if (num%2 == 0) {
    contaPari++;
   }
   else
   {
    contaDispari++;         
   }   
  }
  
  System.out.println("Hai inserito " + contaPari + " numeri pari");
  System.out.println("Hai inserito " + contaDispari + " numeri dispari");

 }

}

import java.util.Scanner;

public class Palindromo {

 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.println("Inserisci una parola");
  
  String parola = input.nextLine();
  
  System.out.println("La parola inserita ha lunghezza "+parola.length());
  System.out.println("Ora vesiamo se è o meno palindroma");
  parola = parola.toUpperCase();
  String parola_al_contrario = "";
  
  for (int i = parola.length()-1; i>=0; i--) {
   parola_al_contrario = parola_al_contrario + parola.charAt(i); 
  }
  
  if (parola.equals(parola_al_contrario)) {
   System.out.println("La parola è palindroma");
  } else {
   System.out.println("La parola non è palindroma");
  }
 }
}

import java.util.Scanner;

public class Palindromo {

 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.println("Inserisci una parola");
  
  String parola = input.nextLine();
  
  System.out.println("La parola inserita ha lunghezza "+parola.length());
  System.out.println("Ora vediamo se è o meno palindroma");
  parola = parola.toUpperCase();
  
  
  String parola_al_contrario = "";
  
  for (int i = parola.length()-1; i>=0; i--) {
   parola_al_contrario = parola_al_contrario + parola.charAt(i); 
  }
  
  if (parola.equals(parola_al_contrario)) {
   System.out.println("La parola è palindroma");
  } else {
   System.out.println("La parola non è palindroma");
  }
 }
}

import java.util.Scanner;

public class Palindromo {

 public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.println("Inserisci una parola");
  
  String parola = input.nextLine();
  
  System.out.println("La parola inserita ha lunghezza "+parola.length());
  System.out.println("Ora vediamo se è o meno palindroma");
  parola = parola.toUpperCase();
  
  
  String parola_al_contrario = "";
  
  for (int i = parola.length()-1; i>=0; i--) {
   parola_al_contrario = parola_al_contrario + parola.charAt(i); 
  }
  
  if (parola.equals(parola_al_contrario)) {
   System.out.println("La parola è palindroma");
  } else {
   System.out.println("La parola non è palindroma");
  }
 }
}

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

 
 public static int numerocasuale(int min, int max) {
  // Restituisce un numero casuale compreso tra 0 e 100
  Random R = new Random();
  int n = R.nextInt(max - min + 1) + min;
  return n;
 }
 
 public static void main(String[] args) {
  int scelta;
  Scanner input = new Scanner(System.in);
  do
  {
   System.out.println("1. GENERA NUOVA PASSWORD");
   System.out.println("2. ESCI");
    do
    {
     System.out.println("SCEGLI UN'OPZIONE:");                
                 scelta = input.nextInt();
                 input.nextLine(); // Consuma il newline rimasto nel buffer
                 if (scelta != 1 && scelta != 2)
                    {
                        System.out.println("Opzione non valida, riprova.");
                    }
             } while (scelta != 1 && scelta != 2);
   if (scelta==1)
   {
    int lunghezza;
    do
    {
     System.out.println("Inserisci la lunghezza della password (minimo 8 caratteri):");
     lunghezza = input.nextInt();
     input.nextLine(); // Consuma il newline rimasto nel buffer
     if (lunghezza < 8)
                    {
                        System.out.println("Lunghezza non valida, riprova.");
                    }
    } while (lunghezza < 8);
    
    
    char ch;
    String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
    String password = "";
    int da = 0;
    int a = alfabeto.length() - 1;
    for (int i=0;i<lunghezza;i++)
    {
     
     boolean trovata_ripetizione_eccessiva;
     do {
       int posizionecasuale = numerocasuale(da, a);
       ch = alfabeto.charAt(posizionecasuale);
       
       trovata_ripetizione_eccessiva = false;
       int conteggio_caratteri_controllati = 0;
       int posizione_carattere = password.length()-1;
       while (!trovata_ripetizione_eccessiva && posizione_carattere>=0 && conteggio_caratteri_controllati<8){
        if (password.charAt(posizione_carattere) == ch) {
         trovata_ripetizione_eccessiva = true;
        }
        posizione_carattere--;
        conteggio_caratteri_controllati++;      
       }
       
      } while (trovata_ripetizione_eccessiva);
     password += ch;
    }
    System.out.println("PASSWORD GENERATA: " + password);
    
       
   }
   
   if (scelta !=2)
   {
    System.out.println("...PREMI INVIO PER TORNARE AL MENU");
    input.nextLine(); // Aspetta che l'utente prema INVIO
   }
   
  } while (scelta != 2);
  System.out.println("Ciao ciao.");
 }

}

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

 
 public static int numerocasuale(int min, int max) {
  // Restituisce un numero casuale compreso tra 0 e 100
  Random R = new Random();
  int n = R.nextInt(max - min + 1) + min;
  return n;
 }
 
 public static void main(String[] args) {
  int scelta;
  Scanner input = new Scanner(System.in);
  do
  {
   System.out.println("1. GENERA NUOVA PASSWORD");
   System.out.println("2. ESCI");
    do
    {
     System.out.println("SCEGLI UN'OPZIONE:");                
                 scelta = input.nextInt();
                 input.nextLine(); // Consuma il newline rimasto nel buffer
                 if (scelta != 1 && scelta != 2)
                    {
                        System.out.println("Opzione non valida, riprova.");
                    }
             } while (scelta != 1 && scelta != 2);
   if (scelta==1)
   {
    int lunghezza;
    do
    {
     System.out.println("Inserisci la lunghezza della password (minimo 8 caratteri):");
     lunghezza = input.nextInt();
     input.nextLine(); // Consuma il newline rimasto nel buffer
     if (lunghezza < 8)
                    {
                        System.out.println("Lunghezza non valida, riprova.");
                    }
    } while (lunghezza < 8);
    
    String alfabeto = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
    String password = "";
    int da = 0;
    int a = alfabeto.length() - 1;
    for (int i=0;i<lunghezza;i++)
    {
     int posizionecasuale = numerocasuale(da, a);
     char ch = alfabeto.charAt(posizionecasuale);
     password += ch;
    }
    System.out.println("PASSWORD GENERATA: " + password);
    
       
   }
   
   if (scelta !=2)
   {
    System.out.println("...PREMI INVIO PER TORNARE AL MENU");
    input.nextLine(); // Aspetta che l'utente prema INVIO
   }
   
  } while (scelta != 2);
  System.out.println("Ciao ciao.");
 }

}

package numerocasualeminmax;

import java.util.Random;
import java.util.Scanner;

public class Main {
 
 public static int numerocasuale(int min, int max) {
  // Restituisce un numero casuale compreso tra 0 e 100
  Random R = new Random();
  int n = R.nextInt(max - min + 1) + min;
  return n;
 }
 
 public static void main(String args[]) {
  Scanner input = new Scanner(System.in);
  String rispostaripeti;
  
  do {
    System.out.println("Inserisci il minimo");
    
    int min = input.nextInt();
    input.nextLine(); // Consuma il newline rimasto nel buffer
    
    System.out.println("Inserisci il massimo");
    int max = input.nextInt();
    input.nextLine(); // Consuma il newline rimasto nel buffer
    
    int n = numerocasuale(min, max);
    
    System.out.println("Ora indovina... quale numero è stato estratto (tra " + min + " e " + max + ")? ");
    int tentativo;
    
   
    tentativo = input.nextInt();
    input.nextLine(); // Consuma il newline rimasto nel buffer
  
    if (tentativo < min || tentativo > max) {
     System.out.println("Numero non valido, sei al di fuori dei limiti che tu stesso/a hai dato riprova.");
    } else if (tentativo == n) {
     System.out.println("Hai indovinato! Il numero era " + n);
    } else {
     System.out.println("Hai sbagliato! Il numero era " + n);
    }
    
    do {
     System.out.println("Vuoi ripetere? (si/no)");    
     rispostaripeti = input.nextLine().toLowerCase().trim();
                    if (!rispostaripeti.equalsIgnoreCase("si") && !rispostaripeti.equalsIgnoreCase("no")) {
                        System.out.println("Risposta non valida, riprova.");
                    }
                } while (!rispostaripeti.equalsIgnoreCase("si") && !rispostaripeti.equalsIgnoreCase("no"));
    
  } while (rispostaripeti.equalsIgnoreCase("si"));

  
 }
  
  
  

}

import java.util.Random;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  Random numeriCasuali = new Random(); 
  Scanner numeroInput = new Scanner (System.in);  
  
  System.out.println("tenta la fortuna in 20 estrazioni : ");
  
  for(int i=20; i>=0 ;i--) {
    int c =numeriCasuali.nextInt(6) + 1;
    System.out.println("(pssst: il numero è "+c+", ma non dirlo a nessuno");
    System.out.println("Inserisci il tuo numero : ");
    int input = numeroInput.nextInt();
    numeroInput.nextLine();
    System.out.println("il tuo numero è: " + input);
     
    int cont =20;
     
    if (input < 1 || input > 6){
                      System.out.println("Numero non valido,inserisci un numero  compreso da 1 a 6.");
    }    
    
    System.out.println("il numero fortunato del dado era :" + c);     
               
    if(input == c){
        System.out.println("Bravo hai vinto");
        break;  // termino il ciclo
         }    
    
    System.out.println("hai ancora " + i + " tentativi, riprova ");    
  } 
 }
}

public class Persona {
 public String nome;
 public String cognome;
 public int anni;
 
 
 public Persona()
 {
  this.nome = "";
  this.cognome = "";
  this.anni = 0;
 }
 
 public Persona(String nome, String cognome, int anni) {
  this();
  this.nome = nome;
  this.cognome = cognome;
  this.anni = anni;
 }
 
 public boolean isAdult() {  
  return this.anni >= 18;
 }
 
 
 @Override
 public String toString() {
  return "Persona [nome=" + nome + ", cognome=" + cognome + ", anni=" + anni + "]";
 }
 
 

}

public class MuliClassProject01 {

 public static void main(String[] args) {
        
  Persona p1 = new Persona("Marco", "Rossi", 20);
  
  
  
  if (p1.isAdult()) {
   System.out.println("La persona è maggiorenne");
  } else {
   System.out.println("La persona è minorenne");
  }
  
  System.out.println(p1);
 
  

 }

}

public class Persona {
 public String nome;
 public String cognome;
 private int anni;
 
 
 public Persona()
 {
  this.nome = "";
  this.cognome = "";
  this.anni = 0;
 }
 
 public Persona(String nome, String cognome, int anni) {
  this();
  this.nome = nome;
  this.cognome = cognome;
  this.anni = anni;
 }
 
 public boolean isAdult() {  
  return this.anni >= 18;
 }
 
 
 @Override
 public String toString() {
  return "Persona [nome=" + nome + ", cognome=" + cognome + ", anni=" + anni + "]";
 }
 
 public String getNome() {
  
  return nome;
 }

 public boolean setNome(String nome) {
  if (nome.length() > 0 && nome.length() < 50) {
   this.nome = nome;
   return true;
  }
  return false;  
 }
 
 public String getCognome() {
  return cognome;
 }
 
 public boolean setCognome(String cognome) {
  if (cognome.length() > 0 && cognome.length() < 50) {
   this.cognome = cognome;
   return true;
  }
  return false;
 }
  
 public boolean setAnni(int anni) {
  if (anni >= 0 && anni <= 120) {
                this.anni = anni;   
                return true;
        }
  return false;
 }
 
 public int getAnni() {
  return anni;
 }

}

public class Conto {
 private String intestario;
 private double saldo;
 private double tassoInteresse; // es. 1.5 per l'1.5%
 
 public Conto() {
  this.intestario = "";
  this.saldo = 0;
  this.tassoInteresse = 0;
 }
 public Conto(String intestario, double saldo, double tassoInteresse) {
  this();
  this.setIntestario(intestario);
  this.setSaldo(saldo);
  this.setTassoInteresse(tassoInteresse);  
 }
 public String getIntestario() {
  return intestario;
 }
 public void setIntestario(String intestario) {
  this.intestario = intestario;
 }
 public double getSaldo() {
  return saldo;
 }
 public void setSaldo(double saldo) {
  this.saldo = saldo;
 }
 public double getTassoInteresse() {
  return tassoInteresse;
 }
 public void setTassoInteresse(double tassoInteresse) {
  this.tassoInteresse = tassoInteresse;
 }
 
 
 public boolean deposita(double importo)
 {
  if (importo > 0) {
            this.saldo += importo;
            return true;
        }
        return false;
 }
 
 public boolean preleva(double importo) {
  if (importo > 0 && this.saldo >= importo) {
   this.saldo -= importo;
   return true;
  }
  return false;
 }
 
 
 public void applicaInteresse() {
  this.saldo += this.saldo * (this.tassoInteresse / 100);
 }
 
 
}

public class Conto {
 private String intestario;
 private double saldo;
 private double tassoInteresse; // es. 1.5 per l'1.5%
 
 public Conto() {
  this.intestario = "";
  this.saldo = 0;
  this.tassoInteresse = 0;
 }
 public Conto(String intestario, double saldo, double tassoInteresse) {
  this();
  this.setIntestario(intestario);
  this.setSaldo(saldo);
  this.setTassoInteresse(tassoInteresse);  
 }
 public String getIntestario() {
  return intestario;
 }
 public void setIntestario(String intestario) {
  this.intestario = intestario;
 }
 public double getSaldo() {
  return saldo;
 }
 public void setSaldo(double saldo) {
  this.saldo = saldo;
 }
 public double getTassoInteresse() {
  return tassoInteresse;
 }
 public void setTassoInteresse(double tassoInteresse) {
  this.tassoInteresse = tassoInteresse;
 }
 
 
 public boolean deposita(double importo)
 {
  if (importo > 0) {
            this.saldo += importo;
            return true;
        }
        return false;
 }
 
 public boolean preleva(double importo) {
  if (importo > 0 && this.saldo >= importo) {
   this.saldo -= importo;
   return true;
  }
  return false;
 }
 
 
 public void applicaInteresse() {
  this.saldo += this.saldo * (this.tassoInteresse / 100);
 }
 
 
}

public class Main {

 public static void main(String[] args) {
  
  
  Conto c1 = new Conto("Mario Rossi", 1000, 1.5);
  
  
  System.out.println("Saldo c1 (intestatario "+c1.getIntestario()+": " + c1.getSaldo()+" euro");
  c1.applicaInteresse();
  System.out.println("Saldo c1 (intestatario "+c1.getIntestario()+": " + c1.getSaldo()+" euro");
  c1.deposita(500);
  System.out.println("Saldo c1 (intestatario "+c1.getIntestario()+": " + c1.getSaldo()+" euro");
  c1.preleva(200);
  System.out.println("Saldo c1 (intestatario "+c1.getIntestario()+": " + c1.getSaldo()+" euro");
  c1.applicaInteresse();
  System.out.println("Saldo c1 (intestatario "+c1.getIntestario()+": " + c1.getSaldo()+" euro");
 }

}

import classiMie.IO;

public class Main {

 public static void main(String[] args) {
  
  IO.println("Quanti numeri vuoi inserire? ");
  int n = IO.getInt("ERRORE! Inserisci un numero!");
  int[] numeri = new int[n];
  for (int i = 0; i < n; i++) {
   IO.println("Inserisci il numero " + (i + 1) + ": ");
   numeri[i] = IO.getInt("ERRORE! Inserisci un numero!");
  }
  IO.println("Hai inserito: ");
  for (int i = 0; i < n; i++) {
   IO.println(numeri[i]);
  }
  
 }

}

package classiMie;

import java.util.Scanner;

public class IO {
 private static boolean errore;
 
 public static boolean isError() {
  return errore;
 }

 public static boolean noError() {
  return !errore;
 }
 
 
 public static void println(Object testo)
 {
  
  System.out.println(testo);  
 }

 public static void print(Object testo)
 {
  
  System.out.print(testo);  
 }
 
 public static String getString()
 {
  errore = false;
  Scanner scanner = new Scanner(System.in);
  return scanner.nextLine();
 }
 
 public static int getInt() { 
  
  String testo = getString();  
  int numero = 0;
  try {
    numero = Integer.parseInt(testo);
   } 
  catch (NumberFormatException e) {
    
   errore = true;
  }
  return numero;
 }
 
 public static int getInt(String errormessage)
 {
  int numero = getInt();
  if (errore) {
   System.out.println(errormessage);
   numero = getInt(errormessage);
  }
  return numero;
 }
 
 public static double getDouble() {
  
  String testo = getString();
  testo = testo.replace(',', '.'); // sostituisco la virgola con il punto
  double numero = 0;
  try {
   numero = Double.parseDouble(testo);
  } catch (NumberFormatException e) {
   // System.out.println("Non hai inserito un numero intero");
   // numero = getInt();
   errore = true;
  }
  return numero;
 }
 
 public static double getDouble(String errormessage) {
  double numero = getDouble();
  if (errore) {
   System.out.println(errormessage);
   numero = getDouble(errormessage);
  }
  return numero;
 }
 
 public static boolean getBoolean() {
  
  String testo = getString();
  boolean valore = false;
  if (testo.equalsIgnoreCase("true")) {
   valore = true;
  } else if (testo.equalsIgnoreCase("false")) {
   valore = false;
  } else {
   errore = true;
  }
  return valore;
 }
 
 public static boolean getBoolean(String errormessage) {
  boolean valore = getBoolean();
  if (errore) {
   System.out.println(errormessage);
   valore = getBoolean(errormessage);
  }
  return valore;
 }
 
 
 
  
}

import java.util.Scanner;

import classiMie.IO;

public class Main {

 public static void main(String[] args) {
  int ngiorno;
  do {
    IO.println("Inserisci un numero che corrisponde ad un giorno della settimana (1-7):");
    ngiorno = IO.getInt("Inserisci un numero!");
    if (ngiorno < 1 || ngiorno > 7) {
     IO.println("Il numero non corrisponde ad un giorno della settimana");   
    }
    }while (ngiorno < 1 || ngiorno > 7);
  
  // quando arriviamo qua il numero è corretto ngiorno contiene un numero da 1 a 7
  // ora con l'if-else scriveremmo
  
 /* if (ngiorno == 1) {
   IO.println("Hai scelto Lunedi");
  } 
  else if (ngiorno == 2) {
   IO.println("Hai scelto Martedi");
  } 
  else if (ngiorno == 3) {
   IO.println("Hai scelto Mercoledi");
  } 
  else if (ngiorno == 4) {
   IO.println("Hai scelto Giovedi");
  } 
  else if (ngiorno == 5) {
   IO.println("Hai scelto Venerdi");
  } 
  else if (ngiorno == 6) {
   IO.println("Hai scelto Sabato");
  } 
  else {
   IO.println("Hai scelto Domenica");
  }
  */
  
  // con lo switch scriviamo
  
  switch (ngiorno) {
  
  case 1:
   IO.println("Hai scelto Lunedi");
   break;
  case 2:
   IO.println("Hai scelto Martedi");
   break;
  case 3:
   IO.println("Hai scelto Mercoledi");
   break;
  case 4:
   IO.println("Hai scelto Giovedi");
   break;
  case 5:
   IO.println("Hai scelto Venerdi");
   break;
  case 6:
   IO.println("Hai scelto Sabato");
   break;
  default:
   IO.println("Hai scelto Domenica");
  
  }
 }

}

import java.util.Scanner;

import classiMie.IO;

public class Main {

 public static void main(String[] args) {
  int ngiorno;
  do {
    IO.println("Inserisci un numero che corrisponde ad un giorno della settimana (1-7):");
    ngiorno = IO.getInt("Inserisci un numero!");
    if (ngiorno < 1 || ngiorno > 7) {
     IO.println("Il numero non corrisponde ad un giorno della settimana");   
    }
    }while (ngiorno < 1 || ngiorno > 7);
  
  // quando arriviamo qua il numero è corretto ngiorno contiene un numero da 1 a 7
  // ora con l'if-else scriveremmo
  
  if (ngiorno == 1) {
   IO.println("Hai scelto Lunedi");
  } 
  else if (ngiorno == 2) {
   IO.println("Hai scelto Martedi");
  } 
  else if (ngiorno == 3) {
   IO.println("Hai scelto Mercoledi");
  } 
  else if (ngiorno == 4) {
   IO.println("Hai scelto Giovedi");
  } 
  else if (ngiorno == 5) {
   IO.println("Hai scelto Venerdi");
  } 
  else if (ngiorno == 6) {
   IO.println("Hai scelto Sabato");
  } 
  else {
   IO.println("Hai scelto Domenica");
  }
 }

}

import Dati.Libreria;
import Dati.Libro;
import classiMie.IO;
public class Main {
 
 public static Libreria libri;
 
 public static void main(String[] args) {
  libri = new Libreria();
  int scelta;
  do
  {
   IO.println("1. Aggiungi libro");
   IO.println("2. Visualizza libri");
   IO.println("3. Esci");
   
   
   
   do
   {
    System.out.print("Scelta: ");
                scelta = IO.getInt("errore, inserisci un numero corretto!");
                
                if (scelta < 1 || scelta > 3)
                    System.out.println("Scelta non valida");
                
            } while (scelta < 1 || scelta > 3);
   
   switch (scelta) {
    case 1:
     Libro libro = new Libro();
                    IO.println("Inserisci il titolo del libro:");
                    libro.setTitle(IO.getString());
                    
                    IO.println("Inserisci l'autore del libro:");
                    libro.setAuthor(IO.getString());
                    
                    IO.println("Inserisci l'anno di pubblicazione del libro:");
                    libro.setYear(IO.getInt("errore, inserisci un numero corretto!"));
                    
                    IO.println("inserisci la casa editrice del libro:");
                    libro.setPublisher(IO.getString());
                    
                    libri.add(libro);
                    
    break;
    case 2:
     for (int i = 0; i < libri.NumoeroDeiLibri(); i++) {
      Libro libroVisualizzato = libri.get(i);
      IO.println(libri.get(i));
      IO.println("--------------------------");
     }
    break;

   }
   
   
    
   if (scelta!=3)
   {
    IO.println("PREMI INVIO PER CONTINUARE...");
    IO.getString();
   }
   
  } while (scelta != 3);

 }

}

package Dati;

public class Libreria {
 
 private Libro[] ListaLibri;
 
 public Libreria() {
  this.ListaLibri = new Libro[0];
 }
 
 public int NumoeroDeiLibri() {
  return this.ListaLibri.length; 
 }
 
 public int posizioneUltimLibro() {
  return this.ListaLibri.length - 1;
 }
 public void add(Libro libro)
 {
  Libro temp[] = this.ListaLibri;
  int nuovalunghezza = this.ListaLibri.length + 1;
  this.ListaLibri = new Libro[nuovalunghezza];
  int ultima_posizione = this.posizioneUltimLibro();
  this.ListaLibri[ultima_posizione] = libro;
  for (int i = 0; i < temp.length; i++) {
   this.ListaLibri[i] = temp[i];
  }  
 }

 public void add(String titolo, String autore, int annoPubblicazione, String casaEditrice) {
  Libro libro = new Libro();
  libro.setTitle(titolo);
  libro.setAuthor(autore);
  libro.setYear(annoPubblicazione);
  libro.setPublisher(casaEditrice);
  this.add(libro);
 }
 
 
 public Libro get(int i) {
  if (i < 0 || i > this.posizioneUltimLibro()) {
   return null;
  }
  return this.ListaLibri[i];
 }

}

package Dati;

public class Libro {
 private String title;   // Titolo
 private String author;      // Autore
 private String publisher; // Casa editrice
 
 private int year;   // Anno
 
 
 public Libro()
 {
  this.title = "";
  this.author = "";
  this.publisher = "";
  this.year = 0;  
 }
 
 public Libro(String title, String author, String publisher, int year) {
  this();
  this.setTitle(title);
  this.setAuthor(author);
  this.setPublisher(publisher);
  this.setYear(year);  
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public String getPublisher() {
  return publisher;
 }

 public void setPublisher(String publisher) {
  this.publisher = publisher;
 }

 public int getYear() {
  return year;
 }

 public void setYear(int year) {
  this.year = year;
 }
 
 @Override
 public String toString() {
  return "Libro [title=" + title + ", author=" + author + ", publisher=" + publisher + ", year=" + year + "]";
 }
 
}

package Dati;

public class Posto {
 private String nome;
 private String cognome;
 private String telefono;
 
 public Posto() {
  this.nome = "";
  this.cognome = "";
  this.telefono = "";
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public String getCognome() {
  return cognome;
 }

public void setCognome(String cognome) {
  this.cognome = cognome;
 }

 public String getTelefono() {
  return telefono;
 }

 public void setTelefono(String telefono) {
  this.telefono = telefono;
 }
 
 @Override
 public String toString() {
  return "Posto [nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + "]";
 }
 
 public boolean Prenota(String nome, String cognome, String telefono) {
  if (this.nome.equals("") && this.cognome.equals("") && this.telefono.equals("")) {
   this.nome = nome;
   this.cognome = cognome;
   this.telefono = telefono;
   return true;
  } else {
   return false;
  }
 }
 
 public void annullaPrenotazione()
 {
  this.nome = "";
        this.cognome = "";
        this.telefono = "";    
 }
 
 public boolean isPrenotato() {
  return !this.nome.equals("") && !this.cognome.equals("") && !this.telefono.equals("");
 }
 
 
}

package Dati;

public class Libro {
 private String title;   // Titolo
 private String author;      // Autore
 private String publisher; // Casa editrice
 
 private int year;   // Anno
 
 
 public Libro()
 {
  this.title = "";
  this.author = "";
  this.publisher = "";
  this.year = 0;  
 }
 
 public Libro(String title, String author, String publisher, int year) {
  this();
  this.setTitle(title);
  this.setAuthor(author);
  this.setPublisher(publisher);
  this.setYear(year);  
 }

 public String getTitle() {
  return title;
 }

 public void setTitle(String title) {
  this.title = title;
 }

 public String getAuthor() {
  return author;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public String getPublisher() {
  return publisher;
 }

 public void setPublisher(String publisher) {
  this.publisher = publisher;
 }

 public int getYear() {
  return year;
 }

 public void setYear(int year) {
  this.year = year;
 }
 
 @Override
 public String toString() {
  return "Libro [title=" + title + ", author=" + author + ", publisher=" + publisher + ", year=" + year + "]";
 }
 
}

import java.util.ArrayList;
import Dati.Persona;
import classiMie.IO;
public class ArrayList01 {
 
 public static void main(String[] args) {
  int scelta;
  ArrayList<Persona> listaPersone = new ArrayList<>();
  
  do
  {   
   do {
     System.out.println("1) Aggiungi persona");
     System.out.println("2) Stampa persone");
     System.out.println("3) Esci");
     
     scelta = IO.getInt("Errore! Inserire un numero!");
     if (scelta < 1 || scelta > 3)
     {
      System.out.println("Errore! Inserire un numero tra 1 e 3!");
     }
   }
   while (scelta < 1 || scelta > 3);
   
   switch (scelta)
   {
    case 1:
     // Aggiungi persona
     System.out.println("Inserisci i dati della persona:");
     System.out.print("Nome: ");
     String nome = IO.getString();
     System.out.print("Cognome: ");
     String cognome = IO.getString();
     System.out.print("Età: ");
     int anni = IO.getInt("Errore! Inserire un numero intero per l'età!");

     Persona p = new Persona(nome, cognome, anni);

     listaPersone.add(p);

     

     System.out.println("Aggiunta avvenuta con successo!");
     
    break;
 
    case 2:
     // Stampa persone
     System.out.println("Lista persone:");
     for (int i = 0; i < listaPersone.size(); i++) {
      System.out.println(listaPersone.get(i));
     }
     
    break;   
   }
   
  } while (scelta != 3);
  
  System.out.println("Arrivederci!");
  

 
  

 }

}

package Dati;

public class Persona {
 private String nome;
 private String cognome;
 private int anni;
 
 public Persona() {
  this.nome = "";
  this.cognome = "";
  this.anni = 0;
 }
 
 public Persona(String nome, String cognome, int anni) {
  this.nome = nome;
  this.cognome = cognome;
  this.anni = anni;
 }
 
 public String getNome() {
  return nome;
 }
 
 public void setNome(String nome) {
  this.nome = nome;
 }
 
 public String getCognome() {
  return cognome;
 }
 
 public void setCognome(String cognome) {
  this.cognome = cognome;
 }
 
 public int getAnni() {
  return anni;
 }
 
 public void setAnni(int anni) {
  this.anni = anni;
 }
 
 @Override
 public String toString() {
  return "Persona {nome=" + nome + ", cognome=" + cognome + ", anni=" + anni + "}";
 }
 
}

import java.util.ArrayList;

public class ArrayList01 {

 public static void main(String[] args) {
  ArrayList A = new ArrayList();
  A.add(100);
  A.add(200);
  A.add("Pippo");
  A.add(3.14);
  A.add(false);
  A.add("YEEE");
   
  Persona p1 = new Persona("Mario", "Rossi", 30);
  A.add(p1);
    
  A.add( new Persona("Giovanni", "Verdi", 25) );
  
  int c = A.size();
  System.out.println("La lista contiene " + c + " elementi.");
  A.add("Gigi");

  System.out.println("La lista contiene " + A.size() + " elementi.");
  A.remove(0);
  System.out.println("La lista contiene " + A.size() + " elementi.");
  
  System.out.println(A);
  
  System.out.println("Il primo elemento è: " + A.get(0));
  System.out.println("Il secondo elemento è: " + A.get(1));
  System.out.println("Il terzo elemento è: " + A.get(2));
  System.out.println("Il quarto elemento è: " + A.get(3));
  System.out.println("Il quinto elemento è: " + A.get(4));
  System.out.println("Il sesto elemento è: " + A.get(5));
  System.out.println("Il settimo elemento è: " + A.get(6));
  
 
  

 }

}

public class Persona {
 private String nome;
 private String cognome;
 private int anni;
 
 public Persona() {
  this.nome = "";
  this.cognome = "";
  this.anni = 0;
 }
 
 public Persona(String nome, String cognome, int anni) {
  this.nome = nome;
  this.cognome = cognome;
  this.anni = anni;
 }
 
 public String getNome() {
  return nome;
 }
 
 public void setNome(String nome) {
  this.nome = nome;
 }
 
 public String getCognome() {
  return cognome;
 }
 
 public void setCognome(String cognome) {
  this.cognome = cognome;
 }
 
 public int getAnni() {
  return anni;
 }
 
 public void setAnni(int anni) {
  this.anni = anni;
 }
 
 @Override
 public String toString() {
  return "Persona {nome=" + nome + ", cognome=" + cognome + ", anni=" + anni + "}";
 }
 
}

import classiMie.Menu;

public class Prova {

 public static void main(String[] args) {
  Menu m = new Menu();
  m.add("Aggiungi un nuovo libro");
  m.add("Visualizza tutti i libri");
  m.add("Cerca un libro");
  m.add("Modifica un libro");
  m.add("Esci");
  
  int scelta;
  do {
    scelta = m.executeMenu();
    
    
    
  } while ( scelta != m.count() );
  
  System.out.println("Arrivederci!");
  

 }

}

package classiMie;

import java.util.ArrayList;

public class Menu {
 private ArrayList<String> items;
 
 public Menu() {
  this.items = new ArrayList<String>();
 }
 
 public void add(String item) {
  this.items.add(item);
 }
 
 public void add(int index, String item) {
  this.items.add(index, item);
 }
 
 public void remove(int index) {
  this.items.remove(index);
 }
 
 public void printMenu()
 {  
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
 }
 
 
 public int count() {
  return this.items.size();
 }
 
 public int lastIndex() {
  return this.count() - 1;
 }
 
 public int executeMenu()
 {
  int scelta = 0;
  if (this.count() > 0) 
  {
   do {
    this.printMenu();
    scelta = IO.getInt("Seleziona un'opzione: ", "Scelta non valida. Riprova." );
    if (scelta < 1 || scelta > this.count()) {
                    System.out.println("Scelta non valida. Riprova.");
                }
   } while (scelta < 1 || scelta > this.count());
  }
  return scelta;
 }
 
 
}

package classiMie;

import java.util.Scanner;

public class IO {
 private static boolean errore;
 
 public static boolean isError() {
  return errore;
 }

 public static boolean noError() {
  return !errore;
 }
 
 
 public static void println(Object testo)
 {
  
  System.out.println(testo);  
 }

 public static void print(Object testo)
 {
  
  System.out.print(testo);  
 }
 
 public static String getString()
 {
  errore = false;
  Scanner scanner = new Scanner(System.in);
  return scanner.nextLine();
 }
 
 public static String getString(String message)
 {
  println(message);
  return getString();
 }
 
 public static int getInt() { 
  
  String testo = getString();  
  int numero = 0;
  try {
    numero = Integer.parseInt(testo);
   } 
  catch (NumberFormatException e) {
    
   errore = true;
  }
  return numero;
 }
 
 public static int getInt(String message) { 
  println(message);
  return getInt();
 }
 
 public static int getInt(String message, String errormessage)
 {
  int numero = getInt(message);
  if (errore) {
   System.out.println(errormessage);
   
  }
  return numero;
 }
 
 
 public static int getInt(String message, String errormessage, boolean ripeti)
 {
  int res ;
  
  res = getInt(message, errormessage);
  if (ripeti && errore)
  {
   res = getInt(message, errormessage, true);
  }
  
  return res;
 }
 
 
 public static double getDouble() {

  String testo = getString();
  double numero = 0;
  try {
   numero = Double.parseDouble(testo);
  } catch (NumberFormatException e) {

   errore = true;
  }
  return numero;
 }
 
 public static double getDouble(String message) {
  println(message);
  return getDouble();
 }
 
 public static double getDouble(String message, String errormessage) {
  double numero = getDouble(message);
  if (errore) {
   System.out.println(errormessage);

  }
  return numero;
 }
 
 public static double getDouble(String message, String errormessage, boolean ripeti) {
  double res;

  res = getDouble(message, errormessage);
  if (ripeti && errore) {
   res = getDouble(message, errormessage, true);
  }

  return res;
 }
 
 
 
 
 
 
 
 
}

package Dati;

import java.io.Serializable;

public class Persona implements Serializable {
 
 private String nome;
 private String cognome;
 private String email;
 
 public Persona() {
  this.nome = "";
        this.cognome = "";
        this.email = "";    
 }
 
 public Persona(String nome, String cognome, String email) {
  this();
  this.setNome(nome);
  this.setCognome(cognome);
  this.setEmail(email);
 }

 public String getNome() {
  return nome;
 }

 public void setNome(String nome) {
  this.nome = nome;
 }

 public String getCognome() {
  return cognome;
 }

 public void setCognome(String cognome) {
  this.cognome = cognome;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }
 
 
 @Override
 public String toString() {
  return "Nome: " + this.nome + "\nCognome: " + this.cognome + "\nEmail: " + this.email;
 }
 
}

import classiMie.IO;
import classiMie.Menu;

public class Biblioteca {

	public static void main(String[] args) {
		Menu m = new Menu();
		m.add("LISTA LIBRI");
		m.add("AGGIUNGI UN LIBRO");
		m.add("CERCA LIBRI");		
		m.add("ESCI");
		
		int scelta;
		do {
				scelta = m.executeMenu();
				
				
				
				if (scelta!=m.count()) {
					IO.getString("PREMI INVIO PER CONTINUARE...");
				}
				
		} while ( scelta != m.count() );
		
		System.out.println("Arrivederci!");
		

	}

}

package Dati;

public abstract class Utente {
	private String tipo;
	private String username;
	private String nome;
	private String cognome;
	
	
	public Utente(String tipo, String username, String nome, String cognome) {
		this.tipo = tipo;
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return "Tipo: " + tipo + ", Nome: " + nome + ", Cognome: " + cognome;
	}
	
	
	public String getRuolo()
	{
		return this.tipo;
    }
	
	public abstract String getInfo();
	
	

}

package classiMie;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> items;
	
	public Menu() {
		this.items = new ArrayList<String>();
	}
	
	public void add(String item) {
		this.items.add(item);
	}
	
	public void add(int index, String item) {
		this.items.add(index, item);
	}
	
	public void remove(int index) {
		this.items.remove(index);
	}
	
	public void printMenu()
	{		
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
	}
	
	
	public int count() {
		return this.items.size();
	}
	
	public int lastIndex() {
		return this.count() - 1;
	}
	
	public int executeMenu()
	{
		int scelta = 0;
		if (this.count() > 0) 
		{
			do {
				this.printMenu();
				scelta = IO.getInt("Seleziona un'opzione: ", "Scelta non valida. Riprova." );
				if (scelta < 1 || scelta > this.count()) {
                    System.out.println("Scelta non valida. Riprova.");
                }
			} while (scelta < 1 || scelta > this.count());
		}
		return scelta;
	}
	
	
}

import classiMie.Menu;

public class Biblioteca {

	public static void main(String[] args) {
		Menu m = new Menu();
		m.add("LISTA LIBRI");
		m.add("AGGIUNGI UN LIBRO");
		m.add("CERCA LIBRI");		
		m.add("ESCI");
		
		int scelta;
		do {
				scelta = m.executeMenu();
				
				
				
		} while ( scelta != m.count() );
		
		System.out.println("Arrivederci!");
		

	}

}