/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Vector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Vector() {
    this(opensimModelJNI.new_Vector__SWIG_0(), true);
  }

  public Vector(int m, SWIGTYPE_p_double cppInitialValues) {
    this(opensimModelJNI.new_Vector__SWIG_1(m, SWIGTYPE_p_double.getCPtr(cppInitialValues)), true);
  }

  public Vector(int m, double initialValue) {
    this(opensimModelJNI.new_Vector__SWIG_2(m, initialValue), true);
  }

}