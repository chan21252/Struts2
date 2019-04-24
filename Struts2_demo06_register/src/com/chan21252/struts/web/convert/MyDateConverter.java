package com.chan21252.struts.web.convert;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * 自定义日期转换器
 * @author cuican
 * @version 1.0
 */
public class MyDateConverter extends StrutsTypeConverter {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");

    /**
     * String类型的参数转换为Date对象
     * @param map 未知
     * @param values 参数字符串数组
     * @param toClass 要转换的参数类型
     * @return 转换后的Date对象
     */
    @Override
    public Object convertFromString(Map map, String[] values, Class toClass) {

        /*for (String s:values){
            System.out.println(s);
        }
        System.out.println(values);*/

        if(values != null && values.length > 0){
            String dateStr = values[0];

            if ("".equals(dateStr)){
                return null;
            }

            if (toClass == java.util.Date.class){
                try {
                    return format.parse(dateStr);
                } catch (ParseException e) {
                    //e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }

        return null;
    }

    /**
     * 日期对象转换为字符串
     * @param map 未知
     * @param o Date对象
     * @return 日期转换的字符串对象
     */
    @Override
    public String convertToString(Map map, Object o) {

        if (o == java.util.Date.class){
            return format.format(o);
        }
        return null;
    }
}
