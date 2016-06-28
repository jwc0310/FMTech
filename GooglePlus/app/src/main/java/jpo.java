import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class jpo
  extends gzf
{
  private final int a;
  private final String b;
  private final String c;
  private final String d;
  private final jpr l;
  
  public jpo(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, jpr paramjpr)
  {
    super(paramContext, "CopyPhotosToAlbumTask");
    this.a = paramInt;
    this.b = paramString1;
    this.c = null;
    this.d = paramString3;
    this.l = paramjpr;
  }
  
  protected final hae a()
  {
    boolean bool1 = true;
    Context localContext = g();
    kbu localkbu = (kbu)mbb.a(localContext, kbu.class);
    boolean bool2;
    boolean bool3;
    if (!TextUtils.isEmpty(this.b))
    {
      bool2 = bool1;
      if (bool2) {
        break label128;
      }
      bool3 = bool1;
    }
    label38:
    jpq localjpq;
    label128:
    boolean bool4;
    for (;;)
    {
      if (this.c != null)
      {
        ArrayList localArrayList1 = new ArrayList();
        Iterator localIterator1 = this.l.a(g()).iterator();
        for (;;)
        {
          if (localIterator1.hasNext())
          {
            jps localjps1 = (jps)localIterator1.next();
            if (localjps1.c())
            {
              localArrayList1.add(localjps1.d());
              continue;
              bool2 = false;
              break;
              bool3 = false;
              break label38;
            }
          }
        }
        localjpq = new jpq(localContext, this.a);
        localjpq.c = this.c;
        localjpq.d = this.d;
        localjpq.e = localArrayList1;
        localjpq.f = 0;
        efj.d(TextUtils.isEmpty(localjpq.c) ^ TextUtils.isEmpty(localjpq.d), "Exactly one of albumMediaKey or albumTitle must be set.");
        if (localjpq.e == null) {
          throw new NullPointerException();
        }
        if (!localjpq.e.isEmpty())
        {
          bool4 = bool1;
          efj.d(bool4, "mediaKeys cannot be empty.");
        }
      }
    }
    ArrayList localArrayList2;
    for (jpp localjpp = new jpp(localjpq.a, localjpq.b, null, localjpq.c, localjpq.d, localjpq.e, null, localjpq.f);; localjpp = new jpp(localContext, this.a, this.b, this.d, localArrayList2, 0))
    {
      localkbu.a(localjpp);
      if (!localjpp.n()) {
        break label430;
      }
      return new hae(localjpp.o, localjpp.q, null);
      bool4 = false;
      break;
      localArrayList2 = new ArrayList();
      Iterator localIterator2 = this.l.a(g()).iterator();
      while (localIterator2.hasNext())
      {
        jps localjps2 = (jps)localIterator2.next();
        if (localjps2.b()) {
          localArrayList2.add(Long.toString(localjps2.a()));
        }
      }
    }
    label430:
    hae localhae = new hae(bool1);
    Bundle localBundle = localhae.a();
    boolean bool5;
    if (localjpp.a == null)
    {
      bool5 = bool1;
      if (localjpp.b != null) {
        break label544;
      }
      label466:
      efj.c(bool5 ^ bool1, "Exactly one of legacyPhotoIds and mediaKeys must be set.");
      if (localjpp.a == null) {
        break label549;
      }
    }
    label544:
    label549:
    for (int i = localjpp.a.size();; i = localjpp.b.size())
    {
      psl localpsl = localjpp.e;
      localBundle.putBoolean("is_new_album", bool3);
      localBundle.putInt("num_photos_added", i);
      localBundle.putString("media_key", localpsl.b.a);
      return localhae;
      bool5 = false;
      break;
      bool1 = false;
      break label466;
    }
  }
  
  public final String b()
  {
    Context localContext = g();
    int i;
    if (!TextUtils.isEmpty(this.b))
    {
      i = 1;
      if (i == 0) {
        break label36;
      }
    }
    label36:
    for (int j = efj.Tf;; j = efj.Tg)
    {
      return localContext.getString(j);
      i = 0;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpo
 * JD-Core Version:    0.7.0.1
 */