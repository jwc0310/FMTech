package com.google.android.libraries.social.squares.listitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import efj;
import gxn;
import gxq;
import kxq;
import leb;
import mbb;
import pjo;

public final class CreateSquareView
  extends LinearLayout
  implements View.OnClickListener
{
  public leb a;
  private final SpaceListItemView b;
  
  public CreateSquareView(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.b = ((kxq)mbb.a(localContext, kxq.class)).b(localContext, null);
    efj.a(this, new gxq(pjo.P));
    setOnClickListener(new gxn(this));
  }
  
  public CreateSquareView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    this.b = ((kxq)mbb.a(localContext, kxq.class)).b(localContext, null);
    efj.a(this, new gxq(pjo.P));
    setOnClickListener(new gxn(this));
  }
  
  public CreateSquareView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    this.b = ((kxq)mbb.a(localContext, kxq.class)).b(localContext, null);
    efj.a(this, new gxq(pjo.P));
    setOnClickListener(new gxn(this));
  }
  
  public final void onClick(View paramView)
  {
    if (this.a != null) {
      this.a.x();
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.resolveSize(2147483647, paramInt1);
    SpaceListItemView localSpaceListItemView = this.b;
    setMeasuredDimension(i, (int)(0.5625D * i) + localSpaceListItemView.j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.squares.listitem.CreateSquareView
 * JD-Core Version:    0.7.0.1
 */