package com.tzw.util;



import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import jdk.nashorn.internal.runtime.Version;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CreateWord {


    public static void exportDoc() {

        Map<String, Object> dataMap = new HashMap<String, Object>();
//        dataMap.put("brand", "海尔");
//        dataMap.put("store_name", "海尔天津");
        dataMap.put("username", "小明");

        //经过编码后的图片路径
//        String image = getWatermarkImage(picturePath);
//        dataMap.put("image", image);

        //Configuration用于读取ftl文件
        Configuration configuration = new Configuration();
        configuration.setDefaultEncoding("utf-8");

        Writer out = null;
        try {
            //输出文档路径及名称
            File outFile = new File("D:/a/aaa.doc");
            out = new BufferedWriter(new OutputStreamWriter(new
                    FileOutputStream(new File("outFile")), "utf-8"), 10240);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 加载文档模板
        Template template = null;
        try {
            //指定路径，例如C:/a.ftl 注意：此处指定ftl文件所在目录的路径，而不是ftl文件的路径
            configuration.setDirectoryForTemplateLoading(new File("D:/a/"));
            //以utf-8的编码格式读取文件
            template = configuration.getTemplate("a.ftl", "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("文件模板加载失败！", e);
        }

        // 填充数据
        try {
            template.process(dataMap, out);
        } catch (TemplateException e) {
            e.printStackTrace();
            throw new RuntimeException("模板数据填充异常！", e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("模板数据填充异常！", e);
        } finally {
            if (null != out) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("文件输出流关闭异常！", e);
                }
            }
        }
    }

    public static void main(String[] args) {
        CreateWord.exportDoc();
    }

}
