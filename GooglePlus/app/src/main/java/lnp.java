import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

final class lnp
  implements lln
{
  private static mcq l = new mcq(new mfm("debug.plus.enable_full_bleed", (byte)0).a, false);
  private static final int[] m = { 2, 15, 13, 8, 4, 6, 22, 23 };
  private final Context a;
  private final mbj b;
  private final mbj c;
  private int[] d;
  private int[] e;
  private int[] f;
  private int[] g;
  private int[] h;
  private final SparseIntArray i = new SparseIntArray();
  private ArrayList<Integer> j;
  private mcq k = new mcq("debug.plus.url_attribution");
  private Boolean n = null;
  
  lnp(Context paramContext)
  {
    this(paramContext.getApplicationContext(), new mbj(paramContext, (byte)0), new mbj(paramContext));
  }
  
  private lnp(Context paramContext, mbj parammbj1, mbj parammbj2)
  {
    this.a = paramContext;
    this.b = parammbj1;
    this.c = parammbj2;
  }
  
  private static int[] a(ArrayList<Integer> paramArrayList)
  {
    int[] arrayOfInt = new int[paramArrayList.size()];
    for (int i1 = 0; i1 < paramArrayList.size(); i1++) {
      arrayOfInt[i1] = ((Integer)paramArrayList.get(i1)).intValue();
    }
    return arrayOfInt;
  }
  
  private final ArrayList<Integer> b()
  {
    if (this.j == null) {
      this.j = new ArrayList(this.b.a.keySet());
    }
    return this.j;
  }
  
  public final Cursor a(int paramInt, String[] paramArrayOfString, String paramString)
  {
    Cursor localCursor = hsb.b(this.a, paramInt).query("activity_view", paramArrayOfString, "unique_activity_id=?", new String[] { paramString }, null, null, null, "1");
    localCursor.setNotificationUri(this.a.getContentResolver(), Uri.withAppendedPath(lnf.b, paramString));
    return localCursor;
  }
  
  public final Cursor a(int paramInt, String[] paramArrayOfString, String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    Object localObject = "stream_key=?";
    String[] arrayOfString = { paramString1 };
    String str4;
    String str6;
    String str1;
    String str2;
    if (paramBoolean1)
    {
      str4 = String.valueOf(localObject);
      String str5 = String.valueOf(" AND (activity_flags&64=0)");
      if (str5.length() != 0)
      {
        str6 = str4.concat(str5);
        localObject = str6;
      }
    }
    else if (paramBoolean2)
    {
      str1 = String.valueOf(localObject);
      str2 = String.valueOf(" AND (content_flags&2213!=0 AND content_flags&16=0)");
      if (str2.length() == 0) {
        break label158;
      }
    }
    label158:
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      localObject = str3;
      Cursor localCursor = hsb.b(this.a, paramInt).query("activities_stream_view", paramArrayOfString, (String)localObject, arrayOfString, null, null, "sort_index ASC", paramString2);
      localCursor.setNotificationUri(this.a.getContentResolver(), Uri.withAppendedPath(lnf.a, paramString1));
      return localCursor;
      str6 = new String(str4);
      break;
    }
  }
  
  public final ArrayList<lll> a()
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList(this.c.a.keySet());
    for (int i1 = 0; i1 < localArrayList2.size(); i1++)
    {
      mbj localmbj = this.c;
      Object localObject = localArrayList2.get(i1);
      localArrayList1.add((mbi)localmbj.a.get(localObject));
    }
    return localArrayList1;
  }
  
  public final ArrayList<Integer> a(int paramInt)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = b();
    int i1 = localArrayList2.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      llm localllm = a(((Integer)localArrayList2.get(i2)).intValue(), paramInt);
      if (localllm != null) {
        localArrayList1.add(localllm.a());
      }
    }
    return localArrayList1;
  }
  
  public final lll a(String paramString)
  {
    String str = efj.u(paramString);
    if (str == null) {
      return null;
    }
    return (lll)this.c.a.get(str);
  }
  
  public final llm a(int paramInt1, int paramInt2)
  {
    mbj localmbj = this.b;
    Integer localInteger = Integer.valueOf(paramInt1);
    llm localllm = (llm)localmbj.a.get(localInteger);
    if ((localllm != null) && (localllm.a(paramInt2))) {
      return localllm;
    }
    return null;
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    for (;;)
    {
      int i1;
      synchronized (this.i)
      {
        i1 = this.i.get(paramInt);
        if (paramBoolean)
        {
          i1++;
          this.i.put(paramInt, i1);
          return;
        }
      }
      if (i1 > 0) {
        i1--;
      }
    }
  }
  
  public final int[] a(Context paramContext, int paramInt)
  {
    ArrayList localArrayList1 = b();
    HashSet localHashSet = new HashSet();
    int i1 = localArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      llm localllm = a(((Integer)localArrayList1.get(i2)).intValue(), paramInt);
      if (localllm != null)
      {
        ArrayList localArrayList3 = localllm.b(paramContext, paramInt);
        if (localArrayList3 != null) {
          localHashSet.addAll(localArrayList3);
        }
      }
    }
    ArrayList localArrayList2 = new ArrayList(localHashSet);
    if ((this.d == null) || (this.d.length != localArrayList2.size())) {
      this.d = a(localArrayList2);
    }
    return this.d;
  }
  
  public final int[] a(Context paramContext, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList1 = b();
    HashSet localHashSet = new HashSet();
    int i1 = localArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      llm localllm = a(((Integer)localArrayList1.get(i2)).intValue(), paramInt);
      if (localllm != null)
      {
        ArrayList localArrayList3 = localllm.a(paramContext, paramInt);
        if (localArrayList3 != null) {
          localHashSet.addAll(localArrayList3);
        }
      }
    }
    ArrayList localArrayList2 = new ArrayList(localHashSet);
    if ((paramBoolean) && (!localArrayList2.contains(Integer.valueOf(1)))) {
      localArrayList2.add(Integer.valueOf(1));
    }
    localArrayList2.add(Integer.valueOf(10));
    if (paramBoolean)
    {
      if ((this.f == null) || (this.f.length != localArrayList2.size())) {
        this.f = a(localArrayList2);
      }
      return this.f;
    }
    if ((this.e == null) || (this.e.length != localArrayList2.size())) {
      this.e = a(localArrayList2);
    }
    return this.e;
  }
  
  public final int[] a(boolean paramBoolean, int paramInt)
  {
    int i1 = 0;
    if (paramBoolean)
    {
      if (this.g == null) {
        this.g = new int[] { 2, 4, 22 };
      }
      return this.g;
    }
    List localList = mbb.c(this.a, llg.class);
    if (localList.isEmpty()) {
      return m;
    }
    ArrayList localArrayList1 = new ArrayList();
    int i2 = localList.size();
    for (int i3 = 0; i3 < i2; i3++)
    {
      ArrayList localArrayList2 = ((llg)localList.get(i3)).a();
      if (localArrayList2 != null) {
        localArrayList1.addAll(localArrayList2);
      }
    }
    int i4 = m.length + localArrayList1.size();
    int[] arrayOfInt = Arrays.copyOf(m, i4);
    int i5 = m.length;
    while (i5 < i4)
    {
      arrayOfInt[i5] = ((Integer)localArrayList1.get(i1)).intValue();
      i5++;
      i1++;
    }
    return arrayOfInt;
  }
  
  public final Cursor b(int paramInt, String[] paramArrayOfString, String paramString)
  {
    Cursor localCursor = hsb.b(this.a, paramInt).query("comments_view", paramArrayOfString, "activity_id=?", new String[] { paramString }, null, null, "created ASC", null);
    localCursor.setNotificationUri(this.a.getContentResolver(), Uri.withAppendedPath(lnf.c, paramString));
    return localCursor;
  }
  
  public final boolean b(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(lnm.a, paramInt);
  }
  
  public final int[] b(Context paramContext, int paramInt)
  {
    ArrayList localArrayList1 = b();
    HashSet localHashSet = new HashSet();
    int i1 = localArrayList1.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      llm localllm = a(((Integer)localArrayList1.get(i2)).intValue(), paramInt);
      if (localllm != null)
      {
        ArrayList localArrayList3 = localllm.c(paramContext, paramInt);
        if (localArrayList3 != null) {
          localHashSet.addAll(localArrayList3);
        }
      }
    }
    ArrayList localArrayList2 = new ArrayList(localHashSet);
    if ((this.h == null) || (this.h.length != localArrayList2.size())) {
      this.h = a(localArrayList2);
    }
    return this.h;
  }
  
  public final boolean c(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(lnm.b, paramInt);
  }
  
  public final boolean d(int paramInt)
  {
    for (;;)
    {
      synchronized (this.i)
      {
        if (this.i.get(paramInt) > 0)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public final int e(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).c(lnm.g, paramInt).intValue();
  }
  
  public final int f(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).c(lnm.h, paramInt).intValue();
  }
  
  public final boolean g(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(lnm.j, paramInt);
  }
  
  public final boolean h(int paramInt)
  {
    if (this.n == null) {
      this.n = Boolean.valueOf(((hyi)mbb.a(this.a, hyi.class)).b(lnm.i, paramInt));
    }
    return this.n.booleanValue();
  }
  
  public final boolean i(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(lnm.k, paramInt);
  }
  
  public final boolean j(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(lnm.m, paramInt);
  }
  
  public final boolean k(int paramInt)
  {
    return ((hyi)mbb.a(this.a, hyi.class)).b(lnm.n, paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lnp
 * JD-Core Version:    0.7.0.1
 */