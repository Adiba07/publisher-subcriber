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

public abstract class Abonnee {	
	
	private ArrayList <Article> AbonneArticles = new ArrayList<Article>();
	
	public ArrayList<Article> getArticleAbonne() {
		return AbonneArticles;
	}
	public void setAbonneArticles(ArrayList<Article> AbonneArticle) {
		this.AbonneArticles = AbonneArticles;
	}
	

	public abstract void addAbonne(String topic, PubSubService pubSubService);
	
	
	public abstract void desAbonne(String topic, PubSubService pubSubService);
	
	public abstract void getArticlesPrAbonneDInteret(String topic, PubSubService pubSubService);
	

	public void printArticle(){
		for(Article art : AbonneArticles){
			System.out.println("Article  : " + art.getPayload());
		}
	}
}