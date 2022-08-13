package Ex17;

/**
 *
 * @author s.lucas
 */
public class Person {
    private double height;
    private boolean sex;

    public Person(double height, boolean sex) {
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

    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    
}
