import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;

public final class dco
  extends hqo<Cursor, Long>
{
  private int h;
  private boolean i;
  private boolean j;
  private String k;
  private boolean l;
  private boolean m;
  private boolean n;
  private boolean o;
  
  public dco(Context paramContext, bw parambw, Cursor paramCursor, int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    super(paramContext, parambw, new hqk(null));
    this.h = paramInt;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
    this.k = paramString;
    this.l = paramBoolean3;
    this.m = paramBoolean4;
    this.n = paramBoolean5;
    this.o = paramBoolean6;
  }
  
  public final bk a(Context paramContext, hqs<Cursor, Long> paramhqs, int paramInt)
  {
    Cursor localCursor = (Cursor)paramhqs.c();
    localCursor.moveToPosition(paramInt);
    if (this.j) {}
    for (Object localObject = null;; localObject = this.k)
    {
      if (Log.isLoggable("PhotoSelectionOneUp", 3))
      {
        String str = this.k;
        new StringBuilder(40 + String.valueOf(localObject).length() + String.valueOf(str).length()).append("PagerAdapter selectionClusterId=").append((String)localObject).append(" viewId=").append(str);
      }
      ipf localipf = dch.a(this.c, localCursor);
      Bundle localBundle = new Bundle();
      localBundle.putInt("account_id", this.h);
      localBundle.putParcelable("photo_ref", localipf);
      localBundle.putString("tile_id", null);
      localBundle.putString("view_id", this.k);
      localBundle.putString("selection_cluster_id", (String)localObject);
      localBundle.putBoolean("selectable", true);
      localBundle.putBoolean("force_return_edit_list", this.i);
      localBundle.putLong("media_attr", 278528L);
      localBundle.putLong("user_actions", jrf.c.longValue());
      localBundle.putBoolean("prevent_edit", this.l);
      localBundle.putBoolean("prevent_share", this.m);
      localBundle.putBoolean("prevent_delete", this.n);
      localBundle.putBoolean("disable_chromecast", this.o);
      localBundle.putString("pager_identifier", Integer.toString(localCursor.getPosition()));
      bem localbem = new bem();
      localbem.f(localBundle);
      return localbem;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dco
 * JD-Core Version:    0.7.0.1
 */