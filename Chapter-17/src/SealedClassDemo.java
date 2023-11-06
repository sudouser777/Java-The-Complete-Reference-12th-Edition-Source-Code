public class SealedClassDemo {
}

sealed class MySealedClass permits Alpha, Beta, Gamma {

}


final class Alpha extends MySealedClass {

}

non-sealed class Beta extends MySealedClass {

}

sealed class Gamma extends MySealedClass permits GammaImpl {

}


final class GammaImpl extends Gamma {

}
// This is invalid
/*
final class Temp extends MySealedClass{

}*/


sealed interface A permits B, C, D {

}


non-sealed class B implements A{

}

final class C implements A {

}

non-sealed interface D extends A {

}