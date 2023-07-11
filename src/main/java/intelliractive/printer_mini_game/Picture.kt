package intelliractive.printer_mini_game

import org.bukkit.Material
import org.bukkit.Material.*

//    PAPER(1), SCISSORS(2), ROCK(3);
//    fun act() {
//        println("Nothing")
//    }

/** ## Картинки
 * Здесь содердатся все картинки в форме списка со списками, явл. горизонтальными строками, на кот. поделена картинка. Их 10 (размер картинки: 10*10).
 * @since the beginning */
enum class Picture(val grid: List<List<Material>>) {
    Cow(listOf(
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL)
    )),
    Beach(listOf(
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL)
    )),
    VillageHouse(listOf(
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL)
    )),
    Aquarium(listOf(
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL)
    )),
    WinterNight(listOf(
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL)
    )),
    Burger(listOf(
        listOf(YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE),
        listOf(YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE),
        listOf(YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER, YELLOW_CONCRETE_POWDER),
        listOf(ORANGE_CONCRETE_POWDER, WHITE_CONCRETE, WHITE_CONCRETE, ORANGE_CONCRETE_POWDER, WHITE_CONCRETE, WHITE_CONCRETE, ORANGE_CONCRETE_POWDER, ORANGE_CONCRETE_POWDER, WHITE_CONCRETE, WHITE_CONCRETE),
        listOf(RED_TERRACOTTA, RED_TERRACOTTA, RED_TERRACOTTA, RED_TERRACOTTA, RED_TERRACOTTA, RED_TERRACOTTA, RED_TERRACOTTA, ORANGE_CONCRETE_POWDER, RED_TERRACOTTA, RED_TERRACOTTA),
        listOf(BROWN_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, ORANGE_CONCRETE_POWDER, BROWN_CONCRETE_POWDER, LIME_WOOL),
        listOf(LIME_WOOL, LIME_WOOL, LIME_WOOL, LIME_WOOL, LIME_WOOL, LIME_WOOL, LIME_WOOL, ORANGE_CONCRETE_POWDER, ORANGE_CONCRETE_POWDER, LIME_WOOL),
        listOf(LIME_WOOL, GREEN_CONCRETE, GREEN_CONCRETE_POWDER, WHITE_WOOL, GREEN_CONCRETE_POWDER, GREEN_CONCRETE, GREEN_CONCRETE_POWDER, ORANGE_CONCRETE_POWDER, ORANGE_CONCRETE_POWDER, GREEN_CONCRETE_POWDER),
        listOf(YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, ORANGE_CONCRETE_POWDER, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE),
        listOf(YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE, YELLOW_CONCRETE),
    )),
    Roblox(listOf(
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL)
    )),
    RobloxConfidentFace(listOf(
        listOf(WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE),
        listOf(WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE),

        listOf(WHITE_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, WHITE_CONCRETE),
        listOf(WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE),
        listOf(WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE),
        // EYES
        listOf(WHITE_CONCRETE, WHITE_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE),
        listOf(WHITE_CONCRETE, WHITE_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, BLACK_CONCRETE),
        listOf(WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, WHITE_CONCRETE),
        listOf(BLACK_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, BLACK_CONCRETE, BLACK_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE),

        listOf(WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE, WHITE_CONCRETE)
    )),
    AmongUsRed(listOf(
        listOf(LIGHT_BLUE_TERRACOTTA, BLUE_TERRACOTTA, BLUE_TERRACOTTA, BLUE_TERRACOTTA, BLUE_TERRACOTTA, LIGHT_BLUE_TERRACOTTA, BLUE_TERRACOTTA, BLUE_TERRACOTTA, BLUE_TERRACOTTA, BLUE_TERRACOTTA),
        listOf(BLUE_TERRACOTTA, BLUE_TERRACOTTA, LIGHT_BLUE_TERRACOTTA, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, BLUE_TERRACOTTA, BLUE_TERRACOTTA),
        listOf(BLUE_TERRACOTTA, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, BLUE_TERRACOTTA),
        listOf(BLACK_WOOL, LIGHT_BLUE_WOOL, LIGHT_BLUE_WOOL, BLUE_WOOL, BLUE_WOOL, BLACK_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, LIGHT_BLUE_TERRACOTTA),
        listOf(BLACK_WOOL, LIGHT_BLUE_WOOL, BLUE_WOOL, BLUE_WOOL, BLUE_WOOL, BLACK_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, BLUE_TERRACOTTA),
        listOf(BLACK_WOOL, BLUE_WOOL, BLUE_WOOL, BLUE_WOOL, BLUE_WOOL, BLACK_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, BLUE_TERRACOTTA),
        listOf(BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, LIGHT_BLUE_TERRACOTTA),
        listOf(RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, BLUE_TERRACOTTA),
        listOf(RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, BLUE_TERRACOTTA),
        listOf(RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, RED_WOOL, BLUE_TERRACOTTA, BLUE_TERRACOTTA)
    )),
    Sackboy(listOf(
        listOf(BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL),
        listOf(BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL),

        //Глаза
        listOf(BROWN_WOOL, WHITE_WOOL, BLACK_WOOL, BLACK_WOOL, BROWN_WOOL, BROWN_WOOL, WHITE_WOOL, BLACK_WOOL, BLACK_WOOL, BROWN_WOOL),
        listOf(BROWN_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BROWN_WOOL, BROWN_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BROWN_WOOL),
        listOf(BROWN_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BROWN_WOOL, BROWN_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BROWN_WOOL),

        listOf(BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL),
        listOf(BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL),

        // Рот
        listOf(BROWN_WOOL, BROWN_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BLACK_WOOL, BROWN_WOOL, BROWN_WOOL),
        listOf(BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BLACK_WOOL, RED_WOOL, RED_WOOL, BLACK_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL),

        listOf(BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL, BROWN_WOOL),
    )),
    LegoFace(listOf(
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL),
        listOf(WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL, WHITE_WOOL)
    ));
}
