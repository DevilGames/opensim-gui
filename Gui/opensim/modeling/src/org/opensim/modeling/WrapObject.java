/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapObject extends OpenSimObject {
  private transient long swigCPtr;

  public WrapObject(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.WrapObject_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapObject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_WrapObject(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapObject safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.WrapObject_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapObject(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.WrapObject_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.WrapObject_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.WrapObject_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapObject(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.WrapObject_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_display_preference(WrapObject source) {
    opensimModelSimulationJNI.WrapObject_copyProperty_display_preference(swigCPtr, this, WrapObject.getCPtr(source), source);
  }

  public int get_display_preference(int i) {
    return opensimModelSimulationJNI.WrapObject_get_display_preference__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_int upd_display_preference(int i) {
    return new SWIGTYPE_p_int(opensimModelSimulationJNI.WrapObject_upd_display_preference__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_display_preference(int i, int value) {
    opensimModelSimulationJNI.WrapObject_set_display_preference__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_display_preference(int value) {
    return opensimModelSimulationJNI.WrapObject_append_display_preference(swigCPtr, this, value);
  }

  public void constructProperty_display_preference(int initValue) {
    opensimModelSimulationJNI.WrapObject_constructProperty_display_preference(swigCPtr, this, initValue);
  }

  public int get_display_preference() {
    return opensimModelSimulationJNI.WrapObject_get_display_preference__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_int upd_display_preference() {
    return new SWIGTYPE_p_int(opensimModelSimulationJNI.WrapObject_upd_display_preference__SWIG_1(swigCPtr, this), false);
  }

  public void set_display_preference(int value) {
    opensimModelSimulationJNI.WrapObject_set_display_preference__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_color(WrapObject source) {
    opensimModelSimulationJNI.WrapObject_copyProperty_color(swigCPtr, this, WrapObject.getCPtr(source), source);
  }

  public double get_color(int i) {
    return opensimModelSimulationJNI.WrapObject_get_color(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_color(int i) {
    return new SWIGTYPE_p_double(opensimModelSimulationJNI.WrapObject_upd_color(swigCPtr, this, i), false);
  }

  public void set_color(int i, double value) {
    opensimModelSimulationJNI.WrapObject_set_color(swigCPtr, this, i, value);
  }

  public int append_color(double value) {
    return opensimModelSimulationJNI.WrapObject_append_color(swigCPtr, this, value);
  }

  public void copyData(WrapObject aWrapObject) {
    opensimModelSimulationJNI.WrapObject_copyData(swigCPtr, this, WrapObject.getCPtr(aWrapObject), aWrapObject);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelSimulationJNI.WrapObject_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimModelSimulationJNI.WrapObject_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

  public PhysicalFrame getBody() {
    return new PhysicalFrame(opensimModelSimulationJNI.WrapObject_getBody(swigCPtr, this), false);
  }

  public SWIGTYPE_p_double getXYZBodyRotation() {
    long cPtr = opensimModelSimulationJNI.WrapObject_getXYZBodyRotation(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public SWIGTYPE_p_double getTranslation() {
    long cPtr = opensimModelSimulationJNI.WrapObject_getTranslation(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public boolean getActive() {
    return opensimModelSimulationJNI.WrapObject_getActive(swigCPtr, this);
  }

  public boolean getActiveUseDefault() {
    return opensimModelSimulationJNI.WrapObject_getActiveUseDefault(swigCPtr, this);
  }

  public String getQuadrantName() {
    return opensimModelSimulationJNI.WrapObject_getQuadrantName(swigCPtr, this);
  }

  public boolean getQuadrantNameUseDefault() {
    return opensimModelSimulationJNI.WrapObject_getQuadrantNameUseDefault(swigCPtr, this);
  }

  public void setQuadrantName(String aName) {
    opensimModelSimulationJNI.WrapObject_setQuadrantName(swigCPtr, this, aName);
  }

  public Transform getTransform() {
    return new Transform(opensimModelSimulationJNI.WrapObject_getTransform(swigCPtr, this), false);
  }

  public String getWrapTypeName() {
    return opensimModelSimulationJNI.WrapObject_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelSimulationJNI.WrapObject_getDimensionsString(swigCPtr, this);
  }

  public void updateGeometry() {
    opensimModelSimulationJNI.WrapObject_updateGeometry(swigCPtr, this);
  }

  public final static class WrapQuadrant {
    public final static WrapObject.WrapQuadrant allQuadrants = new WrapObject.WrapQuadrant("allQuadrants");
    public final static WrapObject.WrapQuadrant negativeX = new WrapObject.WrapQuadrant("negativeX");
    public final static WrapObject.WrapQuadrant positiveX = new WrapObject.WrapQuadrant("positiveX");
    public final static WrapObject.WrapQuadrant negativeY = new WrapObject.WrapQuadrant("negativeY");
    public final static WrapObject.WrapQuadrant positiveY = new WrapObject.WrapQuadrant("positiveY");
    public final static WrapObject.WrapQuadrant negativeZ = new WrapObject.WrapQuadrant("negativeZ");
    public final static WrapObject.WrapQuadrant positiveZ = new WrapObject.WrapQuadrant("positiveZ");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static WrapQuadrant swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + WrapQuadrant.class + " with value " + swigValue);
    }

    private WrapQuadrant(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private WrapQuadrant(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private WrapQuadrant(String swigName, WrapQuadrant swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static WrapQuadrant[] swigValues = { allQuadrants, negativeX, positiveX, negativeY, positiveY, negativeZ, positiveZ };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class WrapAction {
    public final static WrapObject.WrapAction noWrap = new WrapObject.WrapAction("noWrap");
    public final static WrapObject.WrapAction insideRadius = new WrapObject.WrapAction("insideRadius");
    public final static WrapObject.WrapAction wrapped = new WrapObject.WrapAction("wrapped");
    public final static WrapObject.WrapAction mandatoryWrap = new WrapObject.WrapAction("mandatoryWrap");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static WrapAction swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + WrapAction.class + " with value " + swigValue);
    }

    private WrapAction(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private WrapAction(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private WrapAction(String swigName, WrapAction swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static WrapAction[] swigValues = { noWrap, insideRadius, wrapped, mandatoryWrap };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
