/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MissingHeader extends IOError {
  private transient long swigCPtr;

  public MissingHeader(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.MissingHeader_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MissingHeader obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_MissingHeader(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MissingHeader() {
    this(opensimModelCommonJNI.new_MissingHeader(), true);
  }

}
