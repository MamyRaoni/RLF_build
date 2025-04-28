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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Paiement")
public class Paiement implements Serializable {
	public Paiement() {
	}
	
	public static Paiement loadPaiementByORMID(int ID_paiement) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadPaiementByORMID(session, ID_paiement);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(int ID_paiement) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getPaiementByORMID(session, ID_paiement);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByORMID(int ID_paiement, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadPaiementByORMID(session, ID_paiement, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(int ID_paiement, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getPaiementByORMID(session, ID_paiement, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByORMID(PersistentSession session, int ID_paiement) throws PersistentException {
		try {
			return (Paiement) session.load(diagramme_des_classes.Paiement.class, Integer.valueOf(ID_paiement));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(PersistentSession session, int ID_paiement) throws PersistentException {
		try {
			return (Paiement) session.get(diagramme_des_classes.Paiement.class, Integer.valueOf(ID_paiement));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByORMID(PersistentSession session, int ID_paiement, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paiement) session.load(diagramme_des_classes.Paiement.class, Integer.valueOf(ID_paiement), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement getPaiementByORMID(PersistentSession session, int ID_paiement, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Paiement) session.get(diagramme_des_classes.Paiement.class, Integer.valueOf(ID_paiement), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaiement(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryPaiement(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaiement(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryPaiement(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listPaiementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listPaiementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaiement(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Paiement as Paiement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPaiement(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Paiement as Paiement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paiement", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPaiement(session, condition, orderBy);
			return (Paiement[]) list.toArray(new Paiement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement[] listPaiementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPaiement(session, condition, orderBy, lockMode);
			return (Paiement[]) list.toArray(new Paiement[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadPaiementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadPaiementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Paiement[] paiements = listPaiementByQuery(session, condition, orderBy);
		if (paiements != null && paiements.length > 0)
			return paiements[0];
		else
			return null;
	}
	
	public static Paiement loadPaiementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Paiement[] paiements = listPaiementByQuery(session, condition, orderBy, lockMode);
		if (paiements != null && paiements.length > 0)
			return paiements[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePaiementByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iteratePaiementByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaiementByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iteratePaiementByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaiementByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Paiement as Paiement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePaiementByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Paiement as Paiement");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Paiement", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Paiement loadPaiementByCriteria(PaiementCriteria paiementCriteria) {
		Paiement[] paiements = listPaiementByCriteria(paiementCriteria);
		if(paiements == null || paiements.length == 0) {
			return null;
		}
		return paiements[0];
	}
	
	public static Paiement[] listPaiementByCriteria(PaiementCriteria paiementCriteria) {
		return paiementCriteria.listPaiement();
	}
	
	public static Paiement createPaiement() {
		return new diagramme_des_classes.Paiement();
	}
	
	public boolean save() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getDon_paiement() != null) {
				getDon_paiement().setPaiement(null);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getDon_paiement() != null) {
				getDon_paiement().setPaiement(null);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="ID_paiement", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMME_DES_CLASSES_PAIEMENT_ID_PAIEMENT_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMME_DES_CLASSES_PAIEMENT_ID_PAIEMENT_GENERATOR", strategy="native")	
	private int ID_paiement;
	
	@OneToOne(optional=false, targetEntity=diagramme_des_classes.Don.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="DonID_don", referencedColumnName="ID_don", nullable=false) }, foreignKey=@ForeignKey(name="don-paiement"))	
	private diagramme_des_classes.Don don_paiement;
	
	@Column(name="Don", nullable=true, length=10)	
	private Integer don;
	
	@Column(name="Etat", nullable=true, length=255)	
	private String etat;
	
	@Column(name="RecuEnvoyé", nullable=true, length=255)	
	private String recuEnvoyé;
	
	private void setID_paiement(int value) {
		this.ID_paiement = value;
	}
	
	public int getID_paiement() {
		return ID_paiement;
	}
	
	public int getORMID() {
		return getID_paiement();
	}
	
	public void setDon(int value) {
		setDon(Integer.valueOf(value));
	}
	
	public void setDon(Integer value) {
		this.don = value;
	}
	
	public Integer getDon() {
		return don;
	}
	
	public void setEtat(String value) {
		this.etat = value;
	}
	
	public String getEtat() {
		return etat;
	}
	
	public void setRecuEnvoyé(String value) {
		this.recuEnvoyé = value;
	}
	
	public String getRecuEnvoyé() {
		return recuEnvoyé;
	}
	
	public void setDon_paiement(diagramme_des_classes.Don value) {
		if (this.don_paiement != value) {
			diagramme_des_classes.Don ldon_paiement = this.don_paiement;
			this.don_paiement = value;
			if (value != null) {
				don_paiement.setPaiement(this);
			}
			if (ldon_paiement != null && ldon_paiement.getPaiement() == this) {
				ldon_paiement.setPaiement(null);
			}
		}
	}
	
	public diagramme_des_classes.Don getDon_paiement() {
		return don_paiement;
	}
	
	public String toString() {
		return String.valueOf(getID_paiement());
	}
	
}
