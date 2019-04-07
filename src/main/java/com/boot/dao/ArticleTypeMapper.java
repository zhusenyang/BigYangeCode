package com.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.entity.ArticleType;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月14日 下午9:34:06 
* 类说明 :
*/
@Mapper
public interface ArticleTypeMapper {
	@Select("select * from article_type")
	public List<ArticleType> getAllType();
	
}
 