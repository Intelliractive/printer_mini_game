package intelliractive.printer_mini_game

import org.bukkit.Material

//    PAPER(1), SCISSORS(2), ROCK(3);
//    fun act() {
//        println("Nothing")
//    }

/** ## Картинки
 * Здесь содердатся все картинки в форме списка со списками, явл. горизонтальными строками, на кот. поделена картинка. Их 10 (размер картинки: 10*10).
 * @since the beginning */
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
        listOf(Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE),
        listOf(Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE),
        listOf(Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER, Material.YELLOW_CONCRETE_POWDER),
        listOf(Material.ORANGE_CONCRETE_POWDER, Material.WHITE_CONCRETE, Material.WHITE_CONCRETE, Material.ORANGE_CONCRETE_POWDER, Material.WHITE_CONCRETE, Material.WHITE_CONCRETE, Material.ORANGE_CONCRETE_POWDER, Material.ORANGE_CONCRETE_POWDER, Material.WHITE_CONCRETE, Material.WHITE_CONCRETE),
        listOf(Material.RED_TERRACOTTA, Material.RED_TERRACOTTA, Material.RED_TERRACOTTA, Material.RED_TERRACOTTA, Material.RED_TERRACOTTA, Material.RED_TERRACOTTA, Material.RED_TERRACOTTA, Material.ORANGE_CONCRETE_POWDER, Material.RED_TERRACOTTA, Material.RED_TERRACOTTA),
        listOf(Material.BROWN_CONCRETE_POWDER, Material.BROWN_CONCRETE_POWDER, Material.BROWN_CONCRETE_POWDER, Material.BROWN_CONCRETE_POWDER, Material.BROWN_CONCRETE_POWDER, Material.BROWN_CONCRETE_POWDER, Material.BROWN_CONCRETE_POWDER, Material.ORANGE_CONCRETE_POWDER, Material.BROWN_CONCRETE_POWDER, Material.LIME_WOOL),
        listOf(Material.LIME_WOOL, Material.LIME_WOOL, Material.LIME_WOOL, Material.LIME_WOOL, Material.LIME_WOOL, Material.LIME_WOOL, Material.LIME_WOOL, Material.ORANGE_CONCRETE_POWDER, Material.ORANGE_CONCRETE_POWDER, Material.LIME_WOOL),
        listOf(Material.LIME_WOOL, Material.GREEN_CONCRETE, Material.GREEN_CONCRETE_POWDER, Material.WHITE_WOOL, Material.GREEN_CONCRETE_POWDER, Material.GREEN_CONCRETE, Material.GREEN_CONCRETE_POWDER, Material.ORANGE_CONCRETE_POWDER, Material.ORANGE_CONCRETE_POWDER, Material.GREEN_CONCRETE_POWDER),
        listOf(Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.ORANGE_CONCRETE_POWDER, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE),
        listOf(Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE, Material.YELLOW_CONCRETE),
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
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),

        listOf(Material.WHITE_WOOL, Material.BLACK_WOOL, Material.BLACK_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),

        listOf(Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL, Material.BROWN_WOOL),
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
