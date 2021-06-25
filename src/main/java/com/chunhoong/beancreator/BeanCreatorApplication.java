package com.chunhoong.beancreator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class BeanCreatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanCreatorApplication.class, args);
    }

    @Bean
    @RequestScope
    public DataService dataService() {
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();

        Country country = Country.fromCountryCode(request.getParameter("country"));

        if (country == Country.Estonia) {
            return new EEDataService();
        } else if (country == Country.Latvia) {
            return new LVDataService();
        } else {
            return new LTDataService();
        }
    }

}
