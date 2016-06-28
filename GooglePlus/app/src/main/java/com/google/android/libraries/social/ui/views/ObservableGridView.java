package com.google.android.libraries.social.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;
import lxg;

public final class ObservableGridView
  extends GridView
{
  public List<lxg> a = new ArrayList();
  
  public ObservableGridView(Context paramContext)
  {
    super(paramContext);
  }
  
  public ObservableGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ObservableGridView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    for (int i = -1 + this.a.size(); i >= 0; i--) {
      ((lxg)this.a.get(i)).a(this);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.ui.views.ObservableGridView
 * JD-Core Version:    0.7.0.1
 */