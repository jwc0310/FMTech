import android.app.Activity;
import android.content.Intent;

public final class anr
  implements mbr
{
  public final Class a()
  {
    return anw.class;
  }
  
  public final void a(Activity paramActivity, mek parammek, mbb parammbb)
  {
    Intent localIntent = paramActivity.getIntent();
    boolean bool = false;
    if (localIntent != null) {
      bool = localIntent.getBooleanExtra("is_for_movie_maker_launch", false);
    }
    if (bool)
    {
      parammbb.a(anw.class, new any(parammek));
      return;
    }
    parammbb.a(anw.class, new aof(paramActivity, parammek));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     anr
 * JD-Core Version:    0.7.0.1
 */