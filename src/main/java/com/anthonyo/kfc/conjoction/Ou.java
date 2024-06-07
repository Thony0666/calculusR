package com.anthonyo.kfc.conjoction;

import com.anthonyo.kfc.Conjonction;
import com.anthonyo.kfc.enums.ValuerDeVeriter;

public class Ou extends Conjonction {


    @Override
    protected ValuerDeVeriter valeur(ValuerDeVeriter PremierValeur, ValuerDeVeriter DeuxiemeValeur) {
        if (PremierValeur == ValuerDeVeriter.VRAI || DeuxiemeValeur == ValuerDeVeriter.VRAI){
            return ValuerDeVeriter.VRAI;
        }
        if(PremierValeur == ValuerDeVeriter.VRAI || DeuxiemeValeur == ValuerDeVeriter.FAUSSE){
            return ValuerDeVeriter.VRAI;
        }
        if (PremierValeur == ValuerDeVeriter.FAUSSE || DeuxiemeValeur == ValuerDeVeriter.VRAI){
            return ValuerDeVeriter.VRAI;
        }
        if (PremierValeur == ValuerDeVeriter.FAUSSE  || DeuxiemeValeur == ValuerDeVeriter.FAUSSE){
            return ValuerDeVeriter.FAUSSE;
        }
        return ValuerDeVeriter.JENESAISPAS;
    }
}
