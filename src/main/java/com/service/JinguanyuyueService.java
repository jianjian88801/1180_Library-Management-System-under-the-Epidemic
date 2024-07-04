package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinguanyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinguanyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinguanyuyueView;


/**
 * 进馆预约
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface JinguanyuyueService extends IService<JinguanyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinguanyuyueVO> selectListVO(Wrapper<JinguanyuyueEntity> wrapper);
   	
   	JinguanyuyueVO selectVO(@Param("ew") Wrapper<JinguanyuyueEntity> wrapper);
   	
   	List<JinguanyuyueView> selectListView(Wrapper<JinguanyuyueEntity> wrapper);
   	
   	JinguanyuyueView selectView(@Param("ew") Wrapper<JinguanyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinguanyuyueEntity> wrapper);
   	
}

