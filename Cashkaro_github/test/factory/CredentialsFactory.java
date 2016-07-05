package factory;

import entities.Credential;

public class CredentialsFactory {

    public static Credential getValidCredentials(){
        return new Credential("checkworking3@gmail.com","August12#");
    }
}
