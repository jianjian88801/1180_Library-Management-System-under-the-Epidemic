package com.dao;

import com.entity.YuyueguihaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuyueguihaiVO;
import com.entity.view.YuyueguihaiView;


/**
 * 预约归还
 * 
 * @author 
 * @email 
 * @date 2021-05-16 10:32:37
 */
public interface YuyueguihaiDao extends BaseMapper<YuyueguihaiEntity> {
	
	List<YuyueguihaiVO> selectListVO(@Param("ew") Wrapper<YuyueguihaiEntity> wrapper);
	
	YuyueguihaiVO selectVO(@Param("ew") Wrapper<YuyueguihaiEntity> wrapper);
	
	List<YuyueguihaiView> selectListView(@Param("ew") Wrapper<YuyueguihaiEntity> wrapper);

	List<YuyueguihaiView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueguihaiEntity> wrapper);
	
	YuyueguihaiView selectView(@Param("ew") Wrapper<YuyueguihaiEntity> wrapper);
	
}
