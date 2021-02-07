package immedia.superhero.app.Interfaces;

import immedia.superhero.app.pojo.HeroInfo;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Url;

public interface ApiInterface {

    @GET("/search/batman")
    Call<HeroInfo>  getHeroInfo();

    @GET("/api/{access-token}/search/{name}/")
    Call<HeroInfo> searchHero( @Path("name") String user ,@Path("access-token") String token);

    @GET
    Call<ResponseBody> downloadFileWithDynamicUrl(@Url String fileUrl);
}
