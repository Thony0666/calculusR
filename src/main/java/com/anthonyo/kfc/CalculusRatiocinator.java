package com.anthonyo.kfc;

import com.anthonyo.kfc.enums.ValuerDeVeriter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@ToString
@EqualsAndHashCode
public class CalculusRatiocinator {
    private final Set<Assertion> assertions;

    public CalculusRatiocinator() {
        this.assertions = new HashSet<>();
    }

    public void ajouterAssertion(Assertion assertion) {
        assertions.add(assertion);
    }

    public ValuerDeVeriter evaluerAssertion(Assertion assertion) {
        if (assertions.contains(assertion)) {
            return assertion.evaluer();
        } else {
            return ValuerDeVeriter.JENESAISPAS;
        }
    }

    public ValuerDeVeriter evaluerAssertion(Assertion premierAffirmation, Assertion deuxiemeAffirmation, Conjonction conjonction) {
        if (assertions.contains(premierAffirmation) && assertions.contains(deuxiemeAffirmation)) {
            return conjonction.valeur(premierAffirmation.evaluer(), deuxiemeAffirmation.evaluer());
        } else {
            return ValuerDeVeriter.JENESAISPAS;
        }
    }
}