package encapsulation.box;

public class Box {

    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double data){
        if(data < 1){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = data;
    }

    private void setWidth(double data){
        if(data < 1){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = data;
    }

    private void setHeight(double data){
        if(data < 1){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = data;
    }

    private double calculateData(double x, double y){
        return x * y;
    }

    public double calculateLiteralArea(){
        return (2 * calculateData(this.length, this.height) +
                2 * calculateData(this.width, this.height));
    }

    public double calculateSurfaceArea(){
        return ((2 * calculateData(this.width, this.length)) +
                (2 * calculateData(this.width, this.height)) +
                (2 * calculateData(this.length, this.height)));
    }

    public double calculateVolume(){
        return this.length * this.height * this.width;
    }
}
