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
						" isimli kullanıcının kayıt olma işlemi başarıyla gerçekleşti. ");
			}else {
				System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullanıcının kayıt olma işleminiz gerçekleşmedi.");
			}
			
	}
		
	
	public void uptadePlayerInfo(Player player)
    {
		System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullanıcının bilgileri güncellenmiştir.");
	}
	
	public void deletePlayer(Player player) 
	{
		System.out.println(player.getFirstName() + " " +player.getLastName() + " isimli kullanıcının hesabı silinmiştir.");
	}

}
