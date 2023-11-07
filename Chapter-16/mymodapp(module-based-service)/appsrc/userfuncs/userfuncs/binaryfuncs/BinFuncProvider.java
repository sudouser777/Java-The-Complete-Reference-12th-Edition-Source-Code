// This interface defines the form of a service provider that 
// obtains BinaryFunc instances. 
package userfuncs.binaryfuncs;

import userfuncs.binaryfuncs.BinaryFunc;

public interface BinFuncProvider {

    // Obtain a BinaryFunc.
    public BinaryFunc get();
}