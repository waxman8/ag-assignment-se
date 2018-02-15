# ag-challenge-se



Assumptions
1) Usernames are case sensitive, so Martin and MARTIN will be two different users
2) When processing the files, lines that do not conform to the format are not important therefore will not be reported and just be skipped. 
(just how important are these tweets :-))
3) When processing the tweet file, tweets of more than 140 characters get truncated to 140 characters and not ignored / bypassed
4) An IO error is a big deal and these are left to bubble all the way to the console 

There are 2 Ways of running the program from the command line

1) Passing in the path to a directory where user.txt and tweet.txt reside, for example
java -jar "/../AGCodingAssignment.jar" /sandpit/resources

2) Passing in the fully qualified file names of files that conform to user.txt and tweet.txt
java -jar "/../AGCodingAssignment.jar" /sandpit/resources/user1.txt /sandpit/resources/tweet1.txt



