import greenfoot.*;
public class DataInventory extends Datas
{
    static int numberOfItems;
    static String[] items = new String[4];
    static String[] names = new String[4];
    static int[] itemsNumber = new int[4];
    
    static boolean isPresent;
    
    public static void addItem(String name, int number)
    {
        if(numberOfItems > 0)
        {
            for(int i = 0; i < numberOfItems; i++)
            {
                isPresent = false;
                if(items[i].equals(name))
                {
                    itemsNumber[i] += number;
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent)
            {
                items[numberOfItems] = name;
                itemsNumber[numberOfItems] = number;
                numberOfItems++;
            }
        }
        else
        {
            items[numberOfItems] = name;
            itemsNumber[numberOfItems] = number;
            numberOfItems++;
        }
        
        for(int i = 0; i < items.length; i++)
        {
            if(items[i] == null)
                break;
            switch(items[i])
            {
                case "SuperPotion" : names[i] = "Super Potion";
                    break;
                default : names[i] = items[i];
                    break;
            }
        }
    }
    
    public static void removeItem(String name, int number)
    {
        for(int i = 0; i < numberOfItems; i++)
        {
            isPresent = true;
            if(items[i].equals(name))
            {
                itemsNumber[i] -= number;
                if(itemsNumber[i] == 0)
                    isPresent = false;
            }
            if(!isPresent)
            {
                numberOfItems--;
                items[i] = null;
                names[i] = null;
                for(int j = i; j < (3 - i); j++)
                {
                    itemsNumber[j] = itemsNumber[j + 1];
                    items[j] = items[j + 1];
                    items[j + 1] = null;
                    names[j + 1] = null;
                    itemsNumber[j + 1] = 0;
                }
            }
        }
        
        for(int i = 0; i < items.length; i++)
        {
            if(items[i] == null)
                break;
            switch(items[i])
            {
                case "SuperPotion" : names[i] = "Super Potion";
                    break;
                default : names[i] = items[i];
                    break;
            }
        }
    }
}
