
package abhirockzz.wordpress.com.ozarktest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author @GET
 */
//@RequestScoped
//@Named("tweet")
public class Tweet {

    public Tweet() {
    }

    public Tweet(String content) {
        this.content = content;
    }
    
    
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}
