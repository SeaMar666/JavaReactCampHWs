package hw4_coffee;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServisAdapter implements ICustomerCheckService{
	
	 @SuppressWarnings("deprecation")
	public boolean checkIfRealPerson(Customer customer) {
		 
		 
		 KPSPublicSoap client = new KPSPublicSoapProxy();
		 try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.firstName.toUpperCase(), 
					 customer.lastName.toUpperCase(),customer.dateOfBirth.getYear() );
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		 
	 }

}
