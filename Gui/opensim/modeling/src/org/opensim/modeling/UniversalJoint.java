/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class UniversalJoint extends Joint {
  private transient long swigCPtr;

  public UniversalJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.UniversalJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(UniversalJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_UniversalJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static UniversalJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.UniversalJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new UniversalJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.UniversalJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.UniversalJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.UniversalJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new UniversalJoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.UniversalJoint_getConcreteClassName(swigCPtr, this);
  }

  public UniversalJoint(String name, PhysicalFrame parent, PhysicalFrame child) {
    this(opensimModelSimulationJNI.new_UniversalJoint__SWIG_0(name, PhysicalFrame.getCPtr(parent), parent, PhysicalFrame.getCPtr(child), child), true);
  }

  public UniversalJoint(String name, PhysicalFrame parent, Vec3 locationInParent, Vec3 orientationInParent, PhysicalFrame child, Vec3 locationInChild, Vec3 orientationInChild) {
    this(opensimModelSimulationJNI.new_UniversalJoint__SWIG_1(name, PhysicalFrame.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, PhysicalFrame.getCPtr(child), child, Vec3.getCPtr(locationInChild), locationInChild, Vec3.getCPtr(orientationInChild), orientationInChild), true);
  }

}
