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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class MessageCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID_message;
	public final IntegerExpression utilisateurId;
	public final AssociationExpression utilisateur;
	public final IntegerExpression projet_messageId;
	public final AssociationExpression projet_message;
	public final StringExpression contenu;
	public final StringExpression deteEnvoi;
	public final IntegerExpression expediteur;
	public final IntegerExpression projet;
	
	public MessageCriteria(Criteria criteria) {
		super(criteria);
		ID_message = new IntegerExpression("ID_message", this);
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this);
		utilisateur = new AssociationExpression("utilisateur", this);
		projet_messageId = new IntegerExpression("projet_message.ID_projet", this);
		projet_message = new AssociationExpression("projet_message", this);
		contenu = new StringExpression("contenu", this);
		deteEnvoi = new StringExpression("deteEnvoi", this);
		expediteur = new IntegerExpression("expediteur", this);
		projet = new IntegerExpression("projet", this);
	}
	
	public MessageCriteria(PersistentSession session) {
		this(session.createCriteria(Message.class));
	}
	
	public MessageCriteria() throws PersistentException {
		this(TPRLFPersistentManager.instance().getSession());
	}
	
	public UtilisateurCriteria createUtilisateurCriteria() {
		return new UtilisateurCriteria(createCriteria("utilisateur"));
	}
	
	public ProjetCriteria createProjet_messageCriteria() {
		return new ProjetCriteria(createCriteria("projet_message"));
	}
	
	public Message uniqueMessage() {
		return (Message) super.uniqueResult();
	}
	
	public Message[] listMessage() {
		java.util.List list = super.list();
		return (Message[]) list.toArray(new Message[list.size()]);
	}
}

