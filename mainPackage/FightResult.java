package daryx77.superTextBattleRoyale.mainPackage;
public class FightResult
{
	public Player playerToHit;
	public Player playerHitter;
	public HitStats damageStats;
	public Weapon weaponUsed;
	public int fightStatus;
	public int playersRemaingInFight;
	public Location location;
	public boolean unarmed;
	public FightResult(Player playerToHit, Player playerHitter, HitStats damageStats, Weapon weaponUsed, int fightStatus, Location location) 
	{
		
		this.playerToHit = playerToHit;
		this.playerHitter = playerHitter;
		this.damageStats = damageStats;
		this.weaponUsed = weaponUsed;
		this.fightStatus = fightStatus;
		this.location = location;
	}
}
