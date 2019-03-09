/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Article.publisher;

/**
 *
 * @author Adiba
 * 
 */
public class ClassMain {
	
      public static void main(String[] args) {
            
            
		
		 
		Publisher sportPublisher = new PublisherImpl();
		Publisher politiqPublisher = new PublisherImpl();
		
		AbonneeImpl sportSubscriber = new AbonneeImpl();
	
		AbonneeImpl politiqSubscriber = new AbonneeImpl();
		
		PubSubService pubSubService = new PubSubService();
                PublisherImpl p= new PublisherImpl();
		
		Article sportMsg1 = new Article("Sport", " qui parle sur le sport");
		Article sportMsg2 = new Article("Sport", "qui parle sur le sport");
		Article sportMsg3 = new Article("Sport", "qui parle sur le sport");
		
		p.publish(sportMsg1, pubSubService);
		p.publish(sportMsg2, pubSubService);
		p.publish(sportMsg3, pubSubService);
		
		Article politiqMsg1 = new Article("Poli", "qui parle sur la politique");
		Article politiqMsg2 = new Article("Poli", "qui parle sur la politique");
		
		p.publish(politiqMsg1, pubSubService);
		p.publish(politiqMsg2, pubSubService);
		
		
		sportSubscriber.addAbonne("Sport",pubSubService);		
		politiqSubscriber.addAbonne("Poli",pubSubService);   
	
                
                pubSubService.broadcast();
		
		
		System.out.println("Articles of Sport Subscriber are: ");
		sportSubscriber.printArticle();
		
		System.out.println("\n Articles of Politique Subscriber are: ");
                politiqSubscriber.printArticle();
	
                
                
                
                
                
                
                Article ecoMsg4 = new Article("Sport", "qui parle sur le sport");
		Article ecoMsg5 = new Article("Sport", "qui parle sur le sport");
		
		p.publish(ecoMsg4, pubSubService);
		p.publish(ecoMsg5, pubSubService);
		
		sportSubscriber.getArticlesPrAbonneDInteret("Sport", pubSubService);
                
                
                
	//	System.out.println("\n Articles of eco Subscriber now are: ");
	//	politiqSubscriber.printArticle();		
	}
}