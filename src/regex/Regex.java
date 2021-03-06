package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    public static void main(String[] args) {

        // 1. What does the following pattern match? (\d){36} explain in a println() statement.

        System.out.println("The following pattern ('\\d'){36} matches : A digit from 0-9, thats what 'backslash d' does, and the {36} means that it executes it 36 times.");



        String[] TEKmentors = {"Amir Yunas","Mark Bennet", "Rosa Garcia", "Desaree Byers", "Abram Jablonski", "Dylan Fellows", "Emilios Papas", "Jonathan Diamond"};

        // 2. Create a new array of the first names of the TEKmentors.  Use Regex to only grab the first name of every TEKmentor.  Push the values to a new array
        int k = 0;
        String[] tekMentors = new String[8];
        
        while(k < 8){
        String firstNames = "([A-Za-z]+)\\s*";
        Pattern firstNamePattern = Pattern.compile(firstNames);
        Matcher firstNameMatcher = firstNamePattern.matcher(TEKmentors[k]);
            firstNameMatcher.find();
            String firstName = firstNameMatcher.group(1);
            tekMentors[k] = firstName;
            System.out.println(tekMentors[k]);
            k++;
        };
        System.out.println(Arrays.toString(tekMentors));


        // 3. Find all the occurences of any form of 'book' in the following paragraph. use regex to match the occurences and store the count of books in an int.
        
        int bookCount = 0;
        String bookText = "Books are the keys to knowledge.  I didn't like to read books as a child, but in college I started enjoying learning and reading books. You can borrows books from the library, or you can buy them from the bookstore. I'm not sure if I prefer paperback books or hardcover books.  I'm such a nerd that I even like textbooks.  With the advent of technology, you can even buy digital books, such as kindle-books, nook-books, or other e-books. My personal favorite book format are pdf-books, because I don't have to carry so many books around wherever I go.  All the books are on my ipad or laptop.  When I lived abroad, they would give books to students absolutely free.  Free books for a student of knowledge is like a kid in a candy store.  So wipe the dust off of your books, and remember the slogan from 'reading rainbow' : 'Take a look! It's in a book! Reading Rainbow!";
        System.out.println(bookText);
        String bookPattern = "(Books*)";
        Pattern booksPattern = Pattern.compile(bookPattern, Pattern.CASE_INSENSITIVE);
        Matcher bookMatcher = booksPattern.matcher(bookText);
        while(bookMatcher.find()){
            bookCount++;
            System.out.println("Occurence " + bookCount + " : " + bookMatcher.start() + " to " + bookMatcher.end());
        }

        // 4.a Create an array of all the words besides the word 'sleepy'.  Each word does not have to be a separate element, although you can split it that way if you wish.  We just want an array that everything that is not 'sleepy'.  

        String sleepy = "I felt sleepy because I saw the others were sleepy and because I knew I should feel sleepy, but I wasn't really sleepy.  If you're sleepy and you know it, clap your hands.  Keep on being sleepy until you actually become sleepy";
        String[] noSleepy = new String[1];
        int i = 0;
        while(i< 1){
            String nonSleepy = sleepy.replaceAll("sleepy", "");
            Pattern nonSleepyPattern = Pattern.compile("\\s+");
            Matcher nonSleepyMatcher = nonSleepyPattern.matcher(nonSleepy);
            noSleepy[0] = nonSleepyMatcher.replaceAll(" ");
            i++;
        };
        System.out.println(noSleepy[0]);
        // 4.b combine the array that you just created into a string
        String not_sleepy = noSleepy[0]; //punctuation marks will be here
        System.out.println(not_sleepy);
        //4.c remove the punctuation marks from the notSleepy string.
        String notSleepy; //no punctuation marks should be here.
        notSleepy = not_sleepy.replaceAll("\\p{Punct}", "");
        System.out.println(notSleepy);
        //4.d Now replace all the occurences of 'sleepy' with the word 'happy'.  Call the new string happy.  
        
        String happy= sleepy.replaceAll("sleepy", "happy");
        System.out.println(happy);

        //BONUS : 
        //5. You are looking for unicode arrow symbols in a string.  https://jrgraphix.net/r/Unicode/2190-21FF is a selection of unicode arrow symbols to aid you in your search.  Match all the codes that are arrows, and then print them out to the console.  They should be printing out as the arrow images.

        String[] arrows = {"\u21FD", "\u26F7", "\u21FF", "\u21EF","\u21EC", "\u26F9","\u26FD","\u26D4","\u26A5","\u21FD","\u2190", "\u26A1","\u21BA","\u2196","\u2603","\u21FD"};
    }
}

