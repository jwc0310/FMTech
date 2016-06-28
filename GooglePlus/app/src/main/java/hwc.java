import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class hwc
  implements DialogInterface.OnClickListener
{
  hwc(hwb paramhwb) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      this.a.b.c(new hwd(this.a.a, "DownloadResourcesTask"));
      return;
    }
    this.a.b();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwc
 * JD-Core Version:    0.7.0.1
 */