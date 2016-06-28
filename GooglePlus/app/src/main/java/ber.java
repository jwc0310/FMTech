import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.photos.viewer.components.captionbar.CaptionBarView;
import com.google.android.apps.photos.viewer.pager.core.PhotoFragmentTouchHandler;
import com.google.android.apps.plus.views.PhotoActionBar;
import com.google.android.apps.plus.views.TouchInterceptParent;

final class ber
  implements lxr
{
  ber(bem parambem) {}
  
  public final void a(int paramInt)
  {
    int i = 4;
    boolean bool1;
    boolean bool2;
    label37:
    int m;
    label63:
    bfi localbfi;
    int k;
    label111:
    azh localazh;
    CaptionBarView localCaptionBarView2;
    if (paramInt != 0)
    {
      bool1 = true;
      PhotoFragmentTouchHandler localPhotoFragmentTouchHandler = this.a.ab;
      localPhotoFragmentTouchHandler.e = bool1;
      TouchInterceptParent localTouchInterceptParent = localPhotoFragmentTouchHandler.a;
      if (bool1) {
        break label225;
      }
      bool2 = true;
      localTouchInterceptParent.a = bool2;
      if (efj.B(localPhotoFragmentTouchHandler.getContext()))
      {
        if (!bool1) {
          break label231;
        }
        m = 8;
        localPhotoFragmentTouchHandler.setVisibility(m);
      }
      if (this.a.Z != null)
      {
        localbfi = this.a.Z;
        if (Build.VERSION.SDK_INT >= 16) {
          break label243;
        }
        PhotoActionBar localPhotoActionBar2 = localbfi.ae;
        if (!bool1) {
          break label237;
        }
        k = i;
        localPhotoActionBar2.setVisibility(k);
      }
      if (this.a.d != null)
      {
        localazh = this.a.d;
        if (Build.VERSION.SDK_INT >= 16) {
          break label278;
        }
        localCaptionBarView2 = localazh.c;
        if (!bool1) {
          break label273;
        }
      }
    }
    baa localbaa;
    for (;;)
    {
      localCaptionBarView2.setVisibility(i);
      if (this.a.aa != null)
      {
        localbaa = this.a.aa;
        if ((((AccessibilityManager)localbaa.c.a.getSystemService("accessibility")).isEnabled()) && (Build.VERSION.SDK_INT >= 21) && (!localbaa.ai)) {
          break label303;
        }
      }
      return;
      bool1 = false;
      break;
      label225:
      bool2 = false;
      break label37;
      label231:
      m = 0;
      break label63;
      label237:
      k = 0;
      break label111;
      label243:
      PhotoActionBar localPhotoActionBar1 = localbfi.ae;
      if (bool1) {}
      for (int j = i;; j = 0)
      {
        localPhotoActionBar1.setImportantForAccessibility(j);
        break;
      }
      label273:
      i = 0;
    }
    label278:
    CaptionBarView localCaptionBarView1 = localazh.c;
    if (bool1) {}
    for (;;)
    {
      localCaptionBarView1.setImportantForAccessibility(i);
      break;
      i = 0;
    }
    label303:
    if (!bool1)
    {
      jdx.a(localbaa.ac);
      localbaa.ai = false;
      return;
    }
    View localView = localbaa.ac;
    if (Build.VERSION.SDK_INT >= 16) {
      localView.setImportantForAccessibility(1);
    }
    localbaa.ac.findViewById(16908298).requestFocus();
    localbaa.ai = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ber
 * JD-Core Version:    0.7.0.1
 */