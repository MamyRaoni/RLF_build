/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteTPRLFData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = diagramme_des_classes.TPRLFPersistentManager.instance().getSession().beginTransaction();
		try {
			diagramme_des_classes.Utilisateur ldiagramme_des_classesUtilisateur = diagramme_des_classes.Utilisateur.loadUtilisateurByQuery(null, null);
			ldiagramme_des_classesUtilisateur.delete();
			diagramme_des_classes.Projet ldiagramme_des_classesProjet = diagramme_des_classes.Projet.loadProjetByQuery(null, null);
			ldiagramme_des_classesProjet.delete();
			diagramme_des_classes.Message ldiagramme_des_classesMessage = diagramme_des_classes.Message.loadMessageByQuery(null, null);
			ldiagramme_des_classesMessage.delete();
			diagramme_des_classes.Paiement ldiagramme_des_classesPaiement = diagramme_des_classes.Paiement.loadPaiementByQuery(null, null);
			ldiagramme_des_classesPaiement.delete();
			diagramme_des_classes.Verification_Identite ldiagramme_des_classesVerification_Identite = diagramme_des_classes.Verification_Identite.loadVerification_IdentiteByQuery(null, null);
			ldiagramme_des_classesVerification_Identite.delete();
			diagramme_des_classes.Don ldiagramme_des_classesDon = diagramme_des_classes.Don.loadDonByQuery(null, null);
			ldiagramme_des_classesDon.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteTPRLFData deleteTPRLFData = new DeleteTPRLFData();
			try {
				deleteTPRLFData.deleteTestData();
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
