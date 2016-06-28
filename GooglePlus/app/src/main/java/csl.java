import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;
import java.util.HashSet;
import java.util.List;

public final class csl
  extends hqj
{
  private static String[] r = { "gaia_id", "packed_circle_ids" };
  private final int s;
  private final jiw t;
  
  public csl(Context paramContext, int paramInt, nve[] paramArrayOfnve)
  {
    super(paramContext, EsProvider.a(EsProvider.f(paramContext), paramInt), r, a(paramArrayOfnve), null, null);
    this.s = paramInt;
    this.t = ((jiw)mbb.a(paramContext, jiw.class));
  }
  
  private static String a(nve[] paramArrayOfnve)
  {
    if ((paramArrayOfnve == null) || (paramArrayOfnve.length == 0)) {
      return "0";
    }
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      localStringBuilder.append("gaia_id IN (");
      int i = paramArrayOfnve.length;
      for (int j = 0; j < i; j++)
      {
        DatabaseUtils.appendEscapedSQLString(localStringBuilder, paramArrayOfnve[j].a);
        localStringBuilder.append(',');
      }
    }
    localStringBuilder.setLength(-1 + localStringBuilder.length());
    localStringBuilder.append(')');
    return mfx.b(localStringBuilder);
  }
  
  private final HashSet<String> p()
  {
    HashSet localHashSet = new HashSet();
    List localList = this.t.a(this.s, jgx.k);
    int i = localList.size();
    for (int j = 0; j < i; j++) {
      localHashSet.add(((jgw)localList.get(j)).b());
    }
    if (Log.isLoggable("FriendLocations", 4))
    {
      String str = String.valueOf(localHashSet);
      new StringBuilder(21 + String.valueOf(str).length()).append("initSelectedCircles: ").append(str);
    }
    return localHashSet;
  }
  
  public final Cursor o()
  {
    brn.d(this.l, this.s);
    Cursor localCursor = super.o();
    Bundle localBundle = new Bundle();
    int i = this.s;
    HashSet localHashSet = bgp.j(this.l, i);
    if (localHashSet == null) {
      localHashSet = p();
    }
    localBundle.putSerializable("circle_ids", localHashSet);
    hqh localhqh = new hqh(localCursor);
    localhqh.setExtras(localBundle);
    return localhqh;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csl
 * JD-Core Version:    0.7.0.1
 */