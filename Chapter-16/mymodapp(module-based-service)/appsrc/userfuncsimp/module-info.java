module userfuncsimp {
    requires userfuncs;

    provides userfuncs.binaryfuncs.BinFuncProvider with
            userfuncsimp.binaryfuncsimp.AbsPlusProvider,
            userfuncsimp.binaryfuncsimp.AbsMinusProvider;
}