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