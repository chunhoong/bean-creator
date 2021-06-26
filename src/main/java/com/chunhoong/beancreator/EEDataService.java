package com.chunhoong.beancreator;

import org.springframework.stereotype.Service;

@Service("eeDataService")
public class EEDataService implements DataService {
    @Override
    public Data getData() {
        Data data = new Data();
        data.setCountry(Country.Estonia);
        return data;
    }
}
