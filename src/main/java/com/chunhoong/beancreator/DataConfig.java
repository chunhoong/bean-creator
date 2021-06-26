package com.chunhoong.beancreator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class DataConfig {

    private final DataService eeDataService;
    private final DataService lvDataService;
    private final DataService ltDataService;

    @Autowired
    public DataConfig(
            @Qualifier("eeDataService") DataService eeDataService,
            @Qualifier("lvDataService") DataService lvDataService,
            @Qualifier("ltDataService") DataService ltDataService
    ) {
        this.eeDataService = eeDataService;
        this.lvDataService = lvDataService;
        this.ltDataService = ltDataService;
    }

    @Bean
    @RequestScope
    public DataService dataService() {
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        Country country = Country.fromCountryCode(request.getParameter("country"));

        if (country == Country.Estonia) {
            return eeDataService;
        } else if (country == Country.Latvia) {
            return lvDataService;
        } else {
            return ltDataService;
        }
    }
}
