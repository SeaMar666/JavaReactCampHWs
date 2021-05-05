package Simulasyon;

public interface GameService {
	
	void sellGame(Game game ,Player player);
	void sellWithCampaign(Game game , Campaign campaign);
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
	

}
