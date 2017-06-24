/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PointToPointSpring extends Force {
  private transient long swigCPtr;

  public PointToPointSpring(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PointToPointSpring_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointToPointSpring obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PointToPointSpring(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PointToPointSpring safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PointToPointSpring_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PointToPointSpring(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PointToPointSpring_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PointToPointSpring_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PointToPointSpring_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PointToPointSpring(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PointToPointSpring_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_point1(PointToPointSpring source) {
    opensimSimulationJNI.PointToPointSpring_copyProperty_point1(swigCPtr, this, PointToPointSpring.getCPtr(source), source);
  }

  public Vec3 get_point1(int i) {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_get_point1__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point1(int i) {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_upd_point1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point1(int i, Vec3 value) {
    opensimSimulationJNI.PointToPointSpring_set_point1__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point1(Vec3 value) {
    return opensimSimulationJNI.PointToPointSpring_append_point1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point1(Vec3 initValue) {
    opensimSimulationJNI.PointToPointSpring_constructProperty_point1(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point1() {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_get_point1__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point1() {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_upd_point1__SWIG_1(swigCPtr, this), false);
  }

  public void set_point1(Vec3 value) {
    opensimSimulationJNI.PointToPointSpring_set_point1__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_point2(PointToPointSpring source) {
    opensimSimulationJNI.PointToPointSpring_copyProperty_point2(swigCPtr, this, PointToPointSpring.getCPtr(source), source);
  }

  public Vec3 get_point2(int i) {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_get_point2__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point2(int i) {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_upd_point2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point2(int i, Vec3 value) {
    opensimSimulationJNI.PointToPointSpring_set_point2__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point2(Vec3 value) {
    return opensimSimulationJNI.PointToPointSpring_append_point2(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point2(Vec3 initValue) {
    opensimSimulationJNI.PointToPointSpring_constructProperty_point2(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point2() {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_get_point2__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point2() {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_upd_point2__SWIG_1(swigCPtr, this), false);
  }

  public void set_point2(Vec3 value) {
    opensimSimulationJNI.PointToPointSpring_set_point2__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_stiffness(PointToPointSpring source) {
    opensimSimulationJNI.PointToPointSpring_copyProperty_stiffness(swigCPtr, this, PointToPointSpring.getCPtr(source), source);
  }

  public double get_stiffness(int i) {
    return opensimSimulationJNI.PointToPointSpring_get_stiffness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.PointToPointSpring_upd_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness(int i, double value) {
    opensimSimulationJNI.PointToPointSpring_set_stiffness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness(double value) {
    return opensimSimulationJNI.PointToPointSpring_append_stiffness(swigCPtr, this, value);
  }

  public void constructProperty_stiffness(double initValue) {
    opensimSimulationJNI.PointToPointSpring_constructProperty_stiffness(swigCPtr, this, initValue);
  }

  public double get_stiffness() {
    return opensimSimulationJNI.PointToPointSpring_get_stiffness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.PointToPointSpring_upd_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness(double value) {
    opensimSimulationJNI.PointToPointSpring_set_stiffness__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_rest_length(PointToPointSpring source) {
    opensimSimulationJNI.PointToPointSpring_copyProperty_rest_length(swigCPtr, this, PointToPointSpring.getCPtr(source), source);
  }

  public double get_rest_length(int i) {
    return opensimSimulationJNI.PointToPointSpring_get_rest_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_rest_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.PointToPointSpring_upd_rest_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rest_length(int i, double value) {
    opensimSimulationJNI.PointToPointSpring_set_rest_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_rest_length(double value) {
    return opensimSimulationJNI.PointToPointSpring_append_rest_length(swigCPtr, this, value);
  }

  public void constructProperty_rest_length(double initValue) {
    opensimSimulationJNI.PointToPointSpring_constructProperty_rest_length(swigCPtr, this, initValue);
  }

  public double get_rest_length() {
    return opensimSimulationJNI.PointToPointSpring_get_rest_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_rest_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.PointToPointSpring_upd_rest_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_rest_length(double value) {
    opensimSimulationJNI.PointToPointSpring_set_rest_length__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_socket_body1_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.PointToPointSpring_PropertyIndex_socket_body1_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_body1_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.PointToPointSpring_PropertyIndex_socket_body1_connectee_name_get(swigCPtr, this), true);
  }

  public void connectSocket_body1(OpenSimObject object) {
    opensimSimulationJNI.PointToPointSpring_connectSocket_body1(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_body2_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.PointToPointSpring_PropertyIndex_socket_body2_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_body2_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.PointToPointSpring_PropertyIndex_socket_body2_connectee_name_get(swigCPtr, this), true);
  }

  public void connectSocket_body2(OpenSimObject object) {
    opensimSimulationJNI.PointToPointSpring_connectSocket_body2(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public PointToPointSpring() {
    this(opensimSimulationJNI.new_PointToPointSpring__SWIG_0(), true);
  }

  public PointToPointSpring(PhysicalFrame body1, Vec3 point1, PhysicalFrame body2, Vec3 point2, double stiffness, double restlength) {
    this(opensimSimulationJNI.new_PointToPointSpring__SWIG_1(PhysicalFrame.getCPtr(body1), body1, Vec3.getCPtr(point1), point1, PhysicalFrame.getCPtr(body2), body2, Vec3.getCPtr(point2), point2, stiffness, restlength), true);
  }

  public void setBody1(PhysicalFrame body) {
    opensimSimulationJNI.PointToPointSpring_setBody1(swigCPtr, this, PhysicalFrame.getCPtr(body), body);
  }

  public void setBody2(PhysicalFrame body) {
    opensimSimulationJNI.PointToPointSpring_setBody2(swigCPtr, this, PhysicalFrame.getCPtr(body), body);
  }

  public PhysicalFrame getBody1() {
    return new PhysicalFrame(opensimSimulationJNI.PointToPointSpring_getBody1(swigCPtr, this), false);
  }

  public PhysicalFrame getBody2() {
    return new PhysicalFrame(opensimSimulationJNI.PointToPointSpring_getBody2(swigCPtr, this), false);
  }

  public void setPoint1(Vec3 aPosition) {
    opensimSimulationJNI.PointToPointSpring_setPoint1(swigCPtr, this, Vec3.getCPtr(aPosition), aPosition);
  }

  public Vec3 getPoint1() {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_getPoint1(swigCPtr, this), false);
  }

  public void setPoint2(Vec3 aPosition) {
    opensimSimulationJNI.PointToPointSpring_setPoint2(swigCPtr, this, Vec3.getCPtr(aPosition), aPosition);
  }

  public Vec3 getPoint2() {
    return new Vec3(opensimSimulationJNI.PointToPointSpring_getPoint2(swigCPtr, this), false);
  }

  public void setStiffness(double stiffness) {
    opensimSimulationJNI.PointToPointSpring_setStiffness(swigCPtr, this, stiffness);
  }

  public double getStiffness() {
    return opensimSimulationJNI.PointToPointSpring_getStiffness(swigCPtr, this);
  }

  public void setRestlength(double restLength) {
    opensimSimulationJNI.PointToPointSpring_setRestlength(swigCPtr, this, restLength);
  }

  public double getRestlength() {
    return opensimSimulationJNI.PointToPointSpring_getRestlength(swigCPtr, this);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimSimulationJNI.PointToPointSpring_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(State state) {
    return new ArrayDouble(opensimSimulationJNI.PointToPointSpring_getRecordValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

}
