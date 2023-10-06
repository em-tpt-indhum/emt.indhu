package src;
import java.util.ArrayList;
import java.util.List;

public class CodethoneOne {
    public static void main(String arg[])
    {
        List<String> usernames=new ArrayList<>();
        usernames.add("Aab");
        usernames.add("Cta");
        usernames.add("Bapg");
        usernames.add("Indhu");
        possibleChange(usernames);
    }
    static void possibleChange(List<String> usernames) {
        System.out.println(usernames);
        List<String> use = new ArrayList<>();
        for (String var : usernames) {
            String var1 = var.toLowerCase();
            char ch[] = var1.toCharArray();
            for (int i = 0; i < (ch.length); i++) {
                for (int j = i + 1; j < ch.length; j++) {
                    int a = ch[i];
                    int b = ch[j];
                    if (a < b) {
                        continue;
                    } else {
                        char c;
                        c = ch[i];
                        ch[i] = ch[j];
                        ch[j] = c;
                    }
                }

            }

            ch[0] = Character.toUpperCase(ch[0]);
            String str = "";

            for (int i = 0; i < ch.length; i++) {
                str = str + ch[i];
            }

            use.add(str);


        }
        System.out.println(use);

        List<String> answer = new ArrayList<>();
        for (int i = 0; i < usernames.size(); i++) {
            String a = usernames.get(i);
            String b = use.get(i);
            if (a.equals(b)) {
                answer.add("NO");
            } else {
                answer.add("YES");
            }

        }
        System.out.println(answer);

    }
}
