import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ljg
  implements lje
{
  static final mcq a = new mcq("debug.stream.database");
  private static final List<owm> d = Collections.unmodifiableList(new ljh());
  final hgs b;
  final pxz c;
  private final String e;
  private final owc f;
  private final pie g;
  private int h = 999;
  
  ljg(Context paramContext, String paramString, hgs paramhgs, pxz parampxz, pie parampie)
  {
    this.e = paramString;
    this.b = paramhgs;
    this.g = parampie;
    this.c = parampxz;
    this.f = new owc(this.e, paramContext, parampie, d);
  }
  
  static int a(owa paramowa, int paramInt)
  {
    oxk localoxk = new oxk();
    localoxk.a.append("SELECT sort_key FROM streams WHERE stream_view_id= ? ORDER BY sort_key DESC LIMIT ?");
    String str = String.valueOf(paramInt);
    localoxk.b.add(str);
    localoxk.b.add("1");
    Cursor localCursor = paramowa.a(localoxk.a());
    try
    {
      if (localCursor.moveToFirst())
      {
        int i = localCursor.getInt(localCursor.getColumnIndexOrThrow("sort_key"));
        int j = i + 100;
        return j;
      }
      return 100;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private final ouq<List<qzz>> a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    return this.f.a().a(new lju(this, paramBoolean, paramInt1, paramInt3, paramInt2), this.g);
  }
  
  private ouq<Integer> a(String paramString1, int paramInt, String paramString2, List<String> paramList, List<qzz> paramList1, List<kx> paramList2, boolean paramBoolean)
  {
    return this.f.a().a(new ljo(this, paramBoolean, paramString1, paramInt, paramString2, paramList1, paramList2, paramList), this.g);
  }
  
  private final void a(int paramInt, owa paramowa, long paramLong, List<qzz> paramList, List<kx> paramList1, ContentValues paramContentValues)
  {
    paramContentValues.clear();
    paramContentValues.put("timestamp", Long.valueOf(paramLong));
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      qzz localqzz = (qzz)localIterator1.next();
      paramContentValues.put("card_id", localqzz.c);
      paramContentValues.put("card", localqzz.e());
      paramowa.a("stream_cards", paramContentValues, 5);
    }
    HashSet localHashSet = new HashSet();
    Iterator localIterator2 = paramList1.iterator();
    while (localIterator2.hasNext()) {
      localHashSet.add(((kx)localIterator2.next()).c());
    }
    a(paramowa, "parent_child_cards", "parent_card_id", localHashSet);
    paramContentValues.clear();
    paramContentValues.put("stream_view_id", Integer.valueOf(paramInt));
    Iterator localIterator3 = paramList1.iterator();
    while (localIterator3.hasNext())
    {
      kx localkx = (kx)localIterator3.next();
      paramContentValues.put("parent_card_id", localkx.c());
      paramContentValues.put("child_card_id", localkx.d());
      paramowa.a("parent_child_cards", paramContentValues, 5);
    }
  }
  
  private final ouq<Map<String, qzz>> b(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    return this.f.a().a(new ljw(this, paramBoolean, paramInt1, paramInt3, paramInt2), this.g);
  }
  
  final int a(owa paramowa, String paramString1, String paramString2, Iterable<?> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      oxi localoxi = new oxi(paramString1);
      localoxi.a.append(paramString2);
      localoxi.a.append(" IN (");
      for (int j = 0; (j < this.h) && (localIterator.hasNext()); j++)
      {
        if (j > 0) {
          localoxi.a.append(",");
        }
        localoxi.a.append("?");
        String str3 = String.valueOf(localIterator.next());
        localoxi.b.add(str3);
      }
      localoxi.a.append(")");
      if (Log.isLoggable("StreamDatabase", 3))
      {
        String str1 = String.valueOf(localoxi.a().b);
        new StringBuilder(26 + String.valueOf(paramString1).length() + String.valueOf(str1).length()).append("query: DELETE FROM ").append(paramString1).append(" WHERE ").append(str1);
        String str2 = String.valueOf(Arrays.toString(localoxi.a().c));
        if (str2.length() == 0) {
          break label264;
        }
        "args: ".concat(str2);
      }
      for (;;)
      {
        i += paramowa.a(localoxi.a());
        break;
        label264:
        new String("args: ");
      }
    }
    return i;
  }
  
  public final Boolean a(int paramInt1, int paramInt2, qzz paramqzz, List<qzz> paramList, List<kx> paramList1, owa paramowa)
  {
    ContentValues localContentValues = new ContentValues();
    long l = this.b.a();
    int m;
    if (paramInt2 == -1)
    {
      m = a(paramowa, paramInt1);
      a(paramInt1, paramowa, l, paramList, paramList1, localContentValues);
      localContentValues.clear();
      localContentValues.put("stream_view_id", Integer.valueOf(paramInt1));
      localContentValues.put("sort_key", Integer.valueOf(m));
      localContentValues.put("card_id", paramqzz.c);
      paramowa.a("streams", localContentValues, 5);
      return Boolean.valueOf(true);
    }
    int i;
    label113:
    int j;
    label122:
    Cursor localCursor;
    if (paramInt2 - 1 < 0)
    {
      i = 0;
      if (paramInt2 - 1 >= 0) {
        break label250;
      }
      j = 1;
      oxk localoxk = new oxk();
      localoxk.a.append("SELECT sort_key FROM streams WHERE stream_view_id= ? ORDER BY sort_key LIMIT ? OFFSET ?");
      String str1 = String.valueOf(paramInt1);
      localoxk.b.add(str1);
      String str2 = String.valueOf(j);
      localoxk.b.add(str2);
      String str3 = String.valueOf(i);
      localoxk.b.add(str3);
      localCursor = paramowa.a(localoxk.a());
    }
    for (;;)
    {
      try
      {
        int k = localCursor.getCount();
        if ((k == 0) && (paramInt2 != 0))
        {
          Boolean localBoolean = Boolean.valueOf(false);
          return localBoolean;
          i = paramInt2 - 1;
          break label113;
          label250:
          j = 2;
          break label122;
        }
        if (k > 0)
        {
          localCursor.moveToFirst();
          int n = localCursor.getColumnIndexOrThrow("sort_key");
          int i1 = localCursor.getInt(n);
          if (k == 2)
          {
            localCursor.moveToNext();
            m = (i1 + localCursor.getInt(n)) / 2;
            localCursor.close();
            break;
          }
          if (i == 0)
          {
            m = i1 - 100;
            continue;
          }
          m = i1 + 100;
          continue;
        }
        m = 100;
      }
      finally
      {
        localCursor.close();
      }
    }
  }
  
  final ArrayList<String> a(owa paramowa, ArrayList<String> paramArrayList, kl<String, qzz> paramkl)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramArrayList.iterator();
    Cursor localCursor;
    while (localIterator.hasNext())
    {
      oxk localoxk = new oxk();
      localoxk.a.append("SELECT card_id, card FROM stream_cards JOIN parent_child_cards ON stream_cards.card_id == parent_child_cards.child_card_id WHERE parent_card_id IN ");
      localoxk.a.append("(");
      for (int i = 0; (i < this.h) && (localIterator.hasNext()); i++)
      {
        if (i > 0) {
          localoxk.a.append(",");
        }
        String str2 = (String)localIterator.next();
        localoxk.a.append("?");
        localoxk.b.add(str2);
      }
      localoxk.a.append(")");
      localCursor = paramowa.a(localoxk.a());
      try
      {
        paramkl.a(paramkl.size() + localCursor.getCount());
        int j = localCursor.getColumnIndexOrThrow("card_id");
        int k = localCursor.getColumnIndexOrThrow("card");
        while (localCursor.moveToNext())
        {
          String str1 = localCursor.getString(j);
          if (!paramkl.containsKey(str1))
          {
            byte[] arrayOfByte = localCursor.getBlob(k);
            pxz localpxz = this.c;
            qzz localqzz = (qzz)((pzh)qzz.d.a(pym.h, null, null)).a(arrayOfByte, localpxz);
            localArrayList.add(str1);
            paramkl.put(str1, localqzz);
          }
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    return localArrayList;
  }
  
  public final ouq<ljf> a(int paramInt)
  {
    return this.f.a().a(new ljq(this, paramInt), this.g);
  }
  
  public final ouq<List<qzz>> a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(paramInt1, true, paramInt2, paramInt3);
  }
  
  public final ouq<Boolean> a(int paramInt1, int paramInt2, qzz paramqzz, List<qzz> paramList, List<kx> paramList1)
  {
    return this.f.a().a(new ljk(this, paramInt1, paramInt2, paramqzz, paramList, paramList1), this.g);
  }
  
  public final ouq<Integer> a(int paramInt, String paramString, List<String> paramList, List<qzz> paramList1, List<kx> paramList2)
  {
    return a(null, paramInt, paramString, paramList, paramList1, paramList2, true);
  }
  
  public final ouq<ljf> a(String paramString)
  {
    return this.f.a().a(new ljs(this, paramString), this.g);
  }
  
  public final ouq<Integer> a(String paramString1, String paramString2, List<String> paramList, List<qzz> paramList1, List<kx> paramList2)
  {
    return a(paramString1, -1, paramString2, paramList, paramList1, paramList2, false);
  }
  
  public final ouq<Integer> a(Set<String> paramSet)
  {
    return this.f.a().a(new lji(this, paramSet), this.g);
  }
  
  public final ouq<Boolean> a(qzz paramqzz, List<qzz> paramList, List<kx> paramList1)
  {
    return this.f.a().a(new ljm(this, paramqzz, paramList, paramList1), this.g);
  }
  
  public final ouq<List<qzz>> b(int paramInt)
  {
    return a(paramInt, false, 0, 0);
  }
  
  public final ouq<Map<String, qzz>> b(int paramInt1, int paramInt2, int paramInt3)
  {
    return b(paramInt1, true, paramInt2, paramInt3);
  }
  
  public final ouq<kx> b(String paramString)
  {
    return this.f.a().a(new ljy(this, paramString), this.g);
  }
  
  public final ouq<Map<String, qzz>> c(int paramInt)
  {
    return b(paramInt, false, 0, 0);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ljg
 * JD-Core Version:    0.7.0.1
 */