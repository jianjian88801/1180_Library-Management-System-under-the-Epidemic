package com.dao;

import com.entity.WenxintishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenxintishiVO;
import com.entity.view.WenxintishiView;


/**
 * 温馨提示
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface WenxintishiDao extends BaseMapper<WenxintishiEntity> {
	
	List<WenxintishiVO> selectListVO(@Param("ew") Wrapper<WenxintishiEntity> wrapper);
	
	WenxintishiVO selectVO(@Param("ew") Wrapper<WenxintishiEntity> wrapper);
	
	List<WenxintishiView> selectListView(@Param("ew") Wrapper<WenxintishiEntity> wrapper);

	List<WenxintishiView> selectListView(Pagination page,@Param("ew") Wrapper<WenxintishiEntity> wrapper);
	
	WenxintishiView selectView(@Param("ew") Wrapper<WenxintishiEntity> wrapper);
	
}
