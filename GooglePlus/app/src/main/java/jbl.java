import android.content.Context;
import android.database.Cursor;

public final class jbl
  extends jcz<Cursor>
{
  private final int d;
  private final int e;
  private final Context f;
  private final fv g = new fv(this);
  
  public jbl(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramContext;
  }
  
  public final Cursor f()
  {
    Cursor localCursor = ((jac)mbb.a(this.f, jac.class)).a(this.d, this.e);
    localCursor.getCount();
    localCursor.registerContentObserver(this.g);
    localCursor.setNotificationUri(this.f.getContentResolver(), jda.b);
    return localCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbl
 * JD-Core Version:    0.7.0.1
 */