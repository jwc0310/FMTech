import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

final class isx
  implements isw
{
  private final itd a;
  
  isx(itd paramitd)
  {
    this.a = paramitd;
  }
  
  public final Cursor a(Context paramContext, int paramInt)
  {
    return paramContext.getContentResolver().query(this.a.b(), this.a.c(), this.a.a(paramInt), null, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     isx
 * JD-Core Version:    0.7.0.1
 */