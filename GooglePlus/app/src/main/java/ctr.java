import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public final class ctr
  extends mca
  implements View.OnClickListener, giv
{
  TextView Z;
  int a = 0;
  ImageView aa;
  ImageView ab;
  Drawable ac;
  private iwu ad;
  private Drawable ae;
  private ill af;
  private git ag;
  private String ah;
  private String ai;
  TextView b;
  TextView c;
  TextView d;
  
  private final void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      this.b.setAlpha(0.54F);
      a(this.b, paramInt, false);
      return;
    case 2: 
      this.d.setAlpha(0.54F);
      a(this.d, paramInt, false);
      return;
    case 3: 
      this.c.setAlpha(0.54F);
      a(this.c, paramInt, false);
      return;
    }
    this.Z.setAlpha(0.54F);
    this.aa.setImageDrawable(this.ae);
    a(this.Z, paramInt, false);
  }
  
  private static void a(View paramView, int paramInt1, int paramInt2, View.OnClickListener paramOnClickListener, gxt paramgxt)
  {
    View localView = paramView.findViewById(paramInt1);
    localView.setOnClickListener(paramOnClickListener);
    localView.setTag(Integer.valueOf(paramInt2));
    efj.a(localView, new gxq(paramgxt));
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    Resources localResources = g();
    View localView = paramLayoutInflater.inflate(efj.zZ, paramViewGroup, false);
    efj.a(localView, new gxq(pjs.d));
    gxn localgxn = new gxn(this);
    a(localView, efj.zT, 1, localgxn, pjs.c);
    a(localView, efj.zR, 3, localgxn, pjs.b);
    a(localView, efj.zP, 2, localgxn, pjs.a);
    a(localView, efj.zV, 4, localgxn, pjs.e);
    if (localView.findViewById(efj.zU) != null)
    {
      this.b = ((TextView)localView.findViewById(efj.zU));
      this.c = ((TextView)localView.findViewById(efj.zS));
    }
    for (this.d = ((TextView)localView.findViewById(efj.zQ));; this.d = ((TextView)localView.findViewById(efj.zP)))
    {
      this.Z = ((TextView)localView.findViewById(efj.zY));
      this.aa = ((ImageView)localView.findViewById(efj.zX));
      this.ab = ((ImageView)localView.findViewById(efj.zW));
      this.ae = localResources.getDrawable(efj.zM).mutate();
      this.ae.setAlpha(138);
      this.ac = localResources.getDrawable(efj.zM);
      this.ah = localResources.getString(efj.Ae);
      this.ai = localResources.getString(efj.Ad);
      a(1);
      a(3);
      a(2);
      a(4);
      return localView;
      this.b = ((TextView)localView.findViewById(efj.zT));
      this.c = ((TextView)localView.findViewById(efj.zR));
    }
  }
  
  final void a(TextView paramTextView, int paramInt)
  {
    v();
    this.a = paramInt;
    paramTextView.setAlpha(1.0F);
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      this.b.setAlpha(1.0F);
      a(this.b, paramInt, true);
      return;
    case 2: 
      this.d.setAlpha(1.0F);
      a(this.d, paramInt, true);
      return;
    case 3: 
      this.c.setAlpha(1.0F);
      a(this.c, paramInt, true);
      return;
    }
    this.Z.setAlpha(1.0F);
    a(this.Z, paramInt, true);
  }
  
  final void a(TextView paramTextView, int paramInt, boolean paramBoolean)
  {
    int i;
    String str1;
    StringBuilder localStringBuilder;
    label100:
    String str3;
    if (paramBoolean)
    {
      i = efj.Aj;
      mbf localmbf = this.bn;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paramTextView.getText();
      arrayOfObject[1] = Integer.valueOf(paramInt);
      arrayOfObject[2] = Integer.valueOf(4);
      str1 = localmbf.getString(i, arrayOfObject);
      if (paramInt != 4) {
        break label190;
      }
      mfz localmfz = (mfz)mfx.a.get();
      localmfz.b = (1 + localmfz.b);
      if (localmfz.b != 1) {
        break label166;
      }
      localStringBuilder = localmfz.a;
      efj.a(localStringBuilder, new CharSequence[] { str1 });
      if (this.ab.getVisibility() != 0) {
        break label181;
      }
      str3 = this.ah;
      label130:
      efj.a(localStringBuilder, new CharSequence[] { str3 });
    }
    label166:
    label181:
    label190:
    for (String str2 = mfx.b(localStringBuilder);; str2 = str1)
    {
      paramTextView.setContentDescription(str2);
      return;
      i = efj.Ak;
      break;
      localStringBuilder = new StringBuilder(256);
      break label100;
      str3 = this.ai;
      break label130;
    }
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    if (paramgiu2 == giu.c)
    {
      ill localill = new ill(this.bn, paramInt2);
      localill.a.add(ine.class);
      this.af = localill;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.ad = ((iwu)this.bo.a(iwu.class));
    this.ag = ((git)this.bo.a(git.class));
    ikt localikt = (ikt)this.bo.a(ikt.class);
    localikt.g.add(this);
    ((ikt)localikt);
    ill localill = new ill(this.bn, this.ag.c());
    localill.a.add(ine.class);
    this.af = localill;
  }
  
  public final void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    if (i == this.a) {
      return;
    }
    Intent localIntent;
    switch (i)
    {
    default: 
      localIntent = this.ad.a(this.bn);
    }
    while (localIntent != null)
    {
      bp localbp = f();
      if ((!(localbp instanceof iwt)) || (((iwt)localbp).d(localIntent))) {
        break;
      }
      ay.a(localbp, localIntent, ((gvj)this.bo.a(gvj.class)).a());
      return;
      if (!this.af.a())
      {
        this.bn.startActivity(this.af.b());
        localIntent = null;
      }
      else
      {
        localIntent = this.ad.c(this.bn, this.ag.c());
        continue;
        localIntent = this.ad.b(this.bn, this.ag.c());
        continue;
        localIntent = this.ad.b(this.bn);
      }
    }
  }
  
  public final void v()
  {
    if (this.a == 0) {
      return;
    }
    a(this.a);
    this.a = 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ctr
 * JD-Core Version:    0.7.0.1
 */