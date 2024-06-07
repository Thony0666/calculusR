package com.anthonyo.kfc.conjoction;

import com.anthonyo.kfc.enums.ValuerDeVeriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EtTest {

    @Test
    public void testEt() {
        Et etConjunction = new Et();
        assertEquals(ValuerDeVeriter.VRAI, etConjunction.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.VRAI));
        assertEquals(ValuerDeVeriter.FAUSSE, etConjunction.valeur(ValuerDeVeriter.VRAI, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.FAUSSE, etConjunction.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.FAUSSE));
        assertEquals(ValuerDeVeriter.FAUSSE, etConjunction.valeur(ValuerDeVeriter.FAUSSE, ValuerDeVeriter.VRAI));
    }
}
