package com.anthonyo.kfc;

import com.anthonyo.kfc.enums.ValuerDeVeriter;
import lombok.Getter;

@Getter
public class SimpleAssertion extends Assertion {
    private final ValuerDeVeriter valeurDeVerite;

    public SimpleAssertion(String description, ValuerDeVeriter valeurDeVerite) {
        super(description);
        this.valeurDeVerite = valeurDeVerite;
    }

    @Override
    public ValuerDeVeriter evaluer() {
        return valeurDeVerite;
    }
}
