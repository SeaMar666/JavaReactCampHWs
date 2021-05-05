package Simulasyon;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServisAdaper implements PlayerCheckService{
	

	 @SuppressWarnings("deprecation")
	public boolean checkIfRealPerson(Player player) {
		 
		 KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();

			try {
						boolean result=mernisCheck.TCKimlikNoDogrula
								(Long.parseLong(player.getIdentityNumber()), 
										player.getFirstName().toUpperCase(), 
										player.getLastName().toUpperCase(), 
										player.dateOfBirth.getYear());
								return result;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;


   }
}