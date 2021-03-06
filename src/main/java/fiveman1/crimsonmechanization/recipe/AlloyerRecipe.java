package fiveman1.crimsonmechanization.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.List;

public class AlloyerRecipe extends BaseRecipe {

    protected AlloyerRecipe(ResourceLocation recipeID, List<Ingredient> inputItems, List<ItemStack> outputItems, List<Integer> outputChances, int energy) {
        super(recipeID, inputItems, outputItems, outputChances, energy);
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return RecipeSerializerRegistration.ALLOYER_SERIALIZER;
    }

    @Override
    public IRecipeType<?> getType() {
        return RecipeTypeRegistration.ALLOYER_RECIPE_TYPE;
    }
}
