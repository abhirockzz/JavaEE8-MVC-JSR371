
package abhirockzz.wordpress.com.ozarktest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author @GET
 */
@ApplicationScoped
public class TweetStore {
    
    private List<Tweet> tweets = new ArrayList<>();
    
    @PostConstruct
    public void bootstrap(){
        tweets.add(new Tweet("#JavaEE8 is going great guns....."));
        tweets.add(new Tweet("#MVC early builds are available for testing..."));
        tweets.add(new Tweet("#ozark... oh what a cool name for a Java EE spec RI!!"));
    }
    
    public List<Tweet> get(String hashtag){
        return tweets.stream().filter(t -> t.getContent().contains(hashtag)).collect(Collectors.toList());
    }
}
