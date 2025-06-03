# RollTheDice

<p style="text-align: center;">Filippo Mattioli - 5AINF</p>

---

## Scopo del Progetto

RollTheDice è un'applicazione Android sviluppata in Kotlin che simula il lancio di un dado. L'app permette agli utenti di "lanciare" un dado virtuale e visualizzare il risultato. Se il numero estratto è pari, l'utente viene reindirizzato a una schermata di "vittoria" dopo un breve ritardo.

Nello specifico, l'applicazione permette di:

1.  **Lanciare un dado**: Simulare il lancio di un dado a sei facce.
2.  **Visualizzare il risultato**: Mostrare il numero estratto e l'immagine corrispondente alla faccia del dado.
3.  **Determinare una vincita**: Se il numero estratto è pari, l'utente "vince" e viene reindirizzato a una schermata dedicata.

---

## Struttura del Progetto

Il progetto è composto dalle seguenti Activity che gestiscono le diverse funzionalità:

### 1. `MainActivity.kt`

È la prima schermata che l'utente visualizza. Contiene un bottone per avviare il lancio del dado.

Quando il bottone viene cliccato, viene mostrato un messaggio temporaneo ("LANCIO DEL DADO") e viene generato un numero casuale tra 1 e 6. Questo numero e un messaggio associato vengono passati alla `SecondActivity`, che viene poi avviata.

### 2. `SecondActivity.kt`

Questa Activity mostra il risultato del lancio del dado.

Recupera il messaggio e il numero casuale dalla `MainActivity`. Visualizza il messaggio in una `TextView` e l'immagine corrispondente alla faccia del dado estratta in una `ImageView`. Se il numero estratto è pari, dopo un ritardo di 5 secondi (5000 millisecondi), l'applicazione avvia la `ThirdActivity` passandole un messaggio di "vittoria" e il numero estratto, quindi si chiude per migliorare l'esperienza utente.

### 3. `ThirdActivity.kt`

Questa Activity viene visualizzata solo se il numero estratto dalla `SecondActivity` è pari, indicando una "vittoria".

Recupera il messaggio di "vittoria" e il numero casuale dalla `SecondActivity` e li visualizza in una `TextView`. Il testo mostrato conferma che l'utente ha vinto e il numero pari estratto.

---

## Funzionalità Future

Il progetto è progettato per essere espandibile. Alcune delle funzionalità pianificate potrebbero includere:

* **Conteggio delle vincite/sconfitte**: Implementare un sistema per tenere traccia dei risultati delle partite.
* **Interfaccia utente migliorata**: Affinamenti estetici e animazioni per rendere l'esperienza di lancio del dado più coinvolgente.
* **Lancio di dadi multipli**: Permettere il lancio di più dadi contemporaneamente.

---
