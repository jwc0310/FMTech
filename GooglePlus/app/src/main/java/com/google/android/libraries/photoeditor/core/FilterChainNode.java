package com.google.android.libraries.photoeditor.core;

import android.graphics.Bitmap;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;

@UsedByNative
public class FilterChainNode
{
  public Bitmap a;
  private final FilterParameter b;
  
  public FilterChainNode(FilterParameter paramFilterParameter)
  {
    this.b = paramFilterParameter;
    this.a = null;
  }
  
  @UsedByNative
  public FilterParameter getFilterParameter()
  {
    return this.b;
  }
  
  @UsedByNative
  public Bitmap getPreviewLayer()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.core.FilterChainNode
 * JD-Core Version:    0.7.0.1
 */