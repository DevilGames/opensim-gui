/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathActuator extends ScalarActuator {
  private transient long swigCPtr;

  public PathActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.PathActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathActuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_PathActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.PathActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.PathActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.PathActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.PathActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathActuator(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.PathActuator_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_GeometryPath(PathActuator source) {
    opensimModelSimulationJNI.PathActuator_copyProperty_GeometryPath(swigCPtr, this, PathActuator.getCPtr(source), source);
  }

  public GeometryPath get_GeometryPath(int i) {
    return new GeometryPath(opensimModelSimulationJNI.PathActuator_get_GeometryPath__SWIG_0(swigCPtr, this, i), false);
  }

  public GeometryPath upd_GeometryPath(int i) {
    return new GeometryPath(opensimModelSimulationJNI.PathActuator_upd_GeometryPath__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_GeometryPath(int i, GeometryPath value) {
    opensimModelSimulationJNI.PathActuator_set_GeometryPath__SWIG_0(swigCPtr, this, i, GeometryPath.getCPtr(value), value);
  }

  public int append_GeometryPath(GeometryPath value) {
    return opensimModelSimulationJNI.PathActuator_append_GeometryPath(swigCPtr, this, GeometryPath.getCPtr(value), value);
  }

  public void constructProperty_GeometryPath(GeometryPath initValue) {
    opensimModelSimulationJNI.PathActuator_constructProperty_GeometryPath(swigCPtr, this, GeometryPath.getCPtr(initValue), initValue);
  }

  public GeometryPath get_GeometryPath() {
    return new GeometryPath(opensimModelSimulationJNI.PathActuator_get_GeometryPath__SWIG_1(swigCPtr, this), false);
  }

  public GeometryPath upd_GeometryPath() {
    return new GeometryPath(opensimModelSimulationJNI.PathActuator_upd_GeometryPath__SWIG_1(swigCPtr, this), false);
  }

  public void set_GeometryPath(GeometryPath value) {
    opensimModelSimulationJNI.PathActuator_set_GeometryPath__SWIG_1(swigCPtr, this, GeometryPath.getCPtr(value), value);
  }

  public void copyProperty_optimal_force(PathActuator source) {
    opensimModelSimulationJNI.PathActuator_copyProperty_optimal_force(swigCPtr, this, PathActuator.getCPtr(source), source);
  }

  public double get_optimal_force(int i) {
    return opensimModelSimulationJNI.PathActuator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_force(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.PathActuator_upd_optimal_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_force(int i, double value) {
    opensimModelSimulationJNI.PathActuator_set_optimal_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_force(double value) {
    return opensimModelSimulationJNI.PathActuator_append_optimal_force(swigCPtr, this, value);
  }

  public void constructProperty_optimal_force(double initValue) {
    opensimModelSimulationJNI.PathActuator_constructProperty_optimal_force(swigCPtr, this, initValue);
  }

  public double get_optimal_force() {
    return opensimModelSimulationJNI.PathActuator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_force() {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.PathActuator_upd_optimal_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_force(double value) {
    opensimModelSimulationJNI.PathActuator_set_optimal_force__SWIG_1(swigCPtr, this, value);
  }

  public PathActuator() {
    this(opensimModelSimulationJNI.new_PathActuator(), true);
  }

  public GeometryPath updGeometryPath() {
    return new GeometryPath(opensimModelSimulationJNI.PathActuator_updGeometryPath(swigCPtr, this), false);
  }

  public GeometryPath getGeometryPath() {
    return new GeometryPath(opensimModelSimulationJNI.PathActuator_getGeometryPath(swigCPtr, this), false);
  }

  public boolean hasGeometryPath() {
    return opensimModelSimulationJNI.PathActuator_hasGeometryPath(swigCPtr, this);
  }

  public void setOptimalForce(double aOptimalForce) {
    opensimModelSimulationJNI.PathActuator_setOptimalForce(swigCPtr, this, aOptimalForce);
  }

  public double getOptimalForce() {
    return opensimModelSimulationJNI.PathActuator_getOptimalForce(swigCPtr, this);
  }

  public double getLength(State s) {
    return opensimModelSimulationJNI.PathActuator_getLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getLengtheningSpeed(State s) {
    return opensimModelSimulationJNI.PathActuator_getLengtheningSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPower(State s) {
    return opensimModelSimulationJNI.PathActuator_getPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getStress(State s) {
    return opensimModelSimulationJNI.PathActuator_getStress(swigCPtr, this, State.getCPtr(s), s);
  }

  public void addNewPathPoint(String proposedName, PhysicalFrame aBody, Vec3 aPositionOnBody) {
    opensimModelSimulationJNI.PathActuator_addNewPathPoint(swigCPtr, this, proposedName, PhysicalFrame.getCPtr(aBody), aBody, Vec3.getCPtr(aPositionOnBody), aPositionOnBody);
  }

  public void computeForce(State state, VectorOfSpatialVec bodyForces, Vector mobilityForces) {
    opensimModelSimulationJNI.PathActuator_computeForce(swigCPtr, this, State.getCPtr(state), state, VectorOfSpatialVec.getCPtr(bodyForces), bodyForces, Vector.getCPtr(mobilityForces), mobilityForces);
  }

  public double computeActuation(State s) {
    return opensimModelSimulationJNI.PathActuator_computeActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public double computeMomentArm(State s, Coordinate aCoord) {
    return opensimModelSimulationJNI.PathActuator_computeMomentArm(swigCPtr, this, State.getCPtr(s), s, Coordinate.getCPtr(aCoord), aCoord);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelSimulationJNI.PathActuator_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimModelSimulationJNI.PathActuator_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

  public void preScale(State s, ScaleSet aScaleSet) {
    opensimModelSimulationJNI.PathActuator_preScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void scale(State s, ScaleSet aScaleSet) {
    opensimModelSimulationJNI.PathActuator_scale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void postScale(State s, ScaleSet aScaleSet) {
    opensimModelSimulationJNI.PathActuator_postScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
