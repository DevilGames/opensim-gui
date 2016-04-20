/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StateVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public StateVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StateVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_StateVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StateVector(double aT, int aN, SWIGTYPE_p_double aData) {
    this(opensimModelCommonJNI.new_StateVector__SWIG_0(aT, aN, SWIGTYPE_p_double.getCPtr(aData)), true);
  }

  public StateVector(double aT, int aN) {
    this(opensimModelCommonJNI.new_StateVector__SWIG_1(aT, aN), true);
  }

  public StateVector(double aT) {
    this(opensimModelCommonJNI.new_StateVector__SWIG_2(aT), true);
  }

  public StateVector() {
    this(opensimModelCommonJNI.new_StateVector__SWIG_3(), true);
  }

  public StateVector(StateVector aVector) {
    this(opensimModelCommonJNI.new_StateVector__SWIG_4(StateVector.getCPtr(aVector), aVector), true);
  }

  public void setStates(double aT, int aN, double[] aY) {
    opensimModelCommonJNI.StateVector_setStates(swigCPtr, this, aT, aN, aY);
  }

  public int getSize() {
    return opensimModelCommonJNI.StateVector_getSize(swigCPtr, this);
  }

  public void setTime(double aT) {
    opensimModelCommonJNI.StateVector_setTime(swigCPtr, this, aT);
  }

  public double getTime() {
    return opensimModelCommonJNI.StateVector_getTime(swigCPtr, this);
  }

  public int getDataValue(int aIndex, SWIGTYPE_p_double rValue) {
    return opensimModelCommonJNI.StateVector_getDataValue(swigCPtr, this, aIndex, SWIGTYPE_p_double.getCPtr(rValue));
  }

  public void setDataValue(int aIndex, SWIGTYPE_p_double aValue) {
    opensimModelCommonJNI.StateVector_setDataValue(swigCPtr, this, aIndex, SWIGTYPE_p_double.getCPtr(aValue));
  }

  public ArrayDouble getData() {
    return new ArrayDouble(opensimModelCommonJNI.StateVector_getData(swigCPtr, this), false);
  }

  public void shiftTime(double aValue) {
    opensimModelCommonJNI.StateVector_shiftTime(swigCPtr, this, aValue);
  }

  public void scaleTime(double aValue) {
    opensimModelCommonJNI.StateVector_scaleTime(swigCPtr, this, aValue);
  }

  public void add(double aValue) {
    opensimModelCommonJNI.StateVector_add__SWIG_0(swigCPtr, this, aValue);
  }

  public void add(int aN, double[] aY) {
    opensimModelCommonJNI.StateVector_add__SWIG_1(swigCPtr, this, aN, aY);
  }

  public void add(int aN, double aValue) {
    opensimModelCommonJNI.StateVector_add__SWIG_2(swigCPtr, this, aN, aValue);
  }

  public void add(StateVector aStateVector) {
    opensimModelCommonJNI.StateVector_add__SWIG_3(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void subtract(double aValue) {
    opensimModelCommonJNI.StateVector_subtract__SWIG_0(swigCPtr, this, aValue);
  }

  public void subtract(int aN, double[] aY) {
    opensimModelCommonJNI.StateVector_subtract__SWIG_1(swigCPtr, this, aN, aY);
  }

  public void subtract(StateVector aStateVector) {
    opensimModelCommonJNI.StateVector_subtract__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void multiply(double aValue) {
    opensimModelCommonJNI.StateVector_multiply__SWIG_0(swigCPtr, this, aValue);
  }

  public void multiply(int aN, double[] aY) {
    opensimModelCommonJNI.StateVector_multiply__SWIG_1(swigCPtr, this, aN, aY);
  }

  public void multiply(StateVector aStateVector) {
    opensimModelCommonJNI.StateVector_multiply__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

  public void divide(double aValue) {
    opensimModelCommonJNI.StateVector_divide__SWIG_0(swigCPtr, this, aValue);
  }

  public void divide(int aN, double[] aY) {
    opensimModelCommonJNI.StateVector_divide__SWIG_1(swigCPtr, this, aN, aY);
  }

  public void divide(StateVector aStateVector) {
    opensimModelCommonJNI.StateVector_divide__SWIG_2(swigCPtr, this, StateVector.getCPtr(aStateVector), aStateVector);
  }

}
