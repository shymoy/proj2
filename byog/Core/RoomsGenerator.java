package byog.Core;

import byog.TileEngine.TETile;

import java.util.ArrayList;
import java.util.Random;

public class RoomsGenerator {
    private ArrayList<Room> rooms = new ArrayList<>();

    public void generateRooms(TETile[][] world, Seed seed) {
        Random rand = seed.getRandom();

//        int roomNum = RandomUtils.uniform(rand,20);

        for (int i = 0; i < 1; i++) {
            //room position and size
            Room room = generateRoom(world, seed);
            rooms.add(room);
        }
    }

    private Room generateRoom(TETile[][] world, Seed seed) {
        //wall on the floor
        Random rand = seed.getRandom();
        int width = RandomUtils.uniform(rand, world.length/7);
        int height = RandomUtils.uniform(rand, world.length/7);
        int xxPosiiton = RandomUtils.uniform(rand, 1,world.length - width - 1);
        int yyPosiiton = RandomUtils.uniform(rand,1, world[0].length - height - 1);
        return new Room(width, height, xxPosiiton, yyPosiiton);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
