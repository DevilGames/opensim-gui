/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PhysicalOffsetFrame extends PhysicalFrameWithOffset {
  private long swigCPtr;

  public PhysicalOffsetFrame(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PhysicalOffsetFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PhysicalOffsetFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PhysicalOffsetFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PhysicalOffsetFrame safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PhysicalOffsetFrame_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PhysicalOffsetFrame(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PhysicalOffsetFrame_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PhysicalOffsetFrame_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PhysicalOffsetFrame_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PhysicalOffsetFrame(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PhysicalOffsetFrame_getConcreteClassName(swigCPtr, this);
  }

  public PhysicalOffsetFrame() {
    this(opensimModelJNI.new_PhysicalOffsetFrame__SWIG_0(), true);
  }

  public PhysicalOffsetFrame(PhysicalFrame parent, Transform offset) {
    this(opensimModelJNI.new_PhysicalOffsetFrame__SWIG_1(PhysicalFrame.getCPtr(parent), parent, Transform.getCPtr(offset), offset), true);
  }

}