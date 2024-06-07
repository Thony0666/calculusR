package com.anthonyo.kfc.conjoction;

import com.anthonyo.kfc.enums.ValuerDeVeriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoncTest {

    @Test
    void valeur() {
        Donc donc = new Donc();
        assertEquals(ValuerDeVeriter.FAUSSE, donc.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.FAUSSE, donc.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.VRAI, donc.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.VRAI));
        assertEquals(ValuerDeVeriter.VRAI, donc.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.VRAI));
    }
}