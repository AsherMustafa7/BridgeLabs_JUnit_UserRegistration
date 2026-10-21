
package UserRegistration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    private final UserRegistration userRegistration =
            new UserRegistration();

    @Test
    void validFirstNameShouldPass() {
        assertTrue(userRegistration.validateFirstName("Asher"));
    }

    @Test
    void invalidFirstNameShouldFail() {
        assertFalse(userRegistration.validateFirstName("as"));
    }

    @Test
    void validLastNameShouldPass() {
        assertTrue(userRegistration.validateLastName("Mustafa"));
    }

    @Test
    void invalidLastNameShouldFail() {
        assertFalse(userRegistration.validateLastName("mustafa"));
    }

    @Test
    void validEmailShouldPass() {
        assertTrue(userRegistration.validateEmail("abc@gmail.com"));
    }

    @Test
    void invalidEmailShouldFail() {
        assertFalse(userRegistration.validateEmail("abc@gmail"));
    }

    @Test
    void validMobileShouldPass() {
        assertTrue(userRegistration.validateMobile("+91 9876543210"));
    }

    @Test
    void invalidMobileShouldFail() {
        assertFalse(userRegistration.validateMobile("12345"));
    }

    @Test
    void validPasswordShouldPass() {
        assertTrue(userRegistration.validatePassword("Hello@123"));
    }

    @Test
    void invalidPasswordShouldFail() {
        assertFalse(userRegistration.validatePassword("hello123"));
    }

    @Test
    void nullValuesShouldFailValidation() {
        assertAll(
                () -> assertFalse(userRegistration.validateFirstName(null)),
                () -> assertFalse(userRegistration.validateLastName(null)),
                () -> assertFalse(userRegistration.validateEmail(null)),
                () -> assertFalse(userRegistration.validateMobile(null)),
                () -> assertFalse(userRegistration.validatePassword(null))
        );
    }
}
