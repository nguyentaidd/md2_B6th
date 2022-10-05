package ra;

public class Shape {
    private String color = "green";
    private boolean filled = true;
    public Shape() {
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
       if(this.filled){
           return "A Shape with color of "+this.color+" and filled";
       } else
           return "A Shape with color of "+this.color+" not and filled";
    }
}
