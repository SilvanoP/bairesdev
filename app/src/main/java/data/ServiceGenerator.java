package data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static final String BASE_URL = "https://api.github.com/search/repositories";
    private static final ServiceGenerator INSTANCE = new ServiceGenerator();

    private Retrofit retrofit;

    private ServiceGenerator() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public GitHubService getService() {
        return retrofit.create(GitHubService.class);
    }
}
