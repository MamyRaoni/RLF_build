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
@Table(name="Message")
public class Message implements Serializable {
	public Message() {
	}
	
	public static Message loadMessageByORMID(int ID_message) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadMessageByORMID(session, ID_message);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message getMessageByORMID(int ID_message) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getMessageByORMID(session, ID_message);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message loadMessageByORMID(int ID_message, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadMessageByORMID(session, ID_message, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message getMessageByORMID(int ID_message, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getMessageByORMID(session, ID_message, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message loadMessageByORMID(PersistentSession session, int ID_message) throws PersistentException {
		try {
			return (Message) session.load(diagramme_des_classes.Message.class, Integer.valueOf(ID_message));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message getMessageByORMID(PersistentSession session, int ID_message) throws PersistentException {
		try {
			return (Message) session.get(diagramme_des_classes.Message.class, Integer.valueOf(ID_message));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message loadMessageByORMID(PersistentSession session, int ID_message, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Message) session.load(diagramme_des_classes.Message.class, Integer.valueOf(ID_message), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message getMessageByORMID(PersistentSession session, int ID_message, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Message) session.get(diagramme_des_classes.Message.class, Integer.valueOf(ID_message), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMessage(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryMessage(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMessage(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryMessage(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message[] listMessageByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listMessageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message[] listMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listMessageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMessage(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Message as Message");
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
	
	public static List queryMessage(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Message as Message");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Message", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message[] listMessageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMessage(session, condition, orderBy);
			return (Message[]) list.toArray(new Message[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message[] listMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMessage(session, condition, orderBy, lockMode);
			return (Message[]) list.toArray(new Message[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message loadMessageByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadMessageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message loadMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadMessageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message loadMessageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Message[] messages = listMessageByQuery(session, condition, orderBy);
		if (messages != null && messages.length > 0)
			return messages[0];
		else
			return null;
	}
	
	public static Message loadMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Message[] messages = listMessageByQuery(session, condition, orderBy, lockMode);
		if (messages != null && messages.length > 0)
			return messages[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMessageByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateMessageByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMessageByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateMessageByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMessageByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Message as Message");
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
	
	public static java.util.Iterator iterateMessageByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Message as Message");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Message", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Message loadMessageByCriteria(MessageCriteria messageCriteria) {
		Message[] messages = listMessageByCriteria(messageCriteria);
		if(messages == null || messages.length == 0) {
			return null;
		}
		return messages[0];
	}
	
	public static Message[] listMessageByCriteria(MessageCriteria messageCriteria) {
		return messageCriteria.listMessage();
	}
	
	public static Message createMessage() {
		return new diagramme_des_classes.Message();
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
				getUtilisateur().messages.remove(this);
			}
			
			if(getProjet_message() != null) {
				getProjet_message().messages.remove(this);
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
				getUtilisateur().messages.remove(this);
			}
			
			if(getProjet_message() != null) {
				getProjet_message().messages.remove(this);
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
		if (key == ORMConstants.KEY_MESSAGE_PROJET_MESSAGE) {
			this.projet_message = (diagramme_des_classes.Projet) owner;
		}
		
		else if (key == ORMConstants.KEY_MESSAGE_UTILISATEUR) {
			this.utilisateur = (diagramme_des_classes.Utilisateur) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID_message", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMME_DES_CLASSES_MESSAGE_ID_MESSAGE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMME_DES_CLASSES_MESSAGE_ID_MESSAGE_GENERATOR", strategy="native")	
	private int ID_message;
	
	@ManyToOne(targetEntity=diagramme_des_classes.Utilisateur.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UtilisateurID_user", referencedColumnName="ID_user", nullable=false) }, foreignKey=@ForeignKey(name="FKMessage210900"))	
	private diagramme_des_classes.Utilisateur utilisateur;
	
	@ManyToOne(targetEntity=diagramme_des_classes.Projet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ProjetID_projet", referencedColumnName="ID_projet", nullable=false) }, foreignKey=@ForeignKey(name="projet-message"))	
	private diagramme_des_classes.Projet projet_message;
	
	@Column(name="Contenu", nullable=true, length=255)	
	private String contenu;
	
	@Column(name="DeteEnvoi", nullable=true, length=255)	
	private String deteEnvoi;
	
	@Column(name="Expediteur", nullable=true, length=10)	
	private Integer expediteur;
	
	@Column(name="Projet", nullable=true, length=10)	
	private Integer projet;
	
	private void setID_message(int value) {
		this.ID_message = value;
	}
	
	public int getID_message() {
		return ID_message;
	}
	
	public int getORMID() {
		return getID_message();
	}
	
	public void setContenu(String value) {
		this.contenu = value;
	}
	
	public String getContenu() {
		return contenu;
	}
	
	public void setDeteEnvoi(String value) {
		this.deteEnvoi = value;
	}
	
	public String getDeteEnvoi() {
		return deteEnvoi;
	}
	
	public void setExpediteur(int value) {
		setExpediteur(Integer.valueOf(value));
	}
	
	public void setExpediteur(Integer value) {
		this.expediteur = value;
	}
	
	public Integer getExpediteur() {
		return expediteur;
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
	
	public void setProjet_message(diagramme_des_classes.Projet value) {
		if (projet_message != null) {
			projet_message.messages.remove(this);
		}
		if (value != null) {
			value.messages.add(this);
		}
	}
	
	public diagramme_des_classes.Projet getProjet_message() {
		return projet_message;
	}
	
	/**
	 * This method is for internal use only.
	 */
	private void setORM_Projet_message(diagramme_des_classes.Projet value) {
		this.projet_message = value;
	}
	
	private diagramme_des_classes.Projet getORM_Projet_message() {
		return projet_message;
	}
	
	public void setUtilisateur(diagramme_des_classes.Utilisateur value) {
		if (utilisateur != null) {
			utilisateur.messages.remove(this);
		}
		if (value != null) {
			value.messages.add(this);
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
	
	public String toString() {
		return String.valueOf(getID_message());
	}
	
}
