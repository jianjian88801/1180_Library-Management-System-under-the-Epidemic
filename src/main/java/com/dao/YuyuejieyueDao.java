package com.dao;

import com.entity.YuyuejieyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyuejieyueVO;
import com.entity.view.YuyuejieyueView;


/**
 * 预约借阅
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface YuyuejieyueDao extends BaseMapper<YuyuejieyueEntity> {
	
	List<YuyuejieyueVO> selectListVO(@Param("ew") Wrapper<YuyuejieyueEntity> wrapper);
	
	YuyuejieyueVO selectVO(@Param("ew") Wrapper<YuyuejieyueEntity> wrapper);
	
	List<YuyuejieyueView> selectListView(@Param("ew") Wrapper<YuyuejieyueEntity> wrapper);

	List<YuyuejieyueView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuejieyueEntity> wrapper);
	
	YuyuejieyueView selectView(@Param("ew") Wrapper<YuyuejieyueEntity> wrapper);
	
}
