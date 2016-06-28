import android.content.Context;
import android.os.Bundle;

public final class cxu
  extends hqo<apz, Long>
{
  private final int h;
  private final boolean i;
  private final long j;
  private final ipf k;
  private final boolean l;
  private final int m;
  
  public cxu(Context paramContext, bw parambw, int paramInt1, boolean paramBoolean1, long paramLong, boolean paramBoolean2, ipf paramipf, int paramInt2)
  {
    super(paramContext, parambw, null);
    this.h = paramInt1;
    this.i = paramBoolean1;
    this.j = paramLong;
    this.l = paramBoolean2;
    this.k = paramipf;
    this.m = paramInt2;
  }
  
  public final bk a(Context paramContext, hqs<apz, Long> paramhqs, int paramInt)
  {
    Bundle localBundle = new Bundle();
    Long localLong = (Long)paramhqs.b(paramInt);
    if (localLong.longValue() == this.j) {
      localBundle.putParcelable("photo_ref", this.k);
    }
    localBundle.putInt("account_id", this.h);
    localBundle.putLong("all_photos_row_id", localLong.longValue());
    localBundle.putString("view_id", jrf.a(1, new String[0]));
    localBundle.putBoolean("disable_chromecast", this.i);
    localBundle.putBoolean("selectable", true);
    localBundle.putBoolean("force_return_edit_list", this.l);
    localBundle.putInt("all_photos_offset", this.m);
    localBundle.putString("pager_identifier", Integer.toString(paramInt));
    bem localbem = new bem();
    localbem.f(localBundle);
    return localbem;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cxu
 * JD-Core Version:    0.7.0.1
 */