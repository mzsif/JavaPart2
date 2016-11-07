package fh.java.geometry.model;

public abstract class GeometricShape {
    

    protected int x;
    protected int y;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

    public int gety() {
        return y;
    }

    public void sety(int y) {
        this.y = y;
    }

	public abstract double calcarea();

    public abstract double calcperimeter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeometricShape that = (GeometricShape) o;

        if (x != that.x) return false;
        return y == that.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
