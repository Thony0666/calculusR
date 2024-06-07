package com.anthonyo.kfc;

import com.anthonyo.kfc.enums.ValuerDeVeriter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculusRatiocinatorTest {

    @Test
    void ajouterAssertion() {
        var calculusRatiocinator = new CalculusRatiocinator();
        var premierAffirmation = new SimpleAssertion("Lou est beau", ValuerDeVeriter.VRAI);
        var deuxiemeAffirmation = new SimpleAssertion("Lou est pauvre", ValuerDeVeriter.FAUSSE);

        calculusRatiocinator.ajouterAssertion(premierAffirmation);
        calculusRatiocinator.ajouterAssertion(deuxiemeAffirmation);

        assertEquals(2, calculusRatiocinator.getAssertions().size());
        assertTrue(calculusRatiocinator.getAssertions().contains(premierAffirmation));
        assertTrue(calculusRatiocinator.getAssertions().contains(deuxiemeAffirmation));
    }

    @Test
    void evaluerAssertion() {
        var cr = new CalculusRatiocinator();
        var premierAffirmation = new SimpleAssertion("Lou est beau", ValuerDeVeriter.VRAI);
        var deuxiemeAffirmation = new SimpleAssertion("Lou est pauvre", ValuerDeVeriter.FAUSSE);
        cr.ajouterAssertion(premierAffirmation);
        cr.ajouterAssertion(deuxiemeAffirmation);
        assertEquals(ValuerDeVeriter.VRAI, cr.evaluerAssertion(premierAffirmation));
        assertEquals(ValuerDeVeriter.FAUSSE, cr.evaluerAssertion(deuxiemeAffirmation));
    }

    @Test
    void testEvaluerAssertion() {
    }

    @Test
    void getAssertions() {
    }
}