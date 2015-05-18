
package abhirockzz.wordpress.com.ozarktest;

import com.oracle.ozark.core.Models;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.View;
import javax.mvc.Viewable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author Abhishek
 */
@Path("ozark")
@Controller
public class TweetManager {
    
    @Inject
    TweetStore store;
    
    @Inject
    Models models;
    
    @GET
    public String get0(@QueryParam("hashtag") String hashtag){
        models.put("tweet", store.get(hashtag).get(0));  
        return "tweet.jsp";
    }
    
    /*
    Uncomment individual methods below to try out various options w.r.t
    return types supported by MVC
    */
    
//    @GET
//    public Response get1(@QueryParam("hashtag") String hashtag){
//        models.put("tweet", store.get(hashtag).get(0));
//        return Response.ok("tweet.jsp").build();
//        
//    }
    
//    @GET
//    public Viewable get2(@QueryParam("hashtag") String hashtag){
//        models.put("tweet", store.get(hashtag).get(0));
//        return new Viewable("tweet.jsp");
//    }
    
//    @GET
//    @View("tweet.jsp")
//    public void get3(@QueryParam("hashtag") String hashtag){
//        models.put("tweet", store.get(hashtag).get(0));
//    }
    
}
