
package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final Pattern FIRST_NAME =
            Pattern.compile("^[A-Z][a-z]{2,}$");

    private static final Pattern LAST_NAME =
            Pattern.compile("^[A-Z][a-z]{2,}$");

    private static final Pattern EMAIL =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    private static final Pattern MOBILE =
            Pattern.compile("^\\+91[- ]?[6-9]\\d{9}$");

    private static final Pattern PASSWORD =
            Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-={}\\[\\]:;\"'<>,.?/]).{8,}$");

    public boolean validateFirstName(String firstName) {
        return firstName != null && FIRST_NAME.matcher(firstName).matches();
    }

    public boolean validateLastName(String lastName) {
        return lastName != null && LAST_NAME.matcher(lastName).matches();
    }

    public boolean validateEmail(String email) {
        return email != null && EMAIL.matcher(email).matches();
    }

    public boolean validateMobile(String mobile) {
        return mobile != null && MOBILE.matcher(mobile).matches();
    }

    public boolean validatePassword(String password) {
        return password != null && PASSWORD.matcher(password).matches();
    }
}
