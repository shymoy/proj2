package byog.Core;

import byog.TileEngine.TETile;

import java.util.ArrayList;
import java.util.Random;

public class RoomsGenerator {
    public static void generateRooms(TETile[][] world, Seed seed) {
        Random rand = seed.getRandom();

        int roomNum = RandomUtils.uniform(rand,20);

        ArrayList<Room> rooms = new ArrayList<>();

        for (int i = 0; i < roomNum; i++) {
            //room position and size
            Room room = generateRoom(world, seed);
            rooms.add(room);
        }
    }

    private static Room generateRoom(TETile[][] world, Seed seed) {
        //wall on the position
        Random rand = seed.getRandom();
        int width = RandomUtils.uniform(rand, world.length/10);
        int height = RandomUtils.uniform(rand, world.length/10);
        int xxPosiiton = RandomUtils.uniform(rand, world.length - width);
        int yyPosiiton = RandomUtils.uniform(rand, world[0].length - height);
        Room room = new Room(width, height, xxPosiiton, yyPosiiton);
        return room;
    }
}
