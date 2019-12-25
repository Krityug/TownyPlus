package net.hypexmc.menus;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.Menu;
import org.mineacademy.fo.menu.button.Button;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

public class HammerShop extends Menu {

    private final Button Smelting;

    public HammerShop() {
        setSize(45);
        setTitle("&8Hammer Shop");

        Smelting = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {
                new SmeltingMenu().displayTo(player);
            }

            @Override
            public ItemStack getItem() {

                ItemStack SmeltingLayout = ItemCreator.of(CompMaterial.COBWEB,"&AHammer Shop","")
                        .build().make();

                return SmeltingLayout;
            }
        };
    }

    @Override
    public ItemStack getItemAt(int slot) {

        if(slot == 10)
            Smelting.getItem();

        return null;
    }

    @Override
    protected String[] getInfo() {
        return null;
    }

    class SmeltingMenu extends Menu {

        public SmeltingMenu() {
            super(HammerShop.this);
            setSize(45);
            setTitle("&8Smelting Menu");
        }

        @Override
        protected String[] getInfo() {
            return null;
        }
    }
}
