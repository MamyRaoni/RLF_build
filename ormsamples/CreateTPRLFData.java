/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateTPRLFData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = diagramme_des_classes.TPRLFPersistentManager.instance().getSession().beginTransaction();
		try {
			diagramme_des_classes.Utilisateur ldiagramme_des_classesUtilisateur = diagramme_des_classes.Utilisateur.createUtilisateur();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : verification_Identite, messages, dons, projets
			ldiagramme_des_classesUtilisateur.save();
			diagramme_des_classes.Projet ldiagramme_des_classesProjet = diagramme_des_classes.Projet.createProjet();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : dons, messages, utilisateur
			ldiagramme_des_classesProjet.save();
			diagramme_des_classes.Message ldiagramme_des_classesMessage = diagramme_des_classes.Message.createMessage();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : projet_message, utilisateur
			ldiagramme_des_classesMessage.save();
			diagramme_des_classes.Paiement ldiagramme_des_classesPaiement = diagramme_des_classes.Paiement.createPaiement();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : don_paiement
			ldiagramme_des_classesPaiement.save();
			diagramme_des_classes.Verification_Identite ldiagramme_des_classesVerification_Identite = diagramme_des_classes.Verification_Identite.createVerification_Identite();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : utilisateur_val
			ldiagramme_des_classesVerification_Identite.save();
			diagramme_des_classes.Don ldiagramme_des_classesDon = diagramme_des_classes.Don.createDon();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : paiement, utilisateur, projet_don
			ldiagramme_des_classesDon.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateTPRLFData createTPRLFData = new CreateTPRLFData();
			try {
				createTPRLFData.createTestData();
			}
			finally {
				diagramme_des_classes.TPRLFPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
