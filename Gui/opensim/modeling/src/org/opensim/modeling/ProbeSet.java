/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ProbeSet extends ModelComponentSetProbes {
  private transient long swigCPtr;

  public ProbeSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ProbeSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ProbeSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ProbeSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ProbeSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ProbeSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ProbeSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ProbeSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ProbeSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ProbeSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ProbeSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ProbeSet_getConcreteClassName(swigCPtr, this);
  }

  public ProbeSet() {
    this(opensimSimulationJNI.new_ProbeSet__SWIG_0(), true);
  }

  public ProbeSet(String file, boolean updateFromXML) {
    this(opensimSimulationJNI.new_ProbeSet__SWIG_1(file, updateFromXML), true);
  }

  public ProbeSet(String file) {
    this(opensimSimulationJNI.new_ProbeSet__SWIG_2(file), true);
  }

}
