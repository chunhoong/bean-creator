package com.chunhoong.beancreator;

public enum Country {
    Estonia("EE"), Latvia("LV"), Lithuania("LT");

    private final String countryCode;

    Country(String countryCode) {
        this.countryCode = countryCode;
    }

    public static Country fromCountryCode(String countryCode) {
        if ("EE".equalsIgnoreCase(countryCode)) {
            return Estonia;
        }

        if ("LV".equalsIgnoreCase(countryCode)) {
            return Latvia;
        }

        if ("LT".equalsIgnoreCase(countryCode)) {
            return Lithuania;
        }

        throw new RuntimeException("Invalid country code");
    }

    public String getCountryCode() {
        return countryCode;
    }
}
