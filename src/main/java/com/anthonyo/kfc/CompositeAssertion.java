package com.anthonyo.kfc;


import com.anthonyo.kfc.enums.ValuerDeVeriter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CompositeAssertion extends Assertion {
    private final Assertion est;
    private final Assertion ouest;
    private final Conjonction conjonction;

    public CompositeAssertion(String description, Assertion est, Assertion ouest, Conjonction conjonction) {
        super(description);
        this.est = est;
        this.ouest = ouest;
        this.conjonction = conjonction;
    }

    @Override
    public ValuerDeVeriter evaluer() {
        return conjonction.valeur(est.evaluer(), ouest.evaluer());
    }
}
