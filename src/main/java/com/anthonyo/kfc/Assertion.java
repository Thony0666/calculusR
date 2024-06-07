package com.anthonyo.kfc;

import com.anthonyo.kfc.enums.ValuerDeVeriter;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public abstract class Assertion {
    private final String description;

    public abstract ValuerDeVeriter evaluer();
}
