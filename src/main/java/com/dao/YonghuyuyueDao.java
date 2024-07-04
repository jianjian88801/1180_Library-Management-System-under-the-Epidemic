package com.dao;

import com.entity.YonghuyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuyuyueVO;
import com.entity.view.YonghuyuyueView;


/**
 * 用户预约
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface YonghuyuyueDao extends BaseMapper<YonghuyuyueEntity> {
	
	List<YonghuyuyueVO> selectListVO(@Param("ew") Wrapper<YonghuyuyueEntity> wrapper);
	
	YonghuyuyueVO selectVO(@Param("ew") Wrapper<YonghuyuyueEntity> wrapper);
	
	List<YonghuyuyueView> selectListView(@Param("ew") Wrapper<YonghuyuyueEntity> wrapper);

	List<YonghuyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuyuyueEntity> wrapper);
	
	YonghuyuyueView selectView(@Param("ew") Wrapper<YonghuyuyueEntity> wrapper);
	
}
