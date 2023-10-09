package src;
import java.util.*;

public class CodethoneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //Give How many customer
        List custom=new ArrayList<String>();
        String customer[] = new String[a];

        for (int i = 0; i < a; i++) {
            customer[i] = sc.next();
            custom.add(customer[i]);

        }

        System.out.println(mostActive(custom, a)); //Print who are having atleast 5%

    }


    public static List<String> mostActive(List<String> customer,int l) {
        float f = ((float) (l * 5) / 100);
        double percent = Math.ceil(f);
        int percentage = (int) percent;
        int len = customer.size();
        TreeSet<String> set = new TreeSet<>();
        TreeSet<String> answer = new TreeSet<>();
        for (int i = 0; i < len; i++) {
            set.add(customer.get(i));
        }
        int setLen = set.size();

        int ch[] = new int[setLen];
        int i = 0;
        for (String str : set) {
            int count = Collections.frequency(customer, str); //count str value how many times is there in customer
            ch[i] = count;
            if (count >= percentage) {
                answer.add(str);   //add customer have Atleast 5%
            }
        }
        List<String> ans = new ArrayList<>();
        for (String str : answer) {
            ans.add(str);
        }
        return ans;  //Return who are have atleast 5%
    }
}
