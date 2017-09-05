/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IncorrectNumTokens extends OpenSimException {
  private transient long swigCPtr;

  public IncorrectNumTokens(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.IncorrectNumTokens_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IncorrectNumTokens obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_IncorrectNumTokens(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IncorrectNumTokens(String file, long line, String func, String msg) {
    this(opensimCommonJNI.new_IncorrectNumTokens(file, line, func, msg), true);
  }

}