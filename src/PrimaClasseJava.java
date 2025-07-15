import java.sql.SQLOutput;

// Il nome della classe pubblica deve essere come il nome del file
// cioè la classe PrimaClasseJava deve esserer dentro al file  PrimaClasseJava.java
public class PrimaClasseJava {
    public static void main(String[] args) {
        System.out.println("Hello World!"); //
        System.out.print("Hello ");
        System.out.print("World!");

        int numeroIntero = 123;
        System.out.println(numeroIntero);

        // Dichiarazione variabile
        short numeroPiccolo; // Errore di compilazione se stampo perché null
        // Inizializzazione variabile
        numeroPiccolo = 12;

        byte unByte = 127;
        System.out.println(unByte);
        // Operatore di preincremento
        System.out.println(++unByte); // Si ritorna a -128

        char c = 'a';
        System.out.println(c);

        // post-inceremnto sulla variabile c
        c++;
        System.out.println(c); // Restituisce b

        boolean staPiovendo = false;
        System.out.println(staPiovendo);

        double prezzo = 9.99; // Mettere il punto
        System.out.println(prezzo + 2 / 2);
        // divisione poi moltiplicazione sottrazione e somma

        int a = 10;
        int b = 3;

        int divisione = a/b; // Questo da 3 e non 3.3
        double divisioneConVirgola = a/b; // qeullo che sta a destra sono interi quindi il risutlato è 3.0
        double divisioneConVirgolaCast = a/(double)b;   // trasformazione di un tipo in un altro compatibilemente
        System.out.println(divisione);
        System.out.println(divisioneConVirgola);
        System.out.println(divisioneConVirgolaCast);

        int resto = 3%2; // Resto della divisione
        System.out.println(resto);

        boolean isNuvoloso = true;
        // or è vero se almeno uno e vero
        System.out.println(staPiovendo || isNuvoloso);

        // and è vero se entrambi sono veri
        System.out.println(staPiovendo && isNuvoloso);

        // stampo se a è maggiore di b
        System.out.println(a>b);

        // stampo se b è minore oppure uguale ad a
        System.out.println(b<=a);

        int somma = 0;
        somma = somma + 1;
        somma += 2;
        System.out.println(somma);

        int prodotto = 2;
        prodotto *= 2;
        prodotto *= 10;
        prodotto *= 20;
        System.out.println(prodotto);

        int primoN = 123;
        int secondoN = 37;
        int resto2 = primoN%secondoN;
        System.out.println(resto2);
    }
}

// git blame > Biasimare ogni riga di codice l'ha scritta ogni riga git