package com.google.android.libraries.social.oneprofile.about;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import aw;
import efj;
import eyg;
import jft;
import jfu;
import jfv;
import jgd;
import lpt;
import lww;
import nvn;
import nxl;
import nxn;
import nxv;

public final class OneProfileAboutMyStoryView
  extends jgd
{
  private TextView A;
  private TextView B;
  private ViewGroup a;
  private View b;
  private TextView c;
  private TextView v;
  private TextView w;
  private TextView x;
  private ViewGroup y;
  private View z;
  
  public OneProfileAboutMyStoryView(Context paramContext)
  {
    super(paramContext);
  }
  
  public OneProfileAboutMyStoryView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public OneProfileAboutMyStoryView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void D_()
  {
    super.D_();
    this.a.setOnClickListener(null);
    this.a.setBackgroundDrawable(null);
    this.y.setOnClickListener(null);
    this.y.setBackgroundDrawable(null);
  }
  
  public final void a(nxl paramnxl)
  {
    String str7;
    String str4;
    String str3;
    label59:
    String str2;
    String str1;
    Object localObject;
    if (paramnxl != null)
    {
      nvn localnvn = paramnxl.d;
      if (localnvn != null) {
        if (localnvn.d != null)
        {
          str7 = localnvn.d.b;
          if (localnvn.e != null)
          {
            String str8 = localnvn.e.b;
            str4 = str7;
            str3 = str8;
            nxv localnxv = paramnxl.e;
            if ((localnxv != null) && (localnxv.k != null))
            {
              str2 = localnxv.k.b;
              String str6 = str3;
              str1 = str4;
              localObject = str6;
            }
          }
        }
      }
    }
    for (;;)
    {
      int i;
      int j;
      label123:
      int k;
      label140:
      label197:
      int m;
      label262:
      label270:
      int n;
      if (!TextUtils.isEmpty(str1))
      {
        i = 1;
        if ((!this.p) && (i == 0)) {
          break label371;
        }
        j = 1;
        if ((!this.p) || (this.r)) {
          break label377;
        }
        k = 1;
        if (j == 0) {
          break label495;
        }
        if (k == 0) {
          break label383;
        }
        this.a.setBackgroundDrawable(getResources().getDrawable(eyg.as));
        a(this.a);
        this.a.setOnClickListener(new jft(this));
        this.b.setVisibility(0);
        if (i == 0) {
          break label395;
        }
        this.a.setVisibility(0);
        this.v.setText(str1);
        a(this.c, jgd.g, true);
        TextView localTextView7 = this.v;
        int i17 = jgd.f;
        int i18 = jgd.i;
        localTextView7.setTextSize(0, i17);
        localTextView7.setTextColor(i18);
        if (j != 0) {
          break label507;
        }
        m = 1;
        if (TextUtils.isEmpty((CharSequence)localObject)) {
          break label513;
        }
        n = 1;
      }
      label281:
      label371:
      label377:
      label383:
      int i1;
      label395:
      label495:
      label507:
      int i2;
      label513:
      label668:
      label678:
      int i3;
      for (;;)
      {
        if (n != 0)
        {
          this.w.setVisibility(0);
          a(this.w, jgd.g, true);
          this.x.setVisibility(0);
          SpannableStringBuilder localSpannableStringBuilder = lww.a((String)localObject, new jfv(this));
          int i9 = localSpannableStringBuilder.length();
          int i10 = 0;
          for (;;)
          {
            if ((i10 != i9) && (Character.isWhitespace(localSpannableStringBuilder.charAt(i10))))
            {
              i10++;
              continue;
              i = 0;
              break;
              j = 0;
              break label123;
              k = 0;
              break label140;
              this.b.setVisibility(8);
              break label197;
              if (k != 0)
              {
                this.a.setVisibility(0);
                TextView localTextView5 = this.v;
                int i14 = efj.Rr;
                localTextView5.setText(getContext().getResources().getString(i14));
                a(this.c, jgd.j, true);
                TextView localTextView6 = this.v;
                int i15 = jgd.f;
                int i16 = jgd.j;
                localTextView6.setTextSize(0, i15);
                localTextView6.setTextColor(i16);
                break label262;
              }
              this.a.setVisibility(8);
              break label262;
              this.a.setVisibility(8);
              break label262;
              m = 0;
              break label270;
              n = 0;
              break label281;
            }
          }
          if (i10 != 0)
          {
            localSpannableStringBuilder.delete(0, i10);
            i9 = localSpannableStringBuilder.length();
          }
          for (int i11 = i9 - 1; (i11 >= 0) && (Character.isWhitespace(localSpannableStringBuilder.charAt(i11))); i11--) {}
          if (i11 != i9 - 1) {
            localSpannableStringBuilder.delete(i11 + 1, i9);
          }
          this.x.setText(localSpannableStringBuilder);
          TextView localTextView4 = this.x;
          int i12 = jgd.f;
          int i13 = jgd.i;
          localTextView4.setTextSize(0, i12);
          localTextView4.setTextColor(i13);
          if (!(this.x.getMovementMethod() instanceof LinkMovementMethod)) {
            this.x.setMovementMethod(LinkMovementMethod.getInstance());
          }
          if ((m == 0) || (n != 0)) {
            break label887;
          }
          i1 = 1;
          if (TextUtils.isEmpty(str2)) {
            break label893;
          }
          i2 = 1;
          if (((!this.p) || (this.q)) && (i2 == 0)) {
            break label899;
          }
          i3 = 1;
          label700:
          if (i3 == 0) {
            break label992;
          }
          this.y.setVisibility(0);
          if (!this.p) {
            break label905;
          }
          this.y.setBackgroundDrawable(getResources().getDrawable(eyg.as));
          a(this.y);
          this.y.setOnClickListener(new jfu(this));
          this.z.setVisibility(0);
          label767:
          if (i2 == 0) {
            break label917;
          }
          this.B.setText(str2);
          a(this.A, jgd.g, true);
          TextView localTextView3 = this.B;
          int i7 = jgd.f;
          int i8 = jgd.i;
          localTextView3.setTextSize(0, i7);
          localTextView3.setTextColor(i8);
        }
      }
      lpt locallpt;
      for (;;)
      {
        if ((i1 != 0) && (i3 == 0)) {}
        locallpt = (lpt)getLayoutParams();
        if ((localObject == null) || (((String)localObject).length() <= 512)) {
          break label1004;
        }
        locallpt.a = 2;
        return;
        this.w.setVisibility(8);
        this.x.setVisibility(8);
        break;
        label887:
        i1 = 0;
        break label668;
        label893:
        i2 = 0;
        break label678;
        label899:
        i3 = 0;
        break label700;
        label905:
        this.z.setVisibility(8);
        break label767;
        label917:
        TextView localTextView1 = this.B;
        int i4 = efj.Rq;
        localTextView1.setText(getContext().getResources().getString(i4));
        a(this.A, jgd.j, true);
        TextView localTextView2 = this.B;
        int i5 = jgd.f;
        int i6 = jgd.j;
        localTextView2.setTextSize(0, i5);
        localTextView2.setTextColor(i6);
        continue;
        label992:
        this.y.setVisibility(8);
      }
      label1004:
      locallpt.a = 1;
      return;
      String str5 = str3;
      str1 = str4;
      localObject = str5;
      str2 = null;
      continue;
      str4 = str7;
      str3 = null;
      break label59;
      str7 = null;
      break;
      str3 = null;
      str4 = null;
      break label59;
      str1 = null;
      str2 = null;
      localObject = null;
    }
  }
  
  protected final void onFinishInflate()
  {
    super.onFinishInflate();
    this.a = ((ViewGroup)findViewById(aw.db));
    this.b = findViewById(aw.bO);
    this.c = ((TextView)findViewById(aw.da));
    this.v = ((TextView)findViewById(aw.cZ));
    this.w = ((TextView)findViewById(aw.cf));
    this.x = ((TextView)findViewById(aw.ce));
    this.y = ((ViewGroup)findViewById(aw.bl));
    this.z = findViewById(aw.bA);
    this.A = ((TextView)findViewById(aw.bk));
    this.B = ((TextView)findViewById(aw.bj));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.oneprofile.about.OneProfileAboutMyStoryView
 * JD-Core Version:    0.7.0.1
 */