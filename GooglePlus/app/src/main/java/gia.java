import android.view.InputDevice;

public final class gia
{
  public static final int a;
  public gic b;
  
  static
  {
    int i = -2147483648;
    int[] arrayOfInt = InputDevice.getDeviceIds();
    int j = arrayOfInt.length;
    for (int k = 0; k < j; k++) {
      i = Math.max(i, arrayOfInt[k]);
    }
    a = i + 1;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (this.b != null)
    {
      gic localgic = this.b;
      localgic.b = true;
      localgic.c = -1L;
      localgic.a = true;
      this.b = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gia
 * JD-Core Version:    0.7.0.1
 */