package byog.Core;

public class Room {
    private final int width;
    private final int height;
    private final int xxPosition;
    private final int yyPosition;
    private final int xxCenter;
    private final int yyCenter;

    public Room (int width, int height, int xxPositon, int yyPosition) {
        this.width = width;
        this.height = height;
        this.xxPosition = xxPositon;
        this.yyPosition = yyPosition;
        this.xxCenter = xxPositon + width / 2;
        this.yyCenter = yyPosition + height / 2;
    }

    public int getXxCenter() {
        return xxCenter;
    }

    public int getYyCenter() {
        return yyCenter;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getXxPosition() {
        return xxPosition;
    }

    public int getYyPositon() {
        return yyPosition;
    }
}
