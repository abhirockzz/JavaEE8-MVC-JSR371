/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhirockzz.wordpress.com.ozarktest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author SAMSUNG
 */
@RequestScoped
@Named("tweet")
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
