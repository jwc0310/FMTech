package com.google.android.apps.photoeditor.views;

import amy;
import and;
import android.content.Context;
import android.os.ConditionVariable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.libraries.photoeditor.ui.views.ToolButton;
import efj;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ItemSelectorView
  extends RelativeLayout
{
  public RelativeLayout a;
  public amy b;
  public and c;
  public int d;
  
  public ItemSelectorView(Context paramContext)
  {
    super(paramContext);
    new Stack();
    new ConditionVariable(true);
    this.d = efj.iB;
    a(paramContext);
  }
  
  public ItemSelectorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    new Stack();
    new ConditionVariable(true);
    this.d = efj.iB;
    a(paramContext);
  }
  
  public ItemSelectorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    new Stack();
    new ConditionVariable(true);
    this.d = efj.iB;
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    this.a = new RelativeLayout(paramContext);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    localLayoutParams.addRule(12, -1);
    addView(this.a, localLayoutParams);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (this.b != null)
    {
      ToolButton localToolButton = this.b.f;
      if (localToolButton != null) {
        localToolButton.setEnabled(paramBoolean);
      }
      Iterator localIterator = this.b.e.iterator();
      while (localIterator.hasNext()) {
        ((View)localIterator.next()).setEnabled(paramBoolean);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.photoeditor.views.ItemSelectorView
 * JD-Core Version:    0.7.0.1
 */