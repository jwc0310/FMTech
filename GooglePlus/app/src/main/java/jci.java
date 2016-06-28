import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class jci
{
  private final Context a;
  private final int b;
  private final HashMap<String, jcj> c = new HashMap();
  
  jci(Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.b = paramInt;
  }
  
  final List<jdt> a(jdh paramjdh)
  {
    for (;;)
    {
      ArrayList localArrayList;
      jdb localjdb;
      try
      {
        localArrayList = new ArrayList();
        Context localContext = this.a;
        int i = this.b;
        switch (jde.a[paramjdh.ordinal()])
        {
        case 1: 
          localjdb = efj.a(localContext, i, str, null);
          try
          {
            if (!localjdb.moveToNext()) {
              break label295;
            }
            jcj localjcj = (jcj)this.c.get(localjdb.getString(localjdb.getColumnIndex("key")));
            if ((localjcj == null) || (localjdb.d() != localjcj.a.d) || (localjdb.a() != localjcj.b)) {
              break label173;
            }
            localArrayList.add(localjcj.a);
            continue;
            localObject1 = finally;
          }
          finally
          {
            localjdb.close();
          }
          str = "priority IN (3,4) AND read_state IN (1,4)";
        }
      }
      finally {}
      continue;
      String str = "priority = 2 AND read_state IN (2,1,4)";
      continue;
      label173:
      jdt localjdt = new jdt();
      localjdt.a = localjdb.getString(localjdb.getColumnIndex("key"));
      localjdt.d = localjdb.d();
      mke localmke = localjdb.g();
      if (localmke != null) {
        localjdt.b = localmke;
      }
      mkf localmkf = localjdb.k();
      if (localmkf != null) {
        localjdt.c = localmkf;
      }
      localjdt.e = localjdb.h();
      this.c.put(localjdt.a, new jcj(this, localjdt, localjdb.a()));
      localArrayList.add(localjdt);
      continue;
      label295:
      localjdb.close();
      return localArrayList;
      str = "priority IN (3,4) AND read_state IN (2,1,4)";
    }
  }
  
  public final void a()
  {
    try
    {
      this.c.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jci
 * JD-Core Version:    0.7.0.1
 */