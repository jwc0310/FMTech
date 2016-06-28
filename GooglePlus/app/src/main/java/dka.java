import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class dka
  implements gjg, hcp
{
  private static final String[] c = { "local_media_inserted", "initial_sync_complete", "current_metadata_limit", "pressed_load_more" };
  public final Context a;
  public giz b;
  private final auw d;
  private final SparseArray<Object> e = new SparseArray();
  
  public dka(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.d = new auw(paramContext);
    hco.a(this.a).a.add(this);
    hbe localhbe = (hbe)mbb.a(paramContext, hbe.class);
    hbg localhbg = new hbg(this);
    localhbe.b.add(localhbg);
  }
  
  public static void a(Context paramContext, boolean paramBoolean)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putBoolean("local_data_dirty", paramBoolean).apply();
  }
  
  private boolean a()
  {
    return PreferenceManager.getDefaultSharedPreferences(this.a).getBoolean("have_fingerprints_been_generated", false);
  }
  
  public static boolean a(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("local_data_dirty", true);
  }
  
  public final gjb a(int paramInt)
  {
    return this.b.a(paramInt).d("AllPhotosSyncManager");
  }
  
  public final void a(int paramInt, bup parambup, bsn parambsn)
  {
    
    synchronized (c(paramInt))
    {
      if (!parambsn.g) {}
      Integer localInteger;
      for (boolean bool = true;; bool = false)
      {
        ois localois = aum.a(this.a, paramInt);
        localInteger = localois.a;
        if (localInteger != null) {
          break;
        }
        i = 0;
        int j = a(paramInt).a("current_metadata_limit", 24000);
        if (!a(paramInt).a("pressed_load_more", false)) {
          j = Math.min(i, j);
        }
        b(paramInt).b("current_metadata_limit", j).d();
        if (Log.isLoggable("AllPhotosSyncManager", 3))
        {
          String str3 = String.valueOf("About to begin all photos sync, max to sync: ");
          String str4 = String.valueOf(parambsn);
          int k = a(paramInt).a("current_metadata_limit", 24000);
          String str5 = String.valueOf(localois.a);
          new StringBuilder(128 + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length()).append(str3).append(j).append(", syncType: ").append(str4).append(", from foreground: ").append(bool).append(", local metadata cap: ").append(k).append(", max photos in settings: ").append(str5).append(", account: ").append(paramInt);
        }
        bsk localbsk = bry.a(this.a, paramInt, parambup, parambsn, j);
        if (localbsk.b != null)
        {
          long l2 = localbsk.b.longValue();
          b(paramInt).b("all_photos_count", l2).d();
        }
        long l1 = jqx.b(this.a, paramInt);
        if (Log.isLoggable("AllPhotosSyncManager", 3))
        {
          String str1 = String.valueOf("Finished all photos sync, reason: ");
          String str2 = String.valueOf(localbsk.a);
          new StringBuilder(65 + String.valueOf(str1).length() + String.valueOf(str2).length()).append(str1).append(str2).append(", total photos synced: ").append(l1).append(", account: ").append(paramInt);
        }
        b(paramInt).b("initial_sync_complete", true).d();
        this.a.getContentResolver().notifyChange(jqx.a(paramInt), null);
        return;
      }
      int i = localInteger.intValue();
    }
  }
  
  public final void a(Context paramContext, gje paramgje) {}
  
  public final void a(String paramString1, String paramString2)
  {
    boolean bool = a();
    Uri localUri = Uri.parse(paramString1);
    long l1 = -1L;
    try
    {
      long l2 = ContentUris.parseId(localUri);
      l1 = l2;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      String str;
      break label27;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      label27:
      break label27;
    }
    if (l1 < 0L) {
      if (Log.isLoggable("AllPhotosSyncManager", 3))
      {
        str = String.valueOf("Ignoreing fingerprint generated for invalid media store id, uri: ");
        new StringBuilder(25 + String.valueOf(str).length() + String.valueOf(paramString1).length()).append(str).append(paramString1).append(" id: ").append(l1);
      }
    }
    for (;;)
    {
      return;
      Iterator localIterator = this.b.a(new String[] { "logged_in" }).iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        jqx.a(this.a, i, paramString1, paramString2);
        if (bool) {
          this.a.getContentResolver().notifyChange(jqx.a(i), null);
        }
      }
    }
  }
  
  public final void a(List<gji> paramList)
  {
    paramList.add(new dkd(this));
    paramList.add(new dke(this));
  }
  
  public final void a(boolean paramBoolean)
  {
    
    try
    {
      auw localauw = this.d;
      if (!paramBoolean) {}
      for (boolean bool = true;; bool = false)
      {
        localauw.a(bool, new aut(this));
        return;
      }
      return;
    }
    catch (SecurityException localSecurityException)
    {
      Log.e("AllPhotosSyncManager", "Insufficient permissions to refresh local media", localSecurityException);
    }
  }
  
  public final gjc b(int paramInt)
  {
    return this.b.b(paramInt).f("AllPhotosSyncManager");
  }
  
  final Object c(int paramInt)
  {
    synchronized (this.e)
    {
      Object localObject2 = this.e.get(paramInt);
      if (localObject2 == null)
      {
        localObject2 = new Object();
        this.e.put(paramInt, localObject2);
      }
      return localObject2;
    }
  }
  
  public final boolean d(int paramInt)
  {
    boolean bool1 = a(paramInt).c("local_media_inserted");
    boolean bool2 = a(paramInt).c("initial_sync_complete");
    boolean bool3 = a();
    if (Log.isLoggable("AllPhotosSyncManager", 4))
    {
      String str = String.valueOf("isAllPhotosTableInitialized accountId: ");
      new StringBuilder(95 + String.valueOf(str).length()).append(str).append(paramInt).append(" local media added: ").append(bool1).append(" initial sync complete: ").append(bool2).append(" fingerprints generated: ").append(bool3);
    }
    return (bool1) && (bool2) && (bool3);
  }
  
  public final void e(int paramInt)
  {
    efj.l();
    ContentResolver.cancelSync(new Account(this.b.a(paramInt).b("account_name"), "com.google"), "com.google.android.apps.photos.GooglePhotoDownsyncProvider");
    synchronized (c(paramInt))
    {
      synchronized (this.d)
      {
        this.d.a();
        bry.a(this.a, paramInt);
        jqx.c(this.a, paramInt);
        gjc localgjc = b(paramInt);
        String[] arrayOfString = c;
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++) {
          localgjc.e(arrayOfString[j]);
        }
        localgjc.d();
        this.a.getContentResolver().notifyChange(jqx.a(paramInt), null);
        return;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dka
 * JD-Core Version:    0.7.0.1
 */