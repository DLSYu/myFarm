import java.util.ArrayList;

public class FarmerDetails {
    private ArrayList<Tools> toolList;
    //private ArrayList<Plant> seedList;
    private float objectCoins;
    private FarmerType farmerType;
    private int expPoints;

    public FarmerDetails(){
        Tools wateringCan= new Tools("Watering Can",
                                "placeholderDesc",
                                1,
                                false);
        Tools plow = new Tools("Plow",
                            "placeholderDesc",
                            1,
                            false);
        Tools pickaxe = new Tools("Pickaxe",
                                "placeholderDesc",
                                1,
                                false);
        Tools fertilizer = new Tools("Fertilizer",
                                    "placeholderDesc",
                                    5,
                                    true);
        this.toolList.add(wateringCan);
        this.toolList.add(plow);
        this.toolList.add(pickaxe);
        this.toolList.add(fertilizer);
        this.objectCoins=100;
        this.farmerType = FarmerType.FARMER;
        this.expPoints=0;
    }
}
