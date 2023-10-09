package src;

import java.util.*;

public class CodethoneSix{
    public static void main(String arg[])
    {

        char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        List<String> list1 = new ArrayList<>();  // List1 for to store unique code
        int lenght=0;
        List<String> list2=new ArrayList<>();     //List2 for to store fruits name

        Map<String,List<String>> map = new HashMap<>();
        list1.add("345e5");
        list1.add("678i9");
        list1.add("2345234r98");
        list2.add("apple");
        list2.add("jackfruit");
        int k=0;
        for (String v1:list1)
        {

            lenght=0;
            for (int i = 0; i < v1.length(); i++) {
                List<String> ex = new ArrayList<>();
                char d = v1.charAt(i);
                char c=Character.toLowerCase(d);
                int asci = c;
                if ((asci > 65 && asci < 90) || (asci > 97 && asci < 122)) { //if Alphabet met then it allow
                    for (int j = 0; j < 26; j++) {
                        if (a[j] == c) {
                            lenght = j + 1;
                        }
                    }
                    for (String arr : list2) {
                        if (lenght == arr.length()) {
                            ex.add(arr);
                        }

                    }
                    if(ex.isEmpty())
                    {
                        ex.add("No Fruits");      //if no fruits mathch for it's length then No Fruits store
                        map.put(list1.get(k),ex);
                    }
                    else {
                        map.put(list1.get(k), ex);
                    }
                    k++;

                }
            }
        }
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue()); //prints required Result
        }


    }

}
