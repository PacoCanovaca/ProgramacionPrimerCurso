// User.java

package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.OffsetDateTime;
import java.util.UUID;

@lombok.Data
public class User {
    private Result[] results;
    private Info info;
}

// Info.java

@lombok.Data
class Info {
    private String seed;
    private long results;
    private long page;
    private String version;
}

// Result.java

@lombok.Data
class Result {
    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private Dob dob;
    private Dob registered;
    private String phone;
    private String cell;
    private ID id;
    private Picture picture;
    private String nat;
}

// Dob.java

@lombok.Data
class Dob {
    @JsonIgnore
    private OffsetDateTime date;
    private long age;
}

// ID.java

@lombok.Data
class ID {
    private String name;
    private Object value;
}

// Location.java

@lombok.Data
class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private long postcode;
    private Coordinates coordinates;
    private Timezone timezone;
}

// Coordinates.java

@lombok.Data
class Coordinates {
    private String latitude;
    private String longitude;
}

// Street.java

@lombok.Data
class Street {
    private long number;
    private String name;
}

// Timezone.java

@lombok.Data
class Timezone {
    private String offset;
    private String description;
}

// Login.java

@lombok.Data
class Login {
    private UUID uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;
}

// Name.java

@lombok.Data
class Name {
    private String title;
    private String first;
    private String last;
}

// Picture.java

@lombok.Data
class Picture {
    private String large;
    private String medium;
    private String thumbnail;
}
