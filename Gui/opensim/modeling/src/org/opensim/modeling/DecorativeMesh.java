/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DecorativeMesh extends DecorativeGeometry {
  private long swigCPtr;

  public DecorativeMesh(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.DecorativeMesh_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(DecorativeMesh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_DecorativeMesh(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DecorativeMesh(SWIGTYPE_p_PolygonalMesh mesh) {
    this(opensimModelJNI.new_DecorativeMesh(SWIGTYPE_p_PolygonalMesh.getCPtr(mesh)), true);
  }

  public SWIGTYPE_p_PolygonalMesh getMesh() {
    return new SWIGTYPE_p_PolygonalMesh(opensimModelJNI.DecorativeMesh_getMesh(swigCPtr, this), false);
  }

  public DecorativeMesh setBodyId(int b) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setBodyId(swigCPtr, this, b), false);
  }

  public DecorativeMesh setTransform(Transform X_BD) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setTransform(swigCPtr, this, Transform.getCPtr(X_BD), X_BD), false);
  }

  public DecorativeMesh setResolution(double r) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setResolution(swigCPtr, this, r), false);
  }

  public DecorativeMesh setScaleFactors(Vec3 s) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setScaleFactors(swigCPtr, this, Vec3.getCPtr(s), s), false);
  }

  public DecorativeMesh setColor(Vec3 rgb) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setColor(swigCPtr, this, Vec3.getCPtr(rgb), rgb), false);
  }

  public DecorativeMesh setOpacity(double o) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setOpacity(swigCPtr, this, o), false);
  }

  public DecorativeMesh setLineThickness(double t) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setLineThickness(swigCPtr, this, t), false);
  }

  public DecorativeMesh setRepresentation(DecorativeGeometry.Representation r) {
    return new DecorativeMesh(opensimModelJNI.DecorativeMesh_setRepresentation(swigCPtr, this, r.swigValue()), false);
  }

}
