/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IndexOutOfRange extends OpenSimException {
  private transient long swigCPtr;

  public IndexOutOfRange(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.IndexOutOfRange_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IndexOutOfRange obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_IndexOutOfRange(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IndexOutOfRange(String file, long line, String func, long index, long min, long max) {
    this(opensimModelCommonJNI.new_IndexOutOfRange(file, line, func, index, min, max), true);
  }

}