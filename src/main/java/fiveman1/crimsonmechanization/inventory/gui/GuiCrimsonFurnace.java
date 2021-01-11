package fiveman1.crimsonmechanization.inventory.gui;

import fiveman1.crimsonmechanization.inventory.container.ContainerCrimsonFurnace;
import fiveman1.crimsonmechanization.tile.TileCrimsonFurnace;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiCrimsonFurnace extends GuiMachine {

    private final TileCrimsonFurnace te;

    public GuiCrimsonFurnace(TileCrimsonFurnace te, ContainerCrimsonFurnace container, InventoryPlayer playerInv, String name, int width, int height) {
        super(container, playerInv, name, width, height);
        this.te = te;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        super.drawGuiContainerBackgroundLayer(partialTicks, mouseX, mouseY);
        drawProgressBar(te.getField(0), te.MAX_PROGRESS);
        drawEnergyBar(te.getField(1), te.getField(2));
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        if (isMouseOverEnergyBar(mouseX, mouseY)) {
            drawHoveringText(te.getField(1) + " RF", mouseX, mouseY);
        }
    }
}
