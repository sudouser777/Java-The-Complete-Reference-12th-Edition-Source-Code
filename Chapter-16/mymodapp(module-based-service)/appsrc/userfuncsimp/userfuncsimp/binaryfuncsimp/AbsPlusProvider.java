// This is a provider for the AbsPlus function. 
 
package userfuncsimp.binaryfuncsimp; 
 
import userfuncs.binaryfuncs.*; 
 
public class AbsPlusProvider implements BinFuncProvider { 
 
  // Provide an AbsPlus object. 
  public BinaryFunc get() { return new AbsPlus(); } 
}