package com.chunhoong.beancreator;

public class LTDataService implements DataService{
    @Override
    public Data getData() {
        Data data = new Data();
        data.setCountry(Country.Lithuania);
        return data;
    }
}
