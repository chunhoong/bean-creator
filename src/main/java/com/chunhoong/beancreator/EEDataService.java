package com.chunhoong.beancreator;

public class EEDataService implements DataService {
    @Override
    public Data getData() {
        Data data = new Data();
        data.setCountry(Country.Estonia);
        return data;
    }
}
