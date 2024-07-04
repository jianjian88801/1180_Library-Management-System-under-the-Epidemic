package com.dao;

import com.entity.JinguanyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinguanyuyueVO;
import com.entity.view.JinguanyuyueView;


/**
 * 进馆预约
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface JinguanyuyueDao extends BaseMapper<JinguanyuyueEntity> {
	
	List<JinguanyuyueVO> selectListVO(@Param("ew") Wrapper<JinguanyuyueEntity> wrapper);
	
	JinguanyuyueVO selectVO(@Param("ew") Wrapper<JinguanyuyueEntity> wrapper);
	
	List<JinguanyuyueView> selectListView(@Param("ew") Wrapper<JinguanyuyueEntity> wrapper);

	List<JinguanyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<JinguanyuyueEntity> wrapper);
	
	JinguanyuyueView selectView(@Param("ew") Wrapper<JinguanyuyueEntity> wrapper);
	
}
