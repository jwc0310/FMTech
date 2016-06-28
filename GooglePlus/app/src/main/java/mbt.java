import android.app.Activity;
import android.content.Context;

public final class mbt
  extends mbw<mbr>
{
  private final Activity a;
  
  public mbt(Activity paramActivity, mek parammek)
  {
    super(parammek, mbs.class);
    this.a = paramActivity;
  }
  
  protected final mbv<mbr> a(Context paramContext)
  {
    return new mbs(paramContext);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbt
 * JD-Core Version:    0.7.0.1
 */