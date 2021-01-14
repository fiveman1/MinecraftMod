package fiveman1.crimsonmechanization.inventory.container;

import fiveman1.crimsonmechanization.inventory.slot.SlotOutput;
import fiveman1.crimsonmechanization.tile.TileAlloyer;
import net.minecraft.inventory.IInventory;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerAlloyer extends ContainerMachine{

    public ContainerAlloyer(IInventory playerInventory, TileAlloyer tileEntity, int xOffsetInventory, int yOffsetInventory) {
        super(playerInventory, tileEntity, xOffsetInventory, yOffsetInventory);
    }
    @Override
    protected void addSlots() {
        IItemHandler itemHandler = te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
        addSlotToContainer(new SlotItemHandler(itemHandler, 0, 22, 34));
        addSlotToContainer(new SlotItemHandler(itemHandler, 1, 46, 34));
        addSlotToContainer(new SlotOutput(itemHandler, 2, 116, 34));
    }

    /*@Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack currentItemStack = slot.getStack();
            itemstack = currentItemStack.copy();

            if (index < TileAlloyer.SIZE) {
                if (!this.mergeItemStack(currentItemStack, TileAlloyer.SIZE, inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(currentItemStack, itemstack);
            } else if (!this.mergeItemStack(currentItemStack, 0, 1, false)) {
                return ItemStack.EMPTY;
            }
            if (currentItemStack.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
            slot.onTake(playerIn, currentItemStack);
        }

        return itemstack;
    }*/
}
