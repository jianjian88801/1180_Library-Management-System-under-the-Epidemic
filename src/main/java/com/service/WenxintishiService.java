package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenxintishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenxintishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenxintishiView;


/**
 * 温馨提示
 *
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface WenxintishiService extends IService<WenxintishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenxintishiVO> selectListVO(Wrapper<WenxintishiEntity> wrapper);
   	
   	WenxintishiVO selectVO(@Param("ew") Wrapper<WenxintishiEntity> wrapper);
   	
   	List<WenxintishiView> selectListView(Wrapper<WenxintishiEntity> wrapper);
   	
   	WenxintishiView selectView(@Param("ew") Wrapper<WenxintishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenxintishiEntity> wrapper);
   	
}

