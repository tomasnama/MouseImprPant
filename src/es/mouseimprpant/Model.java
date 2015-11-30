package es.mouseimprpant;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Model {
    private static final String DIR_APP_DATA = "";
    
    public Model() {
        super();
    }

    public String getSTime() {
        Date now = new Date(); 
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(now);
    }

    public String getFileName() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        StringBuffer sbf = new StringBuffer();
        sbf.append(DIR_APP_DATA);
        sbf.append("\\");   
        sbf.append(year);
        sbf.append("\\");   
        sbf.append(month);
        sbf.append("\\");   
        sbf.append(day);
        new File(sbf.toString()).mkdirs();
        sbf.append("\\");   
        sbf.append(getSTime());
        sbf.append(".png");  
        //System.out.println(sbf.toString());
        return sbf.toString();
    }
}
