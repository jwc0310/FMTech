package com.google.android.libraries.photoeditor.core;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative
public class TilesProvider
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  @UsedByNative
  public TilesProvider()
  {
    a(0, 0, 0, 0, 0, 0, 0, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = paramInt6;
    this.g = paramInt7;
    this.h = paramInt8;
  }
  
  @UsedByNative
  public int getHundredPercentHeight()
  {
    return this.b;
  }
  
  @UsedByNative
  public int getHundredPercentWidth()
  {
    return this.a;
  }
  
  @UsedByNative
  public int getPreviewHeight()
  {
    return this.f;
  }
  
  @UsedByNative
  public int getPreviewSrcTexture()
  {
    return this.g;
  }
  
  @UsedByNative
  public int getPreviewWidth()
  {
    return this.e;
  }
  
  @UsedByNative
  public int getScaledHeight()
  {
    return this.d;
  }
  
  @UsedByNative
  public int getScaledWidth()
  {
    return this.c;
  }
  
  @UsedByNative
  public int getScreenSrcTexture()
  {
    return this.h;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.core.TilesProvider
 * JD-Core Version:    0.7.0.1
 */