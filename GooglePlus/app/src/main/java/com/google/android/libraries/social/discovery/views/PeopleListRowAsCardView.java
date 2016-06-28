package com.google.android.libraries.social.discovery.views;

import aau;
import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView.RecyclerListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import efj;
import ehr;
import huu;
import huv;
import hvj;
import java.util.ArrayList;
import java.util.List;
import lwo;

public final class PeopleListRowAsCardView
  extends FrameLayout
  implements AbsListView.RecyclerListener, huv
{
  public static Drawable a;
  public static Drawable b;
  public static Drawable c;
  public static Drawable d;
  public static Drawable e;
  public static String f;
  public View g;
  public View h;
  public View i;
  public TextView j;
  
  public PeopleListRowAsCardView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public PeopleListRowAsCardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public PeopleListRowAsCardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (a == null)
    {
      Resources localResources = getContext().getResources();
      localResources.getDrawable(aau.zQ);
      a = localResources.getDrawable(aau.zV);
      b = localResources.getDrawable(aau.zS);
      c = localResources.getDrawable(aau.zR);
      d = localResources.getDrawable(aau.zU);
      e = localResources.getDrawable(aau.zT);
      f = localResources.getString(efj.Lf);
    }
  }
  
  public final List<huu> a(View paramView)
  {
    ArrayList localArrayList = new ArrayList();
    View localView = this.h;
    if (((localView instanceof PeopleListRowView)) && (lwo.a(localView, paramView)))
    {
      PeopleListRowView localPeopleListRowView = (PeopleListRowView)localView;
      localArrayList.add(new huu(localPeopleListRowView.c, localPeopleListRowView.f, hvj.b(localPeopleListRowView.g)));
    }
    return localArrayList;
  }
  
  public final void a()
  {
    this.g.setBackgroundColor(getContext().getResources().getColor(aaw.oM));
    if (this.i != null)
    {
      this.i.setVisibility(8);
      this.j.setText(f);
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.g = findViewById(ehr.cJ);
    this.h = findViewById(ehr.cC);
    this.i = findViewById(ehr.cH);
    this.j = ((TextView)findViewById(ehr.cI));
  }
  
  public final void onMovedToScrapHeap(View paramView)
  {
    if ((this.h instanceof AbsListView.RecyclerListener)) {
      ((AbsListView.RecyclerListener)this.h).onMovedToScrapHeap(paramView);
    }
    this.g.setBackgroundDrawable(null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.discovery.views.PeopleListRowAsCardView
 * JD-Core Version:    0.7.0.1
 */