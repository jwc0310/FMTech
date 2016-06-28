import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Handler;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hvu
{
  static final List<SharedPreferences.OnSharedPreferenceChangeListener> a = Collections.synchronizedList(new ArrayList());
  final SharedPreferences b;
  boolean c;
  private final Context d;
  private File e;
  
  hvu(Context paramContext)
  {
    this.d = paramContext;
    this.b = paramContext.getSharedPreferences("photoeditor_download_preferences", 0);
    this.e = new File(paramContext.getCacheDir(), "filter_resources");
    IntentFilter localIntentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    paramContext.getApplicationContext().registerReceiver(new hvv(this), localIntentFilter);
    a();
  }
  
  public static SharedPreferences.OnSharedPreferenceChangeListener a(Context paramContext, Runnable paramRunnable)
  {
    hvu localhvu = (hvu)mbb.a(paramContext, hvu.class);
    if (hwa.d == localhvu.c())
    {
      if (!efj.j()) {
        break label68;
      }
      paramRunnable.run();
    }
    for (;;)
    {
      hvw localhvw = new hvw(paramContext, paramRunnable);
      a.add(localhvw);
      localhvu.b.registerOnSharedPreferenceChangeListener(localhvw);
      localhvu.b();
      return localhvw;
      label68:
      efj.m().post(paramRunnable);
    }
  }
  
  private static String a(String paramString)
  {
    String str1 = String.valueOf("https://www.gstatic.com/photos/editor/mobile/2014.04.01.09.48-535953481848de8b285f566daae315b7/");
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0) {
      return str1.concat(str2);
    }
    return new String(str1);
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      ((hvu)mbb.a(paramContext, hvu.class)).b();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void a(Context paramContext, SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    ((hvu)mbb.a(paramContext, hvu.class)).b.unregisterOnSharedPreferenceChangeListener(paramOnSharedPreferenceChangeListener);
    a.remove(paramOnSharedPreferenceChangeListener);
  }
  
  /* Error */
  private final void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 269	hvz:a	[I
    //   5: iconst_m1
    //   6: aload_0
    //   7: invokespecial 93	hvu:c	()I
    //   10: iadd
    //   11: iaload
    //   12: tableswitch	default:+32 -> 44, 1:+48->60, 2:+48->60, 3:+98->110, 4:+98->110
    //   45: aconst_null
    //   46: dconst_1
    //   47: dup
    //   48: ldc_w 273
    //   51: invokespecial 276	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   54: athrow
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield 278	hvu:c	Z
    //   65: ldc_w 280
    //   68: invokestatic 235	hvu:a	(Ljava/lang/String;)Ljava/lang/String;
    //   71: astore_2
    //   72: aload_0
    //   73: getfield 34	hvu:d	Landroid/content/Context;
    //   76: astore_3
    //   77: getstatic 239	java/util/Collections:EMPTY_MAP	Ljava/util/Map;
    //   80: astore 4
    //   82: new 282	hvx
    //   85: dup
    //   86: aload_0
    //   87: invokespecial 283	hvx:<init>	(Lhvu;)V
    //   90: astore 5
    //   92: aload_3
    //   93: invokestatic 249	ixd:a	(Landroid/content/Context;)Lorg/chromium/net/HttpUrlRequestFactory;
    //   96: aload_2
    //   97: iconst_3
    //   98: aload 4
    //   100: aload 5
    //   102: invokevirtual 286	org/chromium/net/HttpUrlRequestFactory:a	(Ljava/lang/String;ILjava/util/Map;Lorg/chromium/net/HttpUrlRequestListener;)Lorg/chromium/net/HttpUrlRequest;
    //   105: invokeinterface 259 1 0
    //   110: aload_0
    //   111: monitorexit
    //   112: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	hvu
    //   55	4	1	localObject	Object
    //   71	26	2	str	String
    //   76	17	3	localContext	Context
    //   80	19	4	localMap	Map
    //   90	11	5	localhvx	hvx
    // Exception table:
    //   from	to	target	type
    //   2	44	55	finally
    //   44	55	55	finally
    //   60	110	55	finally
  }
  
  public static boolean b(Context paramContext)
  {
    return hwa.d == ((hvu)mbb.a(paramContext, hvu.class)).c();
  }
  
  private final int c()
  {
    try
    {
      if (this.c) {}
      for (int j = hwa.b;; j = hwa.a)
      {
        return j;
        if ("2014.04.01.09.48-535953481848de8b285f566daae315b7".equals(this.b.getString("version_number", ""))) {
          break;
        }
      }
      int i = 0;
      Iterator localIterator = this.b.getAll().keySet().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = this.b.getString(str1, "PENDING");
          if (str2.equals("PENDING"))
          {
            if (Log.isLoggable("DlResUtil", 4)) {
              new StringBuilder(33 + String.valueOf(str1).length()).append("Not available because ").append(str1).append(" is pending");
            }
            j = hwa.b;
            break;
          }
          if (!str2.equals("FAILED")) {
            break label291;
          }
          i = 1;
          if (!Log.isLoggable("DlResUtil", 4)) {
            break label291;
          }
          new StringBuilder(29 + String.valueOf(str1).length()).append("Not available because ").append(str1).append(" failed");
          break label291;
        }
        if (i != 0)
        {
          j = hwa.c;
          break;
        }
        if (!d())
        {
          this.b.edit().clear().apply();
          j = hwa.a;
          break;
        }
        j = hwa.d;
        break;
      }
    }
    finally {}
  }
  
  public static boolean c(Context paramContext)
  {
    return hwa.b == ((hvu)mbb.a(paramContext, hvu.class)).c();
  }
  
  private final boolean d()
  {
    File localFile1 = new File(this.d.getCacheDir(), "filter_resources");
    if (!localFile1.exists()) {
      return false;
    }
    Iterator localIterator = this.b.getAll().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!"version_number".equals(str))
      {
        File localFile2 = new File(localFile1, str);
        if ((!localFile2.isFile()) || (localFile2.length() <= 0L)) {
          return false;
        }
      }
    }
    return true;
  }
  
  final void a()
  {
    try
    {
      SharedPreferences.Editor localEditor = this.b.edit();
      Iterator localIterator = this.b.getAll().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ("PENDING".equals(this.b.getString(str, "PENDING"))) {
          localEditor.putString(str, "FAILED");
        }
      }
      localEditor.apply();
    }
    finally {}
    this.c = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvu
 * JD-Core Version:    0.7.0.1
 */