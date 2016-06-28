import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.widget.Toast;

final class cfn
  implements jpe
{
  private final int a;
  
  cfn(cff paramcff, int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void a(jpg paramjpg)
  {
    if (this.b.i())
    {
      if (!paramjpg.a()) {
        break label104;
      }
      if (this.a != aaw.ja) {
        break label65;
      }
      this.b.f();
    }
    cff localcff;
    for (Intent localIntent = efj.b("camera-p.jpg");; localIntent = new Intent("android.media.action.VIDEO_CAPTURE"))
    {
      localcff = this.b;
      int i = this.a;
      try
      {
        localcff.au.a(i, localIntent);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        label65:
        Toast.makeText(localcff.bn, aau.dp, 1).show();
        return;
      }
      this.b.f();
    }
    label104:
    Toast.makeText(this.b.bn, aau.cK, 1).show();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cfn
 * JD-Core Version:    0.7.0.1
 */