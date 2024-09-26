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
       xxCenterDiffer = room1.getXxCenter() - room2.getYyCenter();
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
        BasicDraw.drawFloor(world, room1.getXxPosition() + xxStepped, room1.getYyPositon() + yyStepped, xxStep, 1);
        BasicDraw.drawWall(world, room1.getXxPosition() + xxStepped, room1.getYyPositon() + yyStepped, xxStep, 1);
    }

    private void yyConnection(int yyStep) {
        BasicDraw.drawFloor(world, room1.getXxPosition() + xxStepped, room1.getYyPositon() + yyStepped, 1, yyStep);
        BasicDraw.drawWall(world, room1.getXxPosition() + xxStepped, room1.getYyPositon() + yyStepped, 1, yyStep);
    }
}
