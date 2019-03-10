package com.example.haveibeenpawned.Model;

public interface DataSource// interface can define a contract -- what we are doing here is having a conversation with user// {
    public void getDataForPawnedSite(String domain);

interface DataListener {
    void onDataRetrieved(List<DomainResponse> Result);
    void onFailure(Throwable throwable);
}


