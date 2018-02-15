package mdv.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * User class for the twitter feed model
 * @author martin
 */
public class User {
    
    private Set<String> followers = new HashSet<>();
    private Set<String> following = new HashSet<>();
    private Set<Tweet> feedHistory = new LinkedHashSet<>();
    private String name;
    
    /**
     *
     * @param name the name or handle of the user
     */
    public User (String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name.trim();
    }
    
    /**
     * @return handle to this users list of followers
     */
    public Set<String> getFollowers() {
        return this.followers;
    }
    
    /**
     * @return handle to this users feed history
     */
    public Set<Tweet> getFeedHistory() {
        return this.feedHistory;
    }
    
    /**
     * @param name of the follower to add 
     */
    public void addFollower(String name) {
        this.followers.add(name.trim());
    }
    
    /**
     * @param name of a user to follow
     */
    public void startFollowing(String name) {
        this.following.add(name.trim());
    }
    
    /**
     * 
     * @param tweet to add to the feed history
     * Tweet will be truncated to 140 characters
     */
    public void addTweet(Tweet tweet) {
        this.feedHistory.add(tweet);
    }
    
    /**
     * @param otherName the name to compare this name to for sorting
     * @return weight for custom comparison
     */
    public int compareTo(String otherName) {
        return this.name.compareTo(otherName);
    }
    
    /**
     * @return custom String value
     */
    @Override
    public String toString() {
        return this.name + "Followers(" + this.followers.size() + ")" + "Following(" + this.following.size() + ")";
    }
    
}
