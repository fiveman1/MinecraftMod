package fiveman1.crimsonmechanization.items;

import fiveman1.crimsonmechanization.items.tools.ItemCrimsonPickaxe;
import net.minecraft.item.Item;

public class ModItems {

    public static Item itemCrimsonCrystal;
    public static Item itemCrimsonPickaxe;

    public static void init() {
        itemCrimsonCrystal = new ItemCrimsonCrystal("crimson_crystal");
        itemCrimsonPickaxe = new ItemCrimsonPickaxe("crimson_pickaxe");
    }
}
