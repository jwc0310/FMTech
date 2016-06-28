import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import android.util.SparseArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public final class gjt
  implements giz
{
  public static final gkh b = new gkh();
  public final SharedPreferences a;
  private List<gjg> c;
  private final List<gjh> d = new ArrayList();
  private final List<gji> e = new ArrayList();
  private List<giw> f;
  private final Context g;
  private boolean h = true;
  private boolean i;
  private final SparseArray<gjb> j = new SparseArray();
  private final Runnable k = new gju(this);
  
  gjt(Context paramContext)
  {
    this(paramContext, paramContext.getSharedPreferences("accounts", 0), null);
  }
  
  private gjt(Context paramContext, SharedPreferences paramSharedPreferences, List<gjg> paramList)
  {
    this.g = paramContext;
    this.a = paramSharedPreferences;
    this.c = null;
  }
  
  private final void g()
  {
    if (!this.i)
    {
      this.i = true;
      if (this.c == null) {
        this.c = mbb.c(this.g, gjg.class);
      }
      List localList = this.e;
      localList.add(new gjv(this));
      localList.add(new gjw(this));
      localList.add(new gjx(this));
      localList.add(new gjy(this));
      localList.add(new gjz(this));
      localList.add(new gka(this));
      Iterator localIterator1 = this.c.iterator();
      while (localIterator1.hasNext()) {
        ((gjg)localIterator1.next()).a(this.e);
      }
      if (!this.a.contains("AccountStore#upgradeAccountCreated"))
      {
        SharedPreferences.Editor localEditor2 = this.a.edit();
        localEditor2.putBoolean("AccountStore#upgradeAccountCreated", true);
        int i5 = this.a.getInt("count", 0);
        for (int i6 = 0; i6 < i5; i6++)
        {
          SharedPreferences localSharedPreferences = this.a;
          String str3 = String.valueOf("gaia_id");
          if (localSharedPreferences.contains(12 + String.valueOf(str3).length() + i6 + "." + str3))
          {
            String str4 = String.valueOf("created");
            localEditor2.putBoolean(12 + String.valueOf(str4).length() + i6 + "." + str4, true);
          }
        }
        localEditor2.apply();
      }
      e();
      SharedPreferences.Editor localEditor1 = this.a.edit();
      SparseArray localSparseArray = new SparseArray();
      Iterator localIterator2 = a().iterator();
      while (localIterator2.hasNext())
      {
        int i4 = ((Integer)localIterator2.next()).intValue();
        localSparseArray.put(i4, new gjc(this, i4));
      }
      Iterator localIterator3 = this.e.iterator();
      while (localIterator3.hasNext())
      {
        String str2 = ((gji)localIterator3.next()).a();
        if (this.a.contains(str2))
        {
          for (int i3 = 0; i3 < localSparseArray.size(); i3++) {
            ((gjc)((gjc)localSparseArray.valueAt(i3)).c(str2, true));
          }
          localEditor1.remove(str2);
        }
      }
      int i1;
      for (int m = 0;; m++)
      {
        int n = localSparseArray.size();
        i1 = 0;
        if (m >= n) {
          break;
        }
        gjc localgjc = (gjc)localSparseArray.valueAt(m);
        Iterator localIterator4 = this.e.iterator();
        while (localIterator4.hasNext())
        {
          gji localgji = (gji)localIterator4.next();
          String str1 = localgji.a();
          if (!localgjc.a(str1))
          {
            localgji.a(this.g, localgjc);
            ((gjc)localgjc.c(str1, true));
          }
        }
      }
      while (i1 < localSparseArray.size())
      {
        int i2 = localSparseArray.keyAt(i1);
        ((gjc)localSparseArray.valueAt(i1)).a(i2, localEditor1);
        i1++;
      }
      localEditor1.apply();
      e();
    }
  }
  
  private final void h()
  {
    if (!this.h) {
      return;
    }
    g();
    int m = this.a.getInt("count", 0);
    this.j.clear();
    for (int n = 0; n < m; n++)
    {
      SharedPreferences localSharedPreferences = this.a;
      String str = String.valueOf("created");
      if (localSharedPreferences.contains(12 + String.valueOf(str).length() + n + "." + str)) {
        this.j.put(n, new gkb(this, n));
      }
    }
    this.h = false;
  }
  
  private final void i(int paramInt)
  {
    SharedPreferences.Editor localEditor = this.a.edit();
    Iterator localIterator = this.a.getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str.startsWith("key.")) && (this.a.getInt(str, -1) == paramInt)) {
        localEditor.remove(str);
      }
    }
    localEditor.apply();
  }
  
  private final File j(int paramInt)
  {
    File localFile1 = new File(this.g.getFilesDir(), "account-blobs");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    File localFile2 = new File(localFile1, String.format("account-%d", arrayOfObject));
    int m;
    if (!localFile2.isDirectory())
    {
      boolean bool = localFile2.mkdirs();
      m = 0;
      if (!bool) {}
    }
    else
    {
      m = 1;
    }
    if (m == 0)
    {
      String str = String.valueOf(localFile2);
      throw new IOException(35 + String.valueOf(str).length() + "Could not create account blob dir: " + str);
    }
    return localFile2;
  }
  
  private void k(int paramInt)
  {
    try
    {
      File localFile = j(paramInt);
      String[] arrayOfString = localFile.list();
      for (int m = 0; m < arrayOfString.length; m++) {
        new File(localFile, arrayOfString[m]).delete();
      }
      localFile.delete();
      return;
    }
    catch (IOException localIOException) {}
  }
  
  public final int a(String paramString)
  {
    try
    {
      int m = b(paramString, null);
      return m;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final gjb a(int paramInt)
  {
    gjb localgjb;
    try
    {
      h();
      localgjb = (gjb)this.j.get(paramInt);
      if (localgjb == null) {
        throw new gjd(28 + "No such account: " + paramInt);
      }
    }
    finally {}
    return localgjb;
  }
  
  public final gjc a(String paramString1, String paramString2)
  {
    boolean bool = true;
    gjc localgjc;
    for (;;)
    {
      try
      {
        g();
        localgjc = new gjc(this, -1);
        localgjc.b("created", true);
        localgjc.b("account_name", paramString1);
        localgjc.b("effective_gaia_id", paramString2);
        if (paramString2 != null)
        {
          localgjc.b("is_managed_account", bool);
          Iterator localIterator1 = this.c.iterator();
          if (!localIterator1.hasNext()) {
            break;
          }
          ((gjg)localIterator1.next()).a(this.g, localgjc);
          continue;
        }
        bool = false;
      }
      finally {}
    }
    Iterator localIterator2 = this.e.iterator();
    while (localIterator2.hasNext()) {
      localgjc.b(((gji)localIterator2.next()).a(), true);
    }
    return localgjc;
  }
  
  public final List<Integer> a()
  {
    try
    {
      h();
      int m = this.j.size();
      ArrayList localArrayList = new ArrayList(m);
      for (int n = 0; n < m; n++) {
        localArrayList.add(Integer.valueOf(this.j.keyAt(n)));
      }
      return localArrayList;
    }
    finally {}
  }
  
  public final List<Integer> a(String... paramVarArgs)
  {
    for (;;)
    {
      try
      {
        h();
        int m = this.j.size();
        ArrayList localArrayList = new ArrayList(m);
        int n = 0;
        if (n < m)
        {
          gjb localgjb = (gjb)this.j.valueAt(n);
          int i1 = 0;
          if (i1 < paramVarArgs.length)
          {
            if (!localgjb.c(paramVarArgs[i1]))
            {
              i2 = 0;
              if (i2 != 0) {
                localArrayList.add(Integer.valueOf(this.j.keyAt(n)));
              }
              n++;
              continue;
            }
            i1++;
            continue;
          }
        }
        else
        {
          return localArrayList;
        }
      }
      finally {}
      int i2 = 1;
    }
  }
  
  public final void a(int paramInt, String paramString)
  {
    if (!c(paramInt)) {
      throw new gjd(27 + "No such account " + paramInt);
    }
    File localFile = new File(j(paramInt), paramString);
    if (localFile.exists()) {
      localFile.delete();
    }
  }
  
  public final void a(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    int m = 1;
    if (!c(paramInt)) {
      throw new gjd(27 + "No such account " + paramInt);
    }
    File localFile1 = j(paramInt);
    Object[] arrayOfObject = new Object[m];
    arrayOfObject[0] = UUID.randomUUID().toString();
    File localFile2 = new File(localFile1, String.format("account-blob-temp-%s", arrayOfObject));
    FileOutputStream localFileOutputStream = new FileOutputStream(localFile2);
    for (;;)
    {
      try
      {
        localFileOutputStream.write(paramArrayOfByte);
        localFileOutputStream.close();
        File localFile3 = new File(localFile1, paramString);
        if ((!localFile3.exists()) || (localFile3.delete()))
        {
          n = m;
          if ((n == 0) || (!localFile2.renameTo(localFile3))) {
            break label221;
          }
          if (m != 0) {
            break;
          }
          String str = String.valueOf(localFile3);
          throw new IOException(36 + String.valueOf(str).length() + "Could not create account blob file: " + str);
        }
      }
      finally
      {
        localFileOutputStream.close();
      }
      int n = 0;
      continue;
      label221:
      m = 0;
    }
  }
  
  public final void a(gjh paramgjh)
  {
    try
    {
      efj.k();
      this.d.add(paramgjh);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(String paramString, int paramInt)
  {
    if ((paramInt != -1) && (!c(paramInt))) {
      throw new gjd(35 + "Account does not exist: " + paramInt);
    }
    SharedPreferences.Editor localEditor = this.a.edit();
    String str1 = String.valueOf("key.");
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      localEditor.putInt(str3, paramInt).apply();
      f();
      return;
    }
  }
  
  /* Error */
  public final int b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 312	gjt:h	()V
    //   6: aload_0
    //   7: getfield 65	gjt:j	Landroid/util/SparseArray;
    //   10: astore_3
    //   11: iconst_0
    //   12: istore 4
    //   14: iload 4
    //   16: aload_3
    //   17: invokevirtual 213	android/util/SparseArray:size	()I
    //   20: if_icmpge +66 -> 86
    //   23: aload_3
    //   24: iload 4
    //   26: invokevirtual 217	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   29: checkcast 317	gjb
    //   32: astore 6
    //   34: aload 6
    //   36: ldc 154
    //   38: invokeinterface 397 2 0
    //   43: aload_1
    //   44: invokestatic 403	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   47: ifeq +33 -> 80
    //   50: aload 6
    //   52: ldc_w 334
    //   55: invokeinterface 339 2 0
    //   60: ifne +20 -> 80
    //   63: aload_3
    //   64: iload 4
    //   66: invokevirtual 233	android/util/SparseArray:keyAt	(I)I
    //   69: istore 7
    //   71: iload 7
    //   73: istore 5
    //   75: aload_0
    //   76: monitorexit
    //   77: iload 5
    //   79: ireturn
    //   80: iinc 4 1
    //   83: goto -69 -> 14
    //   86: iconst_m1
    //   87: istore 5
    //   89: goto -14 -> 75
    //   92: astore_2
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_2
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	gjt
    //   0	97	1	paramString	String
    //   92	4	2	localObject	Object
    //   10	54	3	localSparseArray	SparseArray
    //   12	69	4	m	int
    //   73	15	5	n	int
    //   32	19	6	localgjb	gjb
    //   69	3	7	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	11	92	finally
    //   14	71	92	finally
  }
  
  /* Error */
  public final int b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 312	gjt:h	()V
    //   6: aload_0
    //   7: getfield 65	gjt:j	Landroid/util/SparseArray;
    //   10: astore 4
    //   12: iconst_0
    //   13: istore 5
    //   15: iload 5
    //   17: aload 4
    //   19: invokevirtual 213	android/util/SparseArray:size	()I
    //   22: if_icmpge +73 -> 95
    //   25: aload 4
    //   27: iload 5
    //   29: invokevirtual 217	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
    //   32: checkcast 317	gjb
    //   35: astore 7
    //   37: aload 7
    //   39: ldc_w 328
    //   42: invokeinterface 397 2 0
    //   47: aload_1
    //   48: invokestatic 403	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   51: ifeq +38 -> 89
    //   54: aload 7
    //   56: ldc_w 332
    //   59: invokeinterface 397 2 0
    //   64: aload_2
    //   65: invokestatic 403	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   68: ifeq +21 -> 89
    //   71: aload 4
    //   73: iload 5
    //   75: invokevirtual 233	android/util/SparseArray:keyAt	(I)I
    //   78: istore 8
    //   80: iload 8
    //   82: istore 6
    //   84: aload_0
    //   85: monitorexit
    //   86: iload 6
    //   88: ireturn
    //   89: iinc 5 1
    //   92: goto -77 -> 15
    //   95: iconst_m1
    //   96: istore 6
    //   98: goto -14 -> 84
    //   101: astore_3
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_3
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	gjt
    //   0	106	1	paramString1	String
    //   0	106	2	paramString2	String
    //   101	4	3	localObject	Object
    //   10	62	4	localSparseArray	SparseArray
    //   13	77	5	m	int
    //   82	15	6	n	int
    //   35	20	7	localgjb	gjb
    //   78	3	8	i1	int
    // Exception table:
    //   from	to	target	type
    //   2	12	101	finally
    //   15	80	101	finally
  }
  
  public final gjc b(int paramInt)
  {
    try
    {
      if (!c(paramInt)) {
        throw new gjd(28 + "No such account: " + paramInt);
      }
    }
    finally {}
    gjc localgjc = new gjc(this, paramInt);
    return localgjc;
  }
  
  public final String b()
  {
    gkg localgkg = new gkg(this);
    Map localMap = localgkg.b.a.getAll();
    Iterator localIterator1 = localgkg.b.a().iterator();
    while (localIterator1.hasNext())
    {
      int m = ((Integer)localIterator1.next()).intValue();
      localgkg.a.println(25 + "Account ID: " + m + " {");
      String str1 = 12 + m + ".";
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator2 = localMap.keySet().iterator();
      while (localIterator2.hasNext())
      {
        String str2 = (String)localIterator2.next();
        if (str2.startsWith(str1)) {
          localArrayList.add(str2);
        }
      }
      Collections.sort(localArrayList);
      localgkg.a(localMap, localArrayList, str1, new String[] { "account_name", "effective_gaia_id", "is_plus_page", "created", "is_google_plus", "logged_in", "logged_out", "display_name", "gaia_id" });
      Iterator localIterator3 = localArrayList.iterator();
      while (localIterator3.hasNext()) {
        localgkg.a("    ", localMap, str1, ((String)localIterator3.next()).substring(str1.length()));
      }
      localgkg.a.println("}");
    }
    localgkg.a(localMap);
    return localgkg.a.toString();
  }
  
  public final void b(gjh paramgjh)
  {
    try
    {
      efj.k();
      this.d.remove(paramgjh);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final byte[] b(int paramInt, String paramString)
  {
    if (!c(paramInt)) {
      throw new gjd(27 + "No such account " + paramInt);
    }
    File localFile = new File(j(paramInt), paramString);
    int m = (int)localFile.length();
    byte[] arrayOfByte = new byte[m];
    FileInputStream localFileInputStream = new FileInputStream(localFile);
    try
    {
      if (m != localFileInputStream.read(arrayOfByte, 0, m))
      {
        String str = String.valueOf(localFile);
        throw new IOException(26 + String.valueOf(str).length() + "Could not read blob file: " + str);
      }
    }
    finally
    {
      localFileInputStream.close();
    }
    localFileInputStream.close();
    return arrayOfByte;
  }
  
  public final int c(String paramString)
  {
    SharedPreferences localSharedPreferences = this.a;
    String str1 = String.valueOf("key.");
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1)) {
      return localSharedPreferences.getInt(str3, -1);
    }
  }
  
  public final List<giw> c()
  {
    try
    {
      if (this.f == null) {
        this.f = mbb.c(this.g, giw.class);
      }
      List localList = this.f;
      return localList;
    }
    finally {}
  }
  
  /* Error */
  public final boolean c(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial 312	gjt:h	()V
    //   6: aload_0
    //   7: getfield 65	gjt:j	Landroid/util/SparseArray;
    //   10: iload_1
    //   11: invokevirtual 315	android/util/SparseArray:get	(I)Ljava/lang/Object;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnull +11 -> 27
    //   19: iconst_1
    //   20: istore 4
    //   22: aload_0
    //   23: monitorexit
    //   24: iload 4
    //   26: ireturn
    //   27: iconst_0
    //   28: istore 4
    //   30: goto -8 -> 22
    //   33: astore_2
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_2
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	this	gjt
    //   0	38	1	paramInt	int
    //   33	4	2	localObject1	Object
    //   14	2	3	localObject2	Object
    //   20	9	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	15	33	finally
  }
  
  public final int d()
  {
    try
    {
      int m = this.a.getInt("count", 0);
      this.a.edit().putInt("count", m + 1).apply();
      return m;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final boolean d(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokevirtual 343	gjt:c	(I)Z
    //   7: ifeq +26 -> 33
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual 479	gjt:a	(I)Lgjb;
    //   15: invokeinterface 481 1 0
    //   20: istore 4
    //   22: iload 4
    //   24: ifeq +9 -> 33
    //   27: iconst_1
    //   28: istore_3
    //   29: aload_0
    //   30: monitorexit
    //   31: iload_3
    //   32: ireturn
    //   33: iconst_0
    //   34: istore_3
    //   35: goto -6 -> 29
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	gjt
    //   0	43	1	paramInt	int
    //   38	4	2	localObject	Object
    //   28	7	3	bool1	boolean
    //   20	3	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	22	38	finally
  }
  
  public final void e()
  {
    try
    {
      this.h = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final boolean e(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokevirtual 343	gjt:c	(I)Z
    //   7: ifeq +26 -> 33
    //   10: aload_0
    //   11: iload_1
    //   12: invokevirtual 479	gjt:a	(I)Lgjb;
    //   15: invokeinterface 483 1 0
    //   20: istore 4
    //   22: iload 4
    //   24: ifeq +9 -> 33
    //   27: iconst_1
    //   28: istore_3
    //   29: aload_0
    //   30: monitorexit
    //   31: iload_3
    //   32: ireturn
    //   33: iconst_0
    //   34: istore_3
    //   35: goto -6 -> 29
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	gjt
    //   0	43	1	paramInt	int
    //   38	4	2	localObject	Object
    //   28	7	3	bool1	boolean
    //   20	3	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	22	38	finally
  }
  
  public final void f()
  {
    if (!efj.j()) {
      efj.a(this.k, true);
    }
    for (;;)
    {
      return;
      int m = this.d.size();
      gjh[] arrayOfgjh = (gjh[])this.d.toArray(new gjh[m]);
      for (int n = 0; n < m; n++) {
        arrayOfgjh[n].az_();
      }
    }
  }
  
  public final void f(int paramInt)
  {
    Iterator localIterator = c().iterator();
    while (localIterator.hasNext()) {
      ((giw)localIterator.next()).a(paramInt);
    }
    g(paramInt);
    f();
  }
  
  public final void g(int paramInt)
  {
    try
    {
      if (Log.isLoggable("AccountStore", 3)) {
        new StringBuilder(28).append("Removing account ").append(paramInt);
      }
      k(paramInt);
      i(paramInt);
      h(paramInt);
      e();
      return;
    }
    finally {}
  }
  
  public final void h(int paramInt)
  {
    String str1 = 12 + paramInt + ".";
    SharedPreferences.Editor localEditor = this.a.edit();
    Iterator localIterator = this.a.getAll().entrySet().iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)((Map.Entry)localIterator.next()).getKey();
      if (str2.startsWith(str1)) {
        localEditor.remove(str2);
      }
    }
    localEditor.apply();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gjt
 * JD-Core Version:    0.7.0.1
 */