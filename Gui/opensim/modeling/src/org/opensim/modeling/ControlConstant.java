/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ControlConstant extends Control {
  private long swigCPtr;

  public ControlConstant(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ControlConstant_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ControlConstant obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ControlConstant(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ControlConstant safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ControlConstant_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ControlConstant(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ControlConstant_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ControlConstant_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ControlConstant_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ControlConstant(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ControlConstant_getConcreteClassName(swigCPtr, this);
  }

  public int getNumParameters() {
    return opensimModelJNI.ControlConstant_getNumParameters(swigCPtr, this);
  }

  public void setParameterMin(int aI, double aMin) {
    opensimModelJNI.ControlConstant_setParameterMin(swigCPtr, this, aI, aMin);
  }

  public double getParameterMin(int aI) {
    return opensimModelJNI.ControlConstant_getParameterMin(swigCPtr, this, aI);
  }

  public void setParameterMax(int aI, double aMax) {
    opensimModelJNI.ControlConstant_setParameterMax(swigCPtr, this, aI, aMax);
  }

  public double getParameterMax(int aI) {
    return opensimModelJNI.ControlConstant_getParameterMax(swigCPtr, this, aI);
  }

  public double getParameterTime(int aI) {
    return opensimModelJNI.ControlConstant_getParameterTime(swigCPtr, this, aI);
  }

  public void getParameterNeighborhood(int aI, SWIGTYPE_p_double rTLower, SWIGTYPE_p_double rTUpper) {
    opensimModelJNI.ControlConstant_getParameterNeighborhood(swigCPtr, this, aI, SWIGTYPE_p_double.getCPtr(rTLower), SWIGTYPE_p_double.getCPtr(rTUpper));
  }

  public int getParameterList(double aT, ArrayInt rList) {
    return opensimModelJNI.ControlConstant_getParameterList__SWIG_0(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList);
  }

  public int getParameterList(double aT1, double aT2, ArrayInt rList) {
    return opensimModelJNI.ControlConstant_getParameterList__SWIG_1(swigCPtr, this, aT1, aT2, ArrayInt.getCPtr(rList), rList);
  }

  public void setParameterValue(int aI, double aX) {
    opensimModelJNI.ControlConstant_setParameterValue(swigCPtr, this, aI, aX);
  }

  public double getParameterValue(int aI) {
    return opensimModelJNI.ControlConstant_getParameterValue(swigCPtr, this, aI);
  }

  public void setControlValue(double aT, double aX) {
    opensimModelJNI.ControlConstant_setControlValue(swigCPtr, this, aT, aX);
  }

  public double getControlValue(double aT) {
    return opensimModelJNI.ControlConstant_getControlValue(swigCPtr, this, aT);
  }

  public double getControlValueMin(double aT) {
    return opensimModelJNI.ControlConstant_getControlValueMin__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMin() {
    return opensimModelJNI.ControlConstant_getControlValueMin__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMin(double aT, double aX) {
    opensimModelJNI.ControlConstant_setControlValueMin(swigCPtr, this, aT, aX);
  }

  public double getControlValueMax(double aT) {
    return opensimModelJNI.ControlConstant_getControlValueMax__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMax() {
    return opensimModelJNI.ControlConstant_getControlValueMax__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMax(double aT, double aX) {
    opensimModelJNI.ControlConstant_setControlValueMax(swigCPtr, this, aT, aX);
  }

}
