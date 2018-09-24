/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AbstractInput extends AbstractSocket {
  private transient long swigCPtr;

  public AbstractInput(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.AbstractInput_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AbstractInput obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_AbstractInput(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AbstractSocket clone() {
    long cPtr = opensimCommonJNI.AbstractInput_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractInput(cPtr, true);
  }

  public void connect(OpenSimObject object) {
    opensimCommonJNI.AbstractInput_connect__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void connect(AbstractOutput output, String alias) {
    opensimCommonJNI.AbstractInput_connect__SWIG_1(swigCPtr, this, AbstractOutput.getCPtr(output), output, alias);
  }

  public void connect(AbstractOutput output) {
    opensimCommonJNI.AbstractInput_connect__SWIG_2(swigCPtr, this, AbstractOutput.getCPtr(output), output);
  }

  public void connect(AbstractChannel channel, String alias) {
    opensimCommonJNI.AbstractInput_connect__SWIG_3(swigCPtr, this, AbstractChannel.getCPtr(channel), channel, alias);
  }

  public void connect(AbstractChannel channel) {
    opensimCommonJNI.AbstractInput_connect__SWIG_4(swigCPtr, this, AbstractChannel.getCPtr(channel), channel);
  }

  public String getAlias() {
    return opensimCommonJNI.AbstractInput_getAlias__SWIG_0(swigCPtr, this);
  }

  public String getAlias(long index) {
    return opensimCommonJNI.AbstractInput_getAlias__SWIG_1(swigCPtr, this, index);
  }

  public void setAlias(String alias) {
    opensimCommonJNI.AbstractInput_setAlias__SWIG_0(swigCPtr, this, alias);
  }

  public void setAlias(long index, String alias) {
    opensimCommonJNI.AbstractInput_setAlias__SWIG_1(swigCPtr, this, index, alias);
  }

  public String getLabel() {
    return opensimCommonJNI.AbstractInput_getLabel__SWIG_0(swigCPtr, this);
  }

  public String getLabel(long index) {
    return opensimCommonJNI.AbstractInput_getLabel__SWIG_1(swigCPtr, this, index);
  }

  public static boolean parseConnecteeName(String connecteeName, SWIGTYPE_p_std__string componentPath, SWIGTYPE_p_std__string outputName, SWIGTYPE_p_std__string channelName, SWIGTYPE_p_std__string alias) {
    return opensimCommonJNI.AbstractInput_parseConnecteeName(connecteeName, SWIGTYPE_p_std__string.getCPtr(componentPath), SWIGTYPE_p_std__string.getCPtr(outputName), SWIGTYPE_p_std__string.getCPtr(channelName), SWIGTYPE_p_std__string.getCPtr(alias));
  }

  public static String composeConnecteeName(String componentPath, String outputName, String channelName, String alias) {
    return opensimCommonJNI.AbstractInput_composeConnecteeName(componentPath, outputName, channelName, alias);
  }

}
