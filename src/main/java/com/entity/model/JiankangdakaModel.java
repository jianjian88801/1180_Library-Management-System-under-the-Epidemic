package com.entity.model;

import com.entity.JiankangdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康打卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public class JiankangdakaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 健康情况
	 */
	
	private String jiankangqingkuang;
		
	/**
	 * 接触史
	 */
	
	private String jiechushi;
		
	/**
	 * 今日体温
	 */
	
	private String jinritiwen;
		
	/**
	 * 佩戴口罩
	 */
	
	private String peidaikouzhao;
		
	/**
	 * 打卡日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dakariqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：健康情况
	 */
	 
	public void setJiankangqingkuang(String jiankangqingkuang) {
		this.jiankangqingkuang = jiankangqingkuang;
	}
	
	/**
	 * 获取：健康情况
	 */
	public String getJiankangqingkuang() {
		return jiankangqingkuang;
	}
				
	
	/**
	 * 设置：接触史
	 */
	 
	public void setJiechushi(String jiechushi) {
		this.jiechushi = jiechushi;
	}
	
	/**
	 * 获取：接触史
	 */
	public String getJiechushi() {
		return jiechushi;
	}
				
	
	/**
	 * 设置：今日体温
	 */
	 
	public void setJinritiwen(String jinritiwen) {
		this.jinritiwen = jinritiwen;
	}
	
	/**
	 * 获取：今日体温
	 */
	public String getJinritiwen() {
		return jinritiwen;
	}
				
	
	/**
	 * 设置：佩戴口罩
	 */
	 
	public void setPeidaikouzhao(String peidaikouzhao) {
		this.peidaikouzhao = peidaikouzhao;
	}
	
	/**
	 * 获取：佩戴口罩
	 */
	public String getPeidaikouzhao() {
		return peidaikouzhao;
	}
				
	
	/**
	 * 设置：打卡日期
	 */
	 
	public void setDakariqi(Date dakariqi) {
		this.dakariqi = dakariqi;
	}
	
	/**
	 * 获取：打卡日期
	 */
	public Date getDakariqi() {
		return dakariqi;
	}
			
}
