package com.ba.solid.interfacesegrationprinciple.badexample;

//Aslında bize sadece get lazımdı bu servis için fakat implement ettiğimiz classtan dolayı bütün özellikleri geldi.
//Bu durum hiç hoşumuza gidecek bir durum değil dummy kodlar ortaya çıkmakta
public class Notification implements IBaseApi {
    @Override
    public void Put(int id) {

    }

    @Override
    public void Post(int id) {

    }

    @Override
    public void Get(int id) {

    }

    @Override
    public void Delete(int id) {

    }
}
