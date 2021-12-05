package day16;

import java.util.HashMap;
import java.util.Iterator;

/*
map扩展知识

map集合被使用是因为具备映射关系
"yureban" "01" "zhangsan"
"yureban" "02" "lisi"
"jiuyeban" "01" "wangwu"
"jiuyeban" "02" "zhaoliu"

一个学校有多个教室，每一个教室都有名称
*/
public class Demo06
{
    public static void main(String[] args)
    {
        HashMap<String, String> yure = new HashMap<String, String>();

        yure.put("01", "zhangsan");
        yure.put("02", "lisi");

        HashMap<String, String> jiuye = new HashMap<String, String>();

        jiuye.put("01", "wangwu");
        jiuye.put("02", "zhaoliu");

        HashMap<String, HashMap<String, String>> czbk = new HashMap<String, HashMap<String, String>>();

        czbk.put("yureban", yure);
        czbk.put("jiuyeban", jiuye);

        getStudentInfo(yure);
        System.out.println();
        getStudentInfo(jiuye);
        System.out.println();

        //遍历czbk集合，获取所有的教室
        Iterator<String> it = czbk.keySet().iterator();
        while(it.hasNext())
        {
            String roomName = it.next();
            HashMap<String, String> room = czbk.get(roomName);

            System.out.println(roomName);
            getStudentInfo(room);
        }
    }

    public static void getStudentInfo(HashMap<String, String> roomMap)
    {
        Iterator <String> it = roomMap.keySet().iterator();
        while(it.hasNext())
        {
            String id = it.next();
            String name = roomMap.get(id);
            System.out.println(id+": "+name);
        }
    }

}
