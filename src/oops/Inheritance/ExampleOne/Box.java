package oops.Inheritance.ExampleOne;

public class Box {
    int l;
    int b;
    int h;
    Box() {
        this.l = 22;
        this.b = -1;
        this.h = -1;
    }

    Box(int l ,int b , int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box newbox){
        this.h = newbox.h;
        this.l = newbox.l;
        this.b = newbox.b;
    }
}
