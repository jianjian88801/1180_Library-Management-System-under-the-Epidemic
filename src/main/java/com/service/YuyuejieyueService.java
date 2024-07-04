package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyuejieyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyuejieyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyuejieyueView;


/**
 * 预约借阅
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface YuyuejieyueService extends IService<YuyuejieyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuejieyueVO> selectListVO(Wrapper<YuyuejieyueEntity> wrapper);
   	
   	YuyuejieyueVO selectVO(@Param("ew") Wrapper<YuyuejieyueEntity> wrapper);
   	
   	List<YuyuejieyueView> selectListView(Wrapper<YuyuejieyueEntity> wrapper);
   	
   	YuyuejieyueView selectView(@Param("ew") Wrapper<YuyuejieyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuejieyueEntity> wrapper);
   	
}

