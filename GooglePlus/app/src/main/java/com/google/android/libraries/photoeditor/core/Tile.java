package com.google.android.libraries.photoeditor.core;

import android.graphics.Rect;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative
public class Tile
{
  public final float[] a = new float[9];
  private final Rect b = new Rect();
  private int c;
  
  public Tile()
  {
    a(0, 0, 0, 0, -1);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if ((paramInt4 < 0) || (paramInt3 < 0)) {
      throw new IllegalArgumentException("Illegal value of width or height.");
    }
    this.b.set(0, 0, paramInt3, paramInt4);
    this.c = paramInt5;
  }
  
  @UsedByNative
  public int getScaledHeight()
  {
    return this.b.height();
  }
  
  @UsedByNative
  public int getScaledWidth()
  {
    return this.b.width();
  }
  
  @UsedByNative
  public int getScaledX()
  {
    return this.b.left;
  }
  
  @UsedByNative
  public int getScaledY()
  {
    return this.b.top;
  }
  
  @UsedByNative
  public int getSourceTexture()
  {
    return this.c;
  }
  
  @UsedByNative
  public float[] getTransformMatrix()
  {
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.core.Tile
 * JD-Core Version:    0.7.0.1
 */