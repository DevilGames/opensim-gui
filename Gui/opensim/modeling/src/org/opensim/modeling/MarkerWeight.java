/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MarkerWeight extends OpenSimObject {
  private long swigCPtr;

  public MarkerWeight(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MarkerWeight_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MarkerWeight obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MarkerWeight(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MarkerWeight safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MarkerWeight_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MarkerWeight(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MarkerWeight_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MarkerWeight_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MarkerWeight_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MarkerWeight(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MarkerWeight_getConcreteClassName(swigCPtr, this);
  }

  public MarkerWeight() {
    this(opensimModelJNI.new_MarkerWeight__SWIG_0(), true);
  }

  public MarkerWeight(String name, double weight) {
    this(opensimModelJNI.new_MarkerWeight__SWIG_1(name, weight), true);
  }

  public MarkerWeight(MarkerWeight source) {
    this(opensimModelJNI.new_MarkerWeight__SWIG_2(MarkerWeight.getCPtr(source), source), true);
  }

  public void setWeight(double weight) {
    opensimModelJNI.MarkerWeight_setWeight(swigCPtr, this, weight);
  }

  public double getWeight() {
    return opensimModelJNI.MarkerWeight_getWeight(swigCPtr, this);
  }

}