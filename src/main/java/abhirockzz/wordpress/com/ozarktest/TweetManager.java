/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author SAMSUNG
 */
@Path("ozark")
@Controller
public class TweetManager {
    
    @Inject
    TweetStore store;
    
    @Inject
    Models models;
    
    @GET
    //@View("tweet.jsp")
    public Response get(@QueryParam("hashtag") String hashtag){
        models.put("tweet", store.get(hashtag).get(0));
        System.out.println("fetching via Response....");
        return Response.ok("tweet.jsp").build();
        //return "tweet.jsp";
    }
    
}
