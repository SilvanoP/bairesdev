package data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GitHubService {

    @GET("search/repositories")
    Call<GithubResponse> getAndroidProjects(
            @Query("q") String search,
            @Query("sort") String sort,
            @Query("order") String order
    );
}
