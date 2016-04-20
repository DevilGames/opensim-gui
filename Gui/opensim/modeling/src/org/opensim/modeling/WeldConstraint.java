/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WeldConstraint extends TwoFrameLinkerConstraint {
  private transient long swigCPtr;

  public WeldConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.WeldConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WeldConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_WeldConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WeldConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.WeldConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WeldConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.WeldConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.WeldConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.WeldConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WeldConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.WeldConstraint_getConcreteClassName(swigCPtr, this);
  }

  public WeldConstraint() {
    this(opensimModelSimulationJNI.new_WeldConstraint__SWIG_0(), true);
  }

  public WeldConstraint(String name, String frame1Name, String frame2Name) {
    this(opensimModelSimulationJNI.new_WeldConstraint__SWIG_1(name, frame1Name, frame2Name), true);
  }

  public WeldConstraint(String name, PhysicalFrame frame1, Vec3 locationInFrame1, Vec3 orientationInFrame1, PhysicalFrame frame2, Vec3 locationInFrame2, Vec3 orientationInFrame2) {
    this(opensimModelSimulationJNI.new_WeldConstraint__SWIG_2(name, PhysicalFrame.getCPtr(frame1), frame1, Vec3.getCPtr(locationInFrame1), locationInFrame1, Vec3.getCPtr(orientationInFrame1), orientationInFrame1, PhysicalFrame.getCPtr(frame2), frame2, Vec3.getCPtr(locationInFrame2), locationInFrame2, Vec3.getCPtr(orientationInFrame2), orientationInFrame2), true);
  }

  public WeldConstraint(String name, PhysicalFrame frame1, Transform transformInFrame1, PhysicalFrame frame2, Transform transformInFrame2) {
    this(opensimModelSimulationJNI.new_WeldConstraint__SWIG_3(name, PhysicalFrame.getCPtr(frame1), frame1, Transform.getCPtr(transformInFrame1), transformInFrame1, PhysicalFrame.getCPtr(frame2), frame2, Transform.getCPtr(transformInFrame2), transformInFrame2), true);
  }

  public void setContactPointForInducedAccelerations(State s, Vec3 point) {
    opensimModelSimulationJNI.WeldConstraint_setContactPointForInducedAccelerations(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(point), point);
  }

}
