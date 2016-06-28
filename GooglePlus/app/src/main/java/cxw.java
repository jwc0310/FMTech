import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cxw
  extends hqo<Cursor, Long>
{
  private final AtomicBoolean h = new AtomicBoolean(false);
  private final boolean i;
  private String j;
  private boolean k;
  private int l;
  private String m;
  private String n;
  private String o;
  private boolean p;
  private boolean q;
  
  public cxw(Context paramContext, bw parambw, Cursor paramCursor, String paramString1, int paramInt, boolean paramBoolean1, String paramString2, String paramString3, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    super(paramContext, parambw, new hqk(null));
    this.j = paramString1;
    this.l = paramInt;
    this.k = paramBoolean1;
    this.n = paramString2;
    this.o = paramString3;
    this.i = paramBoolean2;
    this.p = paramBoolean3;
    this.q = paramBoolean4;
  }
  
  public final bk a(int paramInt)
  {
    cxx localcxx;
    if ((this.m != null) && (b() - paramInt < 100) && (this.h.compareAndSet(false, true)))
    {
      localcxx = new cxx(this.c, this.l, this.o, this.n, this.j, this.m, this.h);
      if (Build.VERSION.SDK_INT >= 11) {
        break label89;
      }
      localcxx.execute(new String[0]);
    }
    for (;;)
    {
      return super.a(paramInt);
      label89:
      localcxx.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }
  }
  
  public final bk a(Context paramContext, hqs<Cursor, Long> paramhqs, int paramInt)
  {
    Cursor localCursor = (Cursor)paramhqs.c();
    localCursor.moveToPosition(paramInt);
    if ((0x40000 & localCursor.getLong(4)) != 0L)
    {
      String str3 = localCursor.getString(1);
      long l3 = localCursor.getLong(4);
      String str4 = localCursor.getString(6);
      ipf localipf2 = def.a(this.c, localCursor);
      Bundle localBundle2 = new Bundle();
      localBundle2.putInt("account_id", this.l);
      localBundle2.putParcelable("photo_ref", localipf2);
      localBundle2.putString("tile_id", str3);
      localBundle2.putString("view_id", this.j);
      localBundle2.putString("selection_cluster_id", null);
      localBundle2.putBoolean("selectable", false);
      localBundle2.putLong("media_attr", l3);
      localBundle2.putLong("user_actions", 0L);
      localBundle2.putString("title", str4);
      localBundle2.putBoolean("disable_chromecast", this.i);
      localBundle2.putString("pager_identifier", Integer.toString(localCursor.getPosition()));
      bem localbem2 = new bem();
      localbem2.f(localBundle2);
      return localbem2;
    }
    String str1 = localCursor.getString(1);
    long l1 = localCursor.getLong(5);
    long l2 = localCursor.getLong(4);
    String str2 = localCursor.getString(6);
    ipf localipf1 = def.a(this.c, localCursor);
    Bundle localBundle1 = new Bundle();
    localBundle1.putInt("account_id", this.l);
    localBundle1.putParcelable("photo_ref", localipf1);
    localBundle1.putString("tile_id", str1);
    localBundle1.putLong("photo_id", l1);
    localBundle1.putLong("media_attr", l2);
    localBundle1.putString("view_id", this.j);
    localBundle1.putBoolean("disable_photo_comments", this.k);
    localBundle1.putString("title", str2);
    localBundle1.putBoolean("disable_chromecast", this.i);
    localBundle1.putString("pager_identifier", Integer.toString(localCursor.getPosition()));
    localBundle1.putBoolean("show_oob_tile", this.p);
    localBundle1.putBoolean("launch_comments_at_start", this.q);
    bem localbem1 = new bem();
    localbem1.f(localBundle1);
    return localbem1;
  }
  
  public final hqs<Cursor, Long> a(hqs<Cursor, Long> paramhqs, int paramInt)
  {
    Cursor localCursor;
    if (paramhqs != null)
    {
      localCursor = (Cursor)paramhqs.c();
      if (localCursor != null) {
        break label41;
      }
    }
    label41:
    for (Bundle localBundle = Bundle.EMPTY;; localBundle = localCursor.getExtras())
    {
      this.m = localBundle.getString("resume_token");
      return super.a(paramhqs, paramInt);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxw
 * JD-Core Version:    0.7.0.1
 */