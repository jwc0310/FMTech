import android.content.Intent;
import com.google.android.apps.photos.viewer.pager.HostPhotoPagerActivity;

public final class bdn
  implements lzv
{
  public bdn(HostPhotoPagerActivity paramHostPhotoPagerActivity) {}
  
  public final boolean s_()
  {
    boolean bool1 = this.a.getIntent().getBooleanExtra("up_as_back", false);
    boolean bool2 = false;
    if (bool1)
    {
      this.a.onBackPressed();
      bool2 = true;
    }
    return bool2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdn
 * JD-Core Version:    0.7.0.1
 */