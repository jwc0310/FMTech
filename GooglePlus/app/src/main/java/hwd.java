import android.content.Context;
import android.os.ConditionVariable;

final class hwd
  extends gzf
{
  public hwd(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  protected final hae a()
  {
    ConditionVariable localConditionVariable = new ConditionVariable();
    Context localContext = g();
    hvu.a(localContext, new hwe(this, localConditionVariable));
    localConditionVariable.block(20000L);
    return new hae(hvu.b(localContext));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwd
 * JD-Core Version:    0.7.0.1
 */