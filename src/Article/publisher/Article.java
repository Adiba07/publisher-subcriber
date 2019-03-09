/*
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package Article.publisher;

import java.io.Serializable;

/**
 *
 * @author Adiba
 */

 
public class Article implements Serializable{	
	private String topic;
	private String payload;
	
	public Article(){}	
	public Article(String topic, String payload) {
		this.topic = topic;
		this.payload = payload;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
}