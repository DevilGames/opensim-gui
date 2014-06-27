/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BallJoint extends Joint {
  private long swigCPtr;

  public BallJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.BallJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(BallJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_BallJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static BallJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.BallJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new BallJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.BallJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.BallJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.BallJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BallJoint(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.BallJoint_getConcreteClassName(swigCPtr, this);
  }

  public BallJoint() {
    this(opensimModelJNI.new_BallJoint__SWIG_0(), true);
  }

  public BallJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body body, Vec3 locationInBody, Vec3 orientationInBody, boolean reverse) {
    this(opensimModelJNI.new_BallJoint__SWIG_1(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(body), body, Vec3.getCPtr(locationInBody), locationInBody, Vec3.getCPtr(orientationInBody), orientationInBody, reverse), true);
   markAdopted();
  }

  public BallJoint(String name, Body parent, Vec3 locationInParent, Vec3 orientationInParent, Body body, Vec3 locationInBody, Vec3 orientationInBody) {
    this(opensimModelJNI.new_BallJoint__SWIG_2(name, Body.getCPtr(parent), parent, Vec3.getCPtr(locationInParent), locationInParent, Vec3.getCPtr(orientationInParent), orientationInParent, Body.getCPtr(body), body, Vec3.getCPtr(locationInBody), locationInBody, Vec3.getCPtr(orientationInBody), orientationInBody), true);
   markAdopted();
  }

  public int numCoordinates() {
    return opensimModelJNI.BallJoint_numCoordinates(swigCPtr, this);
  }

}
