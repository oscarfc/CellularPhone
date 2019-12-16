/*
 */
package com.mycompany.cellularphone;

/**
 *
 * Implementare la classe Cellphone, che rappresenta un'utenza telefonica dotata di un gestore (stringa) e un numero di telefono (stringa). La classe è in grado di calcolare 
 * il costo di una telefonata, in base al gestore di partenza, al gestore di arrivo, e alla durata. Il metodo setCost consente di impostare il costo al minuto di una telefonata  
 * con un dato gestore di partenza e un dato gestore di arrivo. Il metodo getCost calcola il costo di una telefonata verso una data utenza ed una data durata (in minuti). 
 * L'implementazione deve rispettare il seguente esempio d'uso.
 * 
 * Esempio d'uso:
 * Cellphone a=newCellphone("TIMMY","3341234"),
 * Cellphone b=newCellphone("Megafon","3355678"),
 * Cellphone c=newCellphone("Odissey","3384343");
 * Cellphone.setCost("TIMMY","TIMMY", 0.05);
 * Cellphone.setCost("TIMMY","Megafon", 0.15);
 * Cellphone.setCost("Megafon","TIMMY", 0.25);
 * System.out.println ( a.getCost(b, 10));
 * System.out.println(b.getCost(a, 8)) ;
 * System.out.println(a.getCost(c, 10)); //provoca eccezione
 * 
 * Output:
 * 1.5
 * 2.0
 * Exception inthread "main"..
 * 
 */
public class Gestisci {

    public static void main(String[] args) {
        CellularPhone phone1 = new CellularPhone("TIM", "3332134567");
        CellularPhone phone2 = new CellularPhone("Vodaphone", "3449934586");
        CellularPhone phone3 = new CellularPhone("Wind", "3231233366");

        phone1.setCosto("TIM", "TIM", 0.05f);               
        phone1.setCosto("TIM", "Vodaphone", 1.15f);         // prova in più
        System.out.println(phone1.getCost(phone2, 10));     // prova in più
        phone1.setCosto("TIM", "Vodaphone", 0.15f);
        phone1.setCosto("Vodaphone", "TIM", 0.25f);

        System.out.println(phone1.getCost(phone2, 10));
        System.out.println(phone2.getCost(phone1, 8));
        System.out.println(phone1.getCost(phone3, 10));
    }

}
