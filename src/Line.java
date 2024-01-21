public class Line {
    Point p1;
    Point p2;
    Line(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public double distanceCalculator(){
           int x1=p1.getX();
           int y1= p1.getY();
           int x2= p2.getX();
           int y2=p2.getY();
           return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
    public int lineComparison(Line l2){
        double d1=this.distanceCalculator();
        double d2=l2.distanceCalculator();
        if(d1>d2){
            return -1;
        } else if (d2>d1) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
