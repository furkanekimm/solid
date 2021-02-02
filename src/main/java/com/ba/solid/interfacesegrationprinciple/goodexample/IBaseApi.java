package com.ba.solid.interfacesegrationprinciple.goodexample;

public interface IBaseApi extends IGet {
    void Put(int id);
    void Post(int id);
    void Delete(int id);
}
