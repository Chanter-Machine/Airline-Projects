package com.airline.utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
/**
 * 
 * @author Chaofan
 * A Util for calculating date and time
 */
public class DateUtil {
	
	/**
	 * Calculate date after start date
	 * @param currentDate Start date
	 * @param distance	Days after current date
	 * @return
	 * @throws Exception
	 */
	public static Date getNextDasByNumber(Date currentDate,int distance)throws Exception{
        Calendar calendar=Calendar.getInstance();//获取日历对象
        calendar.setTime(currentDate);//设置当前时间 date  转 calendar 类型
        calendar.add(Calendar.DATE,distance);//计算离当前时间以后的日期
        Date date=(Date) calendar.getTime();//calendar 转 date  类型
        return date;
    }
	
	/**
	 * Convert sql.date to util,date
	 * @param sqlDate
	 * @return
	 */
	public static java.util.Date convertFromSQLDateToJAVADate(
            java.sql.Date sqlDate) {
        java.util.Date javaDate = null;
        if (sqlDate != null) {
            javaDate = new Date(sqlDate.getTime());
        }
        return javaDate;
    }
	
	/**
	 * Convert util.date to sql.date+
	 * @param utilDate
	 * @return
	 */
	public static java.sql.Date convertFromJavaDateToSqlDate(java.util.Date utilDate){
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		return sqlDate;
	}
}
