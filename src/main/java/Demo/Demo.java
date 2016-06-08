package Demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 有一个叫jsoup的东西很好用。通过它、很多时候就不用自己通过正则表达式来解析html文件了
 * 然后主要需要学会使用的就是Document的select方法！
 * Created by chenh on 2016/6/9.
 */
public class Demo {

    public static void main(String[] args) throws IOException {

        ArrayList<Industry> industries=new ArrayList<Industry>();

        Document doc = Jsoup.connect("http://q.10jqka.com.cn/stock/thshy/").get();

        //捕捉到html中的更新时间
        Elements time=doc.select("div.update_time");
        String timeString=time.text();
        System.out.println(timeString);


        Elements trs = doc.select("table").select("tr");
        //从1开始是因为一开始瞄了一下，第0行获得的是javascrip的内容
        for(int i = 1;i<trs.size();i++) {
            Elements tds = trs.get(i).select("td");
            Industry industry=new Industry();
            for (int j = 0; j < tds.size(); j++) {
                String text = tds.get(j).text();
                industry.addItem(text);
                //System.out.println(text);         //可以print每一个字段
            }
            industries.add(industry);
        }

        for (Industry industry:industries){
            System.out.println(industry.toString());
        }
    }

}
