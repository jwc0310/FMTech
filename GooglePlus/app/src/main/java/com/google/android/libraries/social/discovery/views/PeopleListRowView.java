package com.google.android.libraries.social.discovery.views;

import aau;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.circlemembership.ui.CirclesButton;
import com.google.android.libraries.social.people.ui.PeopleListRowNameView;
import da;
import efj;
import ehr;
import git;
import gvj;
import gxn;
import gxo;
import gxq;
import hgg;
import hul;
import hvl;
import hvn;
import hvo;
import java.util.ArrayList;
import jly;
import lvp;
import mbb;
import odg;
import ork;
import orn;
import ors;
import osf;
import oso;
import osr;
import pka;
import pkf;
import qoq;

public final class PeopleListRowView
  extends FrameLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private hvo A;
  private boolean B;
  private int C;
  private int D;
  private int E;
  public boolean a;
  public hvl b;
  public String c;
  public String d;
  public String e;
  public String f;
  public int g = -1;
  public Object h = null;
  public boolean i = true;
  public AvatarView j;
  public boolean k = true;
  public PeopleListSwipeableRowView l;
  public hvn m;
  public Bundle n = null;
  private View o;
  private Drawable p;
  private boolean q;
  private boolean r;
  private ImageView s;
  private PeopleListRowNameView t;
  private CirclesButton u;
  private CirclesButton v;
  private boolean w;
  private boolean x;
  private jly y;
  private TextView z;
  
  public PeopleListRowView(Context paramContext)
  {
    super(paramContext);
    Context localContext = getContext();
    this.p = localContext.getResources().getDrawable(da.aY);
    git localgit = (git)mbb.a(localContext, git.class);
    this.w = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
    a(false);
  }
  
  public PeopleListRowView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Context localContext = getContext();
    this.p = localContext.getResources().getDrawable(da.aY);
    git localgit = (git)mbb.a(localContext, git.class);
    this.w = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
    a(false);
  }
  
  public PeopleListRowView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Context localContext = getContext();
    this.p = localContext.getResources().getDrawable(da.aY);
    git localgit = (git)mbb.a(localContext, git.class);
    this.w = ((hul)mbb.a(localContext, hul.class)).a(localgit.c());
    a(false);
  }
  
  private void a(int paramInt, String paramString)
  {
    this.j.setVisibility(8);
    if (this.s != null)
    {
      this.s.setVisibility(0);
      if (paramInt == 0) {
        break label45;
      }
      this.s.setImageResource(paramInt);
    }
    for (;;)
    {
      this.s.setContentDescription(paramString);
      return;
      label45:
      this.s.setImageDrawable(null);
    }
  }
  
  @SuppressLint({"InlinedApi", "NewApi"})
  public final void a(View paramView, float paramFloat, long paramLong, boolean paramBoolean)
  {
    if (this.b != null) {
      this.b.a(paramView, paramFloat, 300L, true);
    }
  }
  
  public final void a(hvn paramhvn, jly paramjly, boolean paramBoolean)
  {
    this.m = paramhvn;
    this.y = paramjly;
    this.q = paramBoolean;
    setBackgroundDrawable(this.p);
    this.a = false;
  }
  
  public final void a(Object paramObject, String paramString, hvl paramhvl)
  {
    odg localodg;
    ors localors3;
    orn localorn3;
    Object localObject1;
    Object localObject2;
    if ((paramObject instanceof odg))
    {
      localodg = (odg)paramObject;
      if ((localodg == null) || (localodg.a == null) || (localodg.a.a == null)) {
        return;
      }
      localors3 = localodg.a;
      localorn3 = localors3.b;
      localObject1 = null;
      if ((efj.b(localorn3.f)) && (!TextUtils.isEmpty(paramString))) {
        localObject2 = paramString;
      }
    }
    for (;;)
    {
      a(localors3, (CharSequence)localObject2, (CharSequence)localObject1, localodg.d, paramhvl);
      return;
      SpannableStringBuilder localSpannableStringBuilder;
      if ((localodg.e != null) && (localodg.e.length > 0))
      {
        qoq localqoq = localodg.e[0];
        localSpannableStringBuilder = null;
        if (localqoq != null) {
          localSpannableStringBuilder = efj.a(localodg.e[0]);
        }
        if ((localodg.e.length > 1) && (localodg.e[1] != null))
        {
          localObject1 = efj.a(localodg.e[1]).insert(0, "\n").insert(0, localSpannableStringBuilder);
          localObject2 = localSpannableStringBuilder;
        }
      }
      else
      {
        localObject2 = efj.a(getContext(), efj.a(localodg.b), localorn3, localodg.c);
        localObject1 = null;
        continue;
        if ((paramObject instanceof oso))
        {
          oso localoso = (oso)paramObject;
          if ((localoso == null) || (localoso.a == null) || (localoso.a.a == null)) {
            break;
          }
          ors localors2 = localoso.a;
          osr localosr = localoso.b;
          orn localorn2 = localors2.b;
          String str2;
          if ((efj.b(localorn2.f)) && (!TextUtils.isEmpty(paramString)))
          {
            str2 = paramString;
            a(localors2, str2, null, localoso.c, paramhvl);
            return;
          }
          Context localContext = getContext();
          Integer localInteger;
          int i1;
          if (localosr != null)
          {
            localInteger = localosr.a;
            if (localInteger == null) {
              i1 = 0;
            }
          }
          for (;;)
          {
            str2 = efj.a(localContext, i1, localorn2, null);
            break;
            i1 = localInteger.intValue();
            continue;
            i1 = 0;
          }
        }
        if ((paramObject instanceof ors))
        {
          ors localors1 = (ors)paramObject;
          if ((localors1 == null) || (localors1.a == null)) {
            break;
          }
          orn localorn1 = localors1.b;
          if ((efj.b(localorn1.f)) && (!TextUtils.isEmpty(paramString))) {}
          for (String str1 = paramString;; str1 = efj.a(getContext(), 0, localorn1, null))
          {
            a(localors1, str1, null, null, paramhvl);
            return;
          }
        }
        a(null, null, null, null, null, false, null, null, false, false, paramhvl);
        return;
      }
      localObject2 = localSpannableStringBuilder;
      localObject1 = null;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, CharSequence paramCharSequence1, CharSequence paramCharSequence2, boolean paramBoolean1, String paramString5, String paramString6, boolean paramBoolean2, boolean paramBoolean3, Bundle paramBundle, hvl paramhvl)
  {
    this.c = paramString1;
    if (paramString1 == null)
    {
      this.j.setVisibility(8);
      this.t.setVisibility(8);
      this.v.setVisibility(8);
      this.u.setVisibility(8);
      if (this.o != null) {
        this.o.setVisibility(8);
      }
      if (this.z != null) {
        this.z.setVisibility(8);
      }
      if (this.s != null) {
        this.s.setVisibility(8);
      }
      return;
    }
    int i1;
    label148:
    label200:
    String str1;
    label230:
    boolean bool;
    if (!this.k)
    {
      this.v.setVisibility(8);
      this.u.setVisibility(8);
      if (this.o != null)
      {
        View localView = this.o;
        if (!this.a) {
          break label766;
        }
        i1 = this.v.getVisibility();
        localView.setVisibility(i1);
      }
      this.e = paramString3;
      if (paramString3 == null) {
        break label773;
      }
      this.j.a(paramString2, efj.E(paramString3));
      this.j.setVisibility(0);
      if (this.s != null) {
        this.s.setVisibility(8);
      }
      this.d = paramString4;
      if (this.d == null) {
        break label906;
      }
      str1 = this.d;
      this.r = paramString1.startsWith("g:");
      if ((this.r) || (!TextUtils.equals(str1, paramCharSequence1))) {
        break label974;
      }
      paramCharSequence1 = null;
      bool = false;
    }
    for (CharSequence localCharSequence = null;; localCharSequence = paramCharSequence2)
    {
      if (paramString1.startsWith("f:"))
      {
        this.t.a(str1, false, null, null, false, paramBoolean2);
        if (this.z != null)
        {
          this.z.setText(paramCharSequence1);
          this.z.setVisibility(0);
        }
      }
      for (;;)
      {
        this.t.setVisibility(0);
        this.f = paramString6;
        this.n = paramBundle;
        if (this.a) {
          this.b = paramhvl;
        }
        if (this.b != null)
        {
          hvl localhvl = this.b;
          PeopleListSwipeableRowView localPeopleListSwipeableRowView = this.l;
          if (localPeopleListSwipeableRowView != null) {
            localPeopleListSwipeableRowView.setOnTouchListener(localhvl.g);
          }
          this.l.a = this.b;
        }
        lvp.d(this.l);
        setVisibility(0);
        this.A = new hvo(this.d, paramString3);
        return;
        if (TextUtils.isEmpty(paramString5))
        {
          Resources localResources = getContext().getResources();
          if (this.z != null) {
            this.z.setVisibility(8);
          }
          this.v.setVisibility(0);
          this.v.a(this.D);
          CirclesButton localCirclesButton1 = this.v;
          String str2;
          label487:
          CirclesButton localCirclesButton2;
          if (this.q)
          {
            str2 = localResources.getString(efj.KY);
            localCirclesButton1.a(str2);
            localCirclesButton2 = this.v;
            if (!this.q) {
              break label595;
            }
          }
          label595:
          for (String str3 = localResources.getString(efj.KZ);; str3 = localResources.getString(efj.Lg))
          {
            localCirclesButton2.setContentDescription(str3);
            this.u.setVisibility(8);
            if (!((hgg)mbb.a(getContext(), hgg.class)).a(paramString1)) {
              break label608;
            }
            this.v.setOnClickListener(null);
            this.v.setOnLongClickListener(null);
            this.v.a(true);
            break;
            str2 = localResources.getString(efj.Lg);
            break label487;
          }
          label608:
          this.v.setOnClickListener(new gxn(this));
          this.v.setOnLongClickListener(new gxo(this));
          this.v.a(false);
          break;
        }
        this.v.setVisibility(8);
        this.u.setVisibility(0);
        this.u.setOnClickListener(this);
        this.u.setOnLongClickListener(this);
        if (TextUtils.equals(paramString5, "15"))
        {
          this.u.a(this.E);
          this.x = true;
          paramString3 = null;
          paramCharSequence1 = null;
          paramCharSequence2 = null;
          break;
        }
        this.u.a(this.C);
        this.x = false;
        if (this.B) {
          break;
        }
        ArrayList localArrayList = this.y.b(paramString5);
        this.u.a(localArrayList);
        break;
        label766:
        i1 = 8;
        break label148;
        label773:
        if (paramString1.startsWith("e:"))
        {
          a(aau.zX, getResources().getString(efj.Lj));
          break label200;
        }
        if (paramString1.startsWith("p:"))
        {
          a(0, getResources().getString(efj.Lk));
          break label200;
        }
        if (paramString1.startsWith("f:"))
        {
          a(aau.zW, getResources().getString(efj.Li, new Object[] { paramString4 }));
          break label200;
        }
        this.j.a(paramString2, null);
        this.j.setVisibility(0);
        if (this.s == null) {
          break label200;
        }
        this.s.setVisibility(8);
        break label200;
        label906:
        if ((paramString1.startsWith("e:")) || (paramString1.startsWith("p:")))
        {
          str1 = paramString1.substring(2);
          this.r = false;
          break label230;
        }
        this.r = false;
        str1 = paramString1;
        break label230;
        this.t.a(str1, paramBoolean3, paramCharSequence1, localCharSequence, bool, paramBoolean2);
      }
      label974:
      bool = paramBoolean1;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean1, String paramString6, String paramString7, boolean paramBoolean2, boolean paramBoolean3, hvl paramhvl)
  {
    a(paramString1, paramString2, paramString3, paramString4, paramString5, null, false, paramString6, null, paramBoolean2, paramBoolean3, null, paramhvl);
  }
  
  public final void a(ors paramors, CharSequence paramCharSequence1, CharSequence paramCharSequence2, String paramString, hvl paramhvl)
  {
    String str1 = efj.a(paramors.a);
    String str2 = efj.b(paramors.a);
    String str3;
    String str4;
    boolean bool3;
    boolean bool2;
    String str5;
    StringBuilder localStringBuilder;
    if (paramors.b == null)
    {
      str3 = null;
      str4 = null;
      bool3 = false;
      bool2 = false;
      osf[] arrayOfosf = paramors.c;
      str5 = null;
      if (arrayOfosf != null)
      {
        int i1 = arrayOfosf.length;
        str5 = null;
        if (i1 > 0)
        {
          localStringBuilder = new StringBuilder();
          for (int i2 = 0; i2 < arrayOfosf.length; i2++)
          {
            osf localosf = arrayOfosf[i2];
            if ((localosf.a != null) && (localosf.a.b != null))
            {
              localStringBuilder.append(localosf.a.b);
              localStringBuilder.append('|');
            }
          }
        }
      }
    }
    else
    {
      str3 = paramors.b.c;
      str4 = paramors.b.a;
      if (paramors.b.f == null) {}
      for (boolean bool1 = false;; bool1 = paramors.b.f.booleanValue())
      {
        bool2 = efj.b(paramors.b.i);
        bool3 = bool1;
        break;
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      str5 = localStringBuilder.toString();
    }
    a(str1, str2, str3, str4, paramCharSequence1, paramCharSequence2, false, str5, paramString, bool3, bool2, null, paramhvl);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.B = paramBoolean;
    if (this.B)
    {
      this.C = 3;
      this.D = 9;
      this.E = 12;
      PeopleListRowNameView localPeopleListRowNameView = this.t;
      Context localContext = localPeopleListRowNameView.getContext();
      localPeopleListRowNameView.a.setTextAppearance(localContext, ehr.di);
      localPeopleListRowNameView.b.setTextAppearance(localContext, ehr.dl);
      localPeopleListRowNameView.c = true;
      return;
    }
    this.C = 0;
    this.D = 4;
    this.E = 11;
  }
  
  public final void onClick(View paramView)
  {
    int i1 = paramView.getId();
    if ((i1 == ehr.ck) || (i1 == ehr.cy)) {
      if ((this.m != null) && ((this.r) || (this.i)))
      {
        if (this.j.getVisibility() == 0) {
          ((gvj)mbb.a(getContext(), gvj.class)).a(this.j);
        }
        this.m.a(this.c, this.f, this.n, this.g, this.A);
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (i1 != ehr.cx) {
              break;
            }
          } while (this.m == null);
          if (this.x)
          {
            hvn localhvn = this.m;
            String str = this.c;
            if (!this.q) {}
            for (boolean bool = true;; bool = false)
            {
              localhvn.a(str, bool);
              return;
            }
          }
          this.m.a(this.c, this.d, this.f, this.g);
          return;
          if (i1 != ehr.cj) {
            break;
          }
        } while (this.m == null);
        this.m.a(this.c, this.d, this.q, this.f, this.g);
        return;
        if (i1 != ehr.cr) {
          break;
        }
      } while (this.m == null);
      this.m.a(this, this.f);
      return;
    } while ((i1 != ehr.cG) || (this.m == null) || ((!this.r) && (!this.i)));
    if (this.j.getVisibility() == 0) {
      ((gvj)mbb.a(getContext(), gvj.class)).a(this.j);
    }
    this.m.a(this.c, this.f, this.n, this.g, this.A);
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.j = ((AvatarView)findViewById(ehr.ck));
    efj.a(this.j, new gxq(pka.x));
    this.j.setOnClickListener(new gxn(this));
    this.s = ((ImageView)findViewById(ehr.cw));
    this.t = ((PeopleListRowNameView)findViewById(ehr.cy));
    this.u = ((CirclesButton)findViewById(ehr.cx));
    this.u.b(this.w);
    this.u.a(this.C);
    this.v = ((CirclesButton)findViewById(ehr.cj));
    this.v.b(this.w);
    this.v.a(this.D);
    this.z = ((TextView)findViewById(ehr.cq));
    this.l = ((PeopleListSwipeableRowView)findViewById(ehr.cG));
    if (this.l != null) {
      this.l.setOnClickListener(new gxn(this));
    }
    this.o = findViewById(ehr.cr);
    if (this.o != null)
    {
      this.o.setOnClickListener(new gxn(this));
      efj.a(this.o, new gxq(pkf.B));
    }
  }
  
  public final boolean onLongClick(View paramView)
  {
    if (this.m != null) {
      return this.m.b(this.c, this.d, this.q, this.f, this.g);
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.discovery.views.PeopleListRowView
 * JD-Core Version:    0.7.0.1
 */