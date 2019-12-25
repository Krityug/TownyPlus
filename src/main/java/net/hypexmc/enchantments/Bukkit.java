package net.hypexmc.enchantments;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.model.SimpleEnchantment;
import org.mineacademy.fo.remain.CompMaterial;

@Getter
public class Bukkit extends SimpleEnchantment {

    public static final Enchantment instance = new Bukkit();

    public Bukkit() {
        super("Bukkit",14);
    }

    @Override
    protected void onBreakBlock(int level, BlockBreakEvent event) {

        String Legendary = Common.colorize("&6&LLEGENDARY");
        String EPIC = Common.colorize("&5&LEPIC");
        String Rare = Common.colorize("&B&LRARE");
        String CommonItem = Common.colorize("&A&LCOMMON");
        String Uncommon = Common.colorize("&A&LUNCOMMON");

        Player player = event.getPlayer();

        ItemStack BukkitLayout = ItemCreator.of(CompMaterial.LAVA_BUCKET,"&6&LBukkit",
                "&8","","&7Core of the whole &BHeart Town","&7crust as well as your","&7town's crust."
        ,"",Legendary,"","&8Cannot be used while under water.")
                .build().make();


        player.getInventory().addItem(BukkitLayout);

        super.onBreakBlock(level, event);
    }
}
