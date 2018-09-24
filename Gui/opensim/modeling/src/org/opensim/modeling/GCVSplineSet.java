/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class GCVSplineSet extends FunctionSet {
  private transient long swigCPtr;

  public GCVSplineSet(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.GCVSplineSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(GCVSplineSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_GCVSplineSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static GCVSplineSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.GCVSplineSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new GCVSplineSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.GCVSplineSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.GCVSplineSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.GCVSplineSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new GCVSplineSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.GCVSplineSet_getConcreteClassName(swigCPtr, this);
  }

  public GCVSplineSet() {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_0(), true);
  }

  public GCVSplineSet(String aFileName) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_1(aFileName), true);
  }

  public GCVSplineSet(int aDegree, Storage aStore, double aErrorVariance) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_2(aDegree, Storage.getCPtr(aStore), aStore, aErrorVariance), true);
  }

  public GCVSplineSet(int aDegree, Storage aStore) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_3(aDegree, Storage.getCPtr(aStore), aStore), true);
  }

  public GCVSplineSet(TimeSeriesTable table, StdVectorString labels, int degree, double errorVariance) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_4(TimeSeriesTable.getCPtr(table), table, StdVectorString.getCPtr(labels), labels, degree, errorVariance), true);
  }

  public GCVSplineSet(TimeSeriesTable table, StdVectorString labels, int degree) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_5(TimeSeriesTable.getCPtr(table), table, StdVectorString.getCPtr(labels), labels, degree), true);
  }

  public GCVSplineSet(TimeSeriesTable table, StdVectorString labels) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_6(TimeSeriesTable.getCPtr(table), table, StdVectorString.getCPtr(labels), labels), true);
  }

  public GCVSplineSet(TimeSeriesTable table) {
    this(opensimCommonJNI.new_GCVSplineSet__SWIG_7(TimeSeriesTable.getCPtr(table), table), true);
  }

  public GCVSpline getGCVSpline(int aIndex) {
    long cPtr = opensimCommonJNI.GCVSplineSet_getGCVSpline(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new GCVSpline(cPtr, false);
  }

  public double getMinX() {
    return opensimCommonJNI.GCVSplineSet_getMinX(swigCPtr, this);
  }

  public double getMaxX() {
    return opensimCommonJNI.GCVSplineSet_getMaxX(swigCPtr, this);
  }

  public Storage constructStorage(int aDerivOrder, double aDX) {
    long cPtr = opensimCommonJNI.GCVSplineSet_constructStorage__SWIG_0(swigCPtr, this, aDerivOrder, aDX);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

  public Storage constructStorage(int aDerivOrder) {
    long cPtr = opensimCommonJNI.GCVSplineSet_constructStorage__SWIG_1(swigCPtr, this, aDerivOrder);
    return (cPtr == 0) ? null : new Storage(cPtr, false);
  }

}
