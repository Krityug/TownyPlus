package net.hypexmc.menus;


import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.Menu;
import org.mineacademy.fo.menu.button.Button;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

public class SettingsMenu extends Menu {

    private final Button ChatSettings,HouseSettings,CLOSE;

    public SettingsMenu() {
    super(null);
        setSize(54);
        setTitle("&8Towny Settings Panel");

        CLOSE = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {
                player.closeInventory();
            }

            @Override
            public ItemStack getItem() {

                ItemStack CloseLayout = ItemCreator.of(CompMaterial.ARROW,"&C&LCLOSE").build().make();

                return CloseLayout;
            }
        };

        HouseSettings = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {
            new HouseSettingsMenu().displayTo(player);
            }

            @Override
            public ItemStack getItem() {

                ItemStack HouseSettingsLayout = ItemCreator.of(CompMaterial.PRISMARINE_BRICKS,
                        "&AHouse Settings","&8Common Changes","",
                        "&BCustomize &7your house area options","&7to make it look &Bcleaner with","it's &Bsurroundings&7.",
                        "","&EClick to configure!").build().make();

                return HouseSettingsLayout;
            }
        };


        ChatSettings = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {
                new ChatSettingsMenu().displayTo(player);
            }

            @Override
            public ItemStack getItem() {

                ItemStack ChatSettingsLayout = ItemCreator.of(CompMaterial.BRICKS,
                        "&AChat Settings","&8Common Changes","","&BConfigure &7your chat options as"
                        ,"you like inside this &Bpanel&7.","","&8Currently this panel is in &C&LBETA &8mode.",
                        "&8Please report issues to us.","","&EClick to configure!").build().make();

                return ChatSettingsLayout;
            }
        };

    }

    @Override
    public ItemStack getItemAt(int slot) {

        if(slot == 10) {
            return ChatSettings.getItem();
        }

        if(slot == 11) {
            return HouseSettings.getItem();
        }

        if(slot == 49)
            return CLOSE.getItem();
        return null;
    }

    @Override
    protected String[] getInfo() {
        return  null;
    }

    class ChatSettingsMenu extends Menu {

        private final Button AutoCorrect;

        public ChatSettingsMenu() {
            super(SettingsMenu.this);
            setSize(45);
            setTitle("&8Chat Settings Panel");

            AutoCorrect = new Button() {
                @Override
                public void onClickedInMenu(Player player, Menu menu, ClickType click) {

                }

                @Override
                public ItemStack getItem() {

                    ItemStack Autocorrectlayout = ItemCreator.of(CompMaterial.ITEM_FRAME,
                            "&AAuto-Correct","&8Press C to commit changes","",
                            "&7Automatically corrects your grammar","&7mistakes while you type inside the chat.","",
                            "&6&LCURRENTLY:","","&EClick to enable or disable!").
                            build().make();

                    return Autocorrectlayout;
                }
            };

        }

        @Override
        public ItemStack getItemAt(int slot) {

            if(slot == 10){
                return AutoCorrect.getItem();
            }

            return null;
        }

        @Override
        protected String[] getInfo() {
            return null;
        }
    }

    class HouseSettingsMenu extends Menu {

        private final Button ExtendArea;

        public HouseSettingsMenu() {
          super(SettingsMenu.this);
         setSize(45);
         setTitle("&8House Settings Panel");

         ExtendArea = new Button() {
             @Override
             public void onClickedInMenu(Player player, Menu menu, ClickType click) {

             }

             @Override
             public ItemStack getItem() {

                 ItemStack ExtendAreaLayout = ItemCreator.of(CompMaterial.STICK,"&AExtend Area",
                         "&8Press C to commit changes","","&BExtend &7your town size by","&bupgrading &7your town to next level.","","&E&LNext Size: &82000x2000","","&EClick to extend area!").
                         build().make();

                 return ExtendAreaLayout;
             }
         };
        }

        @Override
        public ItemStack getItemAt(int slot) {

            if(slot == 10)
                return ExtendArea.getItem();

            return null;
        }

        @Override
        protected String[] getInfo() {
            return null;
        }
    }
}
