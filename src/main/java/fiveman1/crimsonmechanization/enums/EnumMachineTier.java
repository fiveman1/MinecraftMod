package fiveman1.crimsonmechanization.enums;

import net.minecraft.util.IStringSerializable;

import java.util.Hashtable;

public enum EnumMachineTier implements IStringSerializable {

    CRIMSON(0, "crimson", "Crimson", 20, 100000),
    REFINED(1, "refined", "Refined", 40, 200000),
    IRIDESCENT(3, "iridescent", "Iridescent", 80, 400000)
    ;

    private final int meta;
    private final String name;
    private final String unlocalizedName;
    private final int energyUse;
    private final int capacity;

    public static final EnumMachineTier[] values = values();
    private static final Hashtable<Integer, EnumMachineTier> metaToEnum = new Hashtable<>();
    static {
        for (EnumMachineTier enumMachineTier : values) {
            metaToEnum.put(enumMachineTier.getMetadata(), enumMachineTier);
        }
    }

    EnumMachineTier(int metaIn, String nameIn, String unlocalizedNameIn, int energyUse, int capacity) {
        this.meta = metaIn;
        this.name = nameIn;
        this.unlocalizedName = unlocalizedNameIn;
        this.energyUse = energyUse;
        this.capacity = capacity;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getUnlocalizedName()
    {
        return unlocalizedName;
    }

    public int getMetadata()
    {
        return meta;
    }

    public int getEnergyUse() {
        return energyUse;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxReceive() {
        return energyUse * 6;
    }

    public static EnumMachineTier byMetadata(int meta) {
        EnumMachineTier enumMachineTier = metaToEnum.get(meta);
        return enumMachineTier != null ? enumMachineTier : CRIMSON;
    }
}