package oops.Inheritance.ExampleOne;

public class BoxWeight extends Box{
    int weight;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(int l, int b, int h, int weight){
        super(l,h,b);
        this.weight = weight;
    }
}
