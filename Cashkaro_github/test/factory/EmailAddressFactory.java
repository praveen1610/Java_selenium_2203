package factory;

import entities.EmailAddress;

public class EmailAddressFactory {

    public static EmailAddress getValidEmailAddress(){
        return new EmailAddress("checkworking1@gmail.com");
    }
}
