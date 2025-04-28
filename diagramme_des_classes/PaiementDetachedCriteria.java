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

public class PaiementDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID_paiement;
	public final IntegerExpression don_paiementId;
	public final AssociationExpression don_paiement;
	public final IntegerExpression don;
	public final StringExpression etat;
	public final StringExpression recuEnvoyé;
	
	public PaiementDetachedCriteria() {
		super(diagramme_des_classes.Paiement.class, diagramme_des_classes.PaiementCriteria.class);
		ID_paiement = new IntegerExpression("ID_paiement", this.getDetachedCriteria());
		don_paiementId = new IntegerExpression("don_paiement.ID_don", this.getDetachedCriteria());
		don_paiement = new AssociationExpression("don_paiement", this.getDetachedCriteria());
		don = new IntegerExpression("don", this.getDetachedCriteria());
		etat = new StringExpression("etat", this.getDetachedCriteria());
		recuEnvoyé = new StringExpression("recuEnvoyé", this.getDetachedCriteria());
	}
	
	public PaiementDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagramme_des_classes.PaiementCriteria.class);
		ID_paiement = new IntegerExpression("ID_paiement", this.getDetachedCriteria());
		don_paiementId = new IntegerExpression("don_paiement.ID_don", this.getDetachedCriteria());
		don_paiement = new AssociationExpression("don_paiement", this.getDetachedCriteria());
		don = new IntegerExpression("don", this.getDetachedCriteria());
		etat = new StringExpression("etat", this.getDetachedCriteria());
		recuEnvoyé = new StringExpression("recuEnvoyé", this.getDetachedCriteria());
	}
	
	public DonDetachedCriteria createDon_paiementCriteria() {
		return new DonDetachedCriteria(createCriteria("don_paiement"));
	}
	
	public Paiement uniquePaiement(PersistentSession session) {
		return (Paiement) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paiement[] listPaiement(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paiement[]) list.toArray(new Paiement[list.size()]);
	}
}

