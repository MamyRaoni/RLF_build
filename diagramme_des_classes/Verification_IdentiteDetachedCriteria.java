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

public class Verification_IdentiteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID_verif;
	public final IntegerExpression utilisateur_valId;
	public final AssociationExpression utilisateur_val;
	public final IntegerExpression utilisateur;
	public final IntegerExpression etat;
	
	public Verification_IdentiteDetachedCriteria() {
		super(diagramme_des_classes.Verification_Identite.class, diagramme_des_classes.Verification_IdentiteCriteria.class);
		ID_verif = new IntegerExpression("ID_verif", this.getDetachedCriteria());
		utilisateur_valId = new IntegerExpression("utilisateur_val.ID_user", this.getDetachedCriteria());
		utilisateur_val = new AssociationExpression("utilisateur_val", this.getDetachedCriteria());
		utilisateur = new IntegerExpression("utilisateur", this.getDetachedCriteria());
		etat = new IntegerExpression("etat", this.getDetachedCriteria());
	}
	
	public Verification_IdentiteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagramme_des_classes.Verification_IdentiteCriteria.class);
		ID_verif = new IntegerExpression("ID_verif", this.getDetachedCriteria());
		utilisateur_valId = new IntegerExpression("utilisateur_val.ID_user", this.getDetachedCriteria());
		utilisateur_val = new AssociationExpression("utilisateur_val", this.getDetachedCriteria());
		utilisateur = new IntegerExpression("utilisateur", this.getDetachedCriteria());
		etat = new IntegerExpression("etat", this.getDetachedCriteria());
	}
	
	public UtilisateurDetachedCriteria createUtilisateur_valCriteria() {
		return new UtilisateurDetachedCriteria(createCriteria("utilisateur_val"));
	}
	
	public Verification_Identite uniqueVerification_Identite(PersistentSession session) {
		return (Verification_Identite) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Verification_Identite[] listVerification_Identite(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Verification_Identite[]) list.toArray(new Verification_Identite[list.size()]);
	}
}

