package com.anthonyo.kfc;
import com.anthonyo.kfc.enums.ValuerDeVeriter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@ToString
@RequiredArgsConstructor
public final class Homme {
    private final CalculusRatiocinator calculusRatiocinator;
    private final String name;



    public void ajouterAssertion(Assertion assertion) {
        calculusRatiocinator.ajouterAssertion(assertion);
    }

    public ValuerDeVeriter evaluerAssertion(Assertion assertion) {
        return calculusRatiocinator.evaluerAssertion(assertion);
    }

    public ValuerDeVeriter evalueAssertion(Assertion premierAssertion, Assertion deuxiemeAssertion, Conjonction conjonction) {
        return calculusRatiocinator.evaluerAssertion(premierAssertion, deuxiemeAssertion, conjonction);
    }
}