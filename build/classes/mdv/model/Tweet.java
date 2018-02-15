package mdv.model;

/**
 * Tweet class for the twitter feed model
 * @author martin
 */
public class Tweet {
    private String userName;
    private String text;

    /**
     * creates a standard tweet 
     * @param userName the name or handle of the user
     * @param text the tweet text 
     */
    public Tweet(String userName, String text) {
        this.setText(text);
        this.setUserName(userName);
    }
    
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * private method used by constructor - place any standards here when needed
     */
    private void setUserName(String userName) {
        this.userName = userName.trim();
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * private method used by constructor - place any standards here when needed
     * .. Limits the text for a tweet to 140 characters
     */
    private void setText(String text) {
        if (text.trim().length() > 140) {
            this.text = text.trim().substring(0, 139);
        }  else {
            this.text = text;
        }
    }
    
}
