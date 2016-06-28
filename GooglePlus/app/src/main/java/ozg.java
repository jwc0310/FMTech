import android.app.Activity;

public final class ozg
{
  final Activity a;
  
  public ozg(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  final bp a()
  {
    try
    {
      bp localbp = (bp)this.a;
      return localbp;
    }
    catch (ClassCastException localClassCastException)
    {
      String str = String.valueOf(this.a);
      throw new IllegalStateException(44 + String.valueOf(str).length() + "Expected activity to be a FragmentActivity: " + str, localClassCastException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ozg
 * JD-Core Version:    0.7.0.1
 */