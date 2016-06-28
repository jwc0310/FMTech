import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class dcm
  extends dch
{
  public dcm(Context paramContext, List<jpx> paramList, int paramInt)
  {
    super(paramContext, null, paramInt, null, jrf.b(), null);
  }
  
  public final Cursor o()
  {
    ArrayList localArrayList = new ArrayList();
    hra localhra = (hra)super.o();
    Cursor[] arrayOfCursor = localhra.a;
    int i = arrayOfCursor.length;
    int j = 0;
    if (j < i) {
      if (arrayOfCursor[j] == null) {}
    }
    for (int k = 1;; k = 0)
    {
      if (k == 0)
      {
        return null;
        j++;
        break;
      }
      dce localdce = new dce(this.l, localhra, 2, (ivl)mbb.a(this.l, ivl.class));
      if (localdce.getCount() > 0) {}
      for (int m = 1;; m = 0)
      {
        if (m != 0)
        {
          Object[] arrayOfObject = new Object[cyd.r.length];
          arrayOfObject[0] = Integer.valueOf(0);
          arrayOfObject[2] = Integer.valueOf(2);
          arrayOfObject[4] = jrf.b();
          arrayOfObject[1] = "~local";
          arrayOfObject[5] = "camera";
          arrayOfObject[9] = Integer.valueOf(localdce.getCount());
          arrayOfObject[13] = Integer.valueOf(0);
          arrayOfObject[15] = Long.valueOf(262144L);
          hqr localhqr = new hqr(cyd.r);
          localhqr.a(arrayOfObject);
          localArrayList.add(localhqr);
          localArrayList.add(localdce);
        }
        Bundle localBundle = new Bundle();
        if (localArrayList.isEmpty()) {
          break;
        }
        return new dcn(this, (Cursor[])localArrayList.toArray(new Cursor[localArrayList.size()]), localBundle);
      }
      return null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcm
 * JD-Core Version:    0.7.0.1
 */