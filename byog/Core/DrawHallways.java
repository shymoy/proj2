package byog.Core;

import byog.TileEngine.TETile;

import java.util.List;
import java.util.Random;

public class DrawHallways {
    public void drawHallways(TETile[][] world, Random rand, List<Room> rooms) {
        //choose two room to draw the hallway
        //first choose two random rooms,second choose one is connected and one is not
        HallwayChooser hallwayChooser = new HallwayChooser(rooms,rand);
        drawHallwayHelper(hallwayChooser);
    }

    private void drawHallwayHelper(HallwayChooser hallwayChooser) {
        //connect two rooms' center
        Room room1 = hallwayChooser.getNotConnectedRoom();
        Room room2 = hallwayChooser.getNotConnectedRoom();
        while (!hallwayChooser.isAllConnected()) {

        }
    }
}
