package byog.Core;

import byog.TileEngine.TETile;

import java.util.ArrayList;
import java.util.Random;

public class RoomsGenerator {
    private static ArrayList<Room> rooms = new ArrayList<>();

    public void generateRooms(TETile[][] world, Random rand) {
        int roomNum = RandomUtils.uniform(rand,10);

        for (int i = 0; i < roomNum; i++) {
            //room position and size
            Room room = generateRoom(world, rand);
                rooms.add(room);
        }
    }

    private Room generateRoom(TETile[][] world, Random rand) {
        //wall on the floor
        int width = RandomUtils.uniform(rand, 5, 10);
        int height = RandomUtils.uniform(rand, 3, 7);
        int xxPosiiton = RandomUtils.uniform(rand, 1,world.length - width - 1);
        int yyPosiiton = RandomUtils.uniform(rand,1, world[0].length - height - 1);
        return new Room(width, height, xxPosiiton, yyPosiiton);
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }
}
