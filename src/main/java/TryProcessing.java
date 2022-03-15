import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int position1 = 0;
    int position2 = 0;
    int position3 = 0;
    int position4 = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();
    }

    private void drawCircle1() {
        ellipse(position1, (float) HEIGHT / 5, DIAMETER, DIAMETER);
        position1++;
    }

    private void drawCircle2() {
        ellipse(position2, (float) 2 * HEIGHT / 5, DIAMETER, DIAMETER);
        position2 = position2 + 2;
    }

    private void drawCircle3() {
        ellipse(position3, (float) 3 * HEIGHT / 5, DIAMETER, DIAMETER);
        position3 = position3 + 3;
    }

    private void drawCircle4() {
        ellipse(position4, (float) 4 * HEIGHT / 5, DIAMETER, DIAMETER);
        position4 = position4 + 4;
    }
}
