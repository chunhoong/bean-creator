package com.chunhoong.beancreator;

import org.springframework.stereotype.Service;

@Service("lvDataService")
public class LVDataService implements DataService {
    @Override
    public Data getData() {
        Data data = new Data();
        data.setCountry(Country.Latvia);
        return data;
    }
}
