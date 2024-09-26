package byog.Core;

import byog.TileEngine.TETile;

import java.util.Random;

public class Connector {
    Room room1;
    Room room2;
    int xxPositionDiffer;
    int yyPositionDiffer;
    int xxSteped;
    int yySteped;
    TETile[][] wolrd;
    Random rand;

    public Connector(TETile[][] wolrd, Room room1, Room room2, Random rand) {
        this.wolrd = wolrd;
       xxPositionDiffer = room1.getXxPosition() - room2.getXxPosition();
       yyPositionDiffer = room1.getYyCenter() - room2.getYyCenter();
       this.rand = rand;
       xxSteped = 0;
       yySteped = 0;
       connect();
    }

    public void connect() {
        while ()
    }

    private void randomConnection() {
        int xxStep = xxPositionDiffer > 0 ? RandomUtils.uniform(rand,xxPositionDiffer) + 1: RandomUtils.uniform(rand,xxPositionDiffer, 0) - 1;
        int yyStep = yyPositionDiffer > 0 ?
        connectOne(xxStep, yyStep);
        xxSteped += xxStep;
        yySteped += yyStep;
    }

    private void connection(int xxStep, int yyStep) {

    }
}
