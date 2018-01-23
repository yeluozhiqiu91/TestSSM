package com.wang.tools;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wang on 2018/1/5.
 */
public class POIUtils {
    public static void main(String[] args) throws IOException {
        String path="D:\\"+"wxh.xls";
        InputStream is=new FileInputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        List<String> list=new ArrayList<String>();
        List<String> list2=new ArrayList<String>();
        HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(0);//第一个sheet的内容
        for(int rowNum = 0; rowNum <= hssfSheet.getLastRowNum(); rowNum++){
            HSSFRow hssfRow = hssfSheet.getRow(rowNum);
            /*if (hssfRow != null) {
                HSSFCell no = hssfRow.getCell(0);
                list.add(getValue(no));
            }*/
            if (hssfRow != null) {
                HSSFCell no1 = hssfRow.getCell(1);
                HSSFCell no4 =hssfRow.getCell(4);
                if(getValue(no4).equals("1")){
                    list.add(getValue(no1));
                }else if(getValue(no4).equals("2")){
                    list2.add(getValue(no1));
                }
            }
        }
        System.out.println("共有"+list.size()+"个元素");
        StringBuffer sb=new StringBuffer("");
        for(int i=0;i<list.size();i++){
            sb.append("'").append(list.get(i)).append("'").append(",");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

        System.out.println("lsit2共有"+list2.size()+"个元素");
        StringBuffer sb2=new StringBuffer("");
        for(int i=0;i<list2.size();i++){
            sb2.append("'").append(list2.get(i)).append("'").append(",");
        }
        sb2.deleteCharAt(sb2.length()-1);
        System.out.println(sb2.toString());
    }
    private static String getValue(XSSFCell xssfRow) {
        // return "" if parameter xssfRow is null
        if(xssfRow == null){
            return "";
        }
        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            return String.valueOf(xssfRow.getNumericCellValue());
        } else {
            return String.valueOf(xssfRow.getStringCellValue());
        }
    }
    private static String getValue(HSSFCell hssfRow) {
        //避免科学计数法的做法
        DecimalFormat df = new DecimalFormat("0");
        // return "" if parameter xssfRow is null
        if(hssfRow == null){
            return "";
        }
        if (hssfRow.getCellType() == hssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(hssfRow.getBooleanCellValue());
        } else if (hssfRow.getCellType() == hssfRow.CELL_TYPE_NUMERIC) {
            return String.valueOf(df.format(hssfRow.getNumericCellValue()));
        } else {
            return String.valueOf(hssfRow.getStringCellValue());
        }
    }
}
