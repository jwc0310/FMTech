import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;

public final class hmp
  extends hqj
{
  static final String[] r;
  private final int s;
  private final String t;
  private final boolean u;
  
  static
  {
    ArrayList localArrayList = new ArrayList(Arrays.asList(hoi.a));
    localArrayList.add("profileItemType");
    r = (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  public hmp(Context paramContext, int paramInt, String paramString, boolean paramBoolean) {}
  
  public final Cursor o()
  {
    hhh localhhh = (hhh)mbb.a(this.l, hhh.class);
    ArrayList localArrayList = new ArrayList(4);
    Cursor localCursor;
    if (this.u)
    {
      localCursor = localhhh.a(this.s);
      if (localCursor == null) {
        break label170;
      }
    }
    label170:
    for (Object localObject = new hmq(localCursor, -1 + r.length);; localObject = localCursor)
    {
      if (this.u)
      {
        MatrixCursor localMatrixCursor = new MatrixCursor(r);
        int i = localMatrixCursor.getColumnIndexOrThrow("profileItemType");
        String[] arrayOfString = new String[r.length];
        arrayOfString[i] = "1";
        localMatrixCursor.addRow(arrayOfString);
        localArrayList.add(localMatrixCursor);
      }
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      return new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[localArrayList.size()]));
      localCursor = localhhh.b(this.s, this.t);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hmp
 * JD-Core Version:    0.7.0.1
 */