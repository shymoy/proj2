package byog.Core;

import byog.TileEngine.TETile;

import java.util.Random;

public class Connector {
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
       connect();
    }

    public void connect() {
        connection(xxCenterDiffer, yyCenterDiffer);
    }

    private void connection(int xxStep, int yyStep) {
        BasicDraw.drawFloor(world, xxStep, yyStep, xxStep, yyStep);
        BasicDraw.drawWall(world, xxStep, yyStep, xxStep, yyStep);
    }
}
