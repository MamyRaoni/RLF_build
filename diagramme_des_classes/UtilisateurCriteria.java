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

public class UtilisateurCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID_user;
	public final StringExpression nom;
	public final StringExpression mdp;
	public final StringExpression type;
	public final CollectionExpression projets;
	public final CollectionExpression dons;
	public final CollectionExpression messages;
	public final IntegerExpression verification_IdentiteId;
	public final AssociationExpression verification_Identite;
	
	public UtilisateurCriteria(Criteria criteria) {
		super(criteria);
		ID_user = new IntegerExpression("ID_user", this);
		nom = new StringExpression("nom", this);
		mdp = new StringExpression("mdp", this);
		type = new StringExpression("type", this);
		projets = new CollectionExpression("ORM_projets", this);
		dons = new CollectionExpression("ORM_dons", this);
		messages = new CollectionExpression("ORM_messages", this);
		verification_IdentiteId = new IntegerExpression("verification_Identite.ID_user", this);
		verification_Identite = new AssociationExpression("verification_Identite", this);
	}
	
	public UtilisateurCriteria(PersistentSession session) {
		this(session.createCriteria(Utilisateur.class));
	}
	
	public UtilisateurCriteria() throws PersistentException {
		this(TPRLFPersistentManager.instance().getSession());
	}
	
	public ProjetCriteria createProjetsCriteria() {
		return new ProjetCriteria(createCriteria("ORM_projets"));
	}
	
	public DonCriteria createDonsCriteria() {
		return new DonCriteria(createCriteria("ORM_dons"));
	}
	
	public MessageCriteria createMessagesCriteria() {
		return new MessageCriteria(createCriteria("ORM_messages"));
	}
	
	public Verification_IdentiteCriteria createVerification_IdentiteCriteria() {
		return new Verification_IdentiteCriteria(createCriteria("verification_Identite"));
	}
	
	public Utilisateur uniqueUtilisateur() {
		return (Utilisateur) super.uniqueResult();
	}
	
	public Utilisateur[] listUtilisateur() {
		java.util.List list = super.list();
		return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
	}
}

