package com.google.android.libraries.social.oneprofile.about;

import aaw;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import aw;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import com.google.android.libraries.social.stream.legacy.views.StreamAlbumViewGroup;
import com.google.android.libraries.social.ui.views.HorizontalPreferredLinearLayout;
import efj;
import eyg;
import hfa;
import java.util.List;
import jgc;
import jgd;
import loh;
import nxl;
import qfj;
import qfk;
import qfl;
import qfm;
import qfp;
import qfx;
import qgd;
import qgi;
import qgj;
import qgm;
import qgo;
import qhd;
import qhg;
import qhh;
import qhk;
import qjn;
import qkf;

public final class OneProfileAboutReviewView
  extends jgd
  implements View.OnClickListener
{
  private static int c;
  private View A;
  private View B;
  private TextView C;
  private TextView D;
  private LocalStarRating E;
  private StreamAlbumViewGroup F;
  private HorizontalPreferredLinearLayout G;
  private TextView H;
  private LayoutInflater I;
  public String a;
  public jgc b;
  private qfm v;
  private qgo[] w;
  private AvatarView x;
  private TextView y;
  private TextView z;
  
  public OneProfileAboutReviewView(Context paramContext)
  {
    super(paramContext);
    if (c == 0) {
      c = getContext().getResources().getDimensionPixelSize(aaw.pf);
    }
  }
  
  public OneProfileAboutReviewView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    if (c == 0) {
      c = getContext().getResources().getDimensionPixelSize(aaw.pf);
    }
  }
  
  public OneProfileAboutReviewView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (c == 0) {
      c = getContext().getResources().getDimensionPixelSize(aaw.pf);
    }
  }
  
  private final void a(Integer paramInteger)
  {
    if (paramInteger != null)
    {
      this.E.a(paramInteger.intValue());
      this.E.setVisibility(0);
      return;
    }
    this.E.setVisibility(8);
  }
  
  private final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.z.setVisibility(0);
      this.z.setText(paramString);
      TextView localTextView = this.z;
      int i = jgd.f;
      int j = jgd.j;
      localTextView.setTextSize(0, i);
      localTextView.setTextColor(j);
      return;
    }
    this.z.setVisibility(8);
  }
  
  private final void a(String paramString1, String paramString2, String paramString3)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      this.A.setVisibility(8);
      this.B.setVisibility(8);
      return;
    }
    this.A.setVisibility(0);
    this.B.setVisibility(0);
    this.C.setVisibility(0);
    this.C.setText(paramString1);
    if (!TextUtils.isEmpty(paramString3))
    {
      this.C.setTextColor(k);
      this.A.setTag(paramString3);
      this.A.setOnClickListener(this);
      this.A.setBackgroundDrawable(getResources().getDrawable(eyg.as));
      a(this.A);
    }
    while (!TextUtils.isEmpty(paramString2))
    {
      this.D.setVisibility(0);
      this.D.setText(paramString2);
      if (!TextUtils.isEmpty(paramString3))
      {
        this.D.setTextColor(j);
        return;
        this.C.setTextColor(-16777216);
        this.A.setOnClickListener(null);
        this.A.setBackgroundDrawable(null);
      }
      else
      {
        this.D.setTextColor(-16777216);
        return;
      }
    }
    this.D.setVisibility(8);
  }
  
  private final void a(qgd paramqgd, boolean paramBoolean)
  {
    if ((paramqgd != null) && (!TextUtils.isEmpty(paramqgd.c)))
    {
      this.x.a(paramqgd.c, efj.E(paramqgd.b));
      this.x.setTag(paramqgd.c);
      AvatarView localAvatarView = this.x;
      OneProfileAboutReviewView localOneProfileAboutReviewView = null;
      if (paramBoolean) {
        localOneProfileAboutReviewView = this;
      }
      localAvatarView.setOnClickListener(localOneProfileAboutReviewView);
    }
    while ((paramqgd != null) && (paramqgd.a != null) && (!TextUtils.isEmpty(paramqgd.a.b)))
    {
      this.y.setVisibility(0);
      this.y.setText(paramqgd.a.b);
      a(this.y, jgd.g, true);
      return;
      this.x.a(null, null);
      this.x.setOnClickListener(null);
    }
    this.y.setVisibility(8);
  }
  
  private final void a(qgo[] paramArrayOfqgo, int paramInt)
  {
    this.w = paramArrayOfqgo;
    if ((this.w != null) && (this.w.length != 0))
    {
      this.F.setVisibility(0);
      setPadding(0, l, 0, 0);
      StreamAlbumViewGroup localStreamAlbumViewGroup = this.F;
      qgo[] arrayOfqgo = this.w;
      int i = (int)(0.6F * paramInt);
      localStreamAlbumViewGroup.c = arrayOfqgo;
      localStreamAlbumViewGroup.f = arrayOfqgo.length;
      localStreamAlbumViewGroup.a(paramInt, i);
      return;
    }
    setPadding(0, l, 0, l);
    this.F.setVisibility(8);
  }
  
  private final void a(qhg[] paramArrayOfqhg)
  {
    this.G.removeAllViews();
    if ((paramArrayOfqhg != null) && (paramArrayOfqhg.length != 0)) {
      for (int k = 0; k < paramArrayOfqhg.length; k++)
      {
        qhg localqhg = paramArrayOfqhg[k];
        if ((!TextUtils.isEmpty(localqhg.a)) && (!TextUtils.isEmpty(localqhg.c)))
        {
          View localView = this.I.inflate(efj.QO, null);
          ((TextView)localView.findViewById(aw.dc)).setText(String.valueOf(localqhg.a).concat(":"));
          ((TextView)localView.findViewById(aw.br)).setText(localqhg.c);
          this.G.addView(localView);
        }
      }
    }
    HorizontalPreferredLinearLayout localHorizontalPreferredLinearLayout = this.G;
    int i = this.G.getChildCount();
    int j = 0;
    if (i > 1) {}
    for (;;)
    {
      localHorizontalPreferredLinearLayout.setVisibility(j);
      return;
      j = 8;
    }
  }
  
  private final void b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      this.H.setVisibility(0);
      this.H.setText(paramString.trim());
      return;
    }
    this.H.setVisibility(8);
  }
  
  public final void D_()
  {
    super.D_();
    this.F.D_();
    this.x.a(null, null);
    this.x.setOnClickListener(null);
  }
  
  public final void a(nxl paramnxl)
  {
    List localList = efj.g(paramnxl);
    int i = 0;
    qgj localqgj2;
    if (i < localList.size())
    {
      localqgj2 = (qgj)localList.get(i);
      if (!TextUtils.equals(localqgj2.e, this.a)) {}
    }
    for (qgj localqgj1 = localqgj2;; localqgj1 = null)
    {
      qgd localqgd;
      String str2;
      Integer localInteger;
      qhg[] arrayOfqhg2;
      label115:
      qhg[] arrayOfqhg1;
      String str1;
      if (localqgj1 != null)
      {
        localqgd = localqgj1.a;
        str2 = localqgj1.d;
        localInteger = localqgj1.b;
        if ((localqgj1.f != null) && (localqgj1.f.a != null) && (localqgj1.f.a.length > 0))
        {
          arrayOfqhg2 = localqgj1.f.a;
          String str3 = localqgj1.c;
          arrayOfqhg1 = arrayOfqhg2;
          str1 = str3;
        }
      }
      for (;;)
      {
        a(localqgd, true);
        a(str2);
        a(null, null, null);
        a(localInteger);
        a(arrayOfqhg1);
        b(str1);
        a(null, 0);
        return;
        i++;
        break;
        arrayOfqhg2 = null;
        break label115;
        str1 = null;
        arrayOfqhg1 = null;
        localInteger = null;
        str2 = null;
        localqgd = null;
      }
    }
  }
  
  public final void a(qfp paramqfp, int paramInt1, int paramInt2)
  {
    Object localObject3;
    Object localObject4;
    Object localObject6;
    Object localObject5;
    Object localObject2;
    Object localObject1;
    if ((paramqfp.b != null) && (paramqfp.b.length != 0))
    {
      qfx localqfx = paramqfp.b[0];
      if ((localqfx.c != null) && (paramInt1 >= 0) && (paramInt1 < localqfx.c.length))
      {
        this.v = localqfx.c[paramInt1];
        qfk[] arrayOfqfk = this.v.d;
        int i = arrayOfqfk.length;
        int j = 0;
        localObject3 = null;
        localObject4 = null;
        if (j < i)
        {
          qfk localqfk = arrayOfqfk[j];
          if (localqfk.a == 1)
          {
            qgj localqgj = (qgj)localqfk.b(qfl.a);
            Object localObject7 = localObject3;
            localObject6 = localqgj;
            localObject5 = localObject7;
          }
          for (;;)
          {
            j++;
            localObject4 = localObject6;
            localObject3 = localObject5;
            break;
            if ((localqfk.a != 3) || (localqfk.b(qfj.a) == null)) {
              break label473;
            }
            localObject5 = ((qhd)localqfk.b(qfj.a)).b;
            localObject6 = localObject4;
          }
        }
        localObject2 = localObject3;
        localObject1 = localObject4;
      }
    }
    for (;;)
    {
      qgd localqgd;
      String str5;
      String str10;
      String str7;
      label274:
      String str8;
      String str6;
      label300:
      String str3;
      Integer localInteger1;
      String str4;
      String str1;
      qhg[] arrayOfqhg1;
      String str2;
      if (localObject1 != null)
      {
        localqgd = paramqfp.a;
        str5 = localObject1.d;
        qgi localqgi = this.v.c;
        if (localqgi != null) {
          if ((localqgi.n != null) && (localqgi.n.a != null))
          {
            str10 = localqgi.n.a.b;
            if (localqgi.a != null)
            {
              str7 = localqgi.a.i;
              if (localqgi.b != null)
              {
                String str11 = localqgi.b.a;
                str8 = str10;
                str6 = str11;
                Integer localInteger2 = localObject1.b;
                qhh localqhh = localObject1.f;
                qhg[] arrayOfqhg2 = null;
                if (localqhh != null) {
                  arrayOfqhg2 = localObject1.f.a;
                }
                String str9 = localObject1.c;
                str3 = str7;
                localInteger1 = localInteger2;
                str4 = str8;
                str1 = str6;
                arrayOfqhg1 = arrayOfqhg2;
                str2 = str9;
              }
            }
          }
        }
      }
      for (;;)
      {
        a(localqgd, false);
        a(str5);
        a(str4, str1, str3);
        a(localInteger1);
        a(arrayOfqhg1);
        b(str2);
        a(localObject2, paramInt2);
        return;
        str8 = str10;
        str6 = null;
        break label300;
        str7 = null;
        break label274;
        str10 = null;
        break;
        str6 = null;
        str7 = null;
        str8 = null;
        break label300;
        arrayOfqhg1 = null;
        localInteger1 = null;
        str1 = null;
        str2 = null;
        str3 = null;
        str4 = null;
        str5 = null;
        localqgd = null;
      }
      label473:
      localObject5 = localObject3;
      localObject6 = localObject4;
      break;
      localObject1 = null;
      localObject2 = null;
    }
  }
  
  public final void onClick(View paramView)
  {
    if (this.b != null)
    {
      int i = paramView.getId();
      if ((i == aw.aU) || (i == aw.bn)) {
        this.b.f((String)paramView.getTag());
      }
    }
  }
  
  public final void onFinishInflate()
  {
    super.onFinishInflate();
    this.x = ((AvatarView)findViewById(aw.aU));
    this.y = ((TextView)findViewById(aw.aV));
    this.z = ((TextView)findViewById(aw.cM));
    this.A = findViewById(aw.bn);
    this.B = findViewById(aw.bo);
    this.C = ((TextView)findViewById(aw.bp));
    this.D = ((TextView)findViewById(aw.bm));
    this.E = ((LocalStarRating)findViewById(aw.cW));
    this.F = ((StreamAlbumViewGroup)findViewById(aw.aS));
    this.G = ((HorizontalPreferredLinearLayout)findViewById(aw.aT));
    this.G.c = c;
    this.G.b = true;
    this.H = ((TextView)findViewById(aw.cQ));
    this.I = ((LayoutInflater)getContext().getSystemService("layout_inflater"));
    if (new hfa(getContext(), loh.a).b()) {}
    for (int i = eyg.aj;; i = eyg.ai)
    {
      setBackgroundResource(i);
      setPadding(0, l, 0, l);
      return;
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = resolveSize(2147483647, paramInt1);
    ViewGroup.LayoutParams localLayoutParams = this.F.getLayoutParams();
    localLayoutParams.width = i;
    localLayoutParams.height = ((int)(0.6F * i));
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutReviewView
 * JD-Core Version:    0.7.0.1
 */