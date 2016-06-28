import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Bundle;

public class hqh
  extends CursorWrapper
  implements hqd
{
  private Bundle a = Bundle.EMPTY;
  private Cursor b;
  
  public hqh(Cursor paramCursor)
  {
    super(paramCursor);
    this.b = paramCursor;
  }
  
  public Bundle getExtras()
  {
    return this.a;
  }
  
  public Cursor getWrappedCursor()
  {
    return this.b;
  }
  
  public void setExtras(Bundle paramBundle)
  {
    if (paramBundle == null) {
      paramBundle = Bundle.EMPTY;
    }
    this.a = paramBundle;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqh
 * JD-Core Version:    0.7.0.1
 */