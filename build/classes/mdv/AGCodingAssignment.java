package mdv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Entry point for my Java SE version of the Allan Gray Coding Assignment
 * Model is in User.java and Tweet.java
 * Repository implementation for the files are in UserRepository.java and TweetRepository.java
 * Control of the process is in Simulator.java
 * The purpose of this application is to simulate a twitter feed, getting it's initial state from two .txt files
 * 
 * @author martin
 */
public class AGCodingAssignment {
    
    public static String userFileName;
    public static String tweetFileName;
    
    /**
     * @param args optional command line arguments: args[0] only, then it is considered a path to where user.txt and tweet.txt lives
     *  if args[0] and args[1] then considered fully qualified paths to any user and tweet repo files
     * @throws java.io.IOException let IO errors bubble up the call stack
     */
    public static void main(String[] args) throws IOException {
        
        switch (args.length) {
            case 1:
                userFileName = args[0] + "/user.txt";
                tweetFileName = args[0] + "/tweet.txt";
                break;
            case 2:
                userFileName = args[0];
                tweetFileName = args[1];
                break;
            default:
                System.out.println("Arguments expected");
                System.out.println("Run with 1 folder argument [path to user and tweet files] OR ");
                System.out.println("Run with 2 fully qualified file path arguments [pathTo user file] [pathTo tweet file]");
                System.exit(0);
        }
        
        File f = new File(userFileName);
        if (!f.exists()) {
            System.out.println("File " + userFileName + " does not exist");
            System.exit(0);
        } 
        f = new File(tweetFileName);
        if (!f.exists()) {
            System.out.println("File " + tweetFileName + " does not exist");
            System.exit(0);
        }
        
        Simulator sim = new Simulator();
        sim.simulate();
    } 
}
