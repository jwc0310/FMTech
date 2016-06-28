import android.app.Notification;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class cus
  implements jav
{
  private Context a;
  
  public cus(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final int a()
  {
    return jaw.b;
  }
  
  public final int a(int paramInt, mjd parammjd)
  {
    if ((parammjd.c != null) && (parammjd.c.b != null) && (parammjd.c.b.b != null) && (parammjd.c.b.b.length > 0))
    {
      SQLiteDatabase localSQLiteDatabase = hsb.b(this.a, paramInt);
      HashSet localHashSet = new HashSet();
      for (mkf localmkf : parammjd.c.b.b) {
        if (localmkf.a.b != null) {
          for (mkr localmkr : localmkf.a.b) {
            if ((!TextUtils.isEmpty(localmkr.b)) && (localHashSet.add(localmkr.b))) {
              brn.a(localSQLiteDatabase, localmkr.b, localmkr.c, localmkr.a);
            }
          }
        }
      }
    }
    return jaw.b;
  }
  
  public final void a(int paramInt, dk paramdk, jah[] paramArrayOfjah)
  {
    if (paramArrayOfjah.length == 1)
    {
      jah localjah2 = paramArrayOfjah[0];
      if (localjah2.c != null)
      {
        mlr localmlr2 = (mlr)localjah2.c.b(mlr.a);
        if (localmlr2 != null) {
          for (mlw localmlw : localmlr2.c)
          {
            Iterator localIterator1 = mbb.c(this.a, jtj.class).iterator();
            while (localIterator1.hasNext())
            {
              List localList = ((jtj)localIterator1.next()).a(paramInt, localjah2.a, localmlw);
              if ((localList != null) && (!localList.isEmpty()))
              {
                Iterator localIterator2 = localList.iterator();
                while (localIterator2.hasNext())
                {
                  dg localdg = (dg)localIterator2.next();
                  paramdk.q.add(localdg);
                }
              }
            }
          }
        }
      }
    }
    int i = paramArrayOfjah.length;
    int k;
    if (i == 0) {
      k = 0;
    }
    for (;;)
    {
      if (k != 0)
      {
        int m = paramdk.b().defaults;
        if (m != 0) {
          paramdk.a(m & 0xFFFFFFFD);
        }
      }
      return;
      label304:
      for (int j = 0;; j++)
      {
        if (j >= i) {
          break label310;
        }
        jah localjah1 = paramArrayOfjah[j];
        if (localjah1.c != null) {}
        for (mlr localmlr1 = (mlr)localjah1.c.b(mlr.a);; localmlr1 = null)
        {
          if ((localmlr1 != null) && (localmlr1.d != null) && (localmlr1.d.a == 1)) {
            break label304;
          }
          k = 0;
          break;
        }
      }
      label310:
      k = 1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cus
 * JD-Core Version:    0.7.0.1
 */