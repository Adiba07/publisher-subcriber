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



public class PublisherImpl implements Publisher {
	
    @Override
    public void publish(Article art, PubSubService pubSubService) {
        pubSubService.addArticleToQueue(art);
    }
}


