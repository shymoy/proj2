package byog.Core;

import byog.TileEngine.TETile;

import java.util.Random;

public class Connector {
    Room room1;
    Room room2;
    int xxCenterDiffer;
    int yyCenterDiffer;
    int xxStepped;
    int yyStepped;
    TETile[][] world;
    Random rand;

    public Connector(TETile[][] world, Room room1, Room room2, Random rand) {
        this.world = world;
       xxCenterDiffer = room1.getXxCenter() - room2.getXxCenter();
       yyCenterDiffer = room1.getYyCenter() - room2.getYyCenter();
       this.rand = rand;
       xxStepped = 0;
       yyStepped = 0;
       this.room1 = room1;
       this.room2 = room2;
       connect();
    }

    public void connect() {
        xxConnection(xxCenterDiffer);
        yyConnection(yyCenterDiffer);
    }

    private void xxConnection(int xxStep) {
        BasicDraw.drawHallway(world, room1.getXxPosition() + xxStepped, room1.getYyPosition() + yyStepped, xxStep, 1);
    }

    private void yyConnection(int yyStep) {
        BasicDraw.drawHallway(world, room1.getXxPosition() + xxStepped, room1.getYyPosition() + yyStepped, 1, yyStep);
    }
}
