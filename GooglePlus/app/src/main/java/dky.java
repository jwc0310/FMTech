import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import com.google.android.apps.plus.service.DreamSettingsActivity;
import java.util.Arrays;

public final class dky
  extends hqj
{
  public dky(Context paramContext)
  {
    super(paramContext);
  }
  
  public final Cursor o()
  {
    Cursor localCursor = DreamSettingsActivity.a(this.l, aau.ft);
    isv[] arrayOfisv = efj.c(this.l, 0, 5);
    MatrixCursor localMatrixCursor = new MatrixCursor(DreamSettingsActivity.d);
    Object[] arrayOfObject = new Object[DreamSettingsActivity.d.length];
    int i = arrayOfisv.length;
    for (int j = 0; j < i; j++)
    {
      isv localisv = arrayOfisv[j];
      Arrays.fill(arrayOfObject, null);
      arrayOfObject[0] = Integer.valueOf(0);
      arrayOfObject[3] = Integer.valueOf(1);
      arrayOfObject[1] = localisv.a;
      arrayOfObject[2] = localisv.b;
      localMatrixCursor.addRow(arrayOfObject);
    }
    return new MergeCursor(new Cursor[] { localCursor, localMatrixCursor });
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dky
 * JD-Core Version:    0.7.0.1
 */