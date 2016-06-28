import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public final class dcl
  extends hqj
{
  private boolean r;
  private final fv s = new fv(this);
  private int t;
  private int u;
  private boolean v;
  
  public dcl(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext);
    this.t = paramInt1;
    this.u = paramInt2;
    this.v = true;
  }
  
  protected final void g()
  {
    super.g();
    if (!this.r)
    {
      Context localContext = this.l;
      fv localfv = this.s;
      efj.h();
      for (itd localitd : efj.PW) {
        localContext.getContentResolver().registerContentObserver(localitd.b(), false, localfv);
      }
      this.l.getContentResolver().registerContentObserver(hbu.b(this.l), false, this.s);
      this.r = true;
    }
  }
  
  protected final void l()
  {
    if (this.r)
    {
      Context localContext = this.l;
      fv localfv = this.s;
      localContext.getContentResolver().unregisterContentObserver(localfv);
      this.l.getContentResolver().unregisterContentObserver(this.s);
      this.r = false;
    }
  }
  
  public final Cursor o()
  {
    isv[] arrayOfisv = efj.c(this.l, this.t, this.u);
    hqr localhqr = new hqr(cyd.r);
    Object[] arrayOfObject = new Object[cyd.r.length];
    int i = 0;
    int j = arrayOfisv.length;
    int k = 0;
    isv localisv;
    String str2;
    if (k < j)
    {
      localisv = arrayOfisv[k];
      if (localisv.e)
      {
        str2 = jrf.a();
        if (!this.v) {
          break label373;
        }
        Arrays.fill(arrayOfObject, null);
        arrayOfObject[0] = Integer.valueOf(i);
        arrayOfObject[2] = Integer.valueOf(2);
        arrayOfObject[4] = str2;
        arrayOfObject[1] = "~local";
        arrayOfObject[5] = localisv.b;
        arrayOfObject[9] = Integer.valueOf(localisv.c);
        arrayOfObject[13] = Integer.valueOf(i);
        arrayOfObject[15] = Long.valueOf(262144L);
        localhqr.a(arrayOfObject);
      }
    }
    label373:
    for (int m = i + 1;; m = i)
    {
      Iterator localIterator = localisv.f.iterator();
      i = m;
      while (localIterator.hasNext())
      {
        ita localita = (ita)localIterator.next();
        efj.h();
        String str3 = ContentUris.withAppendedId(efj.PW[localita.a].b(), localita.b).toString();
        long l = 262144L;
        if (str3.contains("/video/")) {
          l = 262176L;
        }
        Arrays.fill(arrayOfObject, null);
        arrayOfObject[0] = Integer.valueOf(i);
        arrayOfObject[2] = Integer.valueOf(4);
        arrayOfObject[3] = str2;
        arrayOfObject[1] = "~local";
        arrayOfObject[7] = str3;
        arrayOfObject[13] = Integer.valueOf(i);
        arrayOfObject[15] = Long.valueOf(l);
        arrayOfObject[14] = Long.valueOf(jrf.c.longValue());
        arrayOfObject[20] = localita.d;
        localhqr.a(arrayOfObject);
        i++;
        continue;
        if (localisv.a != null) {}
        for (String str1 = localisv.a.toString();; str1 = null)
        {
          str2 = jrf.k(str1);
          break;
        }
      }
      k++;
      break;
      return localhqr;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcl
 * JD-Core Version:    0.7.0.1
 */