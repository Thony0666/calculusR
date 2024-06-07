package com.anthonyo.kfc;
import com.anthonyo.kfc.enums.ValuerDeVeriter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@ToString
public final class Homme {
    private final CalculusRatiocinator calculusRatiocinator;

    private final String name;

    public Homme(String name) {
        this.name = name;
        this.calculusRatiocinator = new CalculusRatiocinator();
    }


    public void ajouterAssertion(Assertion assertion) {
        calculusRatiocinator.ajouterAssertion(assertion);
    }

    public ValuerDeVeriter evaluerAssertion(Assertion assertion) {
        return calculusRatiocinator.evaluerAssertion(assertion);
    }

    public ValuerDeVeriter evaluerAssertion(Assertion premierAssertion, Assertion deuxiemeAssertion, Conjonction conjonction) {
        return calculusRatiocinator.evaluerAssertion(premierAssertion, deuxiemeAssertion, conjonction);
    }
}