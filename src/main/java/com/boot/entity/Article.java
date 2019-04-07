package com.boot.entity; 
import java.util.Date;
/** 
* @author 作者 竺森洋: 
* @version 创建时间：2019年3月14日 下午3:49:43 
* 类说明 :
*/
public class Article {
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", publish_time=" + publish_time
				+ ", type_id=" + type_id + ", article_type=" + article_type + ", last_edtion_time=" + last_edtion_time
				+ "]";
	}
	private int id;
	private String title;
	private String content;
	private Date publish_time;
	private int type_id;
	private String article_type;
	private Date last_edtion_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(Date publish_time) {
		this.publish_time = publish_time;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getArticle_type() {
		return article_type;
	}
	public void setArticle_type(String article_type) {
		this.article_type = article_type;
	}
	public Date getLast_edtion_time() {
		return last_edtion_time;
	}
	public void setLast_edtion_time(Date last_edtion_time) {
		this.last_edtion_time = last_edtion_time;
	}
	
	
}
 