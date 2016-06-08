package Demo;

import java.util.ArrayList;
/**
 * Created by chenh on 2016/6/9.
 */
public class Industry {
    /**
     *
     序号	板块	公司家数	平均价格	涨跌幅↓	总成交量（万手）	总成交额（亿元）	净流入（亿元）	领涨股	最新价	涨跌幅
     */
    private ArrayList<String>  content;


    public Industry(){
        content=new ArrayList<String>();
    }

    public void addItem(String s){
        content.add(s);
    }

    public String toString(){
        return "序号"+content.get(0)+"板块"+content.get(1)+"公司家数"+content.get(2)+"平均价格"+content.get(3)+
                "涨跌幅↓"+content.get(4)+"总成交量（万手）"+content.get(5)+"总成交额（亿元）"+content.get(6)+
                "净流入（亿元）"+content.get(7)+"领涨股"+content.get(8)+"最新价"+content.get(9)+"涨跌幅"+content.get(10);
    }
}
