package ArrayListOperations;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearning {
    public static void main(String[] args) {   
        System.out.println(ArrList(args));
        ArrayList<String> List = ArrList(args); 
        removeAll(List, 'a');
        System.out.println(List);
    }
    
    public static ArrayList<String> ArrList(String[] args){
        ArrayList<String> stringList = new ArrayList<>();

        // Add elements to the List
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        stringList.add("elderberry");
        stringList.add("fig");
        stringList.add("grape");
        stringList.add("honeydew");
        stringList.add("kiwi");
        stringList.add("lemon");
        stringList.add("mango");
        stringList.add("nectarine");
        stringList.add("orange");
        stringList.add("pear");
        stringList.add("quince");
        stringList.add("raspberry");
        stringList.add("strawberry");
        stringList.add("tangerine");
        stringList.add("watermelon");
        stringList.add("zucchini");
        
        return stringList;
    }

    public static ArrayList<String> removeAll(ArrayList<String> ArrList, char symbol){
        Iterator<String> list = ArrList.iterator();
        while(list.hasNext()){
            if(contains(list.next(), symbol)){
                list.remove();
            }
        }
        return ArrList;
    }

    public static boolean contains(String word, char symbol){
        boolean statement = false;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == symbol){
                statement = true;
            }
        }
        return statement;
    }
}

