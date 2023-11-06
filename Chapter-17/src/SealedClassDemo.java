sealed interface A permits B, C, D {

}

non-sealed interface D extends A {

}

public class SealedClassDemo {
}

sealed class MySealedClass permits Alpha, Beta, Gamma {

}

final class Alpha extends MySealedClass {

}

non-sealed class Beta extends MySealedClass {

}
// This is invalid
/*
final class Temp extends MySealedClass{

}*/

sealed class Gamma extends MySealedClass permits GammaImpl {

}

final class GammaImpl extends Gamma {

}

non-sealed class B implements A {

}

final class C implements A {

}