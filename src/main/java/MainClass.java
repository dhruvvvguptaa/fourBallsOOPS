import processing.core.PApplet;

public class MainClass extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    static MyBall balls[]=new MyBall[4];

    public static void main(String args[]){
        PApplet.main("MainClass", args);
        for(int i=1;i<5;i++){
            balls[i-1]=new MyBall((i)*HEIGHT/5,i);
        }
    }
    
    @Override
    public void settings(){
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw(){
        for(int ball=0;ball<4;ball++){
            ellipse(balls[ball].x_axis,balls[ball].y_axis,balls[ball].diameter,balls[ball].diameter);
            balls[ball].move();
        }
    }
}

class MyBall{
    protected int x_axis = 0;
    protected int y_axis;
    protected int speed;
    protected int diameter = 10;

    MyBall(int y_axis,int speed){
        this.y_axis=y_axis;
        this.speed=speed;
    }
    protected void move(){
        this.x_axis+=speed;
    }

}
