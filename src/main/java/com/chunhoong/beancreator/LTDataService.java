package com.chunhoong.beancreator;

import org.springframework.stereotype.Service;

@Service("ltDataService")
public class LTDataService implements DataService {
    @Override
    public Data getData() {
        Data data = new Data();
        data.setCountry(Country.Lithuania);
        return data;
    }
}
