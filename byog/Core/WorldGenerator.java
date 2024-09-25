package byog.Core;
import byog.SaveDemo.World;
import byog.TileEngine.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WorldGenerator {
    //receive a TETil[][] and draw it
    public void generateWorld(TETile[][] world, Seed seed) {
        //random num of rooms
        RoomsGenerator.generateRooms(world, seed);

    }


}
