package encrypt.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/")
public class EncryptController {

    private final EncryptionService encryptionService;

    public EncryptController(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }

    @Get("/encrypt/{text}")
    public Single<Message> encrypt(String text) {
        return encryptionService.encrypt(text);
    }
}
