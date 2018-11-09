package gateway;

import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

public interface EncryptOperations {

    @Get("/encrypt/{text}")
    Single<Message> encrypt(String text);
}
