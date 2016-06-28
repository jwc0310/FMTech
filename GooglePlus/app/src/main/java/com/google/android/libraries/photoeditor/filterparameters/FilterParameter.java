package com.google.android.libraries.photoeditor.filterparameters;

import com.google.android.apps.common.proguard.UsedByNative;
import java.util.List;

@UsedByNative
public abstract interface FilterParameter
  extends Cloneable
{
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract void a(FilterParameter paramFilterParameter);
  
  public abstract boolean a(int paramInt);
  
  public abstract boolean a(int paramInt, float paramFloat);
  
  public abstract boolean a(int paramInt, Object paramObject);
  
  public abstract void addSubParameters(FilterParameter paramFilterParameter);
  
  public abstract float b(int paramInt);
  
  public abstract boolean b(FilterParameter paramFilterParameter);
  
  public abstract float c(int paramInt);
  
  public abstract FilterParameter c();
  
  public abstract Object d(int paramInt);
  
  public abstract List<Integer> d();
  
  public abstract int e();
  
  public abstract Object[] e(int paramInt);
  
  public abstract float f(int paramInt);
  
  public abstract int getActiveParameterKey();
  
  public abstract int getFilterType();
  
  public abstract byte[] getParameterBuffer(int paramInt);
  
  public abstract float getParameterFloat(int paramInt);
  
  public abstract int getParameterInteger(int paramInt);
  
  public abstract int[] getParameterKeys();
  
  public abstract Object getParameterValue(int paramInt);
  
  public abstract List<FilterParameter> getSubParameters();
  
  public abstract void setActiveParameterKey(int paramInt);
  
  public abstract boolean setParameterBuffer(int paramInt, byte[] paramArrayOfByte);
  
  public abstract boolean setParameterFloat(int paramInt, float paramFloat);
  
  public abstract boolean setParameterInteger(int paramInt1, int paramInt2);
  
  public abstract boolean setParameterString(int paramInt, String paramString);
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.filterparameters.FilterParameter
 * JD-Core Version:    0.7.0.1
 */