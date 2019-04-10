package com.boot.entity;

import java.util.ArrayList;
import java.util.List;



/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月14日 下午3:55:56 
* 类说明 :
*/
public class ArticleType {
	
	private int id;
	private String type_content;
	private int farther_type_id;
	private List<ArticleChildType> childrenType;
	private String link;
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<ArticleChildType> getChildrenType() {
		return childrenType;
	}
	public void setChildrenType(ArticleType childrenTypes) {
		if (null==childrenType) {
			childrenType=new ArrayList<ArticleChildType>();
		}
		ArticleChildType act =ArticleChildType.toArticleType(childrenTypes);
		this.childrenType.add(act);
	}
	public int getFarther_type_id() {
		return farther_type_id;
	}
	public void setFarther_type_id(int farther_type_id) {
		this.farther_type_id = farther_type_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType_content() {
		return type_content;
	}
	public void setType_content(String type_content) {
		this.type_content = type_content;
	}
	
	public static void  analyzeListType(List<ArticleType> list){
		List<ArticleType> delType = new ArrayList<ArticleType>();
		for (ArticleType articleType : list) {
			int i =articleType.getId();
			for (ArticleType articleType2 : list) {
				int j =articleType2.getFarther_type_id();
				if (i==j) {
					articleType.setChildrenType(articleType2);
					delType.add(articleType2);
				}
			}
		}
		list.removeAll(delType);
	}
	@Override
	public String toString() {
		return "ArticleType [id=" + id + ", type_content=" + type_content + ", farther_type_id=" + farther_type_id
				+ ", childrenType=" + childrenType + ", link=" + link + "]";
	}
	
}
 