package intelliractive.printer_mini_game
import org.bukkit.Material
import org.bukkit.Material.*
import org.bukkit.Material.WHITE_CONCRETE as wc
import org.bukkit.Material.GRAY_CONCRETE as gc
import org.bukkit.Material.GREEN_CONCRETE as grc
import org.bukkit.Material.YELLOW_CONCRETE as yc
import org.bukkit.Material.BLACK_CONCRETE as bc

import org.bukkit.Material.BLACK_CONCRETE_POWDER as blackcp
import org.bukkit.Material.YELLOW_CONCRETE_POWDER as ycp
import org.bukkit.Material.ORANGE_CONCRETE_POWDER as ocp
import org.bukkit.Material.BROWN_CONCRETE_POWDER as bcp
import org.bukkit.Material.GREEN_CONCRETE_POWDER as gcp

import org.bukkit.Material.WHITE_WOOL as ww
import org.bukkit.Material.BLACK_WOOL as bw
import org.bukkit.Material.BROWN_WOOL as brw
import org.bukkit.Material.LIGHT_BLUE_WOOL as lbw
import org.bukkit.Material.BLUE_WOOL as blw
import org.bukkit.Material.RED_WOOL as rw
import org.bukkit.Material.LIME_WOOL as lw

import org.bukkit.Material.BLUE_TERRACOTTA as bt
import org.bukkit.Material.LIGHT_BLUE_TERRACOTTA as lbt
import org.bukkit.Material.RED_TERRACOTTA as rt

//    PAPER(1), SCISSORS(2), ROCK(3);
//    fun act() {
//        println("Nothing")
//    }

/** ## Картинки
 * Здесь содердатся все картинки в форме списка со списками, явл. горизонтальными строками, на кот. поделена картинка. Их 10 (размер картинки: 10*10).
 * @since the beginning */
