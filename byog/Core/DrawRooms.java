package byog.Core;

import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;

import java.util.List;

public class DrawRooms {
    public static void drawRooms (TETile[][] world, List<Room> rooms) {
        drawFloor(world, rooms);
        drawWall(world, rooms);
    }

    private static void drawFloor(TETile[][] world, List<Room> rooms) {
        for (Room room : rooms) {
            for (int i = room.getXxPosition(); i < room.getXxPosition() + room.getWidth(); i++) {
                for (int j = room.getYyPositon(); j < room.getYyPositon() + room.getHeight(); j++) {
                    world[i][j] = Tileset.FLOOR;
                }
            }
        }
    }

    private static void drawWall(TETile[][] world, List<Room> rooms) {
        for (Room room : rooms) {
            for (int i = room.getXxPosition() - 1; i < room.getXxPosition() + room.getWidth() + 1; i++) {
                for (int j = room.getYyPositon() - 1; j < room.getYyPositon() + room.getHeight() + 1; j++) {
                    if (world[i][j] != Tileset.FLOOR) {
                        world[i][j] = Tileset.WALL;
                    }
                }
            }
        }
    }
}
