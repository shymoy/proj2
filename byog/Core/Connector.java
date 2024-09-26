package byog.Core;

import byog.TileEngine.TETile;
import byog.TileEngine.Tileset;

import java.util.Random;

public class Connector {
    Room room1;
    Room room2;
    int xxCenterDiffer;
    int yyCenterDiffer;
    int xxSteped;
    int yySteped;
    TETile[][] wolrd;
    Random rand;

    public Connector(TETile[][] wolrd, Room room1, Room room2, Random rand) {
        this.wolrd = wolrd;
       xxCenterDiffer = room1.getXxCenter() - room2.getYyCenter();
       yyCenterDiffer = room1.getYyCenter() - room2.getYyCenter();
       this.rand = rand;
       xxSteped = 0;
       yySteped = 0;
       connect();
    }

    public void connect() {
        connection(xxCenterDiffer, yyCenterDiffer);
    }

    private void randomConnection() {

    }

    private void connection(int xxStep, int yyStep) {
        for (int i = room1.getYyCenter(); i < room1.getYyCenter() + xxStep; i++) {
            for (int j = room1.getYyCenter(); j < room1.getYyCenter() + yyStep; j++) {
                wolrd[i][j] = Tileset.FLOOR;
            }
        }
    }
}
