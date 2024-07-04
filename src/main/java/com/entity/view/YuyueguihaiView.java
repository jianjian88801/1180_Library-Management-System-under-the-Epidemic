package com.entity.view;

import com.entity.YuyueguihaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约归还
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
@TableName("yuyueguihai")
public class YuyueguihaiView  extends YuyueguihaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyueguihaiView(){
	}
 
 	public YuyueguihaiView(YuyueguihaiEntity yuyueguihaiEntity){
 	try {
			BeanUtils.copyProperties(this, yuyueguihaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
