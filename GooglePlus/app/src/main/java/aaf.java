import android.content.Context;

public class aaf
{
  final Context a;
  final aai b;
  final aah c = new aah(this);
  aag d;
  aae e;
  boolean f;
  aak g;
  boolean h;
  
  aaf(Context paramContext, aai paramaai)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context must not be null");
    }
    this.a = paramContext;
    this.b = paramaai;
  }
  
  public aaj a(String paramString)
  {
    return null;
  }
  
  public final void a(aae paramaae)
  {
    
    if ((this.e == paramaae) || ((this.e != null) && (this.e.equals(paramaae)))) {}
    do
    {
      return;
      this.e = paramaae;
    } while (this.f);
    this.f = true;
    this.c.sendEmptyMessage(2);
  }
  
  public final void a(aak paramaak)
  {
    
    if (this.g != paramaak)
    {
      this.g = paramaak;
      if (!this.h)
      {
        this.h = true;
        this.c.sendEmptyMessage(1);
      }
    }
  }
  
  public void b(aae paramaae) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aaf
 * JD-Core Version:    0.7.0.1
 */