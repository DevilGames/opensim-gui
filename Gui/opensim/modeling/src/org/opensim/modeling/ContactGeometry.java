/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ContactGeometry extends ModelComponent {
  private long swigCPtr;

  public ContactGeometry(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ContactGeometry_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ContactGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ContactGeometry safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ContactGeometry_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ContactGeometry(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ContactGeometry_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ContactGeometry_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ContactGeometry_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ContactGeometry(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ContactGeometry_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_body_name(ContactGeometry source) {
    opensimModelJNI.ContactGeometry_copyProperty_body_name(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public String get_body_name(int i) {
    return opensimModelJNI.ContactGeometry_get_body_name__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body_name(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ContactGeometry_upd_body_name__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body_name(int i, String value) {
    opensimModelJNI.ContactGeometry_set_body_name__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body_name(String value) {
    return opensimModelJNI.ContactGeometry_append_body_name(swigCPtr, this, value);
  }

  public void constructProperty_body_name(String initValue) {
    opensimModelJNI.ContactGeometry_constructProperty_body_name(swigCPtr, this, initValue);
  }

  public String get_body_name() {
    return opensimModelJNI.ContactGeometry_get_body_name__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body_name() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ContactGeometry_upd_body_name__SWIG_1(swigCPtr, this), false);
  }

  public void set_body_name(String value) {
    opensimModelJNI.ContactGeometry_set_body_name__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_location(ContactGeometry source) {
    opensimModelJNI.ContactGeometry_copyProperty_location(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public Vec3 get_location(int i) {
    return new Vec3(opensimModelJNI.ContactGeometry_get_location__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location(int i) {
    return new Vec3(opensimModelJNI.ContactGeometry_upd_location__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location(int i, Vec3 value) {
    opensimModelJNI.ContactGeometry_set_location__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location(Vec3 value) {
    return opensimModelJNI.ContactGeometry_append_location(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location(Vec3 initValue) {
    opensimModelJNI.ContactGeometry_constructProperty_location(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location() {
    return new Vec3(opensimModelJNI.ContactGeometry_get_location__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location() {
    return new Vec3(opensimModelJNI.ContactGeometry_upd_location__SWIG_1(swigCPtr, this), false);
  }

  public void set_location(Vec3 value) {
    opensimModelJNI.ContactGeometry_set_location__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_orientation(ContactGeometry source) {
    opensimModelJNI.ContactGeometry_copyProperty_orientation(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public Vec3 get_orientation(int i) {
    return new Vec3(opensimModelJNI.ContactGeometry_get_orientation__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_orientation(int i) {
    return new Vec3(opensimModelJNI.ContactGeometry_upd_orientation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation(int i, Vec3 value) {
    opensimModelJNI.ContactGeometry_set_orientation__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_orientation(Vec3 value) {
    return opensimModelJNI.ContactGeometry_append_orientation(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_orientation(Vec3 initValue) {
    opensimModelJNI.ContactGeometry_constructProperty_orientation(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_orientation() {
    return new Vec3(opensimModelJNI.ContactGeometry_get_orientation__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_orientation() {
    return new Vec3(opensimModelJNI.ContactGeometry_upd_orientation__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation(Vec3 value) {
    opensimModelJNI.ContactGeometry_set_orientation__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_display_preference(ContactGeometry source) {
    opensimModelJNI.ContactGeometry_copyProperty_display_preference(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public int get_display_preference(int i) {
    return opensimModelJNI.ContactGeometry_get_display_preference__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_display_preference(int i) {
    return new SWIGTYPE_p_int(opensimModelJNI.ContactGeometry_upd_display_preference__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_display_preference(int i, int value) {
    opensimModelJNI.ContactGeometry_set_display_preference__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_display_preference(int value) {
    return opensimModelJNI.ContactGeometry_append_display_preference(swigCPtr, this, value);
  }

  public void constructProperty_display_preference(int initValue) {
    opensimModelJNI.ContactGeometry_constructProperty_display_preference(swigCPtr, this, initValue);
  }

  public int get_display_preference() {
    return opensimModelJNI.ContactGeometry_get_display_preference__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_display_preference() {
    return new SWIGTYPE_p_int(opensimModelJNI.ContactGeometry_upd_display_preference__SWIG_1(swigCPtr, this), false);
  }

  public void set_display_preference(int value) {
    opensimModelJNI.ContactGeometry_set_display_preference__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_color(ContactGeometry source) {
    opensimModelJNI.ContactGeometry_copyProperty_color(swigCPtr, this, ContactGeometry.getCPtr(source), source);
  }

  public double get_color(int i) {
    return opensimModelJNI.ContactGeometry_get_color(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_color(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ContactGeometry_upd_color(swigCPtr, this, i), false);
  }

  public void set_color(int i, double value) {
    opensimModelJNI.ContactGeometry_set_color(swigCPtr, this, i, value);
  }

  public int append_color(double value) {
    return opensimModelJNI.ContactGeometry_append_color(swigCPtr, this, value);
  }

  public Vec3 getLocation() {
    return new Vec3(opensimModelJNI.ContactGeometry_getLocation(swigCPtr, this), false);
  }

  public void setLocation(Vec3 location) {
    opensimModelJNI.ContactGeometry_setLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public Vec3 getOrientation() {
    return new Vec3(opensimModelJNI.ContactGeometry_getOrientation(swigCPtr, this), false);
  }

  public void setOrientation(Vec3 orientation) {
    opensimModelJNI.ContactGeometry_setOrientation(swigCPtr, this, Vec3.getCPtr(orientation), orientation);
  }

  public Body getBody() {
    return new Body(opensimModelJNI.ContactGeometry_getBody(swigCPtr, this), false);
  }

  public void setBody(Body body) {
    opensimModelJNI.ContactGeometry_setBody(swigCPtr, this, Body.getCPtr(body), body);
  }

  public String getBodyName() {
    return opensimModelJNI.ContactGeometry_getBodyName(swigCPtr, this);
  }

  public void setBodyName(String name) {
    opensimModelJNI.ContactGeometry_setBodyName(swigCPtr, this, name);
  }

  public int getDisplayPreference() {
    return opensimModelJNI.ContactGeometry_getDisplayPreference(swigCPtr, this);
  }

  public void setDisplayPreference(int dispPref) {
    opensimModelJNI.ContactGeometry_setDisplayPreference(swigCPtr, this, dispPref);
  }

  public SWIGTYPE_p_SimTK__ContactGeometry createSimTKContactGeometry() {
    return new SWIGTYPE_p_SimTK__ContactGeometry(opensimModelJNI.ContactGeometry_createSimTKContactGeometry(swigCPtr, this), true);
  }

  public Transform getTransform() {
    return new Transform(opensimModelJNI.ContactGeometry_getTransform(swigCPtr, this), true);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.ContactGeometry_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public VisibleObject getDisplayer() {
    long cPtr = opensimModelJNI.ContactGeometry_getDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public VisibleObject updDisplayer() {
    long cPtr = opensimModelJNI.ContactGeometry_updDisplayer(swigCPtr, this);
    return (cPtr == 0) ? null : new VisibleObject(cPtr, false);
  }

  public void updateGeometry() {
    opensimModelJNI.ContactGeometry_updateGeometry(swigCPtr, this);
  }

}
