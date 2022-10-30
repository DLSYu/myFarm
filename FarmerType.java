public enum FarmerType {
    FARMER("Farmer", 0, 0, 0, 0, 0),
    REGISTERED_FARMER("Registered Farmer", 10, 2, 0, 0.05f, 200),
    DISTINGUISHED_FARMER("Distinguished Farmer", 15, 3, 1, 0.1f, 250),
    HONORABLE_FARMER("Honorable Farmer", 20, 5, 2, 0.15f, 350);

    private final String title;
    private final int reqLevel;
    private final int transacBonus;
    private final int farmingBonus;
    private final float harvestTimeBonus;
    private final float registerFee;

    FarmerType(String title,
               int reqLevel,
               int transacBonus,
               int farmingBonus,
               float harvestTimeBonus,
               float registerFee){
        this.title = title;
        this.reqLevel = reqLevel;
        this.transacBonus = transacBonus;
        this.farmingBonus = farmingBonus;
        this.harvestTimeBonus = harvestTimeBonus;
        this.registerFee = registerFee;
    }

    public String getTitle() {
        return title;
    }

    public int getReqLevel() {
        return reqLevel;
    }

    public int getTransacBonus() {
        return transacBonus;
    }

    public int getFarmingBonus() {
        return farmingBonus;
    }

    public float getHarvestTimeBonus() {
        return harvestTimeBonus;
    }

    public float getRegisterFee() {
        return registerFee;
    }
}
