package com.google.android.libraries.social.collexions.impl.profile;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import da;
import efj;
import git;
import gxn;
import gxq;
import gxs;
import hgz;
import hha;
import hhd;
import hot;
import hpo;
import jgd;
import kxq;
import lxj;
import mbb;
import nxl;
import pjn;

public final class CollexionOneProfileAboutView
  extends jgd
  implements View.OnClickListener, gxs, hhd
{
  private gxq A;
  private int B;
  private int C;
  private int D;
  private String E;
  private TextView a;
  private LinearLayout b;
  private TextView c;
  private LinearLayout.LayoutParams v;
  private SpaceListItemView w;
  private SpaceListItemView x;
  private View y;
  private View z;
  
  public CollexionOneProfileAboutView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public CollexionOneProfileAboutView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public CollexionOneProfileAboutView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private final void a(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    this.v = new LinearLayout.LayoutParams(-2, -2);
    this.B = localResources.getDimensionPixelSize(efj.IB);
    this.C = localResources.getDimensionPixelSize(efj.IA);
  }
  
  private final void d()
  {
    this.y.setVisibility(8);
    this.c.setVisibility(8);
  }
  
  public final void D_()
  {
    super.D_();
    if (this.w != null)
    {
      this.w.D_();
      this.w = null;
    }
    if (this.x != null)
    {
      this.x.D_();
      this.x = null;
    }
    this.z = null;
    this.A = null;
  }
  
  public final void a(Cursor paramCursor, String paramString, boolean paramBoolean)
  {
    Context localContext = getContext();
    hot localhot = (hot)mbb.a(localContext, hot.class);
    this.D = ((git)mbb.a(localContext, git.class)).c();
    this.E = paramString;
    this.b.removeAllViews();
    int i = localhot.d(this.D);
    int m;
    if (paramBoolean) {
      if (i != 2)
      {
        this.a.setVisibility(0);
        this.A = new gxq(pjn.G);
        m = 1;
      }
    }
    for (;;)
    {
      if (m != 0)
      {
        d();
        efj.f(this);
        return;
        if ((paramCursor == null) || (paramCursor.getCount() == 0))
        {
          this.a.setVisibility(8);
          if (this.z == null)
          {
            this.z = LayoutInflater.from(getContext()).inflate(efj.IC, this.b, false);
            ((Button)this.z.findViewById(da.d)).setOnClickListener(new gxn(this));
            efj.a(this.z, new gxq(pjn.z));
          }
          this.b.addView(this.z);
          this.A = new gxq(pjn.H);
          m = 1;
        }
      }
      else
      {
        if ((paramCursor == null) || (paramCursor.getCount() == 0))
        {
          d();
          return;
        }
        this.A = new gxq(pjn.I);
        this.a.setVisibility(8);
        int j;
        label497:
        TextView localTextView;
        int k;
        if (paramCursor.getCount() >= 2)
        {
          this.v.setMargins(this.B, 0, this.B, 0);
          this.b.setGravity(1);
          hha localhha = (hha)mbb.a(localContext, hha.class);
          hgz localhgz = (hgz)mbb.a(localContext, hgz.class);
          kxq localkxq = (kxq)mbb.a(localContext, kxq.class);
          this.w = localkxq.b(localContext, this.b);
          this.w.setLayoutParams(this.v);
          this.b.addView(this.w);
          paramCursor.moveToFirst();
          localhha.a(this.w, paramCursor, this.D, localhgz);
          if (paramCursor.moveToNext())
          {
            this.x = localkxq.b(localContext, this.b);
            this.x.setLayoutParams(this.v);
            this.b.addView(this.x);
            localhha.a(this.x, paramCursor, this.D, localhgz);
          }
          boolean bool = paramCursor.moveToNext();
          View localView = this.y;
          if (!bool) {
            break label558;
          }
          j = 0;
          localView.setVisibility(j);
          localTextView = this.c;
          k = 0;
          if (!bool) {
            break label565;
          }
        }
        for (;;)
        {
          localTextView.setVisibility(k);
          efj.f(this);
          return;
          this.b.setGravity(0);
          this.v.setMargins(this.C, 0, this.C, 0);
          break;
          label558:
          j = 8;
          break label497;
          label565:
          k = 8;
        }
      }
      m = 0;
    }
  }
  
  public final void a(nxl paramnxl) {}
  
  protected final int b()
  {
    return 19;
  }
  
  protected final gxq c()
  {
    return new gxq(pjn.C);
  }
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    Context localContext = getContext();
    hpo localhpo = (hpo)mbb.a(localContext, hpo.class);
    if (i == da.i) {
      localContext.startActivity(localhpo.a(this.D, this.E, true));
    }
    while (i != da.d) {
      return;
    }
    localContext.startActivity(localhpo.f(this.D));
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.b = ((LinearLayout)findViewById(da.c));
    this.a = ((TextView)findViewById(da.f));
    this.y = findViewById(da.b);
    this.c = ((TextView)findViewById(da.i));
    this.c.setOnClickListener(new gxn(this));
    efj.a(this.c, new gxq(pjn.aj));
    TextView localTextView = this.a;
    int i = jgd.f;
    int j = jgd.j;
    localTextView.setTextSize(0, i);
    localTextView.setTextColor(j);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = (int)(View.MeasureSpec.getSize(paramInt1) / 2.0D);
    int j = this.B / 2;
    if (this.w != null)
    {
      SpaceListItemView localSpaceListItemView2 = this.w;
      ViewGroup.LayoutParams localLayoutParams2 = localSpaceListItemView2.getLayoutParams();
      localLayoutParams2.width = (i - j);
      localSpaceListItemView2.setLayoutParams(localLayoutParams2);
    }
    if (this.x != null)
    {
      SpaceListItemView localSpaceListItemView1 = this.x;
      ViewGroup.LayoutParams localLayoutParams1 = localSpaceListItemView1.getLayoutParams();
      localLayoutParams1.width = (i - j);
      localSpaceListItemView1.setLayoutParams(localLayoutParams1);
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final gxq v()
  {
    return this.A;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.collexions.impl.profile.CollexionOneProfileAboutView
 * JD-Core Version:    0.7.0.1
 */