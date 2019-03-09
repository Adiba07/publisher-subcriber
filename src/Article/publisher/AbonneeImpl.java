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

 
public class AbonneeImpl extends Abonnee{
	
    @Override
    public void addAbonne(String topic, PubSubService pubSubService) {
        pubSubService.addAbonne(topic, this);
    }

    @Override
    public void desAbonne(String topic, PubSubService pubSubService) {
                 pubSubService.removeSubscriber(topic, this);   
    }

    @Override
    public void getArticlesPrAbonneDInteret(String topic, PubSubService pubSubService) {
        pubSubService.getArticleForSubscriberOfTopic(topic, this);
    }
}