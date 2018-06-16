package zaj2;

import java.util.Objects;

public class ColorPoint3d {
    Double x;
    Double y;
    Double z;
    private Color color;

    public ColorPoint3d(Double x, Double y, Double z, Color color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorPoint3d that = (ColorPoint3d) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y) &&
                Objects.equals(z, that.z) &&
                color == that.color;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z, color);
    }

    @Override
    public String toString() {
        return "ColorPoint3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", color=" + color +
                '}';
    }
}
