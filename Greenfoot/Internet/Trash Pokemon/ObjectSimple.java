import greenfoot.*;
    public class ObjectSimple extends Objects
    {
        public ObjectSimple(String name)
        {
            setImage("Objects/Simple/" + name + ".png");
            switch(name)
            {
                case "CenterLeft" :
                case "CenterRight" :
                case "HouseRedLeft" :
                case "HouseRedRight" :
                    center = 72;
                    break;
                case "Tree" :
                    center = 52;
                    break;
                case "TreeBottom" :
                case "TableHouse" :
                    center = 28;
                    break;
                case "Bookshelf" : 
                case "PotPlant" : 
                    center = 25;
                    break;
                case "TableCenter" : 
                    center = 23;
                    break;
                case "SinkHouse" :
                case "WallBackCenter" :
                case "WallBackHouseRed" :
                    center = 20;
                    break;
                case "WallBackLeftCenter" :
                case "WallBackRightCenter" :
                case "BarrierEndVertical" :
                    center = 10;
                    break;
                case "BarrierStartHorizontal" :
                case "BarrierEndHorizontal" :
                    center = 2;
                    break;
        }
    }
    
    public void act()
    {
        checkPlayer();
    }
}
