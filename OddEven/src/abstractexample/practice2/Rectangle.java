package abstractexample.practice2;

public class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    void areaCount(){
        double result = dim1*dim2;
        System.out.println("Area is : "+result);
    }
}
