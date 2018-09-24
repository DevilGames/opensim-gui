/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodySet extends ModelComponentSetBodies {
  private transient long swigCPtr;

  public BodySet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.BodySet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodySet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_BodySet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static BodySet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.BodySet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new BodySet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.BodySet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.BodySet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.BodySet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BodySet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.BodySet_getConcreteClassName(swigCPtr, this);
  }

  public BodySet() {
    this(opensimSimulationJNI.new_BodySet__SWIG_0(), true);
  }

  public BodySet(String file, boolean updateFromXML) {
    this(opensimSimulationJNI.new_BodySet__SWIG_1(file, updateFromXML), true);
  }

  public BodySet(String file) {
    this(opensimSimulationJNI.new_BodySet__SWIG_2(file), true);
  }

}
