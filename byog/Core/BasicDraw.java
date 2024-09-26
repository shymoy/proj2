package byog.Core;

import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;

public class BasicDraw {
    public static void drawFloor(TETile[][] world, int xxPosition, int yyPosition,int width, int height) {
        drawFloorHelper(world, xxPosition, yyPosition, width, height);
    }

    private static void drawFloorHelper(TETile[][] world, int xxPosition, int yyPosition, int width, int height) {
        for (int i = xxPosition; i < xxPosition + width; i++) {
            for (int j = yyPosition; j < yyPosition + height; j++) {
                world[i][j] = Tileset.FLOOR;
            }
        }
    }

    public static void drawWall(TETile[][] world, int xxPosition, int yyPosition, int width, int height) {
        drawWallHelper(world, xxPosition, yyPosition, width, height);
    }

    private static void drawWallHelper(TETile[][] world, int xxPosition, int yyPosition, int width, int height) {
        for (int i = xxPosition - 1; i < xxPosition + width + 1; i++) {
            for (int j = yyPosition - 1; j < yyPosition + height + 1; j++) {
                if (world[i][j] != Tileset.FLOOR) {
                    world[i][j] = Tileset.WALL;
                }
            }
        }
    }
}
