import java.lang.reflect.Field;

public final class iap
{
  public final String a;
  public final int b;
  public final boolean c;
  public final boolean d;
  public final boolean e;
  public final String f;
  public final Field g;
  public final int h;
  
  public iap(String paramString1, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, Field paramField, int paramInt2)
  {
    this.a = paramString1.toLowerCase();
    this.b = paramInt1;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramString2;
    this.g = paramField;
    this.h = paramInt2;
    paramField.setAccessible(true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iap
 * JD-Core Version:    0.7.0.1
 */