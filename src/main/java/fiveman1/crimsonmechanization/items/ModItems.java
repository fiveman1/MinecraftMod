package fiveman1.crimsonmechanization.items;

import fiveman1.crimsonmechanization.CrimsonMechanization;
import fiveman1.crimsonmechanization.enums.EnumToolMaterial;
import fiveman1.crimsonmechanization.items.armor.ItemArmorBase;
import fiveman1.crimsonmechanization.items.materials.*;
import fiveman1.crimsonmechanization.items.tools.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

    public static ItemDust itemDust;
    public static ItemGem itemGem;
    public static ItemIngot itemIngot;
    public static ItemNugget itemNugget;
    public static ItemPlate itemPlate;

    // TOOLS
    // Crimson Tools
    public static ItemPickaxeBase itemCrimsonPickaxe;
    public static ItemSpadeBase itemCrimsonSpade;
    public static ItemAxeBase itemCrimsonAxe;
    public static ItemHoeBase itemCrimsonHoe;
    public static ItemSwordBase itemCrimsonSword;

    // Crimson Iron Tools
    public static ItemPickaxeBase itemCrimsonIronPickaxe;
    public static ItemSpadeBase itemCrimsonIronSpade;
    public static ItemAxeBase itemCrimsonIronAxe;
    public static ItemHoeBase itemCrimsonIronHoe;
    public static ItemSwordBase itemCrimsonIronSword;

    // Crimson Steel Tools
    public static ItemPickaxeBase itemCrimsonSteelPickaxe;
    public static ItemSpadeBase itemCrimsonSteelSpade;
    public static ItemAxeBase itemCrimsonSteelAxe;
    public static ItemHoeBase itemCrimsonSteelHoe;
    public static ItemSwordBase itemCrimsonSteelSword;

    // Iridescent Tools
    public static ItemPickaxeBase itemIridescentPickaxe;
    public static ItemSpadeBase itemIridescentSpade;
    public static ItemAxeBase itemIridescentAxe;
    public static ItemHoeBase itemIridescentHoe;
    public static ItemSwordBase itemIridescentSword;

    // ARMOR
    // Crimson Armor
    public static final ItemArmor.ArmorMaterial CRIMSON_MODEL_MATERIAL = EnumHelper.addArmorMaterial("crimson_model",
            CrimsonMechanization.MODID + ":crimson_model", 100, new int[] {7,8,8,9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC
                , 2.0f);
    public static ItemArmorBase crimson_helmet;
    public static ItemArmorBase crimson_chestplate;
    public static ItemArmorBase crimson_leggings;
    public static ItemArmorBase crimson_boots;

    // Crimson Iron Armor
    public static final ItemArmor.ArmorMaterial CRIMSON_IRON_MODEL_MATERIAL = EnumHelper.addArmorMaterial("crimsonIron_model",
            CrimsonMechanization.MODID + ":crimsonIron_model", 100, new int[] {7,8,8,9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC
            , 2.0f);
    public static ItemArmorBase crimsonIron_helmet;
    public static ItemArmorBase crimsonIron_chestplate;
    public static ItemArmorBase crimsonIron_leggings;
    public static ItemArmorBase crimsonIron_boots;

    // Crimson Steel Armor
    public static final ItemArmor.ArmorMaterial CRIMSON_STEEL_MODEL_MATERIAL = EnumHelper.addArmorMaterial("crimsonSteel_model",
            CrimsonMechanization.MODID + ":crimsonSteel_model", 100, new int[] {7,8,8,9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC
            , 2.0f);
    public static ItemArmorBase crimsonSteel_helmet;
    public static ItemArmorBase crimsonSteel_chestplate;
    public static ItemArmorBase crimsonSteel_leggings;
    public static ItemArmorBase crimsonSteel_boots;

    // Iridescent Armor
    public static final ItemArmor.ArmorMaterial IRIDESCENT_MODEL_MATERIAL = EnumHelper.addArmorMaterial("iridescent_model",
            CrimsonMechanization.MODID + ":iridescent_model", 100, new int[] {7,8,8,9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC
            , 2.0f);
    public static ItemArmorBase iridescent_helmet;
    public static ItemArmorBase iridescent_chestplate;
    public static ItemArmorBase iridescent_leggings;
    public static ItemArmorBase iridescent_boots;


    public static void init() {
        itemDust = new ItemDust("dust");
        itemGem = new ItemGem("gem");
        itemIngot = new ItemIngot("ingot");
        itemNugget = new ItemNugget("nugget");
        itemPlate = new ItemPlate("plate");

        // TOOLS
        itemCrimsonPickaxe = new ItemPickaxeBase(EnumToolMaterial.CRIMSON);
        itemCrimsonSpade = new ItemSpadeBase(EnumToolMaterial.CRIMSON);
        itemCrimsonAxe = new ItemAxeBase(EnumToolMaterial.CRIMSON);
        itemCrimsonHoe = new ItemHoeBase(EnumToolMaterial.CRIMSON);
        itemCrimsonSword = new ItemSwordBase(EnumToolMaterial.CRIMSON);

        itemCrimsonIronPickaxe = new ItemPickaxeBase(EnumToolMaterial.CRIMSON_IRON);
        itemCrimsonIronSpade = new ItemSpadeBase(EnumToolMaterial.CRIMSON_IRON);
        itemCrimsonIronAxe = new ItemAxeBase(EnumToolMaterial.CRIMSON_IRON);
        itemCrimsonIronHoe = new ItemHoeBase(EnumToolMaterial.CRIMSON_IRON);
        itemCrimsonIronSword = new ItemSwordBase(EnumToolMaterial.CRIMSON_IRON);

        itemCrimsonSteelPickaxe = new ItemPickaxeBase(EnumToolMaterial.CRIMSON_STEEL);
        itemCrimsonSteelSpade = new ItemSpadeBase(EnumToolMaterial.CRIMSON_STEEL);
        itemCrimsonSteelAxe = new ItemAxeBase(EnumToolMaterial.CRIMSON_STEEL);
        itemCrimsonSteelHoe = new ItemHoeBase(EnumToolMaterial.CRIMSON_STEEL);
        itemCrimsonSteelSword = new ItemSwordBase(EnumToolMaterial.CRIMSON_STEEL);

        itemIridescentPickaxe = new ItemPickaxeBase(EnumToolMaterial.IRIDESCENT);
        itemIridescentSpade = new ItemSpadeBase(EnumToolMaterial.IRIDESCENT);
        itemIridescentAxe = new ItemAxeBase(EnumToolMaterial.IRIDESCENT);
        itemIridescentHoe = new ItemHoeBase(EnumToolMaterial.IRIDESCENT);
        itemIridescentSword = new ItemSwordBase(EnumToolMaterial.IRIDESCENT);

        // ARMOR
        crimson_helmet = new ItemArmorBase("crimson_helmet", EntityEquipmentSlot.HEAD);
        crimson_chestplate = new ItemArmorBase("crimson_chestplate", EntityEquipmentSlot.CHEST);
        crimson_leggings = new ItemArmorBase("crimson_leggings", EntityEquipmentSlot.LEGS);
        crimson_boots = new ItemArmorBase("crimson_boots", EntityEquipmentSlot.FEET);

        crimsonIron_helmet = new ItemArmorBase("crimsonIron_helmet", EntityEquipmentSlot.HEAD);
        crimsonIron_chestplate = new ItemArmorBase("crimsonIron_chestplate", EntityEquipmentSlot.CHEST);
        crimsonIron_leggings = new ItemArmorBase("crimsonIron_leggings", EntityEquipmentSlot.LEGS);
        crimsonIron_boots = new ItemArmorBase("crimsonIron_boots", EntityEquipmentSlot.FEET);

        crimsonSteel_helmet = new ItemArmorBase("crimsonSteel_helmet", EntityEquipmentSlot.HEAD);
        crimsonSteel_chestplate = new ItemArmorBase("crimsonSteel_chestplate", EntityEquipmentSlot.CHEST);
        crimsonSteel_leggings = new ItemArmorBase("crimsonSteel_leggings", EntityEquipmentSlot.LEGS);
        crimsonSteel_boots = new ItemArmorBase("crimsonSteel_boots", EntityEquipmentSlot.FEET);

        iridescent_helmet = new ItemArmorBase("iridescent_helmet", EntityEquipmentSlot.HEAD);
        iridescent_chestplate = new ItemArmorBase("iridescent_chestplate", EntityEquipmentSlot.CHEST);
        iridescent_leggings = new ItemArmorBase("iridescent_leggings", EntityEquipmentSlot.LEGS);
        iridescent_boots = new ItemArmorBase("iridescent_boots", EntityEquipmentSlot.FEET);
    }
}
