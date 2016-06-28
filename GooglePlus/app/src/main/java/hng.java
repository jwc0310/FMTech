import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageButton;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import java.util.ArrayList;
import java.util.Set;

public final class hng
  implements hnf, mbo, mes, mfa, mfd
{
  Context a;
  git b;
  gzj c;
  hpo d;
  String e;
  final la<String, Integer> f = new la();
  hnr g;
  ArrayList<String> h;
  hgv i;
  final cv j;
  
  hng(bk parambk, mek parammek)
  {
    this.j = parambk.k();
    parammek.a(this);
  }
  
  static void a(Context paramContext, SpaceListItemView paramSpaceListItemView, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      paramSpaceListItemView.c(null);
      paramSpaceListItemView.a(false);
      return;
    case 1: 
    case 2: 
    case 3: 
      paramSpaceListItemView.c(paramContext.getString(efj.Jd));
      gxq localgxq2 = new gxq(pjn.F);
      efj.a(paramSpaceListItemView.d, localgxq2);
      paramSpaceListItemView.a(true);
      return;
    case 4: 
    case 5: 
      paramSpaceListItemView.c(paramContext.getString(efj.Je));
      gxq localgxq1 = new gxq(pjn.ad);
      efj.a(paramSpaceListItemView.d, localgxq1);
      paramSpaceListItemView.a(false);
      return;
    }
    paramSpaceListItemView.c(paramContext.getString(efj.Jc));
    paramSpaceListItemView.a(true);
  }
  
  final int a(qpk paramqpk)
  {
    Integer localInteger = (Integer)this.f.get(paramqpk.a);
    if (localInteger != null) {
      return localInteger.intValue();
    }
    return paramqpk.e;
  }
  
  public final Set<String> a()
  {
    fpi localfpi = new fpi(this.h.size());
    for (int k = 0; k < this.h.size(); k++) {
      localfpi.add(this.h.get(k));
    }
    return localfpi;
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.a = paramContext;
    this.b = ((git)parammbb.a(git.class));
    this.c = ((gzj)parammbb.a(gzj.class));
    this.d = ((hpo)parammbb.a(hpo.class));
    this.i = ((hgv)parammbb.a(hgv.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.h = paramBundle.getStringArrayList("dismissed_ids_key");
      return;
    }
    this.h = new ArrayList();
  }
  
  public final void a(SpaceListItemView paramSpaceListItemView, qpq paramqpq, hnp paramhnp)
  {
    qpk localqpk = paramqpq.a;
    String str1 = paramqpq.b;
    String str2 = ((giz)mbb.a(this.a, giz.class)).a(this.b.c()).b("gaia_id");
    paramSpaceListItemView.setTag(efj.IU, localqpk.a);
    this.f.put(localqpk.a, Integer.valueOf(localqpk.e));
    int k = localqpk.a.hashCode();
    this.j.a(k, null, new hnk(this, localqpk.a));
    paramSpaceListItemView.a(localqpk.b);
    paramSpaceListItemView.setBackgroundColor(Color.rgb(localqpk.f.a.intValue(), localqpk.f.b.intValue(), localqpk.f.c.intValue()));
    paramSpaceListItemView.b(localqpk.c);
    qpo localqpo = localqpk.d;
    int m = 0;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int i2;
    if (localqpo != null)
    {
      qpn[] arrayOfqpn1 = localqpk.d.a;
      m = 0;
      if (arrayOfqpn1 != null)
      {
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        qpn[] arrayOfqpn2 = localqpk.d.a;
        int i1 = arrayOfqpn2.length;
        i2 = 0;
        if (i2 < i1)
        {
          qpn localqpn = arrayOfqpn2[i2];
          localArrayList2.add(localqpn.b);
          if (localqpn.c != null) {
            localArrayList1.add(localqpn.c);
          }
          if (!str2.equals(localqpn.a)) {
            break label512;
          }
        }
      }
    }
    label512:
    for (int i3 = 1;; i3 = m)
    {
      i2++;
      m = i3;
      break;
      paramSpaceListItemView.d(TextUtils.join(", ", localArrayList2));
      paramSpaceListItemView.a((String[])localArrayList1.toArray(new String[localArrayList1.size()]));
      int n = m;
      efj.a(paramSpaceListItemView, new kuo(pjn.R, str1));
      paramSpaceListItemView.setOnClickListener(new gxn(new hnh(this, localqpk)));
      gxq localgxq = new gxq(pjn.A);
      efj.a(paramSpaceListItemView.h, localgxq);
      gxn localgxn1 = new gxn(new hni(this, k, localqpk, paramhnp, paramSpaceListItemView));
      paramSpaceListItemView.h.setOnClickListener(localgxn1);
      if (n != 0) {
        paramSpaceListItemView.c(null);
      }
      for (;;)
      {
        ((gxe)mbb.a(paramSpaceListItemView.getContext(), gxe.class)).a(paramSpaceListItemView);
        return;
        gxn localgxn2 = new gxn(new hnl(this, localqpk));
        paramSpaceListItemView.d.setOnClickListener(localgxn2);
        a(this.a, paramSpaceListItemView, a(localqpk));
      }
    }
  }
  
  public final void a(hnr paramhnr)
  {
    if (this.g == paramhnr) {
      this.g = null;
    }
    int k = this.f.size();
    for (int m = 0; m < k; m++) {
      this.j.a(((String)this.f.b[(m << 1)]).hashCode());
    }
  }
  
  public final void a(hnr paramhnr, String paramString)
  {
    this.g = paramhnr;
    this.e = paramString;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putStringArrayList("dismissed_ids_key", this.h);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hng
 * JD-Core Version:    0.7.0.1
 */