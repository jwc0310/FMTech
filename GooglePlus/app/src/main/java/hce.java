import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hce
{
  private final Context a;
  private final List<String> b;
  private final int c;
  
  public hce(Context paramContext, int paramInt, List<String> paramList)
  {
    this.a = paramContext;
    this.b = null;
    this.c = paramInt;
  }
  
  public final hcg a()
  {
    hcg localhcg = new hcg();
    hba localhba = (hba)mbb.a(this.a, hba.class);
    if (!localhba.c())
    {
      localhcg.e = false;
      return localhcg;
    }
    localhcg.e = true;
    localhcg.d = localhba.d();
    ContentResolver localContentResolver = this.a.getContentResolver();
    Cursor localCursor1;
    int i;
    try
    {
      String str1;
      String[] arrayOfString;
      if (this.b == null)
      {
        str1 = hcf.d;
        arrayOfString = new String[1];
        arrayOfString[0] = Integer.toString(this.c);
      }
      for (;;)
      {
        Cursor localCursor2 = localContentResolver.query(hbu.a(this.a), hcf.a, str1, arrayOfString, "upload_state DESC, _id DESC");
        localCursor1 = localCursor2;
        if (localCursor1 != null) {
          break;
        }
        if (localCursor1 != null) {
          localCursor1.close();
        }
        return null;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("media_url IN (");
        i = 0;
        if (i < this.b.size())
        {
          localStringBuilder.append("?");
          if (i >= -1 + this.b.size()) {
            break label844;
          }
          localStringBuilder.append(",");
          break label844;
        }
        localStringBuilder.append(") AND ");
        localStringBuilder.append(hcf.d);
        str1 = localStringBuilder.toString();
        arrayOfString = new String[1 + this.b.size()];
        for (int j = 0; j < this.b.size(); j++) {
          arrayOfString[j] = ((String)this.b.get(j));
        }
        arrayOfString[this.b.size()] = Integer.toString(this.c);
      }
      if (localCursor1 == null) {
        break label320;
      }
    }
    finally
    {
      localCursor1 = null;
    }
    label308:
    localCursor1.close();
    label320:
    throw localObject1;
    for (;;)
    {
      label844:
      try
      {
        long l1 = System.currentTimeMillis();
        int k = localCursor1.getCount();
        localhcg.a = new kl(k);
        localhcg.b = new kl();
        localhcg.c = new kl(k);
        localhcg.l = false;
        if (localCursor1.moveToNext())
        {
          String str3 = localCursor1.getString(2);
          int m = localCursor1.getInt(3);
          int n = localCursor1.getInt(4);
          long l2 = l1 - localCursor1.getLong(6);
          localhcg.c.put(str3, Long.valueOf(localCursor1.getLong(6)));
          hch localhch = hch.a(m, n, l2);
          if (localCursor1.getInt(8) == 0) {
            break label855;
          }
          i1 = 1;
          if (localhcg.a.containsKey(str3)) {
            continue;
          }
          if (localhch == hch.b)
          {
            localhcg.m = localCursor1.getString(2);
            if (i1 != 0)
            {
              localhcg.k = (1 + localhcg.k);
              localhcg.f = (1 + localhcg.f);
              localhcg.a.put(str3, localhch);
              if (localhch != hch.c) {
                continue;
              }
              float f = localCursor1.getFloat(7);
              localhcg.b.put(str3, Float.valueOf(f));
              continue;
            }
            localhcg.j = (1 + localhcg.j);
            continue;
          }
          if (localhch == hch.c)
          {
            localhcg.m = localCursor1.getString(2);
            localhcg.g = (1 + localhcg.g);
            continue;
          }
          if (localhch == hch.e)
          {
            localhcg.i = (1 + localhcg.i);
            continue;
          }
          if (localhch == hch.d)
          {
            localhcg.i = (1 + localhcg.i);
            localhcg.l = true;
            continue;
          }
          if (localhch != hch.f) {
            continue;
          }
          if (hcx.a(localContentResolver, Uri.parse(str3)) <= 0L)
          {
            localContentResolver.delete(hbu.a(this.a), "media_url = ?", new String[] { str3 });
            continue;
          }
          localhcg.h = (1 + localhcg.h);
          continue;
        }
        if (this.b != null)
        {
          Set localSet = localhcg.a.keySet();
          Iterator localIterator = this.b.iterator();
          if (localIterator.hasNext())
          {
            String str2 = (String)localIterator.next();
            if (localSet.contains(str2)) {
              continue;
            }
            localhcg.a.put(str2, hch.a);
            continue;
          }
        }
        if (localCursor1 != null) {
          localCursor1.close();
        }
        return localhcg;
      }
      finally {}
      i++;
      break;
      break label308;
      label855:
      int i1 = 0;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hce
 * JD-Core Version:    0.7.0.1
 */