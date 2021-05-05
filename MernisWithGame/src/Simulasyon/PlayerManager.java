package Simulasyon;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService checkPlayerService;
	
	
	public PlayerManager(PlayerCheckService checkPlayerService){
		this.checkPlayerService = checkPlayerService;
	}

	
	public void registerPlayer(Player player) 
	{
		
			if (checkPlayerService.checkIfRealPerson(player)) {
				System.out.println(player.getFirstName() + " " + player.getLastName() + 
						" isimli kullanýcýnýn kayýt olma iþlemi baþarýyla gerçekleþti. ");
			}else {
				System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullanýcýnýn kayýt olma iþleminiz gerçekleþmedi.");
			}
			
	}
		
	
	public void uptadePlayerInfo(Player player)
    {
		System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullanýcýnýn bilgileri güncellenmiþtir.");
	}
	
	public void deletePlayer(Player player) 
	{
		System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullanýcýnýn hesabý silinmiþtir.");
	}

}
