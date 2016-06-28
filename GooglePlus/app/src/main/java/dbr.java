import android.content.Context;
import android.content.Intent;

public final class dbr
{
  final Intent a;
  private final int b;
  
  public dbr(Context paramContext, Class<?> paramClass, int paramInt)
  {
    this.a = new Intent(paramContext, paramClass);
    this.b = paramInt;
  }
  
  public final Intent a()
  {
    this.a.setAction("android.intent.action.VIEW");
    this.a.putExtra("account_id", this.b);
    return this.a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dbr
 * JD-Core Version:    0.7.0.1
 */