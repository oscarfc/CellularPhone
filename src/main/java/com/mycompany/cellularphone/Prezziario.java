/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cellularphone;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Prezziario {
    private String chiamante;
    private String destinatario;
    private float costo;

    public String getChiamante() {
        return chiamante;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public float getCosto() {
        return costo;
    }

    public Prezziario(String chiamante, String destinatario, float costo) {
        this.chiamante = chiamante;
        this.destinatario = destinatario;
        this.costo = costo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.chiamante);
        hash = 89 * hash + Objects.hashCode(this.destinatario);
        hash = 89 * hash + Float.floatToIntBits(this.costo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prezziario other = (Prezziario) obj;
        if (!Objects.equals(this.chiamante, other.chiamante)) {
            return false;
        }
        if (!Objects.equals(this.destinatario, other.destinatario)) {
            return false;
        }
        return true;
    }    
}
