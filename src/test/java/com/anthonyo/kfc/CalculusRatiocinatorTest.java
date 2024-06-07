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
    }

    @Test
    void testEvaluerAssertion() {
    }

    @Test
    void getAssertions() {
    }
}