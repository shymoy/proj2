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
            BasicDraw.drawFloor(world, room.getXxPosition(), room.getYyPositon(),
                    room.getWidth(), room.getHeight());
        }
    }

    private static void drawWall(TETile[][] world, List<Room> rooms) {
        for (Room room : rooms) {
            BasicDraw.drawWall(world, room.getXxPosition(), room.getYyPositon(),
                    room.getWidth(), room.getHeight());
        }
    }
}
