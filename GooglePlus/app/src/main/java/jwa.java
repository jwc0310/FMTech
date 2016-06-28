import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class jwa
  implements kii
{
  final juz a;
  final jud b;
  kic c;
  private final Context d;
  
  public jwa(Context paramContext, int paramInt)
  {
    this.d = paramContext;
    this.a = new juz(paramContext, paramInt);
    this.b = new jud(paramContext);
  }
  
  public final bk a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 1: 
      return new juo();
    }
    return new jul();
  }
  
  public final qbe a(Context paramContext, int paramInt)
  {
    return new jvb(paramContext, paramInt, this.a, this.b).a(paramContext, true);
  }
  
  public final void a()
  {
    this.a.a(true);
  }
  
  public final void a(Context paramContext, qbe paramqbe)
  {
    if ((paramqbe.a == null) || (paramqbe.a.length != 1) || (paramqbe.a[0] != 408)) {
      throw new IllegalArgumentException("Provided EmbedClientItem must be of type 408.");
    }
    this.a.f();
    qdz localqdz = (qdz)paramqbe.b(qdz.a);
    this.a.a(localqdz.b, true);
    for (int i = this.a.c(); i < localqdz.e.length; i++) {
      this.a.h();
    }
    int j = 0;
    boolean bool = true;
    if (j < localqdz.e.length)
    {
      jux localjux = this.a.a(j);
      qdy localqdy = (qdy)localqdz.e[j].b(qdy.a);
      localjux.a(localqdy.b);
      qdw localqdw;
      String str;
      ipm localipm;
      if (localqdy.e != null)
      {
        localqdw = (qdw)localqdy.e.b(qdw.a);
        str = localqdw.f;
        localipm = ipm.a;
        if (localqdw.j != 2) {
          break label258;
        }
        localipm = ipm.b;
        label206:
        if (!localqdw.i.equals(Long.toString(0L))) {
          break label280;
        }
      }
      label258:
      label280:
      for (ipf localipf = ipf.a(paramContext, Uri.parse(str), localipm);; localipf = ipf.a(paramContext, str, localipm))
      {
        localjux.a(paramContext, localipf, null, true);
        if (j > 0) {
          bool = false;
        }
        j++;
        break;
        if (localqdw.j != ipm.d.e) {
          break label206;
        }
        localipm = ipm.d;
        break label206;
      }
    }
    this.a.b(bool);
  }
  
  public final void a(Bundle paramBundle)
  {
    this.a.a(paramBundle);
    jud localjud = this.b;
    git localgit = (git)mbb.a(localjud.a, git.class);
    iub localiub = new iub(localjud.a).a(localgit.c());
    efj.e(localjud, "progressListener must be non-null");
    localiub.e = localjud;
    localjud.b = localiub.a();
    localjud.c = localgit.c();
    localjud.d = localgit.f().b("gaia_id");
    localjud.e = ((gzj)mbb.a(localjud.a, gzj.class));
    ArrayList localArrayList3;
    ArrayList localArrayList4;
    Map localMap;
    int i;
    if (paramBundle != null)
    {
      ArrayList localArrayList1 = paramBundle.getParcelableArrayList("PENDING_LIST");
      synchronized (localjud.f)
      {
        localjud.f.addAll(localArrayList1);
        localArrayList3 = paramBundle.getParcelableArrayList("FINISHED_REF_LIST");
        localArrayList4 = paramBundle.getParcelableArrayList("FINISHED_DATA_LIST");
        localMap = localjud.g;
        i = 0;
      }
    }
    try
    {
      while (i < localArrayList3.size())
      {
        localjud.g.put(localArrayList3.get(i), localArrayList4.get(i));
        i++;
        continue;
        localObject1 = finally;
        throw localObject1;
      }
      localjud.h = paramBundle.getString("temp_album_id");
      this.c = ((kic)mbb.a(this.d, kic.class));
      this.a.a(new jwb(this));
      return;
    }
    finally {}
  }
  
  public final boolean a(Context paramContext, khx paramkhx, oqq paramoqq)
  {
    if (!efj.J(paramContext))
    {
      jwc localjwc = new jwc(this, jxn.a(paramContext), paramContext.getString(eyg.ay));
      efj.m().post(localjwc);
      return false;
    }
    if (paramoqq.o == null) {
      paramoqq.o = new omp();
    }
    paramoqq.o.a = 26;
    String str = this.a.g();
    if (str == null) {
      str = "";
    }
    paramoqq.a = str;
    paramoqq.q = new jvb(paramContext, paramkhx.a, this.a, this.b).a(paramContext, false);
    return true;
  }
  
  public final boolean a(ImageButton paramImageButton)
  {
    efj.a(paramImageButton, new gxq(pkd.d));
    return true;
  }
  
  public final void b()
  {
    Iterator localIterator = this.a.i().iterator();
    label77:
    while (localIterator.hasNext())
    {
      ipf localipf = ((jux)localIterator.next()).b();
      if (localipf != null)
      {
        if (localipf.d != null) {}
        for (int i = 1;; i = 0)
        {
          if (i == 0) {
            break label77;
          }
          efj.a(localipf.d.toString(), this.d);
          break;
        }
      }
    }
    this.a.f();
    this.a.a(false);
  }
  
  public final void b(Bundle paramBundle)
  {
    this.a.b(paramBundle);
    jud localjud = this.b;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    synchronized (localjud.g)
    {
      Iterator localIterator = localjud.g.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localArrayList1.add(localEntry.getKey());
        localArrayList2.add(localEntry.getValue());
      }
    }
    synchronized (localjud.f)
    {
      paramBundle.putParcelableArrayList("PENDING_LIST", localjud.f);
      paramBundle.putParcelableArrayList("FINISHED_REF_LIST", localArrayList1);
      paramBundle.putParcelableArrayList("FINISHED_DATA_LIST", localArrayList2);
      paramBundle.putString("temp_album_id", localjud.h);
      return;
    }
  }
  
  public final boolean c()
  {
    return this.a.d(0);
  }
  
  public final boolean d()
  {
    return this.a.d(2);
  }
  
  public final kib e()
  {
    kib localkib = new kib();
    localkib.b = false;
    localkib.a = false;
    return localkib;
  }
  
  public final boolean f()
  {
    return this.a.e();
  }
  
  public final Drawable g()
  {
    return this.d.getResources().getDrawable(efj.Tm);
  }
  
  public final String h()
  {
    return this.d.getString(eyg.aJ);
  }
  
  public final String i()
  {
    return this.d.getString(eyg.aC);
  }
  
  public final String j()
  {
    return "polls";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwa
 * JD-Core Version:    0.7.0.1
 */