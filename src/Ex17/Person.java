package Ex17;

/**
 *
 * @author s.lucas
 */
public class Person {
    private double height;
    private int sex;

    public Person(double height, int sex) {
        this.height = height;
        this.sex = sex;
    }
    public Person() {
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public int getSex() {
        return sex;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    
    
}
