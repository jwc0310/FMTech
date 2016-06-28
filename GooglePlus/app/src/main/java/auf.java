import android.content.res.Resources;
import android.graphics.Rect;
import com.google.android.apps.plus.views.PhotoOneUpSelectionButton;

public class auf
  implements jer<aud>
{
  public auf(ayo paramayo) {}
  
  public void a()
  {
    boolean bool1 = true;
    ayo localayo = this.a;
    bcp localbcp1 = localayo.b.b;
    if ((localbcp1 == null) || (localayo.a == null)) {}
    bcp localbcp2;
    for (;;)
    {
      localbcp2 = localayo.b.b;
      if ((localayo.c != null) && (localayo.b.d) && (localbcp2.P()) && (localbcp2.K())) {
        break;
      }
      return;
      if (localbcp1.K())
      {
        int i = localayo.Z.b.b;
        tp localtp = localayo.a;
        Resources localResources = localayo.g();
        int j = efj.xx;
        Object[] arrayOfObject = new Object[bool1];
        arrayOfObject[0] = Integer.valueOf(i);
        localtp.a(localResources.getQuantityString(j, i, arrayOfObject));
        localayo.a.d(bool1);
      }
      else
      {
        localayo.a.d(false);
      }
    }
    jpx localjpx1 = localbcp2.c();
    jpx localjpx2;
    boolean bool2;
    boolean bool3;
    label298:
    PhotoOneUpSelectionButton localPhotoOneUpSelectionButton4;
    if (localjpx1 != null)
    {
      localjpx2 = localjpx1;
      bool2 = bool1;
      PhotoOneUpSelectionButton localPhotoOneUpSelectionButton1 = localayo.c;
      localPhotoOneUpSelectionButton1.g = localjpx2;
      localPhotoOneUpSelectionButton1.e = bool2;
      localPhotoOneUpSelectionButton1.b = new dvt(PhotoOneUpSelectionButton.a.left, PhotoOneUpSelectionButton.a.top, PhotoOneUpSelectionButton.a.width(), PhotoOneUpSelectionButton.a.height(), localPhotoOneUpSelectionButton1, null);
      localPhotoOneUpSelectionButton1.invalidate();
      PhotoOneUpSelectionButton localPhotoOneUpSelectionButton2 = localayo.c;
      localPhotoOneUpSelectionButton2.c = bool1;
      localPhotoOneUpSelectionButton2.requestLayout();
      localPhotoOneUpSelectionButton2.invalidate();
      PhotoOneUpSelectionButton localPhotoOneUpSelectionButton3 = localayo.c;
      if ((!localbcp2.J()) || (localPhotoOneUpSelectionButton3.g == null)) {
        break label353;
      }
      bool3 = bool1;
      localPhotoOneUpSelectionButton3.d = bool3;
      localPhotoOneUpSelectionButton3.requestLayout();
      localPhotoOneUpSelectionButton3.invalidate();
      localPhotoOneUpSelectionButton4 = localayo.c;
      if (localjpx2.h() == null) {
        break label359;
      }
    }
    for (;;)
    {
      localPhotoOneUpSelectionButton4.f = bool1;
      return;
      localjpx2 = localbcp2.d();
      bool2 = false;
      break;
      label353:
      bool3 = false;
      break label298;
      label359:
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     auf
 * JD-Core Version:    0.7.0.1
 */