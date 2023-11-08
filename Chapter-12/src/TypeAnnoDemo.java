// Demonstrate several type annotations.

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// A marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

// Another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

// Still another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface Unique {
}

// A parameterized annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// An annotation that can be applied to a type parameter.
@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

// An annotation that can be applied to a field declaration.
@Target(ElementType.FIELD)
@interface EmptyOK {
}

// An annotation that can be applied to a method declaration.
@Target(ElementType.METHOD)
@interface Recommended {
}


// Use an annotation on a type parameter.  
class TypeAnnoDemo<@What(description = "Generic data type") T> {

    // Annotate the type (in this case String), not the field.
    @TypeAnno String str;
    // This annotates the field test.
    @EmptyOK
    String test;
    // Annotate array levels.
    String @MaxLen(10) [] @NotZeroLen [] w;
    // Annotate the array element type.
    @TypeAnno Integer[] vec;

    // Use a type annotation on a constructor.
    public @Unique TypeAnnoDemo() {
    }

    public static void myMeth(int i) {

        // Use a type annotation on a type argument.
        TypeAnnoDemo<@TypeAnno Integer> ob =
                new TypeAnnoDemo<@TypeAnno Integer>();

        // Use a type annotation with new.
        @Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();

        Object x = Integer.valueOf(10);
        Integer y;

        // Use a type annotation on a cast.
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }

    // Use a type annotation to annotate this (the receiver).
    public int f(@TypeAnno TypeAnnoDemo<T>this, int x) {
        return 10;
    }

    // Annotate the return type.
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    // Annotate the method declaration.
    public @Recommended Integer f3(String str) {
        return str.length() / 2;
    }

    // Use a type annotation with a throws clause.
    public void f4() throws @TypeAnno NullPointerException {
        // ...
    }

    // Use type annotation with inheritance clause.
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
    }
}