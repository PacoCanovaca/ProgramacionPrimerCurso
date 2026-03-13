// PlaceholderUser.java

package model;

@lombok.Data
public class PlaceholderUser {
    private long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
    
    public String getCity() {
        return address.getCity();
    }
}

// Address.java

@lombok.Data
class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;
}

// Geo.java

@lombok.Data
class Geo {
    private String lat;
    private String lng;
}

// Company.java

@lombok.Data
class Company {
    private String name;
    private String catchPhrase;
    private String bs;
}


