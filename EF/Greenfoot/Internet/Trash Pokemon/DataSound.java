import greenfoot.*;
public class DataSound extends Datas
{
    static GreenfootSound[] musics = 
    {
        new GreenfootSound("Music/WorldPokemonCenter.mp3"),
        new GreenfootSound("Music/WorldRoute113.mp3"),
        new GreenfootSound("Music/TitleScreen.mp3"),
        new GreenfootSound("Music/WorldTrashTown.mp3"),
        new GreenfootSound("Music/WorldWildBattle.mp3"),
        new GreenfootSound("Music/Blank.mp3"),
    };
    static GreenfootSound[] sounds =
    {
        new GreenfootSound("MenuChoose.mp3"),
        new GreenfootSound("PokeballLaunch.mp3"),
        new GreenfootSound("BattleRun.mp3"),
        new GreenfootSound("CursorMove.mp3"),
    };
    static GreenfootSound[] attacks =
    {
        new GreenfootSound("Attacks/Potion.mp3"),
        new GreenfootSound("Attacks/Tackle.mp3"),
        new GreenfootSound("Attacks/Flamethrower.mp3"),
        new GreenfootSound("Attacks/Ember.mp3"),
        new GreenfootSound("Attacks/Low Sweep.mp3"),
        new GreenfootSound("Attacks/Rock Tomb.mp3"),
        new GreenfootSound("Attacks/Razor Leaf.mp3"),
        new GreenfootSound("Attacks/Water Gun.mp3"),
    };
    
    static GreenfootSound music;
    
    static int musicVolume = 40;
    static int soundVolume = 40;
    
    public void act()
    {
        for(int i = 0; i < musics.length; i++)
            musics[i].setVolume(musicVolume);
        for(int i = 0; i < sounds.length; i++)
            sounds[i].setVolume(soundVolume);
        for(int i = 0; i < attacks.length; i++)
            attacks[i].setVolume(soundVolume);
        if(music != null)
            music.setVolume(musicVolume);
        playMusic();
    }
    
    public void playMusic()
    {
        String world = getWorld().getClass().getName();
        switch(world)
        {
            case "WorldCenterTownTrash" : music = musics[0];
                break;
            case "WorldRoute113" : music = musics[1];
                break;
            case "WorldMenuScreen" : music = musics[2];
                break;
            case "WorldTownTrash" : music = musics[3];
                break;
            case "WorldWildBattle" : music = musics[4];
                break;
            case "WorldMenuMain" : music = musics[5];
                break;
            default : music = null;
                break;
        }
        if(music != null && !music.isPlaying() && getWorld().getObjects(Transition.class).isEmpty())
        {
            stopMusics();
            music.play();
        }
    }
    
    public void stopMusics()
    {
        for(int i = 0; i < musics.length; i++)
            musics[i].stop();
    }
}
