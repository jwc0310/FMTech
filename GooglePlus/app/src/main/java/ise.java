import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.mediapicker.MediaPickerFragment;

final class ise
  implements View.OnClickListener
{
  ise(isb paramisb) {}
  
  public final void onClick(View paramView)
  {
    int i = 1;
    if (this.a.f.Z)
    {
      Intent localIntent = new Intent("android.intent.action.PICK");
      localIntent.setPackage("com.google.android.apps.photos");
      if (this.a.f.a(i))
      {
        localIntent.setType("image/*");
        if (Build.VERSION.SDK_INT >= 18) {
          if ((this.a.f.d == 3) || (this.a.f.d == i)) {
            break label120;
          }
        }
      }
      for (;;)
      {
        localIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", i);
        try
        {
          this.a.f.a(localIntent, 3);
          return;
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
          int j;
          isb.a(this.a);
          return;
        }
        localIntent.setType("*/*");
        break;
        label120:
        j = 0;
      }
    }
    isb.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ise
 * JD-Core Version:    0.7.0.1
 */