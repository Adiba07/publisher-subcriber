/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Article.publisher;

/**
 *
 * @author Adiba
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import java.util.Map;
import java.util.Queue;
import java.util.Set;

 
public class PubSubService {
	 
	Map<String, Set<Abonnee>> subscribersTopicMap = new HashMap<String, Set<Abonnee>>();
 
	
	Queue<Article> articlesQueue = new LinkedList<Article>();
 
	
	public void addArticleToQueue(Article art){
		articlesQueue.add(art);
	}
 

	public void addAbonne(String topic, Abonnee subscriber){
 
		if(subscribersTopicMap.containsKey(topic)){
			Set<Abonnee> subscribers = subscribersTopicMap.get(topic);
			subscribers.add(subscriber);
			subscribersTopicMap.put(topic, subscribers);
		}else{
			Set<Abonnee> subscribers = new HashSet<Abonnee>();
			subscribers.add(subscriber);
			subscribersTopicMap.put(topic, subscribers);
		}		
	}
 
	
	public void removeSubscriber(String topic, Abonnee subscriber){
 
		if(subscribersTopicMap.containsKey(topic)){
			Set<Abonnee> subscribers = subscribersTopicMap.get(topic);
			subscribers.remove(subscriber);
			subscribersTopicMap.put(topic, subscribers);
		}
	}
 
	
	public void broadcast(){
		if(articlesQueue.isEmpty()){
			System.out.println("No messages from publishers to display");
		}else{
			while(!articlesQueue.isEmpty()){
				Article art = articlesQueue.remove();
				String topic = art.getTopic();
 
				Set<Abonnee> subscribersOfTopic = subscribersTopicMap.get(topic);
 
				for(Abonnee subscriber : subscribersOfTopic){
				
					ArrayList<Article> abonneArticle = subscriber.getArticleAbonne();
					abonneArticle.add(art);
					subscriber.setAbonneArticles(abonneArticle);
				}			
			}
		}
	}
 
	
	public void getArticleForSubscriberOfTopic(String topic, Abonnee subscriber) {
		if(articlesQueue.isEmpty()){
			System.out.println("No messages from publishers to display");
		}else{
			while(!articlesQueue.isEmpty()){
				Article art = articlesQueue.remove();
 
				if(art.getTopic().equalsIgnoreCase(topic)){
 
					Set<Abonnee> subscribersOfTopic = subscribersTopicMap.get(topic);
 
					for(Abonnee _subscriber : subscribersOfTopic){
						if(_subscriber.equals(subscriber)){
							
							ArrayList<Article> abonneArticle = subscriber.getArticleAbonne();
							abonneArticle.add(art);
							subscriber.setAbonneArticles(abonneArticle);
						}
					}
				}
			}
		}
	}
 
}