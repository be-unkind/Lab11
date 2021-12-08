package builder;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


class UserTest {

    private User user;

    @Test
    void testBuilder(){
        user = User.builder()
                .firstName("Nastya")
                .lastName("Havryliv")
                .occupation("UCU")
                .age(18)
                .gender("female")
                .build();

        assertEquals("User(firstName=Nastya, lastName=Havryliv, occupations=[UCU], gender=female, age=18)", user.toString());
    }

}