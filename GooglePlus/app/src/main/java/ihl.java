import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.mtp.MtpDevice;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

@TargetApi(12)
public final class ihl
{
  public static int a = 0;
  
  public static Bitmap a(MtpDevice paramMtpDevice, ihk paramihk)
  {
    byte[] arrayOfByte = paramMtpDevice.getThumbnail(paramihk.a);
    if (arrayOfByte == null) {}
    BitmapFactory.Options localOptions;
    do
    {
      return null;
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions);
    } while ((localOptions.outWidth == 0) || (localOptions.outHeight == 0));
    localOptions.inBitmap = null;
    localOptions.inMutable = true;
    localOptions.inJustDecodeBounds = false;
    localOptions.inSampleSize = 1;
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length, localOptions);
      return localBitmap;
    }
    catch (IllegalArgumentException localIllegalArgumentException) {}
    return BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public static void a(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    a = Math.max(localDisplayMetrics.heightPixels, localDisplayMetrics.widthPixels);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihl
 * JD-Core Version:    0.7.0.1
 */