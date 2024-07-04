package com.entity.view;

import com.entity.YuyuejieyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 预约借阅
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
@TableName("yuyuejieyue")
public class YuyuejieyueView  extends YuyuejieyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuejieyueView(){
	}
 
 	public YuyuejieyueView(YuyuejieyueEntity yuyuejieyueEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuejieyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
