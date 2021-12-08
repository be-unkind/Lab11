package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Nastya")
                .lastName("Havryliv")
                .age(18)
                .occupation("UCU")
                .gender("female")
                .build();
        System.out.println(user);
    }
}
