package encrypt.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class EncryptController {

    @Get("/encrypt/{text}")
    public Message encrypt(String text) {
        String encrypted = new StringBuilder(text).reverse().toString();
        return new Message(encrypted);
    }
}
