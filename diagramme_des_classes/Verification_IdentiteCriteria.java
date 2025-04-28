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

public class Verification_IdentiteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID_verif;
	public final IntegerExpression utilisateur_valId;
	public final AssociationExpression utilisateur_val;
	public final IntegerExpression utilisateur;
	public final IntegerExpression etat;
	
	public Verification_IdentiteCriteria(Criteria criteria) {
		super(criteria);
		ID_verif = new IntegerExpression("ID_verif", this);
		utilisateur_valId = new IntegerExpression("utilisateur_val.ID_user", this);
		utilisateur_val = new AssociationExpression("utilisateur_val", this);
		utilisateur = new IntegerExpression("utilisateur", this);
		etat = new IntegerExpression("etat", this);
	}
	
	public Verification_IdentiteCriteria(PersistentSession session) {
		this(session.createCriteria(Verification_Identite.class));
	}
	
	public Verification_IdentiteCriteria() throws PersistentException {
		this(TPRLFPersistentManager.instance().getSession());
	}
	
	public UtilisateurCriteria createUtilisateur_valCriteria() {
		return new UtilisateurCriteria(createCriteria("utilisateur_val"));
	}
	
	public Verification_Identite uniqueVerification_Identite() {
		return (Verification_Identite) super.uniqueResult();
	}
	
	public Verification_Identite[] listVerification_Identite() {
		java.util.List list = super.list();
		return (Verification_Identite[]) list.toArray(new Verification_Identite[list.size()]);
	}
}

