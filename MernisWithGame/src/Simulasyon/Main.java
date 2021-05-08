package Simulasyon;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Player realPlayer = new Player(1, "Deniz" , "Aygün" , new Date(1999,9,6) , "11111111111");
		@SuppressWarnings("deprecation")
		Player fakePlayer = new Player(2,"Ömer" , "Aksu" , new Date(1000,0,0) , "45295851435");
		MernisServisAdaper playerCheckManager = new MernisServisAdaper();
		PlayerManager playerManager = new PlayerManager(playerCheckManager);
		playerManager.registerPlayer(realPlayer);
		playerManager.registerPlayer(fakePlayer);
		
		System.out.println("******************************************************************************");
		
		
		Game game1 = new Game("Sid Meier's Civilization VI" , 300);
		Game game2 = new Game("Gta V " , 300);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		gameManager.addGame(game2);
		
		System.out.println("******************************************************************************");
		
		Campaign campaign = new Campaign("Bahar Ýndirimi" , 30);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		game2.gameWithCampaign(campaign);
		game1.gameWithCampaign(campaign);


	}

}
