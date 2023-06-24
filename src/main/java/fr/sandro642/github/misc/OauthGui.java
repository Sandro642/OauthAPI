package fr.sandro642.github.misc;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class OauthGui {

    /**
     * This technology is not available for now.
     * @param value
     * @return
     */

    public static ItemStack getHead(String value) {
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1, (short) SkullType.PLAYER.ordinal());
        UUID hashAsId = new UUID(value.hashCode(), value.hashCode());
        return Bukkit.getUnsafe().modifyItemStack(skull,
                "{SkullOwner:{Id:\"" + hashAsId + "\",Properties:{textures:[{Value:\"" + value + "\"}]}}}"
        );
    }

    public static void openGui(Player p) {
        Inventory Gui = Bukkit.createInventory(p, 54, "§6Oauth");

        ItemStack zeroun = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTI0M2EzODE0NGVlNzRiMTFhODM1YmE3YzdiYjNkNGUwYjQxMTBhZmIzYmU1NTA0ZGEyZThhMzYzYWQzNmQ1NiJ9fX0=");
        ItemStack zerodeux = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZTM5NjgyNGQ2ODU1NjNmYmQyMWVhMTNhNTMxZDY0N2FlYzgzNGU5OTBlODcwMDNhMzE4NDk0YmM0OWU2ZjgzMSJ9fX0=");
        ItemStack zerotrois = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDllMmNkZGFlOGE4MzllZmY4YjhkZWZhNjk4ZmFkMGYwYTk4MmRjNzdkNWI1OTBlYTFiMDRlY2FjZTE2NjY5YSJ9fX0=");
        ItemStack zeroquatre = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzk3YzY2ZGQ0ZDg1OTYwMGJkN2ExZmViMjQzYWRhYTc2MGI0NjRiYTQ1N2M3NTFlNWRiMzczYjNmNDhkZDEyYSJ9fX0=");
        ItemStack zerocinq = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjkzYWNlNDYyNjliY2MzM2M3ODFmMzE2NDk1YjRlYjhhMGQ3OWMxNTMxMTdjNzc3ZDExOGQ3YzViZjM1MjlhZCJ9fX0=");
        ItemStack zerosix = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmMyMTMwNTllOGJiMWEzMGY3MTIzMTMwMTc2OTA1ZTc3ZmM5ZDBjNmQxZDE5Y2EyOTI1MDk1YWQ5NzgzNmVhOSJ9fX0=");;
        ItemStack zerosept = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWRjMGM5OTg4ZjgzODA5NWVlYmE1MThkOThlOTQ2MTEyYjQ4ZWM1ZTMzNjc0ZWRkZmZiYmYyZjI2YWUyMTllMCJ9fX0=");
        ItemStack zerohuit = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQ2N2U1OTAxYmYxYzMzOWEwN2Y4YjEwNjM2MTlhZTczY2ExZDY0MjhkNThiYjkzMDE4MjM5YmVkOWE2NmY4MCJ9fX0=");
        ItemStack zeroneuf = getHead("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWU0NWU5Yjk1YmE3OWQ3ZWYxZWExYWRiYzQ5ZmY2ODA1NTYzNzllYjcyNjNhYzI2MWZlNjhiNmU5NjEwMDBhNiJ9fX0=");

        Gui.setItem(12, zeroun);
        Gui.setItem(13, zerodeux);
        Gui.setItem(14, zerotrois);
        Gui.setItem(21, zeroquatre);
        Gui.setItem(22, zerocinq);
        Gui.setItem(23, zerosix);
        Gui.setItem(30, zerosept);
        Gui.setItem(31, zerohuit);
        Gui.setItem(32, zeroneuf);




        p.openInventory(Gui);
    }
}
