/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WeldJoint extends Joint {
  private transient long swigCPtr;

  public WeldJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.WeldJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WeldJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_WeldJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WeldJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.WeldJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WeldJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.WeldJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.WeldJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.WeldJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WeldJoint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.WeldJoint_getConcreteClassName(swigCPtr, this);
  }

  public WeldJoint() {
    this(opensimSimulationJNI.new_WeldJoint__SWIG_0(), true);
  }

  public WeldJoint(String name, PhysicalFrame parent, PhysicalFrame child) {
    this(opensimSimulationJNI.new_WeldJoint__SWIG_1(name, PhysicalFrame.getCPtr(parent), parent, PhysicalFrame.getCPtr(child), child), true);
  }

  public WeldJoint(String name, PhysicalFrame parent, Vec3 locationInParent, Vec3 orientationInParent, PhysicalFrame child, Vec3 locationInChild, Vec3 orientationInChild) {
    this(opensimSimulationJNI.new_WeldJoint__SWIG_2(name, PhysicalFrame.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, PhysicalFrame.getCPtr(child), child, Vec3.getCPtr(locationInChild), locationInChild, Vec3.getCPtr(orientationInChild), orientationInChild), true);
  }

}
