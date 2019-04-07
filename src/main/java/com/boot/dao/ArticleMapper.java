package com.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.boot.entity.Article;

/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月14日 下午8:10:31 
* 类说明 :
*/
@Mapper
public interface ArticleMapper {
	
	@Select("select * from article")
	public List<Article> getAllArticle();
	
	@Insert("insert into article(title,content,type_id,publish_time) values(#{title},#{content},#{type_id},#{publish_time})")
	public int addArticle(Article article);
	
}
 