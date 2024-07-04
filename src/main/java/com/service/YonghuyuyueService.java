package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuyuyueView;


/**
 * 用户预约
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface YonghuyuyueService extends IService<YonghuyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuyuyueVO> selectListVO(Wrapper<YonghuyuyueEntity> wrapper);
   	
   	YonghuyuyueVO selectVO(@Param("ew") Wrapper<YonghuyuyueEntity> wrapper);
   	
   	List<YonghuyuyueView> selectListView(Wrapper<YonghuyuyueEntity> wrapper);
   	
   	YonghuyuyueView selectView(@Param("ew") Wrapper<YonghuyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuyuyueEntity> wrapper);
   	
}

