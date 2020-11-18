package com.tzw.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class WordTest {
    private Configuration configuration = new Configuration();
    /**
     *
     * 加载模板信息
     */
    private Template readWord() {
        // 加载文档模板FTL文件所存在的位置
//        configuration.setClassForTemplateLoading(this.getClass(),"/com/test");
//        configuration.setClassForTemplateLoading(this.getClass(),"classpath:com");
        Template tempWord = null;
        try {
            configuration.setDirectoryForTemplateLoading(new File("C:/Users/Administrator/Desktop/template"));
            //web工程还可以使用加载方法configuration.setServletContextForTemplateLoading(Object servletContext, String path);
            configuration.setDefaultEncoding("UTF-8");


            // 获取模板信息
            tempWord = configuration.getTemplate("发票小样3.ftl");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempWord;
    }
    /**
     *
     填充模板参数
     */
    private void getFillData(Map dataMap) {


    }

    /**
     * 创建新word文档
     */
    public void createWord() {

        for(int i=0;i<20;i++){

            Map dataMap = new HashMap();
            // 根据模板中的参数填充内容，可以不按顺序，参数名称要对上
            dataMap.put("gun_num", gunNum(i));//01
            dataMap.put("trans_id", transId());
            dataMap.put("card_num", cardId());//0000000017000009
            String o = one();
            String on = oneNum();
            Double total = Double.valueOf(o)*Double.valueOf(on);
            String string = new BigDecimal(total).setScale(2,BigDecimal.ROUND_HALF_UP).toString();
            dataMap.put("one", o);//3.85
            dataMap.put("one_num", on);//313.18
            dataMap.put("total", string);//1205.74
            dataMap.put("total_1", string);//1205.74
            // 文档输出目录
            File outFile = new File("C:/Users/Administrator/Desktop/template/a"+i+".docx");
            Writer out = null;
            try {
                out = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(outFile)));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
            try {
                // 模板填充后，输出到指定目录
                readWord().process(dataMap, out);
            } catch (TemplateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static String gunNum(int i){

         return "0"+i%10;

    }

    public static String transId(){
        String random = String.valueOf(Math.random());
        return random.substring(2,11);
    }

    public static String cardId(){
        String random = String.valueOf(Math.random());
        return random.substring(2,17);
    }

    public static String one(){
        return "3.15";
    }

    public static String oneNum(){
        return "313.18";
    }

    // 调用方法
    public static void main(String[] args) {
        WordTest test = new WordTest();
        test.createWord();
    }
}
