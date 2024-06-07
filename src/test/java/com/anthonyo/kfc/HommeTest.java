package com.anthonyo.kfc;

import com.anthonyo.kfc.conjoction.Donc;
import com.anthonyo.kfc.conjoction.Et;
import com.anthonyo.kfc.conjoction.Ou;
import com.anthonyo.kfc.enums.ValuerDeVeriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HommeTest {

    @Test
    void ajouterAssertion() {
        var lou = new Homme("Lou");
        var verite1 = new SimpleAssertion("Lou est beau", ValuerDeVeriter.VRAI);
        var mensonge1 = new SimpleAssertion("Lou est pauvre", ValuerDeVeriter.FAUSSE);

        lou.ajouterAssertion(verite1);
        lou.ajouterAssertion(mensonge1);

        assertTrue(lou.getCalculusRatiocinator().getAssertions().contains(verite1));
        assertTrue(lou.getCalculusRatiocinator().getAssertions().contains(mensonge1));
    }

    @Test
    void evaluerAssertion() {
        var lou = new Homme("Lou");
        var verite = new SimpleAssertion("Lou est beau", ValuerDeVeriter.VRAI);
        var mensonge = new SimpleAssertion("Lou est pauvre", ValuerDeVeriter.FAUSSE);

        lou.ajouterAssertion(verite);
        lou.ajouterAssertion(mensonge);

        assertEquals(ValuerDeVeriter.VRAI, lou.evaluerAssertion(verite));
        assertEquals(ValuerDeVeriter.FAUSSE, lou.evaluerAssertion(mensonge));
    }

    @Test
    void evalueAssertion() {
    }

    @Test
    void getCalculusRatiocinator() {
        var lou = new Homme("Lou");

        var verite = new SimpleAssertion("Lou est beau", ValuerDeVeriter.VRAI);
        var mensonge = new SimpleAssertion("Lou est pauvre", ValuerDeVeriter.FAUSSE);
        var affirmation = new SimpleAssertion("Lou est généreux", ValuerDeVeriter.JENESAISPAS);

        lou.ajouterAssertion(verite);
        lou.ajouterAssertion(mensonge);
        lou.ajouterAssertion(affirmation);

        var et = new Et();
        var ou = new Ou();
        var donc = new Donc();

        var louEstPauvreEtlouEstGenereux = lou.evaluerAssertion(mensonge, affirmation, et);
        assertEquals(ValuerDeVeriter.JENESAISPAS, louEstPauvreEtlouEstGenereux);

        var louEstBeauDoncLouEstPauvre = lou.evaluerAssertion(verite, mensonge, donc);
        assertEquals(ValuerDeVeriter.FAUSSE, louEstBeauDoncLouEstPauvre);

        var louEstPauvreDoncLouEstGenereux = lou.evaluerAssertion(mensonge, affirmation, donc);
        assertEquals(ValuerDeVeriter.VRAI, louEstPauvreDoncLouEstGenereux);

        var louEstBeauOuLouEstGenereuxDoncLouEstPauvre = new CompositeAssertion("Lou est beau ou Lou est généreux", verite, affirmation, ou);
        var result = lou.evaluerAssertion(louEstBeauOuLouEstGenereuxDoncLouEstPauvre, mensonge, donc);
        assertEquals(ValuerDeVeriter.JENESAISPAS, result);
    }
}