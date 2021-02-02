package com.ba.solid.liskovssubstitutionprinciple.badexample;

//Canon printer için ise aynı durum geçerli değil sadece print var fakat extend ettiğimiz için iki özellikte
//kullanılmak zorunda
public class CanonPrinter extends BasePrinter {

    @Override
    public void Print(String value) {

    }

    @Override
    public void Scan(String value) {

    }
}
