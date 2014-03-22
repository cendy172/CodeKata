package com.oo;

import static com.oo.Unit.Mile;
import static com.oo.Unit.Yard;

public abstract class Length {

    public static final int MILE_TO_YARD = 1760;
    public static final int YARD_TO_FEET = 3;
    public static final int FEET_TO_INCH = 12;

    private final int size;
    private final Unit unit = Unit.Inch;

    public Length(int size, Unit unit) {
        if (unit == Mile) {
            this.size = size * MILE_TO_YARD * YARD_TO_FEET * FEET_TO_INCH;
        } else if (unit == Yard) {
            this.size = size * YARD_TO_FEET * FEET_TO_INCH;
        } else if (unit == Unit.Feet) {
            this.size = size * FEET_TO_INCH;
        } else {
            this.size = size;
        }
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null) return false;

        Length length = (Length) o;

        if (size != length.size) return false;
        if (!unit.equals(length.unit)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + unit.hashCode();
        return result;
    }
}
