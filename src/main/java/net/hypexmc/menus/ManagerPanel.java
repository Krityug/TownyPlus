package net.hypexmc.menus;


import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.menu.Menu;
import org.mineacademy.fo.menu.button.Button;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.remain.CompMaterial;

public class ManagerPanel extends Menu {

    private final Button Events,Quests,VirtualBank,Close,SwitchAccount;

    public ManagerPanel() {
        super(null);
        setSize(45);
        setTitle("&8Towny Manager Panel");

        SwitchAccount = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {
            new SwitchAccount().displayTo(player);
            }

            @Override
            public ItemStack getItem() {

                ItemStack Swtich = ItemCreator.of(CompMaterial.BOOKSHELF,"&ASwitch Account",
                        "&8Basic Gadget","","&7In order to play with your friends.","&7You must create &7a new &baccount&7.","","&BAvailable Slots: &87 per player","","&EClick to view profiles!")
                        .build().make();

                return Swtich;
            }
        };

        VirtualBank = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {

            }

            @Override
            public ItemStack getItem() {

                ItemStack VirtualBankLayout = ItemCreator.of(CompMaterial.ENDER_CHEST,"&AVirtual Account",
                        "&8Resources","","&7Virtual Bank &7can help you",
                        "&Bwithdraw, deposit &7money &7without","going to the bank.","",
                        "&C&LNOTE: &7You must wait &B14 minutes","&7prior to using the &BVA &7again.","",
                        "&7Status: &AAvailable",
                        "","&EClick to use Virtual Account!").build().make();

                return VirtualBankLayout;
            }
        };

        Events = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {

            }

            @Override
            public ItemStack getItem() {

                ItemStack EventsLayout = ItemCreator.of(CompMaterial.MAP,"&ACalendar Events",
                        "&8Informative","","&BEvents &7and &Bfestivals &7will list &7in",
                        "&7here which happen in real time.","","&ENext Update: &817h 14m 3s",
                        "","&EClick to view calendar!")
                        .build().make();

                return EventsLayout;
            }
        };

        Close = new Button() {
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

        Quests = new Button() {
            @Override
            public void onClickedInMenu(Player player, Menu menu, ClickType click) {
            new QuestsMenu().displayTo(player);
            }

            @Override
            public ItemStack getItem() {

                ItemStack QuestsLayout = ItemCreator.of(CompMaterial.COBWEB,
                        "&AQuests",
                        "&8Competitive","","&BComplete &7quests to earn &6rewards&7,",
                        "&6cosmetics &7etc. &7Quests can also","give players &6coins&7.","",
                        "&7Earned &6coins &7will be stored"
                        ,"&7inside your bank account.",""
                        ,"&7Every &B24h &7quests get updates.","",
                        "","&EClick to view Quests!").build().make();

                return QuestsLayout;
            }
        };
    }

    @Override
    public ItemStack getItemAt(int slot) {

        if(slot == 39)
                return SwitchAccount.getItem();

        if(slot == 12)
            return VirtualBank.getItem();

        if(slot == 11)
            return Events.getItem();

        if(slot == 10)
            return Quests.getItem();

        if(slot == 40)
            return Close.getItem();


        return null;
    }

    @Override
    protected String[] getInfo() {
        return null;
    }

    class QuestsMenu extends Menu {


        public QuestsMenu() {
         super(ManagerPanel.this);
         setSize(45);
         setTitle("&8Towny Quests");
        }

        @Override
        protected String[] getInfo() {
            return null;
        }
    }

    class SwitchAccount extends Menu {

        public SwitchAccount() {
            super(ManagerPanel.this);
            setSize(45);
            setTitle("&8Switch Account");
        }

        @Override
        protected String[] getInfo() {
            return null;
        }
    }
}
