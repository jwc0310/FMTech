import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class kji
  implements irq, kik, mbo, mes, mfa, mfd
{
  String a;
  public boolean b;
  public lmg c;
  public lmb d;
  hqw e;
  public String f;
  public kkt g;
  public boolean h;
  irp i;
  kij j;
  public khy k;
  public qbe l;
  public kkv m;
  public final ArrayList<kjj> n = new ArrayList();
  public final ArrayList<kjk> o = new ArrayList();
  private final Activity p;
  private String q;
  private String r;
  
  public kji(Activity paramActivity, mek parammek)
  {
    this.p = paramActivity;
    parammek.a(this);
  }
  
  private static lmg a(Intent paramIntent)
  {
    int i1 = 1;
    lmg locallmg1 = (lmg)paramIntent.getParcelableExtra("location");
    lmg locallmg2;
    if (locallmg1 != null) {
      locallmg2 = locallmg1;
    }
    boolean bool;
    do
    {
      return locallmg2;
      if (paramIntent.hasExtra("com.google.android.apps.plus.LOCATION_NAME")) {
        break;
      }
      bool = paramIntent.hasExtra("com.google.android.apps.plus.CID");
      locallmg2 = null;
    } while (!bool);
    String str4;
    String str5;
    if ((paramIntent.hasExtra("com.google.android.apps.plus.LATITUDE")) && (paramIntent.hasExtra("com.google.android.apps.plus.LONGITUDE")))
    {
      str4 = paramIntent.getStringExtra("com.google.android.apps.plus.LATITUDE");
      str5 = paramIntent.getStringExtra("com.google.android.apps.plus.LONGITUDE");
    }
    for (;;)
    {
      String str1;
      String str2;
      String str3;
      try
      {
        double d1 = Double.parseDouble(str4);
        double d2 = Double.parseDouble(str5);
        if ((d1 >= -90.0D) && (d1 <= 90.0D) && (d2 >= -180.0D) && (d2 <= 180.0D))
        {
          Integer localInteger3 = Integer.valueOf((int)(d1 * 10000000.0D));
          localInteger1 = localInteger3;
          i3 = (int)(d2 * 10000000.0D);
        }
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        int i3;
        Integer localInteger4;
        String str7;
        localInteger1 = null;
        if (Log.isLoggable("ComposedContentModel", 5))
        {
          String str6 = String.valueOf("Can't parse latitude/longitude extras. latitude: ");
          new StringBuilder(13 + String.valueOf(str6).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append(str6).append(str4).append(", longitude: ").append(str5);
        }
        i2 = 0;
        localInteger2 = null;
        continue;
      }
      try
      {
        localInteger4 = Integer.valueOf(i3);
        localInteger2 = localInteger4;
        i2 = i1;
        if (!paramIntent.hasExtra("com.google.android.apps.plus.CID")) {
          break label440;
        }
        str1 = paramIntent.getStringExtra("com.google.android.apps.plus.CID");
        i2 = i1;
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        continue;
        i1 = i2;
        str3 = null;
        continue;
        str2 = null;
        continue;
        label440:
        str1 = null;
        continue;
      }
      if (paramIntent.hasExtra("com.google.android.apps.plus.LOCATION_NAME"))
      {
        str2 = paramIntent.getStringExtra("com.google.android.apps.plus.LOCATION_NAME");
        i2 = i1;
        if (paramIntent.hasExtra("com.google.android.apps.plus.ADDRESS"))
        {
          str3 = paramIntent.getStringExtra("com.google.android.apps.plus.ADDRESS");
          locallmg2 = null;
          if (i1 == 0) {
            break;
          }
          return new lmg(3, localInteger1, localInteger2, str2, str3, str1, 0.0D);
          if (Log.isLoggable("ComposedContentModel", 5))
          {
            str7 = String.valueOf("Provided latitude/longitude are out of range. latitude: ");
            new StringBuilder(13 + String.valueOf(str7).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append(str7).append(str4).append(", longitude: ").append(str5);
          }
          i2 = 0;
          localInteger1 = null;
          localInteger2 = null;
          continue;
        }
      }
      int i2 = 0;
      Integer localInteger1 = null;
      Integer localInteger2 = null;
    }
  }
  
  private final void h()
  {
    Iterator localIterator = this.n.iterator();
    while (localIterator.hasNext()) {
      ((kjj)localIterator.next()).z();
    }
  }
  
  public final String a()
  {
    try
    {
      String str = this.r;
      return str;
    }
    finally
    {
      this.r = null;
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.i = ((irp)parammbb.a(irp.class));
    this.j = ((kij)parammbb.a(kij.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    Intent localIntent = this.p.getIntent();
    this.q = localIntent.getAction();
    this.a = kia.a(localIntent, "activity_id");
    int i1;
    boolean bool;
    label53:
    int i2;
    if (Build.VERSION.SDK_INT >= 11)
    {
      i1 = 1;
      if ((i1 != 0) && (!localIntent.getBooleanExtra("disable_location", false))) {
        break label285;
      }
      bool = true;
      this.b = bool;
      if (localIntent.hasExtra("square_embed")) {
        this.d = ((lmb)localIntent.getParcelableExtra("square_embed"));
      }
      if (localIntent.hasExtra("embed_client_item")) {
        this.e = ((hqw)localIntent.getParcelableExtra("embed_client_item"));
      }
      if (paramBundle != null) {
        break label347;
      }
      this.r = kia.a(localIntent, "android.intent.extra.TEXT");
      if (!this.b) {
        this.c = a(localIntent);
      }
      if (!"com.google.android.apps.plus.SHARE_GOOGLE".equals(this.q)) {
        break label291;
      }
      String str = localIntent.getDataString();
      if (str != null) {
        this.f = str;
      }
      label161:
      if (g() == khz.a) {
        break label341;
      }
      i2 = 1;
      label174:
      if ((i2 == 0) && (!TextUtils.isEmpty(this.r)))
      {
        SpannableString localSpannableString = new SpannableString(this.r);
        Linkify.addLinks(localSpannableString, 1);
        URLSpan[] arrayOfURLSpan = (URLSpan[])localSpannableString.getSpans(0, localSpannableString.length(), URLSpan.class);
        if (arrayOfURLSpan.length > 0)
        {
          this.f = arrayOfURLSpan[0].getURL();
          if (this.r.trim().equals(this.f)) {
            this.r = null;
          }
        }
      }
    }
    for (;;)
    {
      this.i.b.add(this);
      return;
      i1 = 0;
      break;
      label285:
      bool = false;
      break label53;
      label291:
      if (((!"com.google.android.apps.plus.GOOGLE_PLUS_SHARE".equals(this.q)) && (!"android.intent.action.SEND".equals(this.q))) || (!localIntent.hasExtra("com.google.android.apps.plus.CONTENT_URL"))) {
        break label161;
      }
      this.f = localIntent.getStringExtra("com.google.android.apps.plus.CONTENT_URL");
      break label161;
      label341:
      i2 = 0;
      break label174;
      label347:
      this.c = ((lmg)paramBundle.getParcelable("location"));
      this.f = paramBundle.getString("preview_url");
      this.g = ((kkt)paramBundle.getParcelable("preview"));
      this.h = paramBundle.getBoolean("is_link_preview_via_url_in_comment_box");
      if (this.g != null) {
        this.m = new kkv(this.g);
      }
    }
  }
  
  public final void a(ArrayList<ipa> paramArrayList, Object paramObject)
  {
    if (!paramArrayList.isEmpty())
    {
      if ((this.g != null) || (this.f != null))
      {
        e();
        return;
      }
      if (this.j.a() != null)
      {
        this.j.a(null);
        return;
      }
    }
    h();
  }
  
  public final void a(kkt paramkkt)
  {
    this.g = paramkkt;
    int i4;
    if (paramkkt != null)
    {
      qbe localqbe = paramkkt.a(null);
      List localList = mbb.c(this.p, khy.class);
      i4 = 0;
      if (i4 < localList.size())
      {
        khy localkhy = (khy)localList.get(i4);
        if (localkhy.a(localqbe))
        {
          this.k = localkhy;
          this.l = localqbe;
          h();
        }
      }
    }
    for (;;)
    {
      return;
      i4++;
      break;
      if (g() != khz.b)
      {
        int i1 = g();
        int i2 = khz.a;
        int i3 = 0;
        if (i1 != i2) {
          i3 = 1;
        }
        if (i3 != 0) {}
      }
      else
      {
        this.m = new kkv(paramkkt);
        if (this.m.a())
        {
          h();
          return;
        }
        String str = this.f;
        this.f = null;
        this.g = null;
        this.m = null;
        Iterator localIterator = this.n.iterator();
        while (localIterator.hasNext()) {
          ((kjj)localIterator.next()).b(str);
        }
      }
    }
  }
  
  public final void a(lmg paramlmg)
  {
    if (paramlmg != this.c)
    {
      this.c = paramlmg;
      Iterator localIterator = this.o.iterator();
      while (localIterator.hasNext()) {
        ((kjk)localIterator.next()).a();
      }
    }
  }
  
  public final void aJ_() {}
  
  public final kkt b()
  {
    kjp localkjp;
    qbe localqbe;
    if ((this.g != null) && (this.m != null) && (this.m.a != null) && (this.m.a.f))
    {
      localkjp = this.m.a;
      localqbe = this.g.a(null);
      if (localkjp.b == null) {
        break label78;
      }
      localqbe.a(qeg.a, localkjp.b);
    }
    for (;;)
    {
      return this.g;
      label78:
      if (localkjp.c != null) {
        localqbe.a(qei.a, localkjp.c);
      } else if (localkjp.d != null) {
        localqbe.a(qcx.a, localkjp.d);
      }
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putParcelable("location", this.c);
    paramBundle.putString("preview_url", this.f);
    paramBundle.putParcelable("preview", this.g);
    paramBundle.putBoolean("is_link_preview_via_url_in_comment_box", this.h);
  }
  
  public final boolean d()
  {
    return (this.f != null) && (this.g == null);
  }
  
  public final void e()
  {
    this.f = null;
    this.g = null;
    this.m = null;
    this.h = false;
    h();
  }
  
  public final void f()
  {
    if (this.j.a() == null) {
      h();
    }
    for (;;)
    {
      return;
      if ((this.g != null) || (this.f != null))
      {
        e();
        return;
      }
      if (this.i.a()) {
        break;
      }
      irp localirp = this.i;
      localirp.c();
      if (!localirp.a.isEmpty()) {}
      for (int i1 = 1; i1 != 0; i1 = 0)
      {
        localirp.a.clear();
        localirp.a(this);
        return;
      }
    }
    h();
  }
  
  public final int g()
  {
    if (this.a != null) {
      return khz.g;
    }
    if ((this.f != null) || (this.g != null)) {
      return khz.b;
    }
    if ((this.i != null) && (this.i.b())) {
      return khz.d;
    }
    if (this.i != null)
    {
      if (!this.i.a.isEmpty()) {}
      for (int i1 = 1; i1 != 0; i1 = 0) {
        return khz.c;
      }
    }
    if (this.d != null) {
      return khz.e;
    }
    if (this.k != null) {
      return this.k.a();
    }
    if (this.j.a() != null) {
      return khz.h;
    }
    return khz.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kji
 * JD-Core Version:    0.7.0.1
 */