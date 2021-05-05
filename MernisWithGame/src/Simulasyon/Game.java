package Simulasyon;

public class Game  {

    private String gameName;
    private double price;
  

    public Game(){

    }
    public Game(String gameName, double price) {
        this.gameName = gameName;
        this.price = price;
 
    }


    public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    public double gameWithCampaign(Campaign campaign) {
    	double newprice = this.price - (this.price*campaign.getDiscount()/100);
    	System.out.println(gameName + "isimli oyunun indirimli fiyatý " + " ----> " + newprice);
    	return price;
    }


}
