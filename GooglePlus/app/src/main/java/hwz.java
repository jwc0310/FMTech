import android.content.DialogInterface;

public final class hwz
  extends lut
{
  public static hwz a(String paramString1, CharSequence paramCharSequence, String paramString2, String paramString3)
  {
    hwz localhwz = new hwz();
    localhwz.b(paramString1, paramCharSequence, paramString2, paramString3, 0, 0);
    return localhwz;
  }
  
  public final void m()
  {
    super.m();
    hwx.a = true;
  }
  
  public final void n()
  {
    super.n();
    hwx.a = false;
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    super.onDismiss(paramDialogInterface);
    hwx.a = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hwz
 * JD-Core Version:    0.7.0.1
 */