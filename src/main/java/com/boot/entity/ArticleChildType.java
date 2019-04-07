package com.boot.entity; 
/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月14日 下午10:53:52 
* 类说明 :
*/
public class ArticleChildType extends ArticleType {
	private int id;
	private String type_content;
	private int farther_type_id;
	private String link;
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
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
	public int getFarther_type_id() {
		return farther_type_id;
	}
	public void setFarther_type_id(int farther_type_id) {
		this.farther_type_id = farther_type_id;
	}
	public static ArticleChildType toArticleType(ArticleType articleType){
		ArticleChildType act = new ArticleChildType();
		act.setId(articleType.getId());
		act.setType_content(articleType.getType_content());
		act.setFarther_type_id(articleType.getFarther_type_id());
		act.setLink(articleType.getLink());
		return act;
	}
	@Override
	public String toString() {
		return "ArticleChildType [id=" + id + ", type_content=" + type_content + ", farther_type_id=" + farther_type_id
				+ ", link=" + link + "]";
	}
	
	
}
 