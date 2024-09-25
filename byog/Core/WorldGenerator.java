package byog.Core;

import byog.TileEngine.*;

import java.util.List;


public class WorldGenerator {
    //receive a TETil[][] and draw it
    public static void generateWorld(TETile[][] world, Seed seed) {
        //random num of rooms
        generateRooms(world, seed);
    }

    private static void generateRooms(TETile[][] world, Seed seed) {
        RoomsGenerator roomsGenerator = new RoomsGenerator();
        roomsGenerator.generateRooms(world, seed);
        List<Room> roomList = roomsGenerator.getRooms();
        DrawRooms.drawRooms(world, roomList);

    }

    private static void generateHallways(TETile[][] world, Seed seed) {

    }
}
