package com.entity.model;

import com.entity.YonghuyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public class YonghuyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图书馆名称
	 */
	
	private String tushuguanmingcheng;
		
	/**
	 * 进馆日期
	 */
	
	private String jinguanriqi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 人数
	 */
	
	private String renshu;
		
	/**
	 * 到达时间
	 */
	
	private String daodashijian;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
				
	
	/**
	 * 设置：图书馆名称
	 */
	 
	public void setTushuguanmingcheng(String tushuguanmingcheng) {
		this.tushuguanmingcheng = tushuguanmingcheng;
	}
	
	/**
	 * 获取：图书馆名称
	 */
	public String getTushuguanmingcheng() {
		return tushuguanmingcheng;
	}
				
	
	/**
	 * 设置：进馆日期
	 */
	 
	public void setJinguanriqi(String jinguanriqi) {
		this.jinguanriqi = jinguanriqi;
	}
	
	/**
	 * 获取：进馆日期
	 */
	public String getJinguanriqi() {
		return jinguanriqi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
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
	 * 设置：人数
	 */
	 
	public void setRenshu(String renshu) {
		this.renshu = renshu;
	}
	
	/**
	 * 获取：人数
	 */
	public String getRenshu() {
		return renshu;
	}
				
	
	/**
	 * 设置：到达时间
	 */
	 
	public void setDaodashijian(String daodashijian) {
		this.daodashijian = daodashijian;
	}
	
	/**
	 * 获取：到达时间
	 */
	public String getDaodashijian() {
		return daodashijian;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
			
}
