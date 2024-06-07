package com.anthonyo.kfc.conjoction;

import com.anthonyo.kfc.enums.ValuerDeVeriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OuTest {

    @Test
    void valeur() {
        Ou ou = new Ou();
        assertEquals(ValuerDeVeriter.FAUSSE, ou.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.VRAI, ou.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.VRAI, ou.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.VRAI));
        assertEquals(ValuerDeVeriter.VRAI, ou.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.VRAI));
    }
}