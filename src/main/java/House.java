import java.util.Objects;

public class House {
    int x;
    int y;
    int z;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return x == house.x &&
                y == house.y &&
                z == house.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
