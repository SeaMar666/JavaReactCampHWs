package hw4_coffee;

public class NeroCustomerManager extends BaseCustomerManager {
	
	 ICustomerCheckService customerCheckService;

	    public NeroCustomerManager(ICustomerCheckService customerCheckService) {
	        this.customerCheckService = customerCheckService;
	    }

	    @Override
	    public void save(Customer customer) throws Exception {
		        
		    if(customerCheckService.checkIfRealPerson(customer)) {
				System.out.println("Valid person.");
				super.save(customer);
			}
		    else
		    {
		    	throw new Exception("Not a valid person.");
		    }


		}


}
