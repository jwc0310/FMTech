import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

final class kkc
  implements iyq
{
  final koj a;
  final gwa b;
  int c;
  int d;
  boolean e;
  long f;
  private final Context g;
  private final int h;
  private final Map<String, ipm> i;
  private final giz j;
  private long k = -1L;
  private long l = -1L;
  private int m;
  private int n;
  private int o;
  private kkf p;
  private final String q;
  private final String r;
  
  public kkc(Context paramContext, int paramInt, koj paramkoj)
  {
    this.g = paramContext;
    this.h = paramInt;
    this.a = paramkoj;
    int i1 = paramkoj.e.length;
    if (i1 > 0)
    {
      this.i = new kl(i1);
      f();
    }
    for (;;)
    {
      this.j = ((giz)mbb.a(paramContext, giz.class));
      this.b = ((gwa)mbb.a(paramContext, gwa.class));
      this.p = new kkf(this);
      this.q = paramContext.getCacheDir().getPath();
      File localFile = efj.u(paramContext);
      if (localFile == null) {
        break;
      }
      this.r = localFile.getPath();
      return;
      this.i = null;
    }
    this.r = null;
  }
  
  public kkc(Context paramContext, int paramInt, myt parammyt, Date paramDate, String paramString, List<ipf> paramList)
  {
    this(paramContext, paramInt, a(parammyt, paramDate, paramString, paramList));
  }
  
  private static koj a(myt parammyt, Date paramDate, String paramString, List<ipf> paramList)
  {
    koj localkoj = new koj();
    localkoj.a = parammyt;
    localkoj.b = Long.valueOf(paramDate.getTime());
    localkoj.c = paramString;
    int i1;
    ArrayList localArrayList;
    int i2;
    label59:
    ipf localipf;
    if (paramList != null)
    {
      i1 = paramList.size();
      localArrayList = new ArrayList(i1);
      i2 = 0;
      if (i2 >= i1) {
        break label169;
      }
      localipf = (ipf)paramList.get(i2);
      if (!localipf.a()) {
        if (localipf.d == null) {
          break label163;
        }
      }
    }
    label163:
    for (int i3 = 1;; i3 = 0)
    {
      if (i3 != 0)
      {
        kok localkok = new kok();
        localkok.a = Integer.valueOf(localipf.e.e);
        localkok.b = localipf.d.toString();
        localArrayList.add(localkok);
      }
      i2++;
      break label59;
      i1 = 0;
      break;
    }
    label169:
    localkoj.e = ((kok[])localArrayList.toArray(new kok[localArrayList.size()]));
    return localkoj;
  }
  
  private final void f()
  {
    int i1 = 0;
    int i2 = this.a.e.length;
    if (i1 < i2)
    {
      kok localkok = this.a.e[i1];
      ipm localipm = ipm.a(localkok.a.intValue());
      this.i.put(localkok.b, localipm);
      switch (kkd.b[localipm.ordinal()])
      {
      default: 
        String str = String.valueOf(localipm);
        Log.e("NetworkQueueRequest", 20 + String.valueOf(str).length() + "Unknown media type: " + str);
      }
      for (;;)
      {
        i1++;
        break;
        this.m = (1 + this.m);
        continue;
        this.c = (1 + this.c);
      }
    }
  }
  
  private final void g()
  {
    if ((this.k != -1L) || (this.l != -1L)) {}
    ArrayList localArrayList2;
    do
    {
      do
      {
        return;
      } while ((this.a.e.length == 0) || (this.a.d == null) || (this.a.d.isEmpty()));
      ArrayList localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      int i1 = 0;
      int i2 = this.a.e.length;
      if (i1 < i2)
      {
        kok localkok = this.a.e[i1];
        ipm localipm = ipm.a(localkok.a.intValue());
        switch (kkd.b[localipm.ordinal()])
        {
        }
        for (;;)
        {
          i1++;
          break;
          localArrayList2.add(localkok.b);
          continue;
          localArrayList1.add(localkok.b);
        }
      }
      if (!localArrayList1.isEmpty()) {
        this.k = this.b.a(this.h, this.a.d, localArrayList1, this.p);
      }
    } while (localArrayList2.isEmpty());
    this.l = this.b.a(this.h, this.a.d, localArrayList2, this.p);
    this.n = this.m;
  }
  
  public final int a(iys paramiys, iyr paramiyr)
  {
    int i1 = 1;
    if (this.a.e.length == 0) {
      this.o = 2;
    }
    for (;;)
    {
      switch (this.o)
      {
      default: 
        int i6 = this.o;
        throw new RuntimeException(55 + "Invalid upload status associated with item: " + i6);
        if (!this.j.c(this.h))
        {
          this.o = 3;
        }
        else
        {
          g();
          if (this.c == this.d) {}
          for (int i2 = i1;; i2 = 0)
          {
            if (i2 == 0) {
              break label154;
            }
            this.o = 2;
            break;
          }
          label154:
          if (this.e) {
            this.o = 3;
          } else if (this.a.d == null) {
            this.o = 4;
          } else {
            this.o = 0;
          }
        }
        break;
      }
    }
    Object localObject1 = null;
    i1 = 3;
    boolean bool = false;
    for (;;)
    {
      paramiys.c = this.m;
      paramiys.d = this.n;
      paramiys.a = this.c;
      paramiys.b = this.d;
      paramiyr.a = localObject1;
      paramiyr.b = bool;
      return i1;
      for (;;)
      {
        for (;;)
        {
          try
          {
            kkr localkkr = new kkr(this.g, this.h, this.a.a, null);
            localkkr.i();
            localkkr.d("NetworkQueueRequest");
            if (!localkkr.x) {
              break label813;
            }
            localqat2 = localkkr.w;
            localolr = ((myu)localqat2).a;
            opo[] arrayOfopo = localolr.a.a;
            if (this.a.e.length > 0)
            {
              ArrayList localArrayList = new ArrayList();
              int i3 = this.a.e.length;
              int i4 = 0;
              if (i4 >= i3) {
                break label819;
              }
              localArrayList.add(this.a.e[i4].b);
              i4++;
              continue;
              if (i5 < arrayOfopo.length)
              {
                opo localopo = arrayOfopo[i5];
                String str = "instant";
                if (this.a.d != null) {
                  str = localopo.p;
                }
                if ((str == null) || (str.isEmpty())) {
                  Log.e("NetworkQueueRequest", "Empty update.albumId");
                } else {
                  this.b.a(this.h, str, localArrayList, this.p);
                }
              }
            }
          }
          catch (IOException localIOException2)
          {
            olr localolr;
            if ((localIOException2.getCause() instanceof kdd))
            {
              if (kdd.a(localIOException2, "ACTIVITY_ALREADY_EXISTS"))
              {
                localObject2 = null;
                bool = false;
                break;
                if (efj.z(this.g, this.h))
                {
                  kiy localkiy = new kiy(this.g, new kcg(this.g, this.h));
                  localkiy.a();
                  if (!localkiy.a.n())
                  {
                    efj.b(this.g, this.h, localkiy.b().b);
                    break label831;
                  }
                  Exception localException = localkiy.a.q;
                  if (!Log.isLoggable("NetworkQueueRequest", 6)) {
                    break label831;
                  }
                  Log.e("NetworkQueueRequest", "Error querying audience history", localException);
                  break label831;
                }
                kmf localkmf = (kmf)mbb.a(this.g, kmf.class);
                if (localolr.b == null) {
                  break label831;
                }
                localkmf.a(this.h, localolr.b.a);
                break label831;
              }
              Log.e("NetworkQueueRequest", "Server error encountered when sending post.", localObject2.getCause());
              i1 = 5;
              bool = false;
              break;
            }
            bool = i1;
            i1 = 4;
            localObject2 = null;
          }
          break;
          i1 = 5;
          localObject2 = null;
          bool = false;
          break;
          try
          {
            kke localkke = new kke(this.g, this.h);
            localkke.i();
            localkke.d("NetworkQueueRequest");
            if (localkke.x) {}
            for (qat localqat1 = localkke.w;; localqat1 = null)
            {
              ntf localntf = ((mqq)localqat1).a;
              this.a.d = localntf.a.c;
              g();
              i1 = 3;
              localObject2 = null;
              bool = false;
              break;
            }
          }
          catch (IOException localIOException1)
          {
            bool = i1;
            i1 = 4;
            localObject2 = null;
          }
        }
        label813:
        qat localqat2 = null;
        continue;
        label819:
        int i5 = 0;
        continue;
        i5++;
      }
      label831:
      Object localObject2 = null;
      bool = false;
    }
  }
  
  public final String a()
  {
    return "network_post_request_handle";
  }
  
  final void a(String paramString)
  {
    if ((paramString.contains(this.q)) || ((!TextUtils.isEmpty(this.r)) && (paramString.contains(this.r)))) {
      efj.l(paramString);
    }
  }
  
  public final String b()
  {
    Resources localResources = this.g.getResources();
    int i1 = efj.UU;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(1);
    return localResources.getQuantityString(i1, 1, arrayOfObject);
  }
  
  public final String c()
  {
    return this.a.c;
  }
  
  public final void d()
  {
    int i1 = 0;
    int i2 = this.a.e.length;
    while (i1 < i2)
    {
      a(this.a.e[i1].b);
      i1++;
    }
    if ((this.b != null) && (this.a.d != null))
    {
      gvq localgvq = gvq.a(this.h, this.a.d);
      if (this.b.b(localgvq).b == gvy.b) {
        this.b.a(localgvq);
      }
    }
  }
  
  public final boolean e()
  {
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kkc
 * JD-Core Version:    0.7.0.1
 */