package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuyueguihaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuyueguihaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueguihaiView;


/**
 * 预约归还
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface YuyueguihaiService extends IService<YuyueguihaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueguihaiVO> selectListVO(Wrapper<YuyueguihaiEntity> wrapper);
   	
   	YuyueguihaiVO selectVO(@Param("ew") Wrapper<YuyueguihaiEntity> wrapper);
   	
   	List<YuyueguihaiView> selectListView(Wrapper<YuyueguihaiEntity> wrapper);
   	
   	YuyueguihaiView selectView(@Param("ew") Wrapper<YuyueguihaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueguihaiEntity> wrapper);
   	
}

