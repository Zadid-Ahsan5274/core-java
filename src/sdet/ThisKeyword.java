package sdet;

public class ThisKeyword {
    int x,y; // class variables or instance variables

    /* ThisKeyword(int x, int y)
    {
        this.x = x;
        this.y = y;
    } */

    void setData(int a, int b)
    {
        x = a;
        y = b;
    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    static void main(String[] args) {
        ThisKeyword object = new ThisKeyword();
        object.setData(250,350);
        object.display();
    }
}
