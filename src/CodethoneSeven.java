package src;

import java.util.*;

class CodethoneSeven{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String a;                            //Declare String to get the input path value


        List directroy = new ArrayList();//In the directory List I set path
        directroy.add("C:\\");
        directroy.add("C:\\");

        List<String> d1 = new ArrayList<>();
        //
        d1.add("C:\\files");
        d1.add("C:\\");
        d1.add("files\\");
        d1.add("f1.txt,");
        d1.add("f2.exe");
        directroy.add(d1);

        List<String> d2 = new ArrayList<>();
        d2.add("C:\\files\\nextDirectory");
        d2.add("C:\\");
        d2.add("files\\");
        d2.add("nextDirectory\\");
        d2.add("project.txt,");
        d2.add("plan.exe");
        directroy.add(d2);

        List<String> d3 = new ArrayList<>();
        d3.add("C:\\files\\nextDirectory\\files3");
        d3.add("C:\\");
        d3.add("files\\");
        d3.add("nextDirectory\\");
        d3.add("files3");

        directroy.add(d3);

        System.out.println("Enter Path");
        a = sc.next();//Given a path value
        if (directroy.contains(a)||d1.contains(a)||d2.contains(a)||d3.contains(a))//In the condition if the correct path value is there then it allow otherwise else path exected
        {
            for (int i = 1; i < directroy.size(); i++) {
                if (directroy.get(i) instanceof List<?>) {
                    List<Object> i1 = new ArrayList<>();
                    i1.addAll((Collection<?>) directroy.get(i));
                    for (int j = 1; j < ((List<?>) directroy.get(i)).size(); j++) {
                        if (j == i + 1) {
                            System.out.print("         ");
                        }
                        System.out.print(i1.get(j));
                    }
                    System.out.println();
                } else {
                    System.out.println(directroy.get(i));

                }
            }
        }
        else {
            System.out.println("Directory not Found on the file System");
        }
    }
}
