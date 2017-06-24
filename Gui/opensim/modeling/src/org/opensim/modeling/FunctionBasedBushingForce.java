/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FunctionBasedBushingForce extends TwoFrameLinkerForce {
  private transient long swigCPtr;

  public FunctionBasedBushingForce(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.FunctionBasedBushingForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FunctionBasedBushingForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_FunctionBasedBushingForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static FunctionBasedBushingForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.FunctionBasedBushingForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new FunctionBasedBushingForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.FunctionBasedBushingForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.FunctionBasedBushingForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.FunctionBasedBushingForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new FunctionBasedBushingForce(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.FunctionBasedBushingForce_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_m_x_theta_x_function(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_m_x_theta_x_function(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Function get_m_x_theta_x_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_m_x_theta_x_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_m_x_theta_x_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_m_x_theta_x_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_m_x_theta_x_function(int i, Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_m_x_theta_x_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_m_x_theta_x_function(Function value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_m_x_theta_x_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_m_x_theta_x_function() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_m_x_theta_x_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_m_x_theta_x_function(Function initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_m_x_theta_x_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_m_x_theta_x_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_m_x_theta_x_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_m_x_theta_x_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_m_x_theta_x_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_m_x_theta_x_function(Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_m_x_theta_x_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_m_y_theta_y_function(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_m_y_theta_y_function(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Function get_m_y_theta_y_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_m_y_theta_y_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_m_y_theta_y_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_m_y_theta_y_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_m_y_theta_y_function(int i, Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_m_y_theta_y_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_m_y_theta_y_function(Function value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_m_y_theta_y_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_m_y_theta_y_function() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_m_y_theta_y_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_m_y_theta_y_function(Function initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_m_y_theta_y_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_m_y_theta_y_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_m_y_theta_y_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_m_y_theta_y_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_m_y_theta_y_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_m_y_theta_y_function(Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_m_y_theta_y_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_m_z_theta_z_function(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_m_z_theta_z_function(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Function get_m_z_theta_z_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_m_z_theta_z_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_m_z_theta_z_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_m_z_theta_z_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_m_z_theta_z_function(int i, Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_m_z_theta_z_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_m_z_theta_z_function(Function value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_m_z_theta_z_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_m_z_theta_z_function() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_m_z_theta_z_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_m_z_theta_z_function(Function initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_m_z_theta_z_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_m_z_theta_z_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_m_z_theta_z_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_m_z_theta_z_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_m_z_theta_z_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_m_z_theta_z_function(Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_m_z_theta_z_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_f_x_delta_x_function(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_f_x_delta_x_function(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Function get_f_x_delta_x_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_f_x_delta_x_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_f_x_delta_x_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_f_x_delta_x_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_f_x_delta_x_function(int i, Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_f_x_delta_x_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_f_x_delta_x_function(Function value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_f_x_delta_x_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_f_x_delta_x_function() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_f_x_delta_x_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_f_x_delta_x_function(Function initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_f_x_delta_x_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_f_x_delta_x_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_f_x_delta_x_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_f_x_delta_x_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_f_x_delta_x_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_f_x_delta_x_function(Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_f_x_delta_x_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_f_y_delta_y_function(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_f_y_delta_y_function(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Function get_f_y_delta_y_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_f_y_delta_y_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_f_y_delta_y_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_f_y_delta_y_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_f_y_delta_y_function(int i, Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_f_y_delta_y_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_f_y_delta_y_function(Function value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_f_y_delta_y_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_f_y_delta_y_function() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_f_y_delta_y_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_f_y_delta_y_function(Function initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_f_y_delta_y_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_f_y_delta_y_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_f_y_delta_y_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_f_y_delta_y_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_f_y_delta_y_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_f_y_delta_y_function(Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_f_y_delta_y_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_f_z_delta_z_function(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_f_z_delta_z_function(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Function get_f_z_delta_z_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_f_z_delta_z_function__SWIG_0(swigCPtr, this, i), false);
  }

  public Function upd_f_z_delta_z_function(int i) {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_f_z_delta_z_function__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_f_z_delta_z_function(int i, Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_f_z_delta_z_function__SWIG_0(swigCPtr, this, i, Function.getCPtr(value), value);
  }

  public int append_f_z_delta_z_function(Function value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_f_z_delta_z_function(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void constructProperty_f_z_delta_z_function() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_f_z_delta_z_function__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_f_z_delta_z_function(Function initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_f_z_delta_z_function__SWIG_1(swigCPtr, this, Function.getCPtr(initValue), initValue);
  }

  public Function get_f_z_delta_z_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_get_f_z_delta_z_function__SWIG_1(swigCPtr, this), false);
  }

  public Function upd_f_z_delta_z_function() {
    return new Function(opensimSimulationJNI.FunctionBasedBushingForce_upd_f_z_delta_z_function__SWIG_1(swigCPtr, this), false);
  }

  public void set_f_z_delta_z_function(Function value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_f_z_delta_z_function__SWIG_1(swigCPtr, this, Function.getCPtr(value), value);
  }

  public void copyProperty_visual_aspect_ratio(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_visual_aspect_ratio(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public double get_visual_aspect_ratio(int i) {
    return opensimSimulationJNI.FunctionBasedBushingForce_get_visual_aspect_ratio__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_visual_aspect_ratio(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FunctionBasedBushingForce_upd_visual_aspect_ratio__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_visual_aspect_ratio(int i, double value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_visual_aspect_ratio__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_visual_aspect_ratio(double value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_visual_aspect_ratio(swigCPtr, this, value);
  }

  public void constructProperty_visual_aspect_ratio() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_visual_aspect_ratio__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_visual_aspect_ratio(double initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_visual_aspect_ratio__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_visual_aspect_ratio() {
    return opensimSimulationJNI.FunctionBasedBushingForce_get_visual_aspect_ratio__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_visual_aspect_ratio() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FunctionBasedBushingForce_upd_visual_aspect_ratio__SWIG_1(swigCPtr, this), false);
  }

  public void set_visual_aspect_ratio(double value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_visual_aspect_ratio__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_moment_visual_scale(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_moment_visual_scale(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public double get_moment_visual_scale(int i) {
    return opensimSimulationJNI.FunctionBasedBushingForce_get_moment_visual_scale__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_moment_visual_scale(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FunctionBasedBushingForce_upd_moment_visual_scale__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_moment_visual_scale(int i, double value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_moment_visual_scale__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_moment_visual_scale(double value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_moment_visual_scale(swigCPtr, this, value);
  }

  public void constructProperty_moment_visual_scale() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_moment_visual_scale__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_moment_visual_scale(double initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_moment_visual_scale__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_moment_visual_scale() {
    return opensimSimulationJNI.FunctionBasedBushingForce_get_moment_visual_scale__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_moment_visual_scale() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FunctionBasedBushingForce_upd_moment_visual_scale__SWIG_1(swigCPtr, this), false);
  }

  public void set_moment_visual_scale(double value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_moment_visual_scale__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_force_visual_scale(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_force_visual_scale(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public double get_force_visual_scale(int i) {
    return opensimSimulationJNI.FunctionBasedBushingForce_get_force_visual_scale__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_force_visual_scale(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FunctionBasedBushingForce_upd_force_visual_scale__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_force_visual_scale(int i, double value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_force_visual_scale__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_force_visual_scale(double value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_force_visual_scale(swigCPtr, this, value);
  }

  public void constructProperty_force_visual_scale() {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_force_visual_scale__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_force_visual_scale(double initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_force_visual_scale__SWIG_1(swigCPtr, this, initValue);
  }

  public double get_force_visual_scale() {
    return opensimSimulationJNI.FunctionBasedBushingForce_get_force_visual_scale__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_force_visual_scale() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.FunctionBasedBushingForce_upd_force_visual_scale__SWIG_1(swigCPtr, this), false);
  }

  public void set_force_visual_scale(double value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_force_visual_scale__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_rotational_damping(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_rotational_damping(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Vec3 get_rotational_damping(int i) {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_get_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_rotational_damping(int i) {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_upd_rotational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rotational_damping(int i, Vec3 value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_rotational_damping__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_rotational_damping(Vec3 value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_rotational_damping(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_rotational_damping(Vec3 initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_rotational_damping(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_rotational_damping() {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_get_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_rotational_damping() {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_upd_rotational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_rotational_damping(Vec3 value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_rotational_damping__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_translational_damping(FunctionBasedBushingForce source) {
    opensimSimulationJNI.FunctionBasedBushingForce_copyProperty_translational_damping(swigCPtr, this, FunctionBasedBushingForce.getCPtr(source), source);
  }

  public Vec3 get_translational_damping(int i) {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_get_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_translational_damping(int i) {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_upd_translational_damping__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_translational_damping(int i, Vec3 value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_translational_damping__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_translational_damping(Vec3 value) {
    return opensimSimulationJNI.FunctionBasedBushingForce_append_translational_damping(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_translational_damping(Vec3 initValue) {
    opensimSimulationJNI.FunctionBasedBushingForce_constructProperty_translational_damping(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_translational_damping() {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_get_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_translational_damping() {
    return new Vec3(opensimSimulationJNI.FunctionBasedBushingForce_upd_translational_damping__SWIG_1(swigCPtr, this), false);
  }

  public void set_translational_damping(Vec3 value) {
    opensimSimulationJNI.FunctionBasedBushingForce_set_translational_damping__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public FunctionBasedBushingForce() {
    this(opensimSimulationJNI.new_FunctionBasedBushingForce__SWIG_0(), true);
  }

  public FunctionBasedBushingForce(String name, String frame1Name, Vec3 point1, Vec3 orientation1, String frame2Name, Vec3 point2, Vec3 orientation2) {
    this(opensimSimulationJNI.new_FunctionBasedBushingForce__SWIG_1(name, frame1Name, Vec3.getCPtr(point1), point1, Vec3.getCPtr(orientation1), orientation1, frame2Name, Vec3.getCPtr(point2), point2, Vec3.getCPtr(orientation2), orientation2), true);
  }

  public FunctionBasedBushingForce(String name, String frame1Name, Vec3 point1, Vec3 orientation1, String frame2Name, Vec3 point2, Vec3 orientation2, Vec3 transStiffness, Vec3 rotStiffness, Vec3 transDamping, Vec3 rotDamping) {
    this(opensimSimulationJNI.new_FunctionBasedBushingForce__SWIG_2(name, frame1Name, Vec3.getCPtr(point1), point1, Vec3.getCPtr(orientation1), orientation1, frame2Name, Vec3.getCPtr(point2), point2, Vec3.getCPtr(orientation2), orientation2, Vec3.getCPtr(transStiffness), transStiffness, Vec3.getCPtr(rotStiffness), rotStiffness, Vec3.getCPtr(transDamping), transDamping, Vec3.getCPtr(rotDamping), rotDamping), true);
  }

  public void setMomentVisualScale(double scale) {
    opensimSimulationJNI.FunctionBasedBushingForce_setMomentVisualScale(swigCPtr, this, scale);
  }

  public void setForceVisualScale(double scale) {
    opensimSimulationJNI.FunctionBasedBushingForce_setForceVisualScale(swigCPtr, this, scale);
  }

  public void setVisualAspectRatio(double ratio) {
    opensimSimulationJNI.FunctionBasedBushingForce_setVisualAspectRatio(swigCPtr, this, ratio);
  }

  public Vec6 calcStiffnessForce(State state) {
    return new Vec6(opensimSimulationJNI.FunctionBasedBushingForce_calcStiffnessForce(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public Vec6 calcDampingForce(State state) {
    return new Vec6(opensimSimulationJNI.FunctionBasedBushingForce_calcDampingForce(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void computeForce(State s, VectorOfSpatialVec bodyForces, Vector generalizedForces) {
    opensimSimulationJNI.FunctionBasedBushingForce_computeForce(swigCPtr, this, State.getCPtr(s), s, VectorOfSpatialVec.getCPtr(bodyForces), bodyForces, Vector.getCPtr(generalizedForces), generalizedForces);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimSimulationJNI.FunctionBasedBushingForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimSimulationJNI.FunctionBasedBushingForce_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
