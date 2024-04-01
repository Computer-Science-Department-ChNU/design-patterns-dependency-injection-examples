package ua.edu.chnu.kkn.di.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NetworkDataSource {

    private final JsonConverter jsonConverter;

    private final HttpClient httpClient;

    public NetworkDataSource(
            JsonConverter jsonConverter,
            HttpClient httpClient) {
        this.jsonConverter = jsonConverter;
        this.httpClient = httpClient;
    }

    public Optional<List<User>> getUsers() {
        var httpResponse = httpClient
                .get("/users/all")
                .orElse("");
        if (httpResponse.isEmpty()) {
            return Optional.of(new ArrayList<>());
        } else {
            return Optional.of(jsonConverter.parseUsers(httpResponse));
        }
    }
}