enum class Picture(val grid: List<List<Material>>) {
    Cow(listOf(
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww)
    )),
    Beach(listOf(
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww)
    )),
    VillageHouse(listOf(
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, DARK_OAK_DOOR, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, DARK_OAK_DOOR, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww)
    )),
    Aquarium(listOf(
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww)
    )),
    WinterNight(listOf(
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww),
        listOf(ww, ww, ww, ww, ww, ww, ww, ww, ww, ww)
    )),
    Burger(listOf(
        listOf(yc, yc, yc, yc, yc, yc, yc, yc, yc, yc),
        listOf(yc, yc, yc, yc, yc, yc, yc, yc, yc, yc),
        listOf(ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp),
        listOf(ocp, wc, wc, ocp, wc, wc, ocp, ocp, wc, wc),
        listOf(rt, rt, rt, rt, rt, rt, rt, ocp, rt, rt),
        listOf(bcp, bcp, bcp, bcp, bcp, bcp, bcp, ocp, bcp, lw),
        listOf(lw, lw, lw, lw, lw, lw, lw, ocp, ocp, lw),
        listOf(lw, grc, gcp, ww, gcp, grc, gcp, ocp, ocp, gcp),
        listOf(yc, yc, yc, yc, yc, yc, ocp, yc, yc, yc),
        listOf(yc, yc, yc, yc, yc, yc, yc, yc, yc, yc),
    )),
    Roblox(listOf(
        listOf(gc, gc, gc, gc, gc, gc, gc, gc, gc, gc),
        listOf(gc, gc, gc, gc, wc, gc, gc, gc, gc, gc),
        listOf(gc, gc, gc, wc, wc, wc, wc, gc, gc, gc),
        listOf(gc, gc, gc, wc, wc, wc, wc, wc, wc, gc),
        listOf(gc, gc, wc, wc, wc, wc, wc, wc, wc, wc),
        listOf(gc, gc, wc, wc, wc, AIR,wc, wc, wc, gc),
        listOf(gc, wc, wc, wc, wc, wc, wc, wc, wc, gc),
        listOf(gc, gc, wc, wc, wc, wc, wc, wc, gc, gc),
        listOf(gc, gc, gc, gc, wc, wc, wc, wc, gc, gc),
        listOf(gc, gc, gc, gc, gc, gc, wc, gc, gc, gc),
    )),
    RobloxConfidentFace(listOf(
        listOf(wc, wc, wc, wc, wc, wc, wc, wc, wc, wc),
        listOf(wc, bc, bc, wc, wc, wc, wc, bc, bc, wc),
        listOf(wc, wc, wc, wc, wc, wc, wc, wc, wc, wc),

        // EYES
        listOf(wc, wc, bc, bc, wc, wc, bc, bc, wc, wc),
        listOf(wc, wc, bc, bc, wc, wc, wc, wc, wc, bc),

        // smile
        listOf(wc, wc, wc, wc, wc, wc, bc, bc, bc, wc),
        listOf(bc, wc, wc, wc, bc, bc, wc, wc, wc, wc),
        listOf(wc, bc, bc, bc, wc, wc, wc, wc, wc, wc),

        listOf(wc, wc, wc, wc, wc, wc, wc, wc, wc, wc),
        listOf(wc, wc, wc, wc, wc, wc, wc, wc, wc, wc)
    )),
    AmongUsRed(listOf(
        listOf(lbt, bt, bt, bt, bt, lbt, bt, bt, bt, bt),
        listOf(bt, bt, lbt, rw, rw, rw, rw, bt, bt, bt),
        listOf(bt, bw, bw, bw, bw, rw, rw, rw, bt, bt),
        listOf(bw, lbw, lbw, blw, blw, bw, rw, rw, bt, lbt),
        listOf(bw, lbw, blw, blw, blw, bw, rw, rw, bt, bt),
        listOf(bw, blw, blw, blw, blw, bw, rw, rw, bt, bt),
        listOf(bw, bw, bw, bw, bw, bw, rw, rw, bt, lbt),
        listOf(rw, rw, rw, rw, rw, rw, rw, rw, bt, bt),
        listOf(rw, rw, rw, rw, rw, rw, rw, rw, bt, bt),
        listOf(rw, rw, rw, rw, rw, rw, rw, rw, bt, bt)
    )),
    Sackboy(listOf(
        listOf(brw, brw, brw, brw, brw, brw, brw, brw, brw, brw),
        listOf(brw, brw, brw, brw, brw, brw, brw, brw, brw, brw),

        //Глаза
        listOf(brw, ww, bw, bw, brw, brw, ww, bw, bw, brw),
        listOf(brw, bw, bw, bw, brw, brw, bw, bw, bw, brw),
        listOf(brw, bw, bw, bw, brw, brw, bw, bw, bw, brw),

        listOf(brw, brw, brw, brw, brw, brw, brw, brw, brw, brw),
        listOf(brw, brw, brw, brw, brw, brw, brw, brw, brw, brw),

        // Рот
        listOf(brw, brw, COAL_BLOCK, COAL_BLOCK, COAL_BLOCK, COAL_BLOCK, COAL_BLOCK, COAL_BLOCK, brw, brw),
        listOf(brw, brw, brw, COAL_BLOCK, rw, rw, COAL_BLOCK, brw, brw, brw),

        listOf(brw, brw, brw, brw, brw, brw, brw, brw, brw, brw),
    )),
    LegoFace(listOf(
        listOf(ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp),
        listOf(ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp),

        // Eyes
        listOf(ycp, blackcp, blackcp, ycp, ycp, ycp, ycp, blackcp, blackcp, ycp),
        listOf(ycp, blackcp, blackcp, ycp, ycp, ycp, ycp, blackcp, blackcp, ycp),

        listOf(ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp),
        listOf(ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp),
        listOf(ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp),
        listOf(ycp, blackcp, ycp, ycp, ycp, ycp, ycp, ycp, blackcp, ycp),
        listOf(ycp, ycp, blackcp, blackcp, blackcp, blackcp, blackcp, blackcp, ycp, ycp),
        listOf(ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp, ycp)
    ));
}
