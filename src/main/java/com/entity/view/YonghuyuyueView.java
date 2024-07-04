package com.entity.view;

import com.entity.YonghuyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
@TableName("yonghuyuyue")
public class YonghuyuyueView  extends YonghuyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuyuyueView(){
	}
 
 	public YonghuyuyueView(YonghuyuyueEntity yonghuyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
