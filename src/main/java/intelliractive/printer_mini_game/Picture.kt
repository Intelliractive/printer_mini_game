package intelliractive.printer_mini_game

import org.bukkit.Material

//    PAPER(1), SCISSORS(2), ROCK(3);
//    fun act() {
//        println("Nothing")
//    }
enum class Picture(val grid: List<List<Material>>) {
    Cow(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    Beach(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    VillageHouse(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    Aquarium(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    WinterNight(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    Burger(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    Roblox(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    RobloxConfidentFace(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    AmongUsRed(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    Sackboy(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    )),
    LegoFace(listOf(
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL),
        listOf(Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL, Material.WHITE_WOOL)
    ));
}
