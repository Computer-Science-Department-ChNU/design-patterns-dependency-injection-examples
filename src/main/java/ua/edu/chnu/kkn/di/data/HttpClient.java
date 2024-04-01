package ua.edu.chnu.kkn.di.data;

import java.util.Arrays;
import java.util.Optional;

public class HttpClient {

    private final String baseUrl;

    public HttpClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    Optional<String> post(String endPoint, Object... args) {
        System.out.println("Making POST http request on " + baseUrl + endPoint + "\n"
                + "with following parameters " + Arrays.toString(args));
        return Optional.of("Result");
    }

    Optional<String> delete(String endPoint, Object... args) {
        System.out.println("Making DELETE http request on " + baseUrl + endPoint + "\n"
                + "with following parameters " + Arrays.toString(args));
        return Optional.of("Result");
    }

    Optional<String> put(String endPoint, Object... args) {
        System.out.println("Making PUT http request on " + baseUrl + endPoint + "\n"
                + "with following parameters " + Arrays.toString(args));
        return Optional.of("Result");
    }

    Optional<String> get(String endPoint, Object... args) {
        System.out.println("Making GET http request on " + baseUrl + endPoint + "\n"
                + "with following parameters " + Arrays.toString(args));
        return Optional.of("Result");
    }
}
