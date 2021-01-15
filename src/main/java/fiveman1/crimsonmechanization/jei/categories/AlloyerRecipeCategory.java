package fiveman1.crimsonmechanization.jei.categories;

import fiveman1.crimsonmechanization.CrimsonMechanization;
import fiveman1.crimsonmechanization.jei.JEIPluginCrimsonMechanization;
import fiveman1.crimsonmechanization.jei.wrappers.BaseEnergyRecipeWrapper;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.*;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class AlloyerRecipeCategory implements IRecipeCategory<BaseEnergyRecipeWrapper> {

    private final IDrawable background;
    private final IDrawable progressBar;

    public AlloyerRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation location = new ResourceLocation(CrimsonMechanization.MODID, "textures/gui/crimson_alloyer.png");

        background = guiHelper.createDrawable(location, 14, 22, 129, 39);
        IDrawableStatic arrow = guiHelper.createDrawable(location, 176, 0, 23, 16);
        progressBar = guiHelper.createAnimatedDrawable(arrow, 80, IDrawableAnimated.StartDirection.LEFT, false);
    }

    @Override
    public String getUid() {
        return JEIPluginCrimsonMechanization.ALLOYER_ID;
    }

    @Override
    public String getTitle() {
        return I18n.format("category." + CrimsonMechanization.MODID + ".alloyer");
    }

    @Override
    public void drawExtras(Minecraft minecraft) {
        progressBar.draw(minecraft, 61, 13);
    }

    @Override
    public String getModName() {
        return CrimsonMechanization.NAME;
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, BaseEnergyRecipeWrapper recipeWrapper, IIngredients ingredients) {
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
        guiItemStacks.init(0, true, 7, 11);
        guiItemStacks.init(1, true, 31, 11);
        guiItemStacks.init(2, false, 101, 11);
        guiItemStacks.set(ingredients);
    }
}