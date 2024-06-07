package com.anthonyo.kfc.conjonction;

import com.anthonyo.kfc.conjoction.Et;
import com.anthonyo.kfc.enums.ValuerDeVeriter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EtTest {

    @Test
    public void testEt() {
        Et etConjunction = new Et();
        assertEquals(ValuerDeVeriter.VRAI, etConjunction.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.VRAI));
        assertEquals(ValuerDeVeriter.FAUSSE, etConjunction.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.FAUSSE, etConjunction.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.VRAI));
        assertEquals(ValuerDeVeriter.FAUSSE, etConjunction.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.JENESAISPAS, etConjunction.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.JENESAISPAS));
        assertEquals(ValuerDeVeriter.JENESAISPAS, etConjunction.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.JENESAISPAS));
        assertEquals(ValuerDeVeriter.JENESAISPAS, etConjunction.valeur(ValuerDeVeriter.JENESAISPAS, ValuerDeVeriter.VRAI));
        assertEquals(ValuerDeVeriter.JENESAISPAS, etConjunction.valeur(ValuerDeVeriter.JENESAISPAS, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.JENESAISPAS, etConjunction.valeur(ValuerDeVeriter.JENESAISPAS, ValuerDeVeriter.JENESAISPAS));
    }
}
