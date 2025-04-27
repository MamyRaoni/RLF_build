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
@Table(name="Projet")
public class Projet implements Serializable {
	public Projet() {
	}
	
	public static Projet loadProjetByORMID(int ID_projet) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadProjetByORMID(session, ID_projet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet getProjetByORMID(int ID_projet) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getProjetByORMID(session, ID_projet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet loadProjetByORMID(int ID_projet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadProjetByORMID(session, ID_projet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet getProjetByORMID(int ID_projet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getProjetByORMID(session, ID_projet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet loadProjetByORMID(PersistentSession session, int ID_projet) throws PersistentException {
		try {
			return (Projet) session.load(diagramme_des_classes.Projet.class, Integer.valueOf(ID_projet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet getProjetByORMID(PersistentSession session, int ID_projet) throws PersistentException {
		try {
			return (Projet) session.get(diagramme_des_classes.Projet.class, Integer.valueOf(ID_projet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet loadProjetByORMID(PersistentSession session, int ID_projet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projet) session.load(diagramme_des_classes.Projet.class, Integer.valueOf(ID_projet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet getProjetByORMID(PersistentSession session, int ID_projet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projet) session.get(diagramme_des_classes.Projet.class, Integer.valueOf(ID_projet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjet(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryProjet(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjet(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryProjet(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet[] listProjetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listProjetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet[] listProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listProjetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryProjet(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Projet as Projet");
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
	
	public static List queryProjet(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Projet as Projet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Projet", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryProjet(session, condition, orderBy);
			return (Projet[]) list.toArray(new Projet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet[] listProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryProjet(session, condition, orderBy, lockMode);
			return (Projet[]) list.toArray(new Projet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet loadProjetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadProjetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet loadProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadProjetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Projet[] projets = listProjetByQuery(session, condition, orderBy);
		if (projets != null && projets.length > 0)
			return projets[0];
		else
			return null;
	}
	
	public static Projet loadProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Projet[] projets = listProjetByQuery(session, condition, orderBy, lockMode);
		if (projets != null && projets.length > 0)
			return projets[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProjetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateProjetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateProjetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Projet as Projet");
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
	
	public static java.util.Iterator iterateProjetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Projet as Projet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Projet", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projet loadProjetByCriteria(ProjetCriteria projetCriteria) {
		Projet[] projets = listProjetByCriteria(projetCriteria);
		if(projets == null || projets.length == 0) {
			return null;
		}
		return projets[0];
	}
	
	public static Projet[] listProjetByCriteria(ProjetCriteria projetCriteria) {
		return projetCriteria.listProjet();
	}
	
	public static Projet createProjet() {
		return new diagramme_des_classes.Projet();
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
			if(getUtilisateur() != null) {
				getUtilisateur().projets.remove(this);
			}
			
			diagramme_des_classes.Message[] lMessagess = messages.toArray();
			for(int i = 0; i < lMessagess.length; i++) {
				lMessagess[i].setProjet_message(null);
			}
			diagramme_des_classes.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setProjet_don(null);
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
			if(getUtilisateur() != null) {
				getUtilisateur().projets.remove(this);
			}
			
			diagramme_des_classes.Message[] lMessagess = messages.toArray();
			for(int i = 0; i < lMessagess.length; i++) {
				lMessagess[i].setProjet_message(null);
			}
			diagramme_des_classes.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setProjet_don(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PROJET_MESSAGES) {
			return ORM_messages;
		}
		else if (key == ORMConstants.KEY_PROJET_DONS) {
			return ORM_dons;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PROJET_UTILISATEUR) {
			this.utilisateur = (diagramme_des_classes.Utilisateur) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID_projet", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMME_DES_CLASSES_PROJET_ID_PROJET_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMME_DES_CLASSES_PROJET_ID_PROJET_GENERATOR", strategy="native")	
	private int ID_projet;
	
	@ManyToOne(targetEntity=diagramme_des_classes.Utilisateur.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UtilisateurID_user", referencedColumnName="ID_user", nullable=false) }, foreignKey=@ForeignKey(name="pprojet-user"))	
	private diagramme_des_classes.Utilisateur utilisateur;
	
	@Column(name="Titre", nullable=true, length=255)	
	private String titre;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@Column(name="ObjectifMontant", nullable=true, length=10)	
	private Integer objectifMontant;
	
	@Column(name="MontantActuel", nullable=true, length=10)	
	private Integer montantActuel;
	
	@Column(name="DateDebut", nullable=true, length=255)	
	private String dateDebut;
	
	@Column(name="DateFin", nullable=true, length=255)	
	private String dateFin;
	
	@Column(name="Statut", nullable=true, length=255)	
	private String statut;
	
	@OneToMany(mappedBy="projet_message", targetEntity=diagramme_des_classes.Message.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_messages = new java.util.HashSet();
	
	@OneToMany(mappedBy="projet_don", targetEntity=diagramme_des_classes.Don.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_dons = new java.util.HashSet();
	
	private void setID_projet(int value) {
		this.ID_projet = value;
	}
	
	public int getID_projet() {
		return ID_projet;
	}
	
	public int getORMID() {
		return getID_projet();
	}
	
	public void setTitre(String value) {
		this.titre = value;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setObjectifMontant(int value) {
		setObjectifMontant(Integer.valueOf(value));
	}
	
	public void setObjectifMontant(Integer value) {
		this.objectifMontant = value;
	}
	
	public Integer getObjectifMontant() {
		return objectifMontant;
	}
	
	public void setMontantActuel(int value) {
		setMontantActuel(Integer.valueOf(value));
	}
	
	public void setMontantActuel(Integer value) {
		this.montantActuel = value;
	}
	
	public Integer getMontantActuel() {
		return montantActuel;
	}
	
	public void setDateDebut(String value) {
		this.dateDebut = value;
	}
	
	public String getDateDebut() {
		return dateDebut;
	}
	
	public void setDateFin(String value) {
		this.dateFin = value;
	}
	
	public String getDateFin() {
		return dateFin;
	}
	
	public void setStatut(String value) {
		this.statut = value;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setUtilisateur(diagramme_des_classes.Utilisateur value) {
		if (utilisateur != null) {
			utilisateur.projets.remove(this);
		}
		if (value != null) {
			value.projets.add(this);
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
	
	private void setORM_Messages(java.util.Set value) {
		this.ORM_messages = value;
	}
	
	private java.util.Set getORM_Messages() {
		return ORM_messages;
	}
	
	@Transient	
	public final diagramme_des_classes.MessageSetCollection messages = new diagramme_des_classes.MessageSetCollection(this, _ormAdapter, ORMConstants.KEY_PROJET_MESSAGES, ORMConstants.KEY_MESSAGE_PROJET_MESSAGE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Dons(java.util.Set value) {
		this.ORM_dons = value;
	}
	
	private java.util.Set getORM_Dons() {
		return ORM_dons;
	}
	
	@Transient	
	public final diagramme_des_classes.DonSetCollection dons = new diagramme_des_classes.DonSetCollection(this, _ormAdapter, ORMConstants.KEY_PROJET_DONS, ORMConstants.KEY_DON_PROJET_DON, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID_projet());
	}
	
}
