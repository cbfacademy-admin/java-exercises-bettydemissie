package com.codingblackfemales.academy;

import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final List<String> nicknames;

    public ImmutablePerson(String firstName, String middleName, String lastName, List<String> nicknames) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and last name are required.");
        }

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nicknames = nicknames == null ? null : Collections.unmodifiableList(nicknames);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getNicknames() {
        return nicknames;
    }
}
