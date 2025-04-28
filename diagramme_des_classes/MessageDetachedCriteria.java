/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Purchased
 */
package diagramme_des_classes;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MessageDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID_message;
	public final IntegerExpression utilisateurId;
	public final AssociationExpression utilisateur;
	public final IntegerExpression projet_messageId;
	public final AssociationExpression projet_message;
	public final StringExpression contenu;
	public final StringExpression deteEnvoi;
	public final IntegerExpression expediteur;
	public final IntegerExpression projet;
	
	public MessageDetachedCriteria() {
		super(diagramme_des_classes.Message.class, diagramme_des_classes.MessageCriteria.class);
		ID_message = new IntegerExpression("ID_message", this.getDetachedCriteria());
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this.getDetachedCriteria());
		utilisateur = new AssociationExpression("utilisateur", this.getDetachedCriteria());
		projet_messageId = new IntegerExpression("projet_message.ID_projet", this.getDetachedCriteria());
		projet_message = new AssociationExpression("projet_message", this.getDetachedCriteria());
		contenu = new StringExpression("contenu", this.getDetachedCriteria());
		deteEnvoi = new StringExpression("deteEnvoi", this.getDetachedCriteria());
		expediteur = new IntegerExpression("expediteur", this.getDetachedCriteria());
		projet = new IntegerExpression("projet", this.getDetachedCriteria());
	}
	
	public MessageDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagramme_des_classes.MessageCriteria.class);
		ID_message = new IntegerExpression("ID_message", this.getDetachedCriteria());
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this.getDetachedCriteria());
		utilisateur = new AssociationExpression("utilisateur", this.getDetachedCriteria());
		projet_messageId = new IntegerExpression("projet_message.ID_projet", this.getDetachedCriteria());
		projet_message = new AssociationExpression("projet_message", this.getDetachedCriteria());
		contenu = new StringExpression("contenu", this.getDetachedCriteria());
		deteEnvoi = new StringExpression("deteEnvoi", this.getDetachedCriteria());
		expediteur = new IntegerExpression("expediteur", this.getDetachedCriteria());
		projet = new IntegerExpression("projet", this.getDetachedCriteria());
	}
	
	public UtilisateurDetachedCriteria createUtilisateurCriteria() {
		return new UtilisateurDetachedCriteria(createCriteria("utilisateur"));
	}
	
	public ProjetDetachedCriteria createProjet_messageCriteria() {
		return new ProjetDetachedCriteria(createCriteria("projet_message"));
	}
	
	public Message uniqueMessage(PersistentSession session) {
		return (Message) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Message[] listMessage(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Message[]) list.toArray(new Message[list.size()]);
	}
}

