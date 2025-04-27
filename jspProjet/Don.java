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
@Table(name="Don")
public class Don implements Serializable {
	public Don() {
	}
	
	public static Don loadDonByORMID(int ID_don) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadDonByORMID(session, ID_don);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(int ID_don) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getDonByORMID(session, ID_don);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByORMID(int ID_don, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadDonByORMID(session, ID_don, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(int ID_don, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getDonByORMID(session, ID_don, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByORMID(PersistentSession session, int ID_don) throws PersistentException {
		try {
			return (Don) session.load(diagramme_des_classes.Don.class, Integer.valueOf(ID_don));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(PersistentSession session, int ID_don) throws PersistentException {
		try {
			return (Don) session.get(diagramme_des_classes.Don.class, Integer.valueOf(ID_don));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByORMID(PersistentSession session, int ID_don, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Don) session.load(diagramme_des_classes.Don.class, Integer.valueOf(ID_don), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don getDonByORMID(PersistentSession session, int ID_don, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Don) session.get(diagramme_des_classes.Don.class, Integer.valueOf(ID_don), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDon(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryDon(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDon(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryDon(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listDonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listDonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDon(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Don as Don");
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
	
	public static List queryDon(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Don as Don");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Don", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDon(session, condition, orderBy);
			return (Don[]) list.toArray(new Don[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don[] listDonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDon(session, condition, orderBy, lockMode);
			return (Don[]) list.toArray(new Don[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadDonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadDonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Don[] dons = listDonByQuery(session, condition, orderBy);
		if (dons != null && dons.length > 0)
			return dons[0];
		else
			return null;
	}
	
	public static Don loadDonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Don[] dons = listDonByQuery(session, condition, orderBy, lockMode);
		if (dons != null && dons.length > 0)
			return dons[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDonByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateDonByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDonByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateDonByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDonByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Don as Don");
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
	
	public static java.util.Iterator iterateDonByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Don as Don");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Don", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Don loadDonByCriteria(DonCriteria donCriteria) {
		Don[] dons = listDonByCriteria(donCriteria);
		if(dons == null || dons.length == 0) {
			return null;
		}
		return dons[0];
	}
	
	public static Don[] listDonByCriteria(DonCriteria donCriteria) {
		return donCriteria.listDon();
	}
	
	public static Don createDon() {
		return new diagramme_des_classes.Don();
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
			if(getProjet_don() != null) {
				getProjet_don().dons.remove(this);
			}
			
			if(getUtilisateur() != null) {
				getUtilisateur().dons.remove(this);
			}
			
			if(getPaiement() != null) {
				getPaiement().setDon_paiement(null);
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
			if(getProjet_don() != null) {
				getProjet_don().dons.remove(this);
			}
			
			if(getUtilisateur() != null) {
				getUtilisateur().dons.remove(this);
			}
			
			if(getPaiement() != null) {
				getPaiement().setDon_paiement(null);
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_DON_UTILISATEUR) {
			this.utilisateur = (diagramme_des_classes.Utilisateur) owner;
		}
		
		else if (key == ORMConstants.KEY_DON_PROJET_DON) {
			this.projet_don = (diagramme_des_classes.Projet) owner;
		}
		
		else if (key == ORMConstants.KEY_DON_PAIEMENT) {
			this.paiement = (diagramme_des_classes.Paiement) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID_don", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMME_DES_CLASSES_DON_ID_DON_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMME_DES_CLASSES_DON_ID_DON_GENERATOR", strategy="native")	
	private int ID_don;
	
	@ManyToOne(targetEntity=diagramme_des_classes.Projet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProjetID_projet", referencedColumnName="ID_projet", nullable=false) }, foreignKey=@ForeignKey(name="don-projet"))	
	private diagramme_des_classes.Projet projet_don;
	
	@ManyToOne(targetEntity=diagramme_des_classes.Utilisateur.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UtilisateurID_user", referencedColumnName="ID_user", nullable=false) }, foreignKey=@ForeignKey(name="FKDon248627"))	
	private diagramme_des_classes.Utilisateur utilisateur;
	
	@Column(name="Montant", nullable=true, length=10)	
	private Integer montant;
	
	@Column(name="`Date`", nullable=true, length=255)	
	private String date;
	
	@Column(name="Contributeur", nullable=true, length=10)	
	private Integer contributeur;
	
	@Column(name="Projet", nullable=true, length=10)	
	private Integer projet;
	
	@OneToOne(mappedBy="don_paiement", targetEntity=diagramme_des_classes.Paiement.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private diagramme_des_classes.Paiement paiement;
	
	private void setID_don(int value) {
		this.ID_don = value;
	}
	
	public int getID_don() {
		return ID_don;
	}
	
	public int getORMID() {
		return getID_don();
	}
	
	public void setMontant(int value) {
		setMontant(Integer.valueOf(value));
	}
	
	public void setMontant(Integer value) {
		this.montant = value;
	}
	
	public Integer getMontant() {
		return montant;
	}
	
	public void setDate(String value) {
		this.date = value;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setContributeur(int value) {
		setContributeur(Integer.valueOf(value));
	}
	
	public void setContributeur(Integer value) {
		this.contributeur = value;
	}
	
	public Integer getContributeur() {
		return contributeur;
	}
	
	public void setProjet(int value) {
		setProjet(Integer.valueOf(value));
	}
	
	public void setProjet(Integer value) {
		this.projet = value;
	}
	
	public Integer getProjet() {
		return projet;
	}
	
	public void setUtilisateur(diagramme_des_classes.Utilisateur value) {
		if (utilisateur != null) {
			utilisateur.dons.remove(this);
		}
		if (value != null) {
			value.dons.add(this);
		}
	}
	
	public diagramme_des_classes.Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Utilisateur(diagramme_des_classes.Utilisateur value) {
		this.utilisateur = value;
	}
	
	private diagramme_des_classes.Utilisateur getORM_Utilisateur() {
		return utilisateur;
	}
	
	public void setProjet_don(diagramme_des_classes.Projet value) {
		if (projet_don != null) {
			projet_don.dons.remove(this);
		}
		if (value != null) {
			value.dons.add(this);
		}
	}
	
	public diagramme_des_classes.Projet getProjet_don() {
		return projet_don;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Projet_don(diagramme_des_classes.Projet value) {
		this.projet_don = value;
	}
	
	private diagramme_des_classes.Projet getORM_Projet_don() {
		return projet_don;
	}
	
	public void setPaiement(diagramme_des_classes.Paiement value) {
		if (this.paiement != value) {
			diagramme_des_classes.Paiement lpaiement = this.paiement;
			this.paiement = value;
			if (value != null) {
				paiement.setDon_paiement(this);
			}
			if (lpaiement != null && lpaiement.getDon_paiement() == this) {
				lpaiement.setDon_paiement(null);
			}
		}
	}
	
	public diagramme_des_classes.Paiement getPaiement() {
		return paiement;
	}
	
	public String toString() {
		return String.valueOf(getID_don());
	}
	
}
