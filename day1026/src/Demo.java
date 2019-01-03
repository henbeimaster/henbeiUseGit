import com.sun.javafx.collections.MappingChange;

import javax.swing.text.Element;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class Demo {
    public static void main(String[] args) {

        /*Date date = new Date(152400001);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String mydate = dateFormat.format(date);
        System.out.println(mydate);*/
        /*String emailContent = "尊敬的用户，您好！</br> ITSM $orderType ($serialCode) 服务时间已消耗 $stage ,请尽快进行处理。</br> 如有任何问题，请及时反馈。";
        emailContent.replaceAll("\\$stage","50");
        System.out.println(emailContent.toString());*/
        /*String email = "1524066683@qq.com";
        String[] split = email.split(" ");
        System.out.println(Arrays.asList(split).toString());*/
       /* List<String> list = new ArrayList<>();
        list.add("asdf");
        list.add("asdf");
        list.add("yuiop");
        list.add("hjkl");

        List<String> collect = list.stream().distinct().collect(toList());
        System.out.println(collect);



        boolean status = true;
        String s = String.valueOf(status);
        System.out.println(s);*/


        Map<String,String> map = new HashMap<>();
        map.put("aaa","a");
        map.put("aaa","b");
        map.put("aaa","c");
        map.put("bbb","d");
        map.put("ccc","t");
        map.put("ccc","f");
        StringBuilder sb = new StringBuilder();
        Map<String,String> hashmap = new HashMap<>();
        for(String key :map.keySet()){
            if(!hashmap.containsKey(key)){
                map.put(key,sb.append(map.get(key)).toString());
            }else{
                map.put(key,sb.append(",").append(map.get(key)).toString());
            }
        }
        for(Map.Entry<String,String> m :map.entrySet()){
            System.out.println(m.getKey()+"-----"+m.getValue());
        }

    }
}
