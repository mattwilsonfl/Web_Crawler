import java.util.Scanner;

public class SpiderTest
{
	
	
    /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {
    	String URL, word;
        Spider spider = new Spider();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a URL start location");
        URL = scanner.nextLine();
        
        System.out.println("Please enter a word to search for (1 maximum)");
        word = scanner.nextLine();
        System.out.println("word is: " + word);
        
        spider.search(URL, word);
    }
}