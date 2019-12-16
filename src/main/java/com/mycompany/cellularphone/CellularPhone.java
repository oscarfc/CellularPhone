/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cellularphone;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class CellularPhone {

    private static List<Prezziario> prezziario = new ArrayList<>();

    private String marca;
    private String numero;

    public String getMarca() {
        return marca;
    }

    public String getNumero() {
        return numero;
    }

    public CellularPhone(String marca, String numero) {
        this.marca = marca;
        this.numero = numero;
    }

    public static void setCosto(String chiamante, String destinatario, float costo) {
        inserisciPrezzo(new Prezziario(chiamante, destinatario, costo));
    }

    @Override
    public String toString() {
        return "CellularPhone{" + "marca=" + marca + ", numero=" + numero + '}';
    }

    /**
     *
     * @param tariffa
     */
    private static void inserisciPrezzo(Prezziario tariffa) {
        for (int i = 0; i < prezziario.size(); i++) {
            if (prezziario.get(i).equals(tariffa)) {
                prezziario.remove(i);
                break;
            }
        }
        prezziario.add(tariffa);
    }

    public float getCost(CellularPhone phone, int durata) {
        float costo = 0;
        costo = trovaTariffa(new Prezziario(this.getMarca(), phone.getMarca(), 0)) * durata;
        if (costo < 0) {
            throw new IllegalArgumentException("Tariffa non presente");
        }
        return costo;
    }

//    private static float trovaTariffa(Prezziario phone) {
//        float tariffa = -1;
//        for (int i = 0; i < prezziario.size(); i++) {
//            if (prezziario.get(i).equals(phone)) {
//                tariffa = prezziario.get(i).getCosto();
//                break;
//            }
//        }
//        return tariffa;
//    }
    
    /**
     * metodo alternativo usando metodi contains indexOf
     * @param phone
     * @return float
     */
    private static float trovaTariffa(Prezziario phone) {
        float tariffa = -1;
        if (prezziario.contains(phone)) {
            tariffa = prezziario.get(prezziario.indexOf(phone)).getCosto();
        }
        return tariffa;
    }

}
