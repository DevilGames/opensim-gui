/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapDoubleCylinderObst extends WrapObject {
  private transient long swigCPtr;

  public WrapDoubleCylinderObst(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.WrapDoubleCylinderObst_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapDoubleCylinderObst obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_WrapDoubleCylinderObst(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapDoubleCylinderObst safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.WrapDoubleCylinderObst_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapDoubleCylinderObst(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.WrapDoubleCylinderObst_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.WrapDoubleCylinderObst_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.WrapDoubleCylinderObst_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapDoubleCylinderObst(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.WrapDoubleCylinderObst_getConcreteClassName(swigCPtr, this);
  }

  public WrapDoubleCylinderObst() {
    this(opensimModelSimulationJNI.new_WrapDoubleCylinderObst__SWIG_0(), true);
  }

  public WrapDoubleCylinderObst(WrapDoubleCylinderObst aWrapDoubleCylinderObst) {
    this(opensimModelSimulationJNI.new_WrapDoubleCylinderObst__SWIG_1(WrapDoubleCylinderObst.getCPtr(aWrapDoubleCylinderObst), aWrapDoubleCylinderObst), true);
  }

  public void copyData(WrapDoubleCylinderObst aWrapDoubleCylinderObst) {
    opensimModelSimulationJNI.WrapDoubleCylinderObst_copyData(swigCPtr, this, WrapDoubleCylinderObst.getCPtr(aWrapDoubleCylinderObst), aWrapDoubleCylinderObst);
  }

  public double getRadius() {
    return opensimModelSimulationJNI.WrapDoubleCylinderObst_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimModelSimulationJNI.WrapDoubleCylinderObst_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimModelSimulationJNI.WrapDoubleCylinderObst_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimModelSimulationJNI.WrapDoubleCylinderObst_setLength(swigCPtr, this, aLength);
  }

  public int getWrapDirection() {
    return opensimModelSimulationJNI.WrapDoubleCylinderObst_getWrapDirection(swigCPtr, this);
  }

  public String getWrapTypeName() {
    return opensimModelSimulationJNI.WrapDoubleCylinderObst_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelSimulationJNI.WrapDoubleCylinderObst_getDimensionsString(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelSimulationJNI.WrapDoubleCylinderObst_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, Body aBody) {
    opensimModelSimulationJNI.WrapDoubleCylinderObst_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, Body.getCPtr(aBody), aBody);
  }

}
