import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.google.android.libraries.social.help.TooltipView;
import java.util.List;

public final class jmp
  extends gpe
{
  TooltipView Z;
  FrameLayout aa;
  View ab;
  private String ac;
  private boolean ad;
  private int ae;
  private ViewTreeObserver.OnGlobalLayoutListener af;
  private int ag = jmt.e;
  
  private static int a(jmm paramjmm)
  {
    jgw localjgw = paramjmm.a;
    if (efj.a(localjgw)) {
      return 1;
    }
    return localjgw.f();
  }
  
  private final void x()
  {
    if (this.Z == null) {}
    do
    {
      TooltipView localTooltipView;
      String str;
      do
      {
        do
        {
          return;
          if ((this.ae != 0) || (this.b.c().size() == 0)) {
            break;
          }
          this.Z.setVisibility(0);
          new kpu(17).b(this.bn);
          gwz.a(this.Z, -1);
        } while (!efj.C(this.bn));
        localTooltipView = this.Z;
        str = this.ac;
      } while (Build.VERSION.SDK_INT < 16);
      localTooltipView.announceForAccessibility(str);
      return;
    } while (this.Z.getVisibility() != 0);
    this.Z.setVisibility(8);
    new kpu(16).b(this.bn);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    int i = ((git)mbb.a(this.bn, git.class)).c();
    hyi localhyi = (hyi)mbb.a(this.bn, hyi.class);
    String str1;
    label103:
    int j;
    int k;
    label115:
    Parcelable localParcelable;
    if (localhyi.b(jmv.a, i))
    {
      this.ag = jmt.a;
      switch (jms.b[(-1 + this.ag)])
      {
      default: 
        str1 = null;
        this.ac = str1;
        j = 0;
        k = 0;
        if (j >= this.b.c().size()) {
          break label316;
        }
        localParcelable = (Parcelable)this.b.c().get(j);
        if ((localParcelable instanceof jne)) {
          k++;
        }
        break;
      }
    }
    for (;;)
    {
      j++;
      break label115;
      if (localhyi.b(jmv.b, i))
      {
        this.ag = jmt.b;
        break;
      }
      if (localhyi.b(jmv.c, i))
      {
        this.ag = jmt.c;
        break;
      }
      if (!localhyi.b(jmv.d, i)) {
        break;
      }
      this.ag = jmt.d;
      break;
      str1 = this.bn.getString(aaw.pK);
      break label103;
      str1 = this.bn.getString(aaw.pL);
      break label103;
      str1 = this.bn.getString(aaw.pM);
      break label103;
      if ((localParcelable instanceof jmm)) {
        k += a((jmm)localParcelable);
      }
    }
    label316:
    this.ae = k;
    if ((this.ae == 0) && (this.b.c().size() != 0)) {
      switch (jms.b[(-1 + this.ag)])
      {
      }
    }
    while (this.ac == null)
    {
      this.ad = false;
      return localView;
      new kpu(21).b(this.bn);
      continue;
      new kpu(22).b(this.bn);
      continue;
      new kpu(23).b(this.bn);
      continue;
      new kpu(24).b(this.bn);
    }
    this.ad = true;
    this.aa = ((FrameLayout)localView);
    this.ab = this.aa.findViewById(efj.Sz);
    this.af = new jmq(this);
    this.ab.getViewTreeObserver().addOnGlobalLayoutListener(this.af);
    String str2 = this.bn.getString(aaw.pN);
    int m = this.bn.getResources().getDimensionPixelSize(efj.Ss);
    this.Z = ((TooltipView)this.aa.findViewById(efj.SA));
    this.Z.setVisibility(8);
    this.Z.a(new ied(i, pkd.l, this.ac, str2, 2147483647));
    this.Z.a(0);
    int n = this.bn.getResources().getDimensionPixelSize(efj.Sr);
    if (this.Z.a()) {}
    for (int i1 = n - m;; i1 = m)
    {
      this.Z.b(i1);
      this.Z.setOnClickListener(new jmr(this));
      x();
      return this.aa;
    }
  }
  
  public final void a(int paramInt, Parcelable paramParcelable)
  {
    super.a(paramInt, paramParcelable);
    if (paramInt == 0) {
      return;
    }
    if ((paramInt == hrv.c) && (paramParcelable == null))
    {
      this.ae = 0;
      x();
      return;
    }
    switch (jms.a[(paramInt - 1)])
    {
    }
    for (;;)
    {
      x();
      return;
      if ((paramParcelable instanceof jmm))
      {
        this.ae += a((jmm)paramParcelable);
      }
      else if ((paramParcelable instanceof jne))
      {
        this.ae = (1 + this.ae);
        continue;
        if ((paramParcelable instanceof jmm))
        {
          this.ae -= a((jmm)paramParcelable);
        }
        else if ((paramParcelable instanceof jne))
        {
          this.ae = (-1 + this.ae);
          continue;
          this.ae = 0;
        }
      }
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (paramBoolean)
    {
      if (this.Z != null) {
        this.Z.setVisibility(8);
      }
      return;
    }
    x();
  }
  
  public final void o()
  {
    super.o();
    for (int i = 0;; i++)
    {
      int j = this.b.c().size();
      int k = 0;
      if (i < j)
      {
        if (((this.b.c().get(i) instanceof jmm)) || ((this.b.c().get(i) instanceof jne))) {
          k = 1;
        }
      }
      else
      {
        if ((k != 0) && (this.ae <= 0)) {
          break;
        }
        return;
      }
    }
    if (this.ad)
    {
      new kpu(19).b(this.bn);
      this.ab.getViewTreeObserver().removeGlobalOnLayoutListener(this.af);
      return;
    }
    new kpu(20).b(this.bn);
  }
  
  protected final int v()
  {
    return efj.SB;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jmp
 * JD-Core Version:    0.7.0.1
 */