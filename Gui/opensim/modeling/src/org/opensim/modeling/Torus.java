/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Torus extends AnalyticGeometry {
  private transient long swigCPtr;

  public Torus(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Torus_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Torus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Torus(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Torus safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Torus_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Torus(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Torus_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Torus_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Torus_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Torus(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Torus_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_cross_section(Torus source) {
    opensimSimulationJNI.Torus_copyProperty_cross_section(swigCPtr, this, Torus.getCPtr(source), source);
  }

  public double get_cross_section(int i) {
    return opensimSimulationJNI.Torus_get_cross_section__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_cross_section(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Torus_upd_cross_section__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_cross_section(int i, double value) {
    opensimSimulationJNI.Torus_set_cross_section__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_cross_section(double value) {
    return opensimSimulationJNI.Torus_append_cross_section(swigCPtr, this, value);
  }

  public void constructProperty_cross_section(double initValue) {
    opensimSimulationJNI.Torus_constructProperty_cross_section(swigCPtr, this, initValue);
  }

  public double get_cross_section() {
    return opensimSimulationJNI.Torus_get_cross_section__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_cross_section() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Torus_upd_cross_section__SWIG_1(swigCPtr, this), false);
  }

  public void set_cross_section(double value) {
    opensimSimulationJNI.Torus_set_cross_section__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_ring_radius(Torus source) {
    opensimSimulationJNI.Torus_copyProperty_ring_radius(swigCPtr, this, Torus.getCPtr(source), source);
  }

  public double get_ring_radius(int i) {
    return opensimSimulationJNI.Torus_get_ring_radius__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_ring_radius(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Torus_upd_ring_radius__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ring_radius(int i, double value) {
    opensimSimulationJNI.Torus_set_ring_radius__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ring_radius(double value) {
    return opensimSimulationJNI.Torus_append_ring_radius(swigCPtr, this, value);
  }

  public void constructProperty_ring_radius(double initValue) {
    opensimSimulationJNI.Torus_constructProperty_ring_radius(swigCPtr, this, initValue);
  }

  public double get_ring_radius() {
    return opensimSimulationJNI.Torus_get_ring_radius__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_ring_radius() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.Torus_upd_ring_radius__SWIG_1(swigCPtr, this), false);
  }

  public void set_ring_radius(double value) {
    opensimSimulationJNI.Torus_set_ring_radius__SWIG_1(swigCPtr, this, value);
  }

  public Torus() {
    this(opensimSimulationJNI.new_Torus__SWIG_0(), true);
  }

  public Torus(double ringRadius, double crossSectionRadius) {
    this(opensimSimulationJNI.new_Torus__SWIG_1(ringRadius, crossSectionRadius), true);
  }

}
