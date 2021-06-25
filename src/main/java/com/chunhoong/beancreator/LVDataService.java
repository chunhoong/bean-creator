package com.chunhoong.beancreator;

public class LVDataService implements DataService {
    @Override
    public Data getData() {
        Data data = new Data();
        data.setCountry(Country.Latvia);
        return data;
    }
}
