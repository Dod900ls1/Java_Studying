import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.util.Set;


public class Framworks {
    public static void main(String[] args) {
        try {
            System.out.println(wordCounter("text.txt", 5));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static HashMap<String, Integer> wordCounter(String filename, int minOccurences) throws FileNotFoundException {
        HashMap<String, Integer> occurences = new HashMap<String, Integer>();
        File file = new File(filename);
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String[] elements = data.split("[\\p{Punct}\\s]");
            for(String i: elements){
                if( i != "" ){ // Array elements has returned some emply elements, so this if statemant was created to get rid of them
                    if(!occurences.containsKey(i)){
                        occurences.put(i, 1);
                    }else{
                        occurences.put(i, occurences.get(i)+1);
                    }
                }
            }
        }
        
        Set<String> keySet = occurences.keySet();
        String[] keysArray = keySet.toArray(new String[keySet.size()]);
        for(String i: keysArray){
            if(occurences.get(i) < minOccurences){
                occurences.remove(i);
            }
        }

        myReader.close();
        return occurences;
    }
}