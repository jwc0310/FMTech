import android.database.Cursor;
import android.database.MergeCursor;
import android.os.Bundle;

final class dcn
  extends MergeCursor
{
  dcn(dcm paramdcm, Cursor[] paramArrayOfCursor, Bundle paramBundle)
  {
    super(paramArrayOfCursor);
  }
  
  public final Bundle getExtras()
  {
    Bundle localBundle = super.getExtras();
    if (localBundle != null) {
      this.a.putAll(localBundle);
    }
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcn
 * JD-Core Version:    0.7.0.1
 */