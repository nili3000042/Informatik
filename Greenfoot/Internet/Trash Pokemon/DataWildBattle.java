import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
public class DataWildBattle extends Datas
{
    int playerAttackPriority, enemyAttackPriority;
    
    int attackTime;
    int healTime;
    int turnEndTime;
    int lastTurnEndTime;
    int enemyDieTime;
    int playerDieTime;
    int playerChangeTime;
    
    String nextAttack;
    
    boolean targetIsPlayer;
    boolean firstTurnIsPlayer;
    
    public void act()
    {
        attackTime--;
        healTime--;
        turnEndTime--;
        lastTurnEndTime--;
        playerDieTime--;
        enemyDieTime--;
        playerChangeTime--;
        if(turnEndTime % 75 == 0 && DataPlayer.interactInput() && turnEndTime != 0)
            turnEndTime--;
        else if(turnEndTime % 75 == 0 && turnEndTime != 0)
            turnEndTime++;
        else if(turnEndTime == 0 && DataPlayer.interactInput())
        {
            turnEndTime--;
            ((WorldWildBattle)getWorld()).addMenuButtons();
            if(!getWorld().getObjects(OverlayText.class).isEmpty())
            {
                getWorld().showText("", getWorld().getObjects(OverlayText.class).get(0).getX(), getWorld().getObjects(OverlayText.class).get(0).getY());
                getWorld().removeObject(getWorld().getObjects(OverlayText.class).get(0));
                if(!getWorld().getObjects(OverlayTextTriangle.class).isEmpty())
                    getWorld().removeObject(getWorld().getObjects(OverlayTextTriangle.class).get(0));
            }
            if(DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected] < 1)
            {
                ((WorldWildBattle)getWorld()).addOverlayText(new String[] {"The wild " + DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected] + " fainted !"}, 75);
                enemyDieTime = 74;
                PokemonEnemy pokemonEnemy = getWorld().getObjects(PokemonEnemy.class).get(0);
                pokemonEnemy.setImage((GreenfootImage)null);
                getWorld().showText("", 200, 85);
                getWorld().showText("", 60, 85);
                getWorld().showText("", 470, 316);
                getWorld().showText("", 410, 275);
                getWorld().showText("", 575, 275);
                getWorld().removeObject(getWorld().getObjects(HPEnemy.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPBarEnemy.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPPlayer.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPBarPlayer.class).get(0));
            }
            else if(DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected] < 1 && DataPokemon.numberOfAlivePokemons() < 1)
            {
                ((WorldWildBattle)getWorld()).addOverlayText(new String[] {"Your " + DataPokemon.pokemons[DataPokemon.pokemonSelected] + " fainted !"}, 75);
                playerDieTime = 74;
                PokemonPlayer pokemonPlayer = getWorld().getObjects(PokemonPlayer.class).get(0);
                pokemonPlayer.setImage((GreenfootImage)null);
                getWorld().showText("", 200, 85);
                getWorld().showText("", 60, 85);
                getWorld().showText("", 470, 316);
                getWorld().showText("", 410, 275);
                getWorld().showText("", 575, 275);
                getWorld().removeObject(getWorld().getObjects(HPEnemy.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPBarEnemy.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPPlayer.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPBarPlayer.class).get(0));
            }
            else if(DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected] < 1)
            {
                playerChangeTime = 74;
                PokemonPlayer pokemonPlayer = getWorld().getObjects(PokemonPlayer.class).get(0);
                pokemonPlayer.setImage((GreenfootImage)null);
            }
            else if(firstTurnIsPlayer)
                 getWorld().addObject(new BattleAttack("Enemy" + nextAttack, false, false, null), 300, 250);
            else
                getWorld().addObject(new BattleAttack("Player" + nextAttack, false, true, null), 300, 250);
        }
        else if(turnEndTime == 0)
            turnEndTime++;
        if(lastTurnEndTime % 75 == 0 && DataPlayer.interactInput() && lastTurnEndTime != 0)
            lastTurnEndTime--;
        else if(lastTurnEndTime % 75 == 0 && lastTurnEndTime != 0)
            lastTurnEndTime++;
        else if(lastTurnEndTime == 0 && DataPlayer.interactInput())
        {
            lastTurnEndTime--;
            if(DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected] < 1)
            {
                ((WorldWildBattle)getWorld()).addOverlayText(new String[] {"The wild " + DataWildPokemon.pokemons[DataWildPokemon.pokemonSelected] + " fainted !"}, 75);
                enemyDieTime = 74;
                PokemonEnemy pokemonEnemy = getWorld().getObjects(PokemonEnemy.class).get(0);
                pokemonEnemy.setImage((GreenfootImage)null);
                getWorld().showText("", 200, 85);
                getWorld().showText("", 60, 85);
                getWorld().removeObject(getWorld().getObjects(HPEnemy.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPBarEnemy.class).get(0));
            }
            else if(DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected] < 1 && DataPokemon.numberOfAlivePokemons() < 1)
            {
                ((WorldWildBattle)getWorld()).addOverlayText(new String[] {"Your " + DataPokemon.pokemons[DataPokemon.pokemonSelected] + " fainted !"}, 75);
                playerDieTime = 74;
                PokemonPlayer pokemonPlayer = getWorld().getObjects(PokemonPlayer.class).get(0);
                pokemonPlayer.setImage((GreenfootImage)null);
                getWorld().showText("", 470, 316);
                getWorld().showText("", 410, 275);
                getWorld().showText("", 575, 275);
                getWorld().removeObject(getWorld().getObjects(HPPlayer.class).get(0));
                getWorld().removeObject(getWorld().getObjects(HPBarPlayer.class).get(0));
            }
            else if(DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected] < 1)
            {
                playerChangeTime = 74;
                PokemonPlayer pokemonPlayer = getWorld().getObjects(PokemonPlayer.class).get(0);
                pokemonPlayer.setImage((GreenfootImage)null);
            }
        }
        else if(lastTurnEndTime == 0)
            lastTurnEndTime++;
        
        if(attackTime > 0 && targetIsPlayer && DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected] > 0)
            DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected]--;
        else if(attackTime > 0 && !targetIsPlayer && DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected] > 0)
            DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected]--;
        if(healTime > 0 && !targetIsPlayer && DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected] < DataPokemon.hpStats[DataPokemon.pokemonSelected])
            DataPokemon.hpStatsCurrent[DataPokemon.pokemonSelected]++;
        else if(healTime > 0 && targetIsPlayer && DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected] < DataWildPokemon.hpStats[DataWildPokemon.pokemonSelected])
            DataWildPokemon.hpStatsCurrent[DataWildPokemon.pokemonSelected]++;
        
        if(enemyDieTime == 0 && DataPlayer.interactInput())
        {
            if(!getWorld().getObjects(OverlayText.class).isEmpty())
            {
                getWorld().showText("", getWorld().getObjects(OverlayText.class).get(0).getX(), getWorld().getObjects(OverlayText.class).get(0).getY());
                getWorld().removeObject(getWorld().getObjects(OverlayText.class).get(0));
                if(!getWorld().getObjects(OverlayTextTriangle.class).isEmpty())
                    getWorld().removeObject(getWorld().getObjects(OverlayTextTriangle.class).get(0));
            }
            
            switch(DataPlayer.previousWorld)
            {
                case "WorldRoute113" : getWorld().addObject(new Transition("fade", new WorldRoute113()), 300, 250);
                    if(!getWorld().getObjects(HPPlayer.class).isEmpty())
                        getWorld().removeObject(getWorld().getObjects(HPPlayer.class).get(0));
                    if(!getWorld().getObjects(HPBarPlayer.class).isEmpty())
                        getWorld().removeObject(getWorld().getObjects(HPBarPlayer.class).get(0));
                    getWorld().showText("", 200, 85);
                    getWorld().showText("", 60, 85);
                    getWorld().showText("", 470, 316);
                    getWorld().showText("", 410, 275);
                    getWorld().showText("", 575, 275);
                    break;
            }
        }
        else if(enemyDieTime == 0)
            enemyDieTime++;
        if(playerDieTime == 0 && DataPlayer.interactInput())
        {
            if(!getWorld().getObjects(OverlayText.class).isEmpty())
            {
                getWorld().showText("", getWorld().getObjects(OverlayText.class).get(0).getX(), getWorld().getObjects(OverlayText.class).get(0).getY());
                getWorld().removeObject(getWorld().getObjects(OverlayText.class).get(0));
                if(!getWorld().getObjects(OverlayTextTriangle.class).isEmpty())
                    getWorld().removeObject(getWorld().getObjects(OverlayTextTriangle.class).get(0));
            }
            
            switch(DataPlayer.previousWorld)
            {
                case "WorldRoute113" : getWorld().addObject(new Transition("fadeFaint", new WorldCenterTownTrash()), 300, 250);
                    if(!getWorld().getObjects(HPEnemy.class).isEmpty())
                        getWorld().removeObject(getWorld().getObjects(HPEnemy.class).get(0));
                    if(!getWorld().getObjects(HPBarEnemy.class).isEmpty())
                        getWorld().removeObject(getWorld().getObjects(HPBarEnemy.class).get(0));
                    getWorld().showText("", 200, 85);
                    getWorld().showText("", 60, 85);
                    getWorld().showText("", 470, 316);
                    getWorld().showText("", 410, 275);
                    getWorld().showText("", 575, 275);
                    break;
            }
        }
        else if(playerDieTime == 0)
            playerDieTime++;
    }
    
    public void startTurn(String playerAttackType)
    {
        switch(playerAttackType)
        {
            case "Potion" : 
            case "SuperPotion" : playerAttackPriority = 5;
                break;
            default : playerAttackPriority = 1;
                break;
        }
        
        String enemyAttackType = "";
        switch(Greenfoot.getRandomNumber(DataWildPokemon.numberOfMoves[DataWildPokemon.pokemonSelected]))
        {
            case 0 : enemyAttackType = DataWildPokemon.pokemonMoves1[DataWildPokemon.pokemonSelected];
                break;
            case 1 : enemyAttackType = DataWildPokemon.pokemonMoves2[DataWildPokemon.pokemonSelected];
                break;
            case 2 : enemyAttackType = DataWildPokemon.pokemonMoves3[DataWildPokemon.pokemonSelected];
                break;
            case 3 : enemyAttackType = DataWildPokemon.pokemonMoves4[DataWildPokemon.pokemonSelected];
                break;
        }
        switch(enemyAttackType)
        {
            default : enemyAttackPriority = 1;
                break;
        }
        
        if(playerPlaysFirst())
            getWorld().addObject(new BattleAttack("Player" + playerAttackType, true, true, enemyAttackType), 300, 250);
        else
            getWorld().addObject(new BattleAttack("Enemy" + enemyAttackType, true, false, playerAttackType), 300, 250);
    }
    
    public void failedRun()
    {
        String enemyAttackType = "";
        switch(Greenfoot.getRandomNumber(DataWildPokemon.numberOfMoves[DataWildPokemon.pokemonSelected]))
        {
            case 0 : enemyAttackType = DataWildPokemon.pokemonMoves1[DataWildPokemon.pokemonSelected];
                break;
            case 1 : enemyAttackType = DataWildPokemon.pokemonMoves2[DataWildPokemon.pokemonSelected];
                break;
            case 2 : enemyAttackType = DataWildPokemon.pokemonMoves3[DataWildPokemon.pokemonSelected];
                break;
            case 3 : enemyAttackType = DataWildPokemon.pokemonMoves4[DataWildPokemon.pokemonSelected];
                break;
        }
        getWorld().addObject(new BattleAttack("Enemy" + enemyAttackType, false, false, null), 300, 250);
    }
    
    public void endFirstTurn(BattleAttack attack)
    {
        String[] texts;
        List<String> textsList = new ArrayList<>();

        double efficiency = 1;
        boolean isCritical = false;

        textsList.add(attack.startingText);

        if(attack.isPlayer)
            efficiency = getEfficiency(attack.type, DataWildPokemon.pokemonTypes1[DataWildPokemon.pokemonSelected], DataWildPokemon.pokemonTypes2[DataWildPokemon.pokemonSelected]);
        else
            efficiency = getEfficiency(attack.type, DataPokemon.pokemonTypes1[DataPokemon.pokemonSelected], DataPokemon.pokemonTypes2[DataPokemon.pokemonSelected]);
        
        if(attack.category.equals("Physical") || attack.category.equals("Special"))
        {
            if(efficiency > 1)
                textsList.add("It's super effective !");
            else if(efficiency < 1)
                textsList.add("It's not very effective...");
                
            if(Greenfoot.getRandomNumber(100) < 6)
            {
                textsList.add("Critical hit !");
                isCritical = true;
            }
        }
        else if(attack.category.equals("Status"))
            textsList.add(attack.statusText);
        else if(attack.category.equals("Heal"))
            textsList.add("Your Pokémon regained some health !");

        targetIsPlayer = !attack.isPlayer;

        texts = textsList.toArray(new String[0]);
        turnEndTime = texts.length * 75 - 1;

        ((WorldWildBattle)getWorld()).addOverlayText(texts, 75);

        switch(attack.category)
        {
            case "Physical" :
                if(attack.isPlayer)
                {
                    double damage = ((double)DataPokemon.pokemonLevels[DataPokemon.pokemonSelected] / 5 + 2);
                    damage *= ((double)DataPokemon.attackStatsCurrent[DataPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataWildPokemon.defenseStatsCurrent[DataWildPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataPokemon.pokemonTypes1[DataPokemon.pokemonSelected]) || attack.type.equals(DataPokemon.pokemonTypes2[DataPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                else
                {
                    double damage = ((double)DataWildPokemon.pokemonLevels / 5 + 2);
                    damage *= ((double)DataWildPokemon.attackStatsCurrent[DataWildPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataPokemon.defenseStatsCurrent[DataPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataWildPokemon.pokemonTypes1[DataWildPokemon.pokemonSelected]) || attack.type.equals(DataWildPokemon.pokemonTypes2[DataWildPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                break;
            case "Special" :
                if(attack.isPlayer)
                {
                    double damage = ((double)DataPokemon.pokemonLevels[DataPokemon.pokemonSelected] / 5 + 2);
                    damage *= ((double)DataPokemon.specialAttackStatsCurrent[DataPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataWildPokemon.specialDefenseStatsCurrent[DataWildPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataPokemon.pokemonTypes1[DataPokemon.pokemonSelected]) || attack.type.equals(DataPokemon.pokemonTypes2[DataPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                else
                {
                    double damage = ((double)DataWildPokemon.pokemonLevels / 5 + 2);
                    damage *= ((double)DataWildPokemon.specialAttackStatsCurrent[DataWildPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataPokemon.specialDefenseStatsCurrent[DataPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataWildPokemon.pokemonTypes1[DataWildPokemon.pokemonSelected]) || attack.type.equals(DataWildPokemon.pokemonTypes2[DataWildPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                break;
            case "Heal" :
                double heal = attack.power;
                healTime = (int)heal + 1;
                break;
            case "Status" :
                if(attack.isPlayer)
                    switch(attack.specialEffect)
                    {
                        case "LowerDefense" : DataWildPokemon.defenseStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerAttack" : DataWildPokemon.attackStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialDefense" : DataWildPokemon.specialDefenseStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialAttack" : DataWildPokemon.specialAttackStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpeed" : DataWildPokemon.speedStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseDefense" : DataPokemon.defenseStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseAttack" : DataPokemon.attackStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialDefense" : DataPokemon.specialDefenseStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialAttack" : DataPokemon.specialAttackStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpeed" : DataPokemon.speedStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                    }
                else
                    switch(attack.specialEffect)
                    {
                        case "IncreaseDefense" : DataWildPokemon.defenseStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseAttack" : DataWildPokemon.attackStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialDefense" : DataWildPokemon.specialDefenseStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialAttack" : DataWildPokemon.specialAttackStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpeed" : DataWildPokemon.speedStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerDefense" : DataPokemon.defenseStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerAttack" : DataPokemon.attackStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialDefense" : DataPokemon.specialDefenseStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialAttack" : DataPokemon.specialAttackStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpeed" : DataPokemon.speedStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                    }
                break;
        }
        nextAttack = attack.nextAttack;
        firstTurnIsPlayer = attack.isPlayer;
    }
    
    public void endLastTurn(BattleAttack attack)
    {
        String[] texts;
        List<String> textsList = new ArrayList<>();

        double efficiency = 1;
        boolean isCritical = false;

        textsList.add(attack.startingText);

        if(attack.isPlayer)
            efficiency = getEfficiency(attack.type, DataWildPokemon.pokemonTypes1[DataWildPokemon.pokemonSelected], DataWildPokemon.pokemonTypes2[DataWildPokemon.pokemonSelected]);
        else
            efficiency = getEfficiency(attack.type, DataPokemon.pokemonTypes1[DataPokemon.pokemonSelected], DataPokemon.pokemonTypes2[DataPokemon.pokemonSelected]);
        
        if(attack.category.equals("Physical") || attack.category.equals("Special"))
        {
            if(efficiency > 1)
                textsList.add("It's super effective !");
            else if(efficiency < 1)
                textsList.add("It's not very effective...");
                
            if(Greenfoot.getRandomNumber(100) < 6)
            {
                textsList.add("Critical hit !");
                isCritical = true;
            }
        }
        else if(attack.category.equals("Status"))
            textsList.add(attack.statusText);
        else if(attack.category.equals("Heal"))
            textsList.add("Your Pokémon regained some health !");
        
        targetIsPlayer = !attack.isPlayer;

        texts = textsList.toArray(new String[0]);
        lastTurnEndTime = texts.length * 75 - 1;

        ((WorldWildBattle)getWorld()).addOverlayText(texts, 75);

        switch(attack.category)
        {
            case "Physical" :
                if(attack.isPlayer)
                {
                    double damage = ((double)DataPokemon.pokemonLevels[DataPokemon.pokemonSelected] / 5 + 2);
                    damage *= ((double)DataPokemon.attackStatsCurrent[DataPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataWildPokemon.defenseStatsCurrent[DataWildPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataPokemon.pokemonTypes1[DataPokemon.pokemonSelected]) || attack.type.equals(DataPokemon.pokemonTypes2[DataPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                else
                {
                    double damage = ((double)DataWildPokemon.pokemonLevels / 5 + 2);
                    damage *= ((double)DataWildPokemon.attackStatsCurrent[DataWildPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataPokemon.defenseStatsCurrent[DataPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataWildPokemon.pokemonTypes1[DataWildPokemon.pokemonSelected]) || attack.type.equals(DataWildPokemon.pokemonTypes2[DataWildPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                break;
            case "Special" :
                if(attack.isPlayer)
                {
                    double damage = ((double)DataPokemon.pokemonLevels[DataPokemon.pokemonSelected] / 5 + 2);
                    damage *= ((double)DataPokemon.specialAttackStatsCurrent[DataPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataWildPokemon.specialDefenseStatsCurrent[DataWildPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataPokemon.pokemonTypes1[DataPokemon.pokemonSelected]) || attack.type.equals(DataPokemon.pokemonTypes2[DataPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                else
                {
                    double damage = ((double)DataWildPokemon.pokemonLevels / 5 + 2);
                    damage *= ((double)DataWildPokemon.specialAttackStatsCurrent[DataWildPokemon.pokemonSelected] * attack.power);
                    damage /= (double)DataPokemon.specialDefenseStatsCurrent[DataPokemon.pokemonSelected];
                    damage /= 50;
                    damage += 2;
                    if(isCritical)
                        damage *= 2;
                    if(attack.type.equals(DataWildPokemon.pokemonTypes1[DataPokemon.pokemonSelected]) || attack.type.equals(DataWildPokemon.pokemonTypes2[DataWildPokemon.pokemonSelected]))
                        damage *= 1.5;
                    damage *= efficiency;
                    damage *= (Greenfoot.getRandomNumber(38) + 217);
                    damage /= 255;
                    attackTime = (int)damage + 1;
                }
                break;
            case "Heal" :
                double heal = attack.power;
                healTime = (int)heal + 1;
                break;
            case "Status" :
                if(attack.isPlayer)
                    switch(attack.specialEffect)
                    {
                        case "LowerDefense" : DataWildPokemon.defenseStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerAttack" : DataWildPokemon.attackStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialDefense" : DataWildPokemon.specialDefenseStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialAttack" : DataWildPokemon.specialAttackStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpeed" : DataWildPokemon.speedStatsCurrent[DataWildPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseDefense" : DataPokemon.defenseStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseAttack" : DataPokemon.attackStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialDefense" : DataPokemon.specialDefenseStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialAttack" : DataPokemon.specialAttackStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpeed" : DataPokemon.speedStatsCurrent[DataPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                    }
                else
                    switch(attack.specialEffect)
                    {
                        case "IncreaseDefense" : DataWildPokemon.defenseStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseAttack" : DataWildPokemon.attackStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialDefense" : DataWildPokemon.specialDefenseStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpecialAttack" : DataWildPokemon.specialAttackStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "IncreaseSpeed" : DataWildPokemon.speedStatsCurrent[DataWildPokemon.pokemonSelected] /= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerDefense" : DataPokemon.defenseStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerAttack" : DataPokemon.attackStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialDefense" : DataPokemon.specialDefenseStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpecialAttack" : DataPokemon.specialAttackStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                        case "LowerSpeed" : DataPokemon.speedStatsCurrent[DataPokemon.pokemonSelected] *= (1.0 - ((double)attack.power / 100.0));
                            break;
                    }
                break;
        }
    }
    
    public boolean playerPlaysFirst()
    {
        if(playerAttackPriority > enemyAttackPriority)
            return true;
        else if(playerAttackPriority == enemyAttackPriority && Greenfoot.getRandomNumber(2) == 0)
            return true;
        else if(DataPokemon.speedStatsCurrent[DataPokemon.pokemonSelected] > DataWildPokemon.speedStatsCurrent[DataWildPokemon.pokemonSelected])
            return true;
        else if(DataPokemon.speedStatsCurrent[DataPokemon.pokemonSelected] == DataWildPokemon.speedStatsCurrent[DataWildPokemon.pokemonSelected] && Greenfoot.getRandomNumber(2) == 0)
            return true;
        return false;
    }
    
    public double getEfficiency(String attackType, String enemyType1, String enemyType2)
    {
        double efficiency = 1;
        if(attackType != null)
            switch(attackType)
            {
                case "Fire" : 
                    switch(enemyType1)
                    {
                        case "Fire" :
                        case "Water" :
                        case "Rock" : efficiency /= 2;
                            break;
                        case "Bug" : 
                        case "Grass" : efficiency *= 2;
                            break;
                    }
                    if(enemyType2 != null)
                        switch(enemyType2)
                        {
                            case "Fire" :
                            case "Water" :
                            case "Rock" : efficiency /= 2;
                                break;
                            case "Bug" : 
                            case "Grass" : efficiency *= 2;
                                break;
                        }
                    break;
                case "Ground" :
                    switch(enemyType1)
                    {
                        case "Fire" : 
                        case "Rock" : efficiency *= 2;
                            break;
                        case "Bug" : 
                        case "Grass" : efficiency /= 2;
                            break;
                    }
                    if(enemyType2!= null)
                        switch(enemyType2)
                        {
                            case "Fire" : 
                            case "Rock" : efficiency *= 2;
                                break;
                            case "Bug" : 
                            case "Grass" : efficiency /= 2;
                                break;
                        }
                case "Fighting" : 
                    switch(enemyType1)
                    {
                        case "Bug" : efficiency /= 2;
                            break;
                        case "Rock" : efficiency *= 2;
                            break;
                    }
                    if(enemyType2 != null)
                        switch(enemyType2)
                        {
                            case "Bug" : efficiency /= 2;
                                break;
                            case "Rock" : efficiency *= 2;
                                break;
                        }
                    break;
                case "Normal" : 
                    switch(enemyType1)
                    {
                        case "Rock" : efficiency /= 2;
                            break;
                    }
                    if(enemyType2 != null)
                        switch(enemyType2)
                        {
                            case "Rock" : efficiency *= 2;
                                break;
                        }
                    break;
                case "Rock" : 
                    switch(enemyType1)
                    {
                        case "Bug" : 
                        case "Fire" : efficiency *= 2;
                            break;
                        case "Ground" : efficiency /= 2;
                            break;
                    }
                    if(enemyType2 != null)
                        switch(enemyType2)
                        {
                            case "Bug" : 
                            case "Rock" : efficiency *= 2;
                                break;
                            case "Ground" : efficiency /= 2;
                                break;
                        }
                    break;
                case "Grass" : 
                    switch(enemyType1)
                    {
                        case "Rock" : 
                        case "Water" : efficiency *= 2;
                            break;
                        case "Ground" : 
                        case "Grass" : 
                        case "Bug" : 
                        case "Fire" : efficiency /= 2;
                            break;
                    }
                    if(enemyType2 != null)
                        switch(enemyType2)
                        {
                            case "Rock" : 
                            case "Water" : efficiency *= 2;
                                break;
                            case "Ground" : 
                            case "Grass" : 
                            case "Bug" : 
                            case "Fire" : efficiency /= 2;
                                break;
                        }
                case "Water" : 
                    switch(enemyType1)
                    {
                        case "Rock" : 
                        case "Ground" : 
                        case "Fire" : efficiency *= 2;
                            break;
                        case "Water" : 
                        case "Grass" : efficiency /= 2;
                            break;
                    }
                    if(enemyType2 != null)
                        switch(enemyType2)
                        {
                            case "Rock" : 
                            case "Ground" : 
                            case "Fire" : efficiency *= 2;
                                break;
                            case "Grass" :  
                            case "Water" : efficiency /= 2;
                                break;
                        }
                case "Bug" :
                    switch(enemyType1)
                    {
                        case "Grass" : efficiency *= 2;
                            break;
                        case "Fire" : 
                        case "Fighting" : efficiency /= 2;
                            break;
                    }
                    if(enemyType2 != null)
                        switch(enemyType2)
                        {
                            case "Grass" : efficiency *= 2;
                                break; 
                            case "Fire" : 
                            case "Fighting" : efficiency /= 2;
                                break;
                        }
            }
        return efficiency;
    }
}
