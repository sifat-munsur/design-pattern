package Creational.Builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String address;
    private final int age;
    private final boolean verified;

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.age = builder.age;
        this.verified = builder.verified;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String address;
        private int age;
        private boolean verified;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder verified(boolean verified){
            this.verified = verified;
            return this;
        }

        public User build(){

            if(email == null || email.isBlank()){
                throw new IllegalArgumentException("Email is required");
            }

            if(age < 0){
                throw new IllegalArgumentException("Age cannot be negative");
            }
            return new User(this);
        }
    }

    public static void main(String[] args) {
        
        User user = new User.Builder()
                        .firstName("Sifat")
                        .lastName("Ullah")
                        .email("sifat@gmail.com")
                        .phone("01928282005")
                        .age(27)
                        .address("Dhaka")
                        .verified(true)
                        .build();

        System.out.println(user.age);

    }


}
