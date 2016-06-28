import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

public final class den
  extends hqo<Cursor, Long>
{
  private int h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private final boolean n;
  
  public den(Context paramContext, bw parambw, Cursor paramCursor, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    super(paramContext, parambw, new hqk(null));
    this.h = paramInt;
    this.i = paramBoolean1;
    this.j = paramBoolean2;
    this.k = paramBoolean3;
    this.l = paramBoolean4;
    this.n = paramBoolean5;
    this.m = paramBoolean6;
  }
  
  public final bk a(Context paramContext, hqs<Cursor, Long> paramhqs, int paramInt)
  {
    Cursor localCursor = (Cursor)paramhqs.c();
    localCursor.moveToPosition(paramInt);
    String str1 = localCursor.getString(1);
    String str2 = localCursor.getString(3);
    String str3 = localCursor.getString(11);
    String str4 = localCursor.getString(2);
    long l1 = localCursor.getLong(5);
    long l2 = localCursor.getLong(6);
    boolean bool;
    long l3;
    String str5;
    String str6;
    long l4;
    Object localObject;
    label150:
    ipm localipm;
    Uri localUri;
    if ((0x4000 & l1) != 0L)
    {
      bool = true;
      l3 = localCursor.getLong(7);
      str5 = localCursor.getString(8);
      str6 = localCursor.getString(12);
      l4 = localCursor.getLong(13);
      if (!this.m) {
        break label453;
      }
      localObject = null;
      if (Log.isLoggable("PhotoSelectionOneUp", 3)) {
        new StringBuilder(40 + String.valueOf(localObject).length() + String.valueOf(str4).length()).append("PagerAdapter selectionClusterId=").append((String)localObject).append(" viewId=").append(str4);
      }
      localipm = ipm.a(localCursor.getInt(10));
      if (TextUtils.isEmpty(str3)) {
        break label467;
      }
      localUri = Uri.parse(str3);
      label236:
      if (str1 == null) {
        break label473;
      }
    }
    label453:
    label467:
    label473:
    for (ipf localipf = ipf.a(paramContext, str1, str2, localUri, localipm, str6);; localipf = ipf.a(paramContext, str5, l3, str2, localUri, localipm, str6))
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("account_id", this.h);
      localBundle.putParcelable("photo_ref", localipf);
      localBundle.putString("tile_id", str1);
      localBundle.putString("view_id", str4);
      localBundle.putString("selection_cluster_id", (String)localObject);
      localBundle.putBoolean("selectable", bool);
      localBundle.putBoolean("prevent_edit", this.i);
      localBundle.putBoolean("prevent_share", this.j);
      localBundle.putBoolean("prevent_delete", this.k);
      localBundle.putBoolean("force_return_edit_list", this.l);
      localBundle.putLong("media_attr", l1);
      localBundle.putLong("user_actions", l2);
      localBundle.putBoolean("selected_only", this.n);
      localBundle.putString("pager_identifier", Integer.toString(localCursor.getPosition()));
      if (l4 >= 0L) {
        localBundle.putLong("all_photos_row_id", l4);
      }
      bem localbem = new bem();
      localbem.f(localBundle);
      return localbem;
      bool = false;
      break;
      localObject = localCursor.getString(9);
      break label150;
      localUri = null;
      break label236;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     den
 * JD-Core Version:    0.7.0.1
 */