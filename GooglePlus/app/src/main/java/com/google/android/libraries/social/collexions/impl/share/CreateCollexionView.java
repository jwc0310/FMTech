package com.google.android.libraries.social.collexions.impl.share;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import efj;
import gxn;
import gxq;
import hhp;
import iej;
import kxq;
import mbb;
import pjn;

public final class CreateCollexionView
  extends LinearLayout
  implements View.OnClickListener
{
  public iej a;
  public View.OnClickListener b;
  public boolean c = true;
  private SpaceListItemView d;
  
  public CreateCollexionView(Context paramContext)
  {
    super(paramContext);
    setOnClickListener(new gxn(this));
    efj.a(this, new gxq(pjn.j));
    Context localContext = getContext();
    this.d = ((kxq)mbb.a(localContext, kxq.class)).b(localContext, null);
  }
  
  public CreateCollexionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnClickListener(new gxn(this));
    efj.a(this, new gxq(pjn.j));
    Context localContext = getContext();
    this.d = ((kxq)mbb.a(localContext, kxq.class)).b(localContext, null);
  }
  
  public CreateCollexionView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOnClickListener(new gxn(this));
    efj.a(this, new gxq(pjn.j));
    Context localContext = getContext();
    this.d = ((kxq)mbb.a(localContext, kxq.class)).b(localContext, null);
  }
  
  public final void onClick(View paramView)
  {
    ((hhp)mbb.a(getContext(), hhp.class)).a();
    if (this.b != null) {
      this.b.onClick(paramView);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (this.a != null))
    {
      View localView = findViewById(efj.JX);
      this.a.a(localView);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (this.c)
    {
      int i = View.resolveSize(2147483647, paramInt1);
      SpaceListItemView localSpaceListItemView = this.d;
      setMeasuredDimension(i, (int)(0.5625D * i) + localSpaceListItemView.j);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.share.CreateCollexionView
 * JD-Core Version:    0.7.0.1
 */