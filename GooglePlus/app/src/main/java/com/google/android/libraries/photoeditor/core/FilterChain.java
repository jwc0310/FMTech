package com.google.android.libraries.photoeditor.core;

import android.graphics.RectF;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import efj;
import gem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UsedByNative
public class FilterChain
{
  public final RectF a = new RectF(0.0F, 0.0F, 1.0F, 1.0F);
  public float b = 0.0F;
  public int c = 0;
  public int d = 0;
  public int e = 0;
  public int f = 0;
  public FilterParameter g = efj.Cv.a(18);
  public final List<FilterChainNode> h = new ArrayList();
  
  public FilterChain() {}
  
  public FilterChain(FilterParameter paramFilterParameter)
  {
    a(paramFilterParameter);
  }
  
  public final void a(RectF paramRectF)
  {
    if (paramRectF.isEmpty()) {
      throw new IllegalArgumentException("Illegal value of width or height.");
    }
    this.a.set(paramRectF);
  }
  
  public final void a(RectF paramRectF, float paramFloat, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramRectF.isEmpty()) || (paramInt1 < 0) || (paramInt3 < 0) || (paramInt4 < 0) || (paramFloat < -45.0F) || (paramFloat > 45.0F)) {
      throw new IllegalArgumentException("Illegal value of width or height or aspectRatio or rotationAngle.");
    }
    this.a.set(paramRectF);
    this.b = paramFloat;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    b();
  }
  
  public final void a(FilterParameter paramFilterParameter)
  {
    switch (paramFilterParameter.getFilterType())
    {
    case 19: 
    default: 
      FilterChainNode localFilterChainNode2 = new FilterChainNode(paramFilterParameter);
      this.h.add(localFilterChainNode2);
      b(localFilterChainNode2.getFilterParameter());
    case 20: 
      return;
    }
    this.g = paramFilterParameter;
    FilterChainNode localFilterChainNode1 = new FilterChainNode(this.g);
    if (!a())
    {
      this.h.add(0, localFilterChainNode1);
      return;
    }
    this.h.set(0, localFilterChainNode1);
  }
  
  public final boolean a()
  {
    FilterChainNode localFilterChainNode = getFilterNodeAt(0);
    boolean bool = false;
    if (localFilterChainNode != null)
    {
      int i = localFilterChainNode.getFilterParameter().getFilterType();
      bool = false;
      if (i == 18) {
        bool = true;
      }
    }
    return bool;
  }
  
  public final void b()
  {
    for (int i = 0; i < this.h.size(); i++) {
      b(((FilterChainNode)this.h.get(i)).getFilterParameter());
    }
  }
  
  public final void b(FilterParameter paramFilterParameter)
  {
    paramFilterParameter.setParameterFloat(610, getCropRectX());
    paramFilterParameter.setParameterFloat(611, getCropRectY());
    paramFilterParameter.setParameterFloat(612, getCropRectWidth());
    paramFilterParameter.setParameterFloat(613, getCropRectHeight());
    paramFilterParameter.setParameterFloat(614, getRotationAngle());
    paramFilterParameter.setParameterInteger(615, getAspectRatio());
    paramFilterParameter.setParameterInteger(616, getPostRotation());
    paramFilterParameter.setParameterInteger(617, getImageWidth());
    paramFilterParameter.setParameterInteger(618, getImageHeight());
  }
  
  public final boolean c()
  {
    return (this.a.width() != 1.0F) || (this.a.height() != 1.0F) || (this.b != 0.0F) || (this.d != 0);
  }
  
  @UsedByNative
  public int getAspectRatio()
  {
    return this.c;
  }
  
  @UsedByNative
  public float getCropRectHeight()
  {
    return this.a.height();
  }
  
  @UsedByNative
  public float getCropRectWidth()
  {
    return this.a.width();
  }
  
  @UsedByNative
  public float getCropRectX()
  {
    return this.a.left;
  }
  
  @UsedByNative
  public float getCropRectY()
  {
    return this.a.top;
  }
  
  @UsedByNative
  public FilterChainNode getFilterNodeAt(int paramInt)
  {
    if (paramInt >= this.h.size()) {
      return null;
    }
    return (FilterChainNode)this.h.get(paramInt);
  }
  
  @UsedByNative
  public List<FilterChainNode> getFilterNodes()
  {
    return Collections.unmodifiableList(this.h);
  }
  
  @UsedByNative
  public int getImageHeight()
  {
    return this.f;
  }
  
  @UsedByNative
  public int getImageWidth()
  {
    return this.e;
  }
  
  @UsedByNative
  public int getPostRotation()
  {
    return this.d;
  }
  
  @UsedByNative
  public float getRotationAngle()
  {
    return this.b;
  }
  
  @UsedByNative
  public int size()
  {
    return this.h.size();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.core.FilterChain
 * JD-Core Version:    0.7.0.1
 */