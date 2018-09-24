/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InvalidColumnLabel extends OpenSimException {
  private transient long swigCPtr;

  public InvalidColumnLabel(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.InvalidColumnLabel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InvalidColumnLabel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_InvalidColumnLabel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public InvalidColumnLabel() {
    this(opensimCommonJNI.new_InvalidColumnLabel(), true);
  }

}
