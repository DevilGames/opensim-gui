/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentFilterAbsolutePathNameContainsString extends ComponentFilter {
  private transient long swigCPtr;

  public ComponentFilterAbsolutePathNameContainsString(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ComponentFilterAbsolutePathNameContainsString_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentFilterAbsolutePathNameContainsString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ComponentFilterAbsolutePathNameContainsString(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ComponentFilterAbsolutePathNameContainsString(String substring) {
    this(opensimCommonJNI.new_ComponentFilterAbsolutePathNameContainsString(substring), true);
  }

  public boolean isMatch(Component comp) {
    return opensimCommonJNI.ComponentFilterAbsolutePathNameContainsString_isMatch(swigCPtr, this, Component.getCPtr(comp), comp);
  }

  public ComponentFilter clone() {
    long cPtr = opensimCommonJNI.ComponentFilterAbsolutePathNameContainsString_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ComponentFilterAbsolutePathNameContainsString(cPtr, true);
  }

}
