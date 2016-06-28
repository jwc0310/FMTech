import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.photos.viewer.components.captionbar.CaptionBarView;
import java.util.List;

public final class azl
  extends ld
{
  public azl(CaptionBarView paramCaptionBarView) {}
  
  public final void b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.b(paramView, paramAccessibilityEvent);
    String str1 = this.d.d;
    Object localObject;
    String str2;
    if (!TextUtils.isEmpty(this.d.e))
    {
      localObject = this.d.e;
      str2 = String.valueOf(localObject);
      if (TextUtils.isEmpty(this.d.f)) {
        break label156;
      }
    }
    label156:
    for (String str3 = this.d.f;; str3 = "")
    {
      String str4 = 2 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str1 + " " + str2 + " " + str3;
      if (!TextUtils.isEmpty(str4)) {
        paramAccessibilityEvent.getText().add(str4);
      }
      return;
      localObject = "";
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     azl
 * JD-Core Version:    0.7.0.1
 */