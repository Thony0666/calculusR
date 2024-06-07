package com.anthonyo.kfc;

import com.anthonyo.kfc.enums.ValuerDeVeriter;

public abstract class Conjonction {
    protected abstract ValuerDeVeriter valeur(ValuerDeVeriter PremierValeur, ValuerDeVeriter DeuxiemeValeur);
}
