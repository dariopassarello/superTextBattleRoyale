package daryx77.superTextBattleRoyale.mainPackage;

public abstract class Event
{
	
	private Players players[]; 
	
	public abstract void onStartEvent();
	
	public abstract void onTickEvent();
	
	public abstract void onEndEvent();
}
